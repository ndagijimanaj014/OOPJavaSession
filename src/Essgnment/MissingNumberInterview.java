package Essgnment;



public class MissingNumberInterview {


    public static void main(String[] args)
    {
        int p = 9;

        int[] a = {1,3,4,2,7, 8, 6,9};
        int sumOfNnumbers=sumOfNnumbers(p);
        int sumOfElements=sumOfElements(a);
        int missingOfNumber=sumOfNnumbers(p)-sumOfElements(a);
        System.out.println("the missing number="+missingOfNumber);

//        //Step 1
//
//        int sumOfNnumbers = sumOfNnumbers(n);
//
//        //Step 2
//
//        int sumOfElements = sumOfElements(a);
//
//        //Step 3
//
//        int missingNumber = sumOfNnumbers - sumOfElements;
//
//        System.out.println("Missing Number is = "+missingNumber);
    }

	 //Method to calculate sum of 'n' numbers

  public static int sumOfNnumbers(int n)
   {
       int sum = (n * (n+1))/ 2;

       return sum;
   }

   //Method to calculate sum of all elements of array

  public static int sumOfElements(int[] array)
   {
       int sum = 0;

       for (int i = 0; i < array.length; i++)
       {
           sum = sum + array[i];
       }

       return sum;
   }
}