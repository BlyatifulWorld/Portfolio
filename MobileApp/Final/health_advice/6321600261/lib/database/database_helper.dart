import 'dart:async';
import 'dart:io';
import 'package:path_provider/path_provider.dart';
import 'package:sqflite/sqflite.dart';
import 'package:path/path.dart';
import 'model.dart';

class DatabaseHelper {
  DatabaseHelper._privateConstructor();

  static final DatabaseHelper instance = DatabaseHelper._privateConstructor();
  static const _databaseName = 'UserDB.db';
  static const _databaseVersion = 1;
  static Database? _database;

  Future<Database> get database async {
    if (_database != null) return _database!;
    _database = await _initDatabase();
    return _database!;
  }

  _initDatabase() async {
    Directory dataDir = await getApplicationDocumentsDirectory();

    String dbPath = join(dataDir.path, _databaseName);
    return await openDatabase(dbPath,
        version: _databaseVersion, onCreate: _onCreateTable);
  }

  Future _onCreateTable(Database db, int version) async {
    await db.execute('''
          CREATE TABLE ${User.tableName} (
            ${User.colName} TEXT PRIMARY KEY,
            ${User.colHeight} REAL NOT NULL,
            ${User.colWeight} REAL NOT NULL,
            ${User.colBMI} REAL NOT NULL,
            ${User.colWaterIntake} REAL NOT NULL
          )
          ''');
  }

  //insert user
  Future<int> insertUser(User user) async {
    Database db = await database;
    return await db.insert(User.tableName, user.toMap(),
        conflictAlgorithm: ConflictAlgorithm.replace);
  }

  //update user
  Future<int> updateUser(User user) async {
    Database db = await database;
    return await db.update(User.tableName, user.toMap(),
        where: '${User.colName} = ?', whereArgs: [user.name]);
  }

  //delete user
  Future<int> deleteUser(String name) async {
    Database db = await database;
    return await db.delete(User.tableName,
        where: '${User.colName} = ?', whereArgs: [name]);
  }

  //get user
  Future<List<User>> fetchUsers() async {
    Database db = await database;
    List<Map<String, dynamic>> maps = await db.query(User.tableName);
    if (maps.isEmpty) {
      return [];
    } else {
      return List.generate(maps.length, (i) {
        return User(
            name: maps[i][User.colName],
            height: maps[i][User.colHeight],
            weight: maps[i][User.colWeight],
            bmi: maps[i][User.colBMI],
            waterintake: maps[i][User.colWaterIntake]);
      });
    }
  }

  Future<List<User>> searchUser(String name) async {
    Database db = await database;
    List<Map<String, dynamic>> maps = await db.query(User.tableName,
        where: '${User.colName} LIKE ?', whereArgs: ['%$name%']);
    if (maps.isEmpty) {
      return [];
    } else {
      return List.generate(maps.length, (i) {
        return User(
            name: maps[i][User.colName],
            height: maps[i][User.colHeight],
            weight: maps[i][User.colWeight],
            bmi: maps[i][User.colBMI],
            waterintake: maps[i][User.colWaterIntake]);
      });
    }
  }
}
