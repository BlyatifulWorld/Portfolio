// ignore_for_file: prefer_const_constructors

import 'package:flutter/material.dart';

class AboutScreen extends StatefulWidget {
  @override
  _AboutScreenState createState() => _AboutScreenState();
}

class _AboutScreenState extends State<AboutScreen> {
  final double coverHeight = 280;
  final double profileHeight = 144;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: ListView(
        padding: EdgeInsets.zero,
        children: <Widget>[
          buildTop(),
          buildContent(),
        ],
      ),
    );
  }

  Widget buildTop() {
    final top = coverHeight - profileHeight / 2;
    final bottom = profileHeight / 2;

    return Stack(
      clipBehavior: Clip.none,
      alignment: Alignment.center,
      children: [
        Container(
          margin: EdgeInsets.only(bottom: bottom),
          child: buildCoverImage(),
        ),
        Positioned(top: top, child: buildProfileImage()),
      ],
    );
  }

  Widget buildCoverImage() => Container(
      color: Colors.grey,
      child: Image.asset(
        'assets/img/bg2.jpg',
        width: double.infinity,
        height: coverHeight,
        fit: BoxFit.cover,
      ));

  Widget buildProfileImage() => CircleAvatar(
        radius: profileHeight / 2,
        backgroundColor: Colors.grey.shade800,
        backgroundImage: const AssetImage('assets/img/icon.png'),
      );

  Widget buildContent() => Column(
        children: const [
          SizedBox(height: 8),
          Text('About Us',
              style: TextStyle(fontSize: 30, fontWeight: FontWeight.bold)),
          SizedBox(width: 8),
          Text('Astronomy Quiz Developer',
              style: TextStyle(fontSize: 18, color: Colors.black)),
          SizedBox(height: 30),
          Text(
            'UX Developer',
            style: TextStyle(
              fontSize: 25,
              color: Color.fromARGB(255, 62, 18, 143),
            ),
          ),
          SizedBox(height: 10),
          Text('Korakoch Monka 6321600261',
              style: TextStyle(
                  fontSize: 18, color: Color.fromARGB(255, 62, 18, 143))),
          SizedBox(height: 30),
          Text(
            'UI Developer',
            style: TextStyle(
              fontSize: 25,
              color: Color.fromARGB(255, 62, 18, 143),
            ),
          ),
          SizedBox(height: 10),
          Text('Napat Parkdee 6321600270',
              style: TextStyle(
                  fontSize: 18, color: Color.fromARGB(255, 62, 18, 143))),
          SizedBox(height: 30),
        ],
      );
}
