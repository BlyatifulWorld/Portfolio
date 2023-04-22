import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:quizproject/screens/welcome.dart';
import 'package:animated_splash_screen/animated_splash_screen.dart';
import 'package:quizproject/screens/about.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: AnimatedSplashScreen(
        splash: Image.asset(
          'assets/img/Astronomy_quiz_logo.png',
        ),
        nextScreen: Welcome(),
        splashTransition: SplashTransition.fadeTransition,
        backgroundColor: Colors.deepPurple.shade800,
        duration: 3000,
      ),
      theme: ThemeData(fontFamily: 'NotoSansThai'
          //textTheme: GoogleFonts.ibmPlexSansThaiTextTheme(),
          ),
    );
  }
}
