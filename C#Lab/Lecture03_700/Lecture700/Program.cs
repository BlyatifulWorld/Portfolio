using System;

namespace Lecture700
{
    class Program
    {
        static void Main(string[] args)
        {
            //Header or something idk I'm Korakoch Monka 6321600261 
            Console.WriteLine("This is a program for calculating the speed in straight line or soemthing");
            Console.WriteLine("-------------------------------------------------------------------------");
            //Input
            Console.Write("Please enter original speed (u) = ");
            double u = double.Parse(Console.ReadLine());
            Console.Write("Please enter accelerationn (a) = ");
            double a = double.Parse(Console.ReadLine());
            Console.Write("Plese enter the time (t) = ");
            double t = double.Parse(Console.ReadLine());
            //Process
            double s = u * t + ((1.0 / 2.0) * a * (t * t));
            //Output help i'm tired please send bob
            Console.WriteLine("-------------------------------------------------------------------------");
            Console.WriteLine("The distant is = {0}", s);
        }
    }
}
