public class Maximum_Sub_Array_Sum_Broute_Force {
    public static void maxSum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {  // getting start point
            int start = i;

            for (int j = i; j < numbers.length; j++) {  // getting end point
                int end = j;
                int currSum = 0;

                for (int k = start; k <= end; k++) {    // calculate sums
                    currSum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println("sum is : "+ currSum);   // max sums

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("MAXIMUM SUB ARRAY SUM IS :" + maxSum);
    }
 
    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSum(numbers);
    }
}
