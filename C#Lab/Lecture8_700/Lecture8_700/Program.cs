using System;

namespace Lecture8_700
{
    class Program
    {
        static string first_last_line(int n)
        {
            int n2 = n / 2;
            string line = "";
            for (int i = 0; i < n2; i++) line = line + "-";
            line = line + "*";
            for (int i = 0; i < n2; i++) line = line + "-";
            return line;
        }
        static string middle_line(int line_i, int n)
        {
            string line = "";
            int n2 = n / 2;
            for (int i = 0; i < n2 - line_i; i++) line = line + "-";
            line = line + "*";
            for (int i = 0; i < 2 * line_i - 1; i++) line = line + "-";
            line = line + "*";
            for (int i = 0; i < n2 - line_i; i++) line = line + "-";
            return line;
        }
        static void Main(string[] args)
        {
            Console.WriteLine("https://programming.in.th/task/rev2_problem.php?pid=0022");
            Console.Write("Please Enter Number of Line: ");
            int n = int.Parse(Console.ReadLine());
            int n2 = n / 2; // n หาร 2 : 9=>4

            string line = "";
            //บรรทัดแรก 
            line = first_last_line(n);
            Console.WriteLine(line);
            //บรรทัดที่สอง-ถึง n หาร 2
            for (int i = 1; i < n2; i++)
            {
                line = middle_line(i, n);
                Console.WriteLine(line);
            }
            //บรรทัดตรงกลาง
            line = middle_line(n2, n);
            if (n % 2 == 0)// n จำนวนคู่
            {
                Console.WriteLine(line);
                Console.WriteLine(line);
            }
            else // n จำนวนคี่
            {
                Console.WriteLine(line);
            }
            //ย้อนกลับ
            for (int i = n2 - 1; i > 0; i--)
            {
                line = middle_line(i, n);
                Console.WriteLine(line);
            }
            //บรรทัดสุดท้าย
            line = first_last_line(n);
            Console.WriteLine(line);
        }
    }
}
