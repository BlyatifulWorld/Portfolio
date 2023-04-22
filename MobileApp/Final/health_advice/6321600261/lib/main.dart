import 'package:flutter/material.dart';
import 'advicepage.dart';
import 'validators.dart';
import 'pages/studentprofile.dart';
import 'package:health_advice/database/database_helper.dart';
import 'package:health_advice/database/model.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Exam with Flutter',
      theme: ThemeData(
        primarySwatch: Colors.deepPurple,
      ),
      home: const MyHomePage(title: 'Healthy Advisory'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  String _name = '';
  List<User> users = [];
  late DatabaseHelper _dbHelper;

  @override
  void initState() {
    super.initState();
    _dbHelper = DatabaseHelper.instance;
    initUsers();
  }

  void initUsers() async {
    var result = await _dbHelper.fetchUsers();

    setState(() {
      users = result;
    });
  }

  @override
  Widget build(BuildContext context) {
    final _formKey = GlobalKey<FormState>();

    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
        actions: [
          IconButton(
              onPressed: () {
                Navigator.push(
                    context, MaterialPageRoute(builder: (_) => MakerProfile()));
              },
              icon: const Icon(Icons.person_outline))
        ],
      ),
      body: Form(
        key: _formKey,
        child: ListView(
          padding: const EdgeInsets.all(20),
          children: [
            const Padding(
                padding: EdgeInsets.all(16),
                child: Center(
                    child: Text(
                  'Healthy Information Advisory',
                  style: TextStyle(fontSize: 20),
                ))),
            const Padding(
              padding: EdgeInsets.all(20.0),
              child: Icon(
                Icons.health_and_safety_outlined,
                size: 120,
                color: Colors.red,
              ),
            ),
            _nameFormField(),
            Padding(
              padding: const EdgeInsets.all(40.0),
              child: ElevatedButton(
                style: ElevatedButton.styleFrom(
                  backgroundColor: Colors.deepPurple,
                  elevation: 2,
                ),
                child: const Text('Calculate BMI and Daily Water Intake'),
                onPressed: () {
                  if (_formKey.currentState!.validate()) {
                    Navigator.push(
                        context,
                        MaterialPageRoute(
                            builder: (context) => FormHealthInfoPage(
                                  personName: _name,
                                )));
                  }
                },
              ),
            ),
          ],
        ),
      ),
    );
  }

  Widget _nameFormField() {
    return TextFormField(
      keyboardType: TextInputType.text,
      decoration: InputDecoration(
        hintText: 'Enter your name',
        labelText: 'Your Name:',
        icon: const Icon(Icons.person_add),
        border: OutlineInputBorder(
            borderRadius: BorderRadius.circular(10),
            borderSide: const BorderSide(color: Colors.grey, width: 32)),
        focusedBorder: OutlineInputBorder(
            borderRadius: BorderRadius.circular(10),
            borderSide: const BorderSide(color: Colors.green, width: 2)),
      ),
      onChanged: ((value) {
        _name = value;
      }),
      validator: Validators.compose([
        Validators.required('Name is not allowed to be empty!'),
      ]),
    );
  }
}
