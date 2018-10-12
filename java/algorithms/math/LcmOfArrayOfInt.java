public class LcmOfArrayOfInt {
  public static long lcmOfArrayOfInt(int[] array)
   {
       long lcm_of_array_int = 1;
       int divisor = 2;

       while (true) {
           int counter = 0;
           boolean divisible = false;

           for (int i = 0; i < array.length; i++) {

               // For negative number we convert into
               // positive and calculate lcm_of_array_elements.

               if (array[i] == 0) {
                   return 0;
               }
               else if (array[i] < 0) {
                   array[i] = array[i] * (-1);
               }
               if (array[i] == 1) {
                   counter++;
               }

               // Divide array of integers by divisor
               // if divisible completely i.e. without remainder
               // then replace the number with quotient
               if (array[i] % divisor == 0) {
                   divisible = true;
                   array[i] = array[i] / divisor;
               }
           }

           // If divisor able to completely divide any number from array
           // replace lcm_of_array_int with multiplication of divisor and lcm_of_array_int
           // else increment divisor
           if (divisible) {
               lcm_of_array_int = lcm_of_array_int * divisor;
           }
           else {
               divisor++;
           }

           // Check if all element_array is 1 indicate
           // we found all factors and terminate while loop.
           if (counter == array.length) {
               return lcm_of_array_int;
           }
       }
   }

   // Driver Code
   public static void main(String[] args)
   {
       int[] array = { 2, 7, 3, 9, 4 };
       System.out.println(lcmOfArrayOfInt(array));
   }
}
