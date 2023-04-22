import 'package:flutter/material.dart';
import 'package:carousel_slider/carousel_slider.dart';
import 'package:form_field_validator/form_field_validator.dart';
import 'package:shared_preferences/shared_preferences.dart';

void main() {
  runApp(const MyApp());
}

class Product {
  String name;
  double price;
  String description;

  Product({required this.name, required this.description, required this.price});
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Learning Flutter',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const HomeScreen(),
    );
  }
}

class HomeScreen extends StatefulWidget {
  const HomeScreen({Key? key}) : super(key: key);

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 2,
      child: Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.deepPurple,
          bottom: const TabBar(
            indicatorColor: Colors.amberAccent,
            indicatorWeight: 2,
            tabs: [
              Tab(icon: Icon(Icons.person_outline_rounded)),
              Tab(icon: Icon(Icons.calculate_outlined)),
            ],
          ),
          title: const Text('Tabs Demo'),
        ),
        body: TabBarView(
          children: [
            Container(
              margin: const EdgeInsets.symmetric(vertical: 1),
              child: buildCarousel(context),
            ),
            buildWorkingForm(context),
          ],
        ),
      ),
    );
  }

  Widget buildCarousel(BuildContext context) {
    final srcImages = [
      const AssetImage('assets/images/pfp1.jpg'),
      const AssetImage('assets/images/pfp2.jpg'),
      const AssetImage('assets/images/pfp3.jpg'),
      const AssetImage('assets/images/pfp4.jpg')
    ];

    Widget buildImage(AssetImage assetImage, int index) => Container(
          margin: const EdgeInsets.symmetric(horizontal: 12),
          color: Colors.grey,
          width: double.infinity,
          child: Image(
            image: assetImage,
            fit: BoxFit.cover,
          ),
        );

    return Scaffold(
      backgroundColor: Colors.blueGrey,
      body: Center(
        child: Container(
          alignment: Alignment.center,
          child: Column(
            children: [
              CarouselSlider.builder(
                  options: CarouselOptions(
                    height: 300,
                    autoPlay: true,
                    autoPlayInterval: const Duration(seconds: 3),
                    enlargeCenterPage: true,
                    viewportFraction: 0.9,
                    aspectRatio: 2.0,
                    initialPage: 0,
                  ),
                  itemCount: srcImages.length,
                  itemBuilder: (context, index, realIndex) {
                    final assetImage = srcImages[index];
                    return buildImage(assetImage, index);
                  }),
              Card(
                child: Container(
                  margin:
                      const EdgeInsets.symmetric(horizontal: 20, vertical: 1),
                  child: const Text('6321600261',
                      style: TextStyle(
                          fontFamily: 'Supermarket',
                          fontSize: 20,
                          color: Colors.red)),
                ),
              ),
              Card(
                child: Container(
                    margin: const EdgeInsets.symmetric(horizontal: 30),
                    child: Column(
                      children: const [
                        ListTile(
                          title: Text(
                            'นายกรกช หมั่นค้า',
                            style: TextStyle(
                              fontFamily: 'Supermarket',
                              color: Colors.black,
                              fontSize: 15,
                            ),
                          ),
                          leading: Icon(
                            Icons.library_books,
                            color: Colors.black,
                          ),
                          trailing: Text(
                            'Mr. Korakoch Monka',
                            style: TextStyle(
                              fontFamily: 'Supermarket',
                              color: Colors.black,
                              fontSize: 15,
                            ),
                          ),
                        )
                      ],
                    )),
              ),
              Container(
                  margin:
                      const EdgeInsets.symmetric(horizontal: 33, vertical: 0),
                  child: Column(
                    children: const [
                      ListTile(
                        title: Text(
                          'Phone Numbers:',
                          style: TextStyle(
                            fontFamily: 'Supermarket',
                            color: Colors.yellowAccent,
                            fontSize: 15,
                          ),
                        ),
                        leading: Icon(
                          Icons.phone_android,
                          color: Colors.yellowAccent,
                        ),
                        trailing: Text(
                          '063-2296759',
                          style: TextStyle(
                            fontFamily: 'Supermarket',
                            color: Colors.yellowAccent,
                            fontSize: 15,
                          ),
                        ),
                      )
                    ],
                  )),
              Card(
                  child: Container(
                      margin: const EdgeInsets.symmetric(
                          horizontal: 30, vertical: 0),
                      child: Column(
                        children: const [
                          ListTile(
                            title: Text(
                              'ระดับชั้นปีที่: 3',
                              style: TextStyle(
                                fontFamily: 'Supermarket',
                                color: Colors.deepPurple,
                                fontSize: 15,
                              ),
                            ),
                            leading: Icon(
                              Icons.phone_android,
                              color: Colors.deepPurple,
                            ),
                            trailing: Text(
                              'ภาคปลาย',
                              style: TextStyle(
                                fontFamily: 'Supermarket',
                                color: Colors.deepPurple,
                                fontSize: 15,
                              ),
                            ),
                          )
                        ],
                      ))),
            ],
          ),
        ),
      ),
    );
  }

  double num1 = 0, num2 = 0, num3 = 0;

  Future<void> showResult(double result, price) async {
    return showDialog<void>(
      context: context,
      barrierDismissible: false,
      builder: (BuildContext context) {
        return AlertDialog(
          title: const Text('ผลลัพธ์'),
          shape: const RoundedRectangleBorder(
              borderRadius: BorderRadius.all(Radius.circular(15.0))),
          content: SingleChildScrollView(
            child: ListBody(
              children: <Widget>[
                Text('จำนวนคิวปูนคือ $result คิว'),
                const Text('ราคาปูนต่อคิวคือ 1,700 บาท'),
                Text('ราคารวมทั้งหมด $price บาท'),
              ],
            ),
          ),
          actions: <Widget>[
            TextButton(
              child: const Text('Close'),
              onPressed: () {
                Navigator.of(context).pop();
              },
            ),
          ],
        );
      },
    );
  }

  Widget buildWorkingForm(BuildContext context) {
    final formKey = GlobalKey<FormState>();

    return SingleChildScrollView(
      child: Column(
        children: [
          const ListTile(
            title: Center(child: Text('คำนวณคิวปูนพร้อมราคาในเรทสั่งเผื่อ 5%')),
          ),
          Form(
            key: formKey,
            autovalidateMode: AutovalidateMode.onUserInteraction,
            child: Column(
              children: [
                Container(
                  margin: const EdgeInsets.fromLTRB(22, 20, 20, 0),
                  alignment: Alignment.topLeft,
                  child: const Text('ความกว้างปูน'),
                ),
                Container(
                  margin: const EdgeInsets.all(20),
                  child: TextFormField(
                    decoration: InputDecoration(
                      labelText: 'ความกว้างของปูน (เมตร)',
                      hintText: 'โปรดใส่ขนาดความกว้างของปูน (เมตร)',
                      border: OutlineInputBorder(
                        borderSide:
                            const BorderSide(color: Colors.grey, width: 32.0),
                        borderRadius: BorderRadius.circular(10.0),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderSide:
                            const BorderSide(color: Colors.grey, width: 1.0),
                        borderRadius: BorderRadius.circular(10.0),
                      ),
                    ),
                    onChanged: (value) {
                      num1 = double.parse(value);
                    },
                    validator: MultiValidator([
                      RequiredValidator(errorText: 'ต้องใส่ข้อมูล'),
                      PatternValidator('[0-9]',
                          errorText: 'ต้องใส่ข้อมูลตัวเลขเท่านั้น'),
                    ]),
                  ),
                ),
                Container(
                  margin: const EdgeInsets.fromLTRB(22, 20, 20, 0),
                  alignment: Alignment.topLeft,
                  child: const Text('ความยาวปูน'),
                ),
                Container(
                  margin: const EdgeInsets.all(20),
                  child: TextFormField(
                    decoration: InputDecoration(
                      labelText: 'ความยาวของปูน (เมตร)',
                      hintText: 'โปรดใส่ขนาดความยาวของปูน (เมตร)',
                      border: OutlineInputBorder(
                        borderSide:
                            const BorderSide(color: Colors.grey, width: 32.0),
                        borderRadius: BorderRadius.circular(10.0),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderSide:
                            const BorderSide(color: Colors.grey, width: 1.0),
                        borderRadius: BorderRadius.circular(10.0),
                      ),
                    ),
                    onChanged: (value) {
                      num2 = double.parse(value);
                    },
                    validator: MultiValidator([
                      RequiredValidator(errorText: 'ต้องใส่ข้อมูล'),
                      PatternValidator('[0-9]',
                          errorText: 'ต้องใส่ข้อมูลตัวเลขเท่านั้น'),
                    ]),
                  ),
                ),
                Container(
                  margin: const EdgeInsets.fromLTRB(22, 20, 20, 0),
                  alignment: Alignment.topLeft,
                  child: const Text('ความหนาของปูน'),
                ),
                Container(
                  margin: const EdgeInsets.all(20),
                  child: TextFormField(
                    decoration: InputDecoration(
                      labelText: 'ความหนาของปูน (เซนติเมตร)',
                      hintText: 'โปรดใส่ขนาดความสูงของปูน (เซนติเมตร)',
                      border: OutlineInputBorder(
                        borderSide:
                            const BorderSide(color: Colors.grey, width: 32.0),
                        borderRadius: BorderRadius.circular(10.0),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderSide:
                            const BorderSide(color: Colors.grey, width: 1.0),
                        borderRadius: BorderRadius.circular(10.0),
                      ),
                    ),
                    onChanged: (value) {
                      num3 = double.parse(value);
                    },
                    validator: MultiValidator([
                      RequiredValidator(errorText: 'ต้องใส่ข้อมูล'),
                      PatternValidator('[0-9]',
                          errorText: 'ต้องใส่ข้อมูลตัวเลขเท่านั้น')
                    ]),
                  ),
                ),
                Container(
                  padding: const EdgeInsets.all(20),
                  child: Row(
                    children: [
                      Expanded(
                        child: ElevatedButton(
                          style: ButtonStyle(
                            backgroundColor: MaterialStateProperty.all<Color>(
                                Colors.deepPurpleAccent),
                          ),
                          child: const Text('คำนวณคิว และราคา'),
                          onPressed: () {
                            if (formKey.currentState!.validate()) {
                              double beforeReCalculate =
                                  num1 * num2 * (num3 / 100);
                              double result = beforeReCalculate +
                                  (beforeReCalculate * 0.05);
                              double price = result * 1700;
                              showResult(result, price);
                            }
                          },
                        ),
                      ),
                    ],
                  ),
                )
              ],
            ),
          ),
        ],
      ),
    );
  }
}
