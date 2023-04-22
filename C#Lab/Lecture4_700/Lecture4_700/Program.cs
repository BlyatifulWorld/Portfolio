using System;

namespace Lecture4_700
{
    class Program
    {
        static void Main(string[] args)
        {
            //Korakoch Monka 6321600261
            //input
            Console.Write("Please Enter weight (kg) : ");
            double weight = double.Parse(Console.ReadLine());
            Console.Write("Please Enter height (m***) : ");
            double height = double.Parse(Console.ReadLine());
            //process
            double BMI = weight / (height * height);
            string ob_level = "";
            //if-else if-else หา  Obesity Level  จาก BMI
            if (BMI >= 30) ob_level = "Obese";
            else if (BMI <= 29.9 && BMI >= 25) ob_level = "Overweight";
            else if (BMI <= 24.9 && BMI >= 18.5) ob_level = "Normal";
            else if (BMI <= 18.5) ob_level = "Underweight";
            //output
            Console.WriteLine("BMI = {0}", BMI);
            Console.WriteLine("Obesity Level = {0}", ob_level);
        }
    }
}
