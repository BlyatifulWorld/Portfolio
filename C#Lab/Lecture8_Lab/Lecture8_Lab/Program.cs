using System;

namespace Lecture8_Lab
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = new int[1000000];
            int[] b = new int[20000];
            long loop_count = 0;
            for (int i = 0; i < a.Length; i++)
            {
                for (int j = 0; j < b.Length; j++)
                {
                    loop_count++;
                }
            }
            Console.WriteLine(loop_count);

        }
    }
}
