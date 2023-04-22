using System;

namespace Lecture4_700_Lab
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Press any following key to perform an arithmetic operation:");
            Console.WriteLine("1 - Addition.");
            Console.WriteLine("2 - Subtraction");
            Console.WriteLine("3 - Multipliation");
            Console.WriteLine("4 - Division");
            //input
            int op = int.Parse(Console.ReadLine());
            if (op > 4 || op < 1)
            {
                Console.Clear();
                continue;
            }
            Console.Write("Enter Value 1:");
            float v1 = float.Parse(Console.ReadLine());
            Console.Write("Enter Value 2:");
            float v2 = float.Parse(Console.ReadLine());
            double result = 0;
            //process
            switch (op)
            {
                case 1:
                    result = v1 + v2; //process
                    Console.WriteLine("{0} + {1} = {2}", v1, v2, result); //output
                    break;
                case 2:
                    result = v1 - v2;
                    Console.WriteLine("{0} - {1} = {2}", v1, v2, result); //output
                    break;
                case 3:
                    result = v1 * v2;
                    Console.WriteLine("{0} * {1} = {2}", v1, v2, result); //output
                    break;
                case 4:
                    result = v1 / v2;
                    Console.WriteLine("{0} / {1} = {2}", v1, v2, result); //output
                    break;
                default: Console.WriteLine("Please Enter Number between 1-4!!"); break;
            }
        }
    }
}
