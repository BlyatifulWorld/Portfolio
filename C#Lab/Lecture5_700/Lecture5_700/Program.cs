using System;
using System.Collections.Generic;
using System.Linq;

namespace Lecture5_700
{
    class Program
    {
        static void Main(string[] args)
        {
            //6321600261 กรกช หมั่นค้า
            Console.Write("How many data : ");
            int N = int.Parse(Console.ReadLine());
            Console.Write("Enter the first data ");
            int data = int.Parse(Console.ReadLine());
            int max = data;
            int min = data;
            double sum = data;
            double avg;
            for (int i = 1; i < N; i++)
            {
                Console.Write("Enter the data number {0} : ", i + 1);
                data = int.Parse(Console.ReadLine());
                sum = sum + data;
                if (data < min) min = data;
                Console.WriteLine("min = {0}", min);
                if (data > max) max = data;
                Console.WriteLine("max = {0}", max);
            }
            avg = sum / N;
            Console.WriteLine("ผลรวม = {0} : ", sum);
            Console.WriteLine("min = {0} ", min);
            Console.WriteLine("max = {0} ", max);
            Console.WriteLine("avg = {0} ", avg);
        }
    }
}
