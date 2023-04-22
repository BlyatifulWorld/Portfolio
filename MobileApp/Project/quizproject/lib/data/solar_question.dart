import 'package:quizproject/model/question_model.dart';

List<QuestionModel> questions = [
  QuestionModel("ระบบสุริยะอยู่ตำแหน่งใดของทางช้างเผือก", {
    "แขนของทางช้างเผือก": true,
    "ขอบสุดของทางช้างเผือก": false,
    "ใจกลางของทางช้างเผือก": false,
    "ฐานล่างของทางช้างเผือก": false,
  }),
  QuestionModel("ชั้นบรรยากาศนอกสุดของดวงอาทิตย์คือชั้นใด", {
    "Photosphere": false,
    "Chromosphere": false,
    "Transition Region": false,
    "Corona": true,
  }),
  QuestionModel("ดาวเคราะห์ใดไม่ใช่ดาวเคราะห์ชั้นนอก", {
    "Jupiter": false,
    "Saturn": false,
    "Uranus": false,
    "Venus": true,
  }),
  QuestionModel("ข้อใดไม่ใช่ลักษณะของดาวเคราะห์ชั้นใน", {
    "มีขนาดเล็ก": false,
    "มีวงแหวนหลายอัน": true,
    "เป็นดาวเคราะห์หิน": false,
    "มีดวงจันทร์น้อยหรือไม่มี": false,
  }),
  QuestionModel(
      "จงเรียงลำดับดาวเคราะห์ขนาดใหญ่ไปเล็ก \n 1.Neptune 2.Saturn 3.Mercury 4.Jupiter",
      {
        "1 > 2 > 3 > 4": false,
        "4 > 2 > 1 > 3": true,
        "4 > 1 > 2 > 3": false,
        "4 > 1 > 3 > 2": false,
      }),
  QuestionModel("ดาวเคราะห์ใดร้อนที่สุด", {
    "Neptune": false,
    "Earth": false,
    "Venus": true,
    "Mercury": false,
  }),
  QuestionModel("ดาวเคราะห์ใดที่มีสภาพอากาศที่รุนแรงเพราะแกนเอียงมาก", {
    "Neptune": false,
    "Mercury": false,
    "Venus": false,
    "Uranus": true,
  }),
  QuestionModel("ปัจจัยใดที่ใช้ในกำหนดสีของดวงดาว", {
    "อุณหภูมิ": true,
    "ขนาด": false,
    "รูปร่าง": false,
    "แรงโน้มถ่วง": false,
  }),
  QuestionModel("ดาวดวงใดใหญ่ที่สุดในระบบสุริยะ", {
    "Jupiter": false,
    "Saturn": false,
    "Sun": true,
    "Pluto": false,
  }),
  QuestionModel("ข้อใดเป็นปัจจัยที่ทำให้ดาวเคราะห์มีแรงดึงดูดต่างกัน", {
    "ชนิดของดาวเคราะห์": false,
    "น้ำหนักของดาวเคราะห์": true,
    "ขนาดของดาวเคราะห์": false,
    "อุณหภูมิของดาวเคราะห์": false,
  }),
];
