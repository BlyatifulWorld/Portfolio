import 'package:flutter/material.dart';
import 'package:quizproject/data/nebula_question.dart';
import 'package:quizproject/model/question_model.dart';
import 'package:quizproject/screens/result_screen.dart';
import 'dart:math';

class NebulaScreen extends StatefulWidget {
  const NebulaScreen({Key? key}) : super(key: key);

  @override
  _NebulaScreenState createState() {
    return _NebulaScreenState();
  }
}

class _NebulaScreenState extends State<NebulaScreen> {
  int score = 0;
  bool btnPressed = false;
  PageController? _controller;
  String btnText = "Next Question";
  bool answered = false;
  @override
  void initState() {
    super.initState();
    _controller = PageController(initialPage: 0);
  }

  @override
  Widget build(BuildContext context) {
    final random = Random();
    List<QuestionModel> questionsCopy = List.of(questions);
    for (int i = 0; i < questions.length - 5; i++) {
      questionsCopy.shuffle(Random());
      int indexToRemove = random.nextInt(questionsCopy.length);
      questionsCopy.removeAt(indexToRemove);
    }
    questions = questionsCopy;
    return Scaffold(
      body: Container(
        width: double.infinity,
        height: MediaQuery.of(context).size.height,
        decoration: const BoxDecoration(
            gradient: LinearGradient(
                colors: [
              Color.fromARGB(255, 124, 192, 248),
              Color.fromARGB(255, 183, 120, 255),
              Color.fromARGB(255, 32, 33, 104),
            ],
                begin: Alignment.topLeft,
                end: Alignment.bottomRight,
                tileMode: TileMode.clamp)),
        child: Padding(
            padding: const EdgeInsets.all(18.0),
            child: PageView.builder(
              controller: _controller!,
              onPageChanged: (page) {
                if (page == questions.length - 1) {
                  setState(() {
                    btnText = "See Results";
                  });
                }
                setState(() {
                  answered = false;
                });
              },
              physics: const NeverScrollableScrollPhysics(),
              itemBuilder: (context, index) {
                return Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  crossAxisAlignment: CrossAxisAlignment.center,
                  children: [
                    SizedBox(
                      width: double.infinity,
                      child: Text(
                        "Question ${index + 1}/5",
                        textAlign: TextAlign.start,
                        style: const TextStyle(
                          color: Colors.white,
                          fontSize: 28.0,
                        ),
                      ),
                    ),
                    const Divider(
                      color: Colors.white,
                    ),
                    const SizedBox(
                      height: 10.0,
                    ),
                    SizedBox(
                      width: double.infinity,
                      height: 200.0,
                      child: Text(
                        "${questions[index].question}",
                        style: const TextStyle(
                          color: Colors.white,
                          fontSize: 22.0,
                        ),
                      ),
                    ),
                    for (int i = 0; i < questions[index].answers!.length; i++)
                      Container(
                        width: double.infinity,
                        height: 50.0,
                        margin: const EdgeInsets.only(
                            bottom: 20.0, left: 12.0, right: 12.0),
                        child: RawMaterialButton(
                          shape: RoundedRectangleBorder(
                            borderRadius: BorderRadius.circular(8.0),
                          ),
                          fillColor: btnPressed
                              ? questions[index].answers!.values.toList()[i]
                                  ? Colors.green
                                  : Colors.red
                              : Colors.blue,
                          onPressed: !answered
                              ? () {
                                  if (questions[index]
                                      .answers!
                                      .values
                                      .toList()[i]) {
                                    score++;
                                  } else {}
                                  setState(() {
                                    btnPressed = true;
                                    answered = true;
                                  });
                                }
                              : null,
                          child:
                              Text(questions[index].answers!.keys.toList()[i],
                                  style: const TextStyle(
                                    color: Colors.white,
                                    fontSize: 18.0,
                                  )),
                        ),
                      ),
                    const SizedBox(
                      height: 40.0,
                    ),
                    RawMaterialButton(
                      onPressed: () {
                        if (_controller!.page?.toInt() ==
                            questions.length - 1) {
                          Navigator.push(
                              context,
                              MaterialPageRoute(
                                  builder: (context) => ResultScreen(score)));
                        } else {
                          _controller!.nextPage(
                              duration: const Duration(milliseconds: 300),
                              curve: Curves.easeInExpo);

                          setState(() {
                            btnPressed = false;
                          });
                        }
                      },
                      shape: const StadiumBorder(),
                      fillColor: Color.fromARGB(255, 255, 255, 255),
                      padding: const EdgeInsets.all(18.0),
                      elevation: 0.0,
                      child: Text(
                        btnText,
                        style: const TextStyle(
                            color: Color.fromARGB(255, 26, 12, 105)),
                      ),
                    )
                  ],
                );
              },
              itemCount: questions.length,
            )),
      ),
    );
  }
}
