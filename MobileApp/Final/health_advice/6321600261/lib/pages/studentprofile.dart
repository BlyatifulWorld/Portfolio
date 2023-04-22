import 'package:flutter/material.dart';
import 'package:health_advice/main.dart';

class MakerProfile extends StatefulWidget {
  @override
  State<MakerProfile> createState() => _MakerProfileState();
}

class _MakerProfileState extends State<MakerProfile> {
  final double coverHeight = 280;
  final double profileHeight = 144;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: const Text('Profile Page'),
        ),
        body: ListView(children: <Widget>[
          buildTop(),
          buildContent(),
        ]));
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
        backgroundImage: const AssetImage('assets/img/pfp.jpg'),
      );

  Widget buildContent() => Column(
        children: const [
          SizedBox(height: 8),
          Text('About Me',
              style: TextStyle(fontSize: 30, fontWeight: FontWeight.bold)),
          SizedBox(width: 8),
          Text('Health Advice Application Developer',
              style: TextStyle(fontSize: 18, color: Colors.black)),
          SizedBox(height: 30),
          Text(
            'Sole Developer',
            style: TextStyle(
              fontSize: 25,
              color: Color.fromARGB(255, 26, 48, 148),
            ),
          ),
          SizedBox(height: 10),
          Text('Korakoch Monka 6321600261',
              style: TextStyle(
                  fontSize: 18, color: Color.fromARGB(255, 26, 48, 148))),
          SizedBox(height: 30),
          Text('Year 3 Student',
              style: TextStyle(
                  fontSize: 18, color: Color.fromARGB(255, 26, 48, 148))),
          Text('Very very tired and sleepy',
              style: TextStyle(
                  fontSize: 18, color: Color.fromARGB(255, 26, 48, 148))),
          SizedBox(height: 30),
          Text('Contact Me at 0632296759',
              style: TextStyle(
                  fontSize: 25,
                  color: Color.fromARGB(255, 26, 48, 148),
                  fontWeight: FontWeight.bold)),
        ],
      );
}
