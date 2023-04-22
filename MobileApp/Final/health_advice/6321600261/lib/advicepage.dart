// ignore_for_file: must_be_immutable
import 'package:flutter/material.dart';
import 'package:health_advice/database/database_helper.dart';
import 'package:health_advice/database/model.dart';

class FormHealthInfoPage extends StatefulWidget {
  FormHealthInfoPage({Key? key, required this.personName}) : super(key: key);

  String personName;

  @override
  State<FormHealthInfoPage> createState() => _FormHealthInfoPageState();
}

class _FormHealthInfoPageState extends State<FormHealthInfoPage> {
  final TextEditingController _heightController = TextEditingController();
  final TextEditingController _weightController = TextEditingController();
  double _bmi = 0.0;
  double _waterintake = 0.0;

  @override
  void dispose() {
    _heightController.dispose();
    _weightController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Advisory for ${widget.personName}'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            TextFormField(
              controller: _heightController,
              keyboardType: TextInputType.number,
              decoration: const InputDecoration(
                labelText: 'Height (in cm)',
              ),
            ),
            const SizedBox(height: 16.0),
            TextFormField(
              controller: _weightController,
              keyboardType: TextInputType.number,
              decoration: const InputDecoration(
                labelText: 'Weight (in kg)',
              ),
            ),
            const SizedBox(height: 16.0),
            ElevatedButton(
              onPressed: _calculateBMI,
              child: const Text('Calculate BMI'),
            ),
            const SizedBox(height: 16.0),
            Text(
              'BMI: ${_bmi.toStringAsFixed(1)}',
              style: const TextStyle(fontSize: 24.0),
            ),
            const SizedBox(height: 16.0),
            Text(
              'ควรดื่มน้ำวันละ: ${_waterintake.toStringAsFixed(2)} มิลลิลิตร',
              style: const TextStyle(fontSize: 24.0),
            ),
            /*ElevatedButton(
                child: const Text('เก็บข้อมูล?'),
                onPressed: () async {
                  var result = await ModalUserForm(
                          height: _heightController.text,
                          weight: _weightController.text,
                          bmi: _bmi.toStringAsFixed(1),
                          waterintake: _waterintake.toStringAsFixed(2))
                      .save();
                })*/
          ],
        ),
      ),
    );
  }

  void _calculateBMI() {
    final height = int.parse(_heightController.text) / 100.0;
    final weight = int.parse(_weightController.text);

    setState(() {
      _bmi = weight / (height * height);
      _waterintake = weight / 2 * 2.2 * 30;
      if (_bmi >= 30) {
        showDialog(
          context: context,
          builder: (context) => AlertDialog(
            title: const Text('คำเตือน'),
            content: const Text('ท่านอ้วนมาก โปรดปรึกษาแพทย์โดยด่วน'),
            actions: [
              TextButton(
                onPressed: () => Navigator.of(context).pop(),
                child: const Text('OK'),
              ),
            ],
          ),
        );
      } else if (_bmi >= 25) {
        showDialog(
          context: context,
          builder: (context) => AlertDialog(
            title: const Text('คำเตือน'),
            content: const Text('ท่านมีน้ำหนักเกินควร โปรดปรึกษาแพทย์'),
            actions: [
              TextButton(
                onPressed: () => Navigator.of(context).pop(),
                child: const Text('OK'),
              ),
            ],
          ),
        );
      } else if (_bmi >= 18.5) {
        showDialog(
          context: context,
          builder: (context) => AlertDialog(
            title: const Text('คำเตือน'),
            content: const Text('ท่านมีน้ำหนักปกติ โปรดรักษาสุขภาพต่อไป'),
            actions: [
              TextButton(
                onPressed: () => Navigator.of(context).pop(),
                child: const Text('OK'),
              ),
            ],
          ),
        );
      } else {
        showDialog(
          context: context,
          builder: (context) => AlertDialog(
            title: const Text('คำเตือน'),
            content:
                const Text('ท่านมีน้ำหนักต่ำกว่าเกณฑ์ โปรดรับประทานอาหารเพิ่ม'),
            actions: [
              TextButton(
                onPressed: () => Navigator.of(context).pop(),
                child: const Text('OK'),
              ),
            ],
          ),
        );
      }
    });
  }
}
