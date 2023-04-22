import 'package:quizproject/model/question_model.dart';

List<QuestionModel> questions = [
  QuestionModel("ดาวเทียมดวงแรกของโลกคือ", {
    "MAGELLAN": false,
    "Sputnik": true,
    "ACRIMSAT": false,
    "Thaichote": false,
  }),
  QuestionModel("ดาวเทียมดวงแรกของอเมริกาคือ?", {
    "Explorer 1": true,
    "Apollo 1": false,
    "Expedition 1": false,
    "Mercury 1": false,
  }),
  QuestionModel("ข้อใดไม่ใช่ส่วนประกอบของดาวเทียม", {
    "Payload": false,
    "ระบบพลังงาน": false,
    "เสาอากาศ": false,
    "พื้นที่โดยสาร": true,
  }),
  QuestionModel(
      "ในปัจจุบันดาวเทียมที่ส่งออกจากโลกมีเท่าใด \n (รวมทั้งปลดระวาง)", {
    "มากกว่า 100": false,
    "มากกว่า 1000": false,
    "มากกว่า 3000": false,
    "มากกว่า 5000": true,
  }),
  QuestionModel("วงโคจรของดาวเทียม GPS เหนือพื้นโลกเท่าไร", {
    "400 km": false,
    "6,000 km": false,
    "20,000 km": true,
    "35,800 km": false,
  }),
  QuestionModel("ดาวเทียมสื่อสารโคจรเหนือพื้นโลกเท่าไร", {
    "35,800 km": true,
    "20,000 km": false,
    "6,000 km": false,
    "400 km": false,
  }),
  QuestionModel(
      "กล้องโทรทัศน์สมัยใหม่เปลี่ยนจากการใช้ฟิล์มในการจับภาพเป็นสิ่งใด", {
    "CD-ROM": false,
    "CCD": true,
    "SSD": false,
    "HDD": false,
  }),
  QuestionModel("ข้อใดไม่ใช่ระดับการโคจรของดาวเทียม", {
    "วงโคจรระดับสูง": true,
    "วงโคจรระดับกลาง": false,
    "วงโคจรระดับต่ำ": false,
    "วงโคจรค้างฟ้า": false,
  }),
  QuestionModel(
      "หากจะสังเกตวัตถุท้องฟ้าในหลายช่วงคลื่นควรใช้กล้องโทรทรรศน์อวกาศในข้อใด",
      {
        "กล้องโทรทรรศน์อวกาศฟาสต์": false,
        "กล้องโทรทรรศน์อวกาศฮับเบิล": true,
        "กล้องโทรทรรศน์อวกาศจันทรา": false,
        "กล้องโทรทรรศน์อวกาศสปิตเซอร์": false,
      }),
  QuestionModel("ใครเป็นคนแรกที่พัฒนากล้องโทรทรรศน์แบบสะท้อนแสง", {
    "Nicolaus Copernicus": false,
    "Galileo Galilei": false,
    "Isaac Newton": true,
    "Tycho Brahe": false,
  }),
];
