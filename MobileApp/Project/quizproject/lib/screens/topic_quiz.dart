import 'package:flutter/material.dart';
import 'package:quizproject/screens/galaxy_screen.dart';
import 'package:quizproject/screens/solar_screen.dart';
import 'package:quizproject/screens/earth_screen.dart';
import 'package:quizproject/screens/satellite_screen.dart';
import 'package:quizproject/screens/nebula_screen.dart';
import 'package:quizproject/screens/constellations_screen.dart';

class TopicScreen extends StatefulWidget {
  const TopicScreen({Key? key}) : super(key: key);

  @override
  _TopicScreenState createState() => _TopicScreenState();
}

class _TopicScreenState extends State<TopicScreen> {
//Card for topic screen
  Card makeTopicItem(String title, String img, int index) {
    return Card(
      elevation: 2,
      margin: const EdgeInsets.all(8),
      child: Container(
        decoration: BoxDecoration(
            borderRadius: BorderRadius.circular(5),
            gradient: const LinearGradient(
                begin: FractionalOffset(0.0, 0.0),
                end: FractionalOffset(1.0, -0.5),
                colors: [
                  Color.fromARGB(255, 68, 151, 247),
                  Color.fromARGB(255, 255, 123, 244),
                ]),
            boxShadow: const [
              BoxShadow(
                  color: Colors.white, blurRadius: 3, offset: Offset(2, 2))
            ]),
        child: InkWell(
          onTap: () {
            if (index == 0) {
              //Earth Topic
              Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => const EarthScreen(),
                  ));
            }
            if (index == 1) {
              //Solar System
              Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => const SolarScreen(),
                  ));
            }
            if (index == 2) {
              //Galaxy
              Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => const GalaxyScreen(),
                  ));
            }
            if (index == 3) {
              //Constellations
              Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => const ConstellationsScreen(),
                  ));
            }
            if (index == 4) {
              //Satellite
              Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => const SatelliteScreen(),
                  ));
            }
            if (index == 5) {
              //Nebula
              Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => const NebulaScreen(),
                  ));
            }
          },
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            mainAxisSize: MainAxisSize.min,
            verticalDirection: VerticalDirection.down,
            children: [
              const SizedBox(height: 50),
              Center(
                child: Image.asset(
                  img,
                  height: 70,
                  width: 70,
                ),
              ),
              const SizedBox(height: 20),
              Center(
                  child: Text(
                title,
                style: const TextStyle(
                  fontSize: 20,
                  color: Colors.white,
                ),
              )),
            ],
          ),
        ),
      ),
    );
  }

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
          children: [
            const SizedBox(height: 80),
            Padding(
              padding: const EdgeInsets.only(left: 16, right: 16),
              child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: const [
                        Text(
                          "Select Topic Astronomy Quiz",
                          style: TextStyle(
                              fontSize: 25,
                              fontWeight: FontWeight.bold,
                              color: Colors.white),
                        ),
                      ],
                    ),
                  ]),
            ),
            const SizedBox(height: 20),
            Expanded(
                child: GridView.count(
              crossAxisCount: 2,
              padding: const EdgeInsets.all(2),
              children: [
                makeTopicItem("Earth Topic", "assets/img/world_1.png", 0),
                makeTopicItem("Solar System", "assets/img/planet_1.png", 1),
                makeTopicItem("Galaxy", "assets/img/galaxy_1.png", 2),
                makeTopicItem(
                    "Constellations", "assets/img/constellation_1.png", 3),
                makeTopicItem("Satellite", "assets/img/satellie_1.png", 4),
                makeTopicItem("Nebula", "assets/img/nebula_1.png", 5)
              ],
            ))
          ],
        ),
      ),
    );
  }
}
