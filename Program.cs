using System;

namespace Test123
{
    class Program
    {
        public static int FindMissNo(int[]a,int n)
        {
           
            int sum = (1 + n) * n / 2;

            for (int i = 0; i < a.Length; i++)
            {
                sum = sum - a[i];
            }

            return sum;
        }


        static void Main(string[] args)
        {
            int[] array = new int[100];

            for (int i = 0; i < array.Length; i++)
            {
                if (i == 25) continue;
                array[i] = i + 1;
                 Console.Write(array[i] + " ");
            }
            Console.WriteLine();
            int miss = FindMissNo(array, 100);
            Console.WriteLine(miss);
        }
    }
}
