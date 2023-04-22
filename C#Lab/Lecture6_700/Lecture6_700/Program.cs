using System;

namespace Lecture6_700
{
    class Program
    {
        static void Main(string[] args)
        {
            public static double standardDeviation(IEnumerable<double> sequence) 
            {
                double result = 0;
                //Korakoch Monka 6321600261
                if (sequence.Any())
                {
                    double average = sequence.Average(); //หาค่าเฉลี่ย
                    double sum = sequence.Sum(d => Math.Pow(d - average, 2)); //สูตร
                                                                              //ถอดสแควร์รูท หารด้วย sequence -1 ถ้า sequence = 1 ลบ 1 จะได้ 0 ในภาษา C# ใดๆหาร 0 = NaN
                    result = Math.Sqrt((sum) / (sequence.Count() - 1));
                }
                return result; //standardDeviation ส่งค่า result กลับไปยังฟังก์ชั่นที่เรียกใช้มัน (ในที่นี้คือ main)
            }

            static void (string[] args)
            {
                Console.Write("Max Input : ");
                int N = int.Parse(Console.ReadLine());

                Console.Write("First Info : ");
                int data = int.Parse(Console.ReadLine());

                int max = data;
                int min = data;
                double sum = data;
                double avg;

                List<double> intList = new List<double> { };
                intList.Add(data); 

                for (int i = 1; i < N; i++)
                {
                    Console.Write("Info {0} : ", i + 1);
                    data = int.Parse(Console.ReadLine());
                    sum = sum + data;
                    if (data < min) min = data;
                    if (data > max) max = data;
                    intList.Add(data); 
                }
                avg = sum / N;
                
                double standard_deviation = standardDeviation(intList);

                Console.WriteLine("\nsum = {0}", sum);
                Console.WriteLine("min = {0}", min);
                Console.WriteLine("max = {0}", max);
                Console.WriteLine("Average = {0} ", avg);
                Console.WriteLine("Standard Deviation = {0}", standard_deviation);
            }
        }
    }
}
