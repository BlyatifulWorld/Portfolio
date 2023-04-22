class User {
  late String name;
  late double height;
  late double weight;
  late double bmi;
  late double waterintake;

  static const tableName = 'users';
  static const colName = 'name';
  static const colHeight = 'height';
  static const colWeight = 'weight';
  static const colBMI = 'bmi';
  static const colWaterIntake = 'waterintake';

  User(
      {required this.name,
      required this.height,
      required this.weight,
      required this.bmi,
      required this.waterintake});

  Map<String, dynamic> toMap() {
    var mapData = <String, dynamic>{
      colName: name,
      colHeight: height,
      colWeight: weight,
      colBMI: bmi,
      colWaterIntake: waterintake
    };
    return mapData;
  }
}
