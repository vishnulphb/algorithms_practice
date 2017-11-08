using System;
using System.Collections.Generic;
using System.Text;
 
namespace CSharpMergeSort
{
 class Mergesort
    {
       public static void Main(string[] args)
        {
            int[] numbers = { 3, 8, 7, 5, 2, 1, 9, 6, 4 };
            int len = 9;
 
            Console.WriteLine("MergeSort By Recursive Method");
            MergeSort_Recursive(numbers, 0, len - 1);
        }
        
         static public void MergeSort_Recursive(int [] numbers, int left, int right)
        {
          int mid;
         //Console.Write(String.Join("", numbers));
             Console.Write(":"+left+":"+right);
             Console.WriteLine();
          if (right > left)
          {
            mid = (right + left) / 2;
            MergeSort_Recursive(numbers, left, mid);
              Console.WriteLine("..Step 1 Finished..");
            MergeSort_Recursive(numbers, (mid + 1), right);
               Console.WriteLine("Now Merge");
             
          }
        }
    }
}