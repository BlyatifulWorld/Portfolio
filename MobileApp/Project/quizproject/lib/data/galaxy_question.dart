import 'package:quizproject/model/question_model.dart';

List<QuestionModel> questions = [
  QuestionModel("Galaxy มีกี่ประเภท เมื่อจำแนกตามรูปทรงสัณฐาน?", {
    "2": false,
    "3": false,
    "4": true,
    "6": false,
  }),
  QuestionModel("Galaxy ใดอยู่ใกล้กับ Galaxy ทางช้างเผือกมากที่สุด?", {
    "Pinwheel Galaxy": false,
    "Andromeda Galaxy": true,
    "Tadpole Galaxy": false,
    "Whirlpool Galaxy": false,
  }),
  QuestionModel("ข้อใดกล่าวไม่ถูกต้องเกี่ยวกับ Galaxy", {
    "ประกอบด้วยแก๊ส ฝุ่น และดาว": false,
    "Spiral galaxy มี 3 ส่วน คือ จาน ส่วนโป่ง เฮโล": false,
    "Galaxy แบ่งเป็นประเภทใหญ่ๆ ได้ 4 ประเภท": true,
    "Galaxy สามารถเคลื่อนที่ได้": false,
  }),
  QuestionModel("Milky Way Galaxy เป็น Galaxy รูปร่างแบบใด", {
    "ก้นหอยหรือกังหันแบบมีแกน": true,
    "ก้นหอยหรือกังหัน": false,
    "วงรี": false,
    "รูปร่างไม่แน่นอน": false,
  }),
  QuestionModel(
      "Galaxy ใดต่อไปนี้ใหญ่ที่สุด โดยเรียงจาก มากไปน้อย "
      "\n 1) Alcyoneus 2) Andromeda 3) NeVe 1 4) Milky Way 5) Malin 1 6) Hercules A",
      {
        "1 > 2 > 6 > 5": false,
        "5 > 3 > 4 > 1": false,
        "3 > 1 > 2 > 4": false,
        "6 > 1 > 2 > 4 ": true,
      }),
  QuestionModel("ข้อใดกล่าวถึง Big Bang ไม่ถูกต้อง", {
    "Edwin Hubble คือผู้คิดค้นทฤษฎีนี้": true,
    "เป็นการระเบิดของพลังงานกลายเป็นสสาร": false,
    "อุณหภูมิในขณะเกิด Big Bang สูงมาก": false,
    "Big Bang ทำให้เอกภพขยายตัวอยู่ช้าๆ": false,
  }),
  QuestionModel("หน่วยมาตรวัดใดที่ใช้ในการวัดระยะห่างระหว่างดวงดาวในอวกาศ", {
    "Kilometer": false,
    "Miles": false,
    "Light year": true,
    "Solar unit": false,
  }),
  QuestionModel("ข้อใดเป็นอนุภาคมูลฐานที่เกิดขึ้นหลังจากการเกิด Big Bang", {
    "Proton, Neutron, Electron": false,
    "Quark, Neutrino, Electron": true,
    "Photon, Electron, Neutron": false,
    "Antiquark, Positron, Electron ": false,
  }),
  QuestionModel("แรงใดที่ทำให้กลุ่มดาวหรือดาวฤกษ์รวมตัวกันจนเป็น Galaxy", {
    "แรงแม่เหล็กไฟฟ้า": false,
    "แรงสู่ศูนย์กลาง": false,
    "แรงนิวเคลียร์": false,
    "แรงโน้มถ่วง": true,
  }),
  QuestionModel(
      "ข้อใดเรียงลำดับระบบทางดาราศาสตร์จากเล็กไปใหญ่ได้ถูกต้อง \n 1) Universe 2) Galaxy 3) Solar system 4) Local group/Cluster, 5) Planet",
      {
        "5 < 4 < 3 < 2 < 1": false,
        "1 < 2 < 3 < 4 < 5": false,
        "5 < 3 < 2 < 4 < 1": true,
        "4 < 5 < 3 < 2 < 1": false,
      }),
];
