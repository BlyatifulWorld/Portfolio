import 'package:flutter/material.dart';
import '../database/model.dart';
import '../database/database_helper.dart';

// ignore: must_be_immutable
class SearchProduct extends StatefulWidget {
  SearchProduct({Key? key, required this.dbHelper}) : super(key: key);
  DatabaseHelper dbHelper;

  @override
  _SearchProductState createState() => _SearchProductState();
}

class _SearchProductState extends State<SearchProduct> {
  String _searchValue = '';
  List<User> resultUsers = [];
  bool found = false;

  void _showResponse(List<User> res) {
    setState(() {
      resultUsers = res;
      if (resultUsers.length > 0) {
        found = true;
      } else {
        found = false;
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Container(
          width: double.infinity,
          height: 40,
          decoration: BoxDecoration(
            color: Colors.white,
            borderRadius: BorderRadius.circular(5),
          ),
          child: Center(
            child: TextField(
              onChanged: (value) => _searchValue = value,
              decoration: InputDecoration(
                  prefixIcon: const Icon(Icons.search),
                  suffixIcon: IconButton(
                    icon: const Icon(Icons.play_circle),
                    onPressed: () async {
                      await widget.dbHelper
                          .searchUser(_searchValue)
                          .then((res) {
                        _showResponse(res);
                      });
                    },
                  ),
                  hintText: 'Search...',
                  border: InputBorder.none),
            ),
          ),
        ),
      ),
      body: found
          ? buildFoundList()
          : const Center(
              child: Text("Search Result (Not Found)"),
            ),
    );
  }

  Widget buildFoundList() {
    return ListView.builder(
        itemCount: resultUsers.length,
        itemBuilder: (context, index) {
          return Card(
              child: ListTile(
            title: Text('Name: ${resultUsers[index].name}'),
            subtitle: Text(
                'BMI:  ${resultUsers[index].bmi}/ Water Intake: ${resultUsers[index].waterintake}'),
          ));
        });
  }
}
