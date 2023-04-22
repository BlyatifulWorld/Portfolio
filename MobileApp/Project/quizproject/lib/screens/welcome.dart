import 'package:flutter/material.dart';
import 'package:quizproject/screens/topic_quiz.dart';
import 'package:quizproject/screens/about.dart';

class Welcome extends StatelessWidget {
  const Welcome({Key? key}) : super(key: key);

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
        child: Center(
          child: Stack(
            children: [
              Positioned(
                top: 100,
                left: 0,
                right: 0,
                child: Column(children: [
                  Image.asset(
                    'assets/img/Astronomy_quiz_logo.png',
                    width: 500,
                  ),
                  Image.asset(
                    'assets/img/saturn_1.png',
                    width: 300,
                  ),
                ]),
              ),
              //--- Start Jump to Topic Screen ---//
              Positioned(
                  bottom: 50,
                  left: 0,
                  right: 160,
                  child: Padding(
                    padding: const EdgeInsets.all(50.0),
                    child: GestureDetector(
                      onTap: () {
                        Navigator.push(
                            context,
                            MaterialPageRoute(
                                builder: (_) => const TopicScreen()));
                      },
                      child: Container(
                        height: 50,
                        decoration: const BoxDecoration(
                          color: Color.fromARGB(255, 255, 255, 255),
                          borderRadius: BorderRadius.all(Radius.circular(20)),
                        ),
                        child: const Center(
                          child: Text(
                            'Start Quiz',
                            style: TextStyle(
                              fontSize: 20,
                            ),
                          ),
                        ),
                      ),
                    ),
                  )),

              //--- Jump to About Screen ---//
              Positioned(
                  bottom: 50,
                  left: 160,
                  right: 0,
                  child: Padding(
                    padding: const EdgeInsets.all(50.0),
                    child: GestureDetector(
                      onTap: () {
                        Navigator.push(context,
                            MaterialPageRoute(builder: (_) => AboutScreen()));
                      },
                      child: Container(
                        height: 50,
                        decoration: const BoxDecoration(
                          color: Colors.blue,
                          borderRadius: BorderRadius.all(Radius.circular(20)),
                        ),
                        child: const Center(
                          child: Text(
                            'About us',
                            style: TextStyle(fontSize: 20, color: Colors.white),
                          ),
                        ),
                      ),
                    ),
                  )),

              //--- Footer ---//
              const Positioned(
                bottom: 20,
                left: 0,
                right: 0,
                child: Center(
                    child: Text(
                  "Version: Beta 0.0.1",
                  textAlign: TextAlign.center,
                  style: TextStyle(
                    color: Colors.white,
                  ),
                )),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
