import 'package:flutter/material.dart';
import 'package:quizproject/screens/main_menu.dart';
import 'package:quizproject/screens/welcome.dart';

class ResultScreen extends StatefulWidget {
  int score;
  ResultScreen(this.score, {Key? key}) : super(key: key);

  @override
  _ResultScreenState createState() => _ResultScreenState();
}

class _ResultScreenState extends State<ResultScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        width: double.infinity,
        height: MediaQuery.of(context).size.height,
        decoration: const BoxDecoration(
            gradient: LinearGradient(
                colors: [
              Color.fromARGB(255, 58, 132, 161),
              Color.fromARGB(255, 33, 52, 114),
              Color.fromARGB(255, 64, 26, 82),
            ],
                begin: Alignment.topLeft,
                end: Alignment.bottomRight,
                tileMode: TileMode.clamp)),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            Image.asset(
              'assets/img/trophy_1.png',
              width: 100,
            ),
            const SizedBox(
              width: double.infinity,
              child: Text(
                "Congratulations",
                textAlign: TextAlign.center,
                style: TextStyle(
                  color: Colors.white,
                  fontSize: 40.0,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
            const SizedBox(
              height: 45.0,
            ),
            const Text(
              "Your Score is",
              style: TextStyle(color: Colors.white, fontSize: 34.0),
            ),
            const SizedBox(
              height: 20.0,
            ),
            Text(
              "${widget.score}",
              style: const TextStyle(
                color: Color.fromARGB(255, 255, 248, 155),
                fontSize: 85.0,
                fontWeight: FontWeight.bold,
              ),
            ),
            const SizedBox(
              height: 100.0,
            ),
            TextButton(
              onPressed: () {
                Navigator.push(
                    context,
                    MaterialPageRoute(
                      builder: (context) => const Welcome(),
                    ));
              },
              child: const Text(
                "Return main page",
                style: TextStyle(color: Colors.white),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
