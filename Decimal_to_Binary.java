/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [15/06/26] → #2  [16/06/26] → #3  [17/06/26]                    │
 * │  #4  [18/06/26] → #5  [19/06/26] → #6  [20/06/26]                    │
 * │  #7  [21/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 71: Convert Decimal Number to Binary                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a decimal (base-10) integer, convert it into its equivalent   │
 * │ binary (base-2) representation.                                     │
 * │ The binary number is constructed by repeatedly dividing the decimal │
 * │ number by 2 and storing the remainders.                             │
 * │ Input: A decimal integer. Output: Equivalent binary integer.        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 20                                                         │
 * │ Output : 10100                                                      │
 * │ Explanation :                                                       │
 * │ 20 ÷ 2 = 10, Remainder = 0                                          │
 * │ 10 ÷ 2 = 5,  Remainder = 0                                          │
 * │  5 ÷ 2 = 2,  Remainder = 1                                          │
 * │  2 ÷ 2 = 1,  Remainder = 0                                          │
 * │  1 ÷ 2 = 0,  Remainder = 1                                          │
 * │ Reading remainders from bottom to top gives 10100.                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n should be a non-negative integer.                                 │
 * │ The resulting binary number should fit within the integer range.    │
 * │ This implementation stores the binary representation as an integer. │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize binary result and positional power to 0.        │
 * │ Step 2 : Find the remainder by dividing the number by 2.            │
 * │ Step 3 : Place the remainder at the correct decimal position using  │
 * │          10^power and add it to the binary result.                  │
 * │ Step 4 : Divide the number by 2 and increment the power.            │
 * │ Step 5 : Repeat until the number becomes 0 and return the result.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Number System Conversion | Mathematical Computation                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 20                                                          │
 * │ n = 20 → rem = 0 → binNum = 0                                       │
 * │ n = 10 → rem = 0 → binNum = 0                                       │
 * │ n = 5  → rem = 1 → binNum = 100                                     │
 * │ n = 2  → rem = 0 → binNum = 100                                     │
 * │ n = 1  → rem = 1 → binNum = 10100                                   │
 * │ Output : 10100                                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(log₂n)                                         │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Decimal_to_Binary {
    
    public static void main(String args[]){
        int decimal = 20;
        
    }
}

/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [15/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 71: Convert Decimal Number to Binary                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a decimal (base-10) integer, convert it into its equivalent   │
 * │ binary (base-2) representation.                                     │
 * │ The binary number is constructed by repeatedly dividing the decimal │
 * │ number by 2 and storing the remainders.                             │
 * │ Input: A decimal integer. Output: Equivalent binary integer.        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 20                                                         │
 * │ Output : 10100                                                      │
 * │ Explanation :                                                       │
 * │ 20 ÷ 2 = 10, Remainder = 0                                          │
 * │ 10 ÷ 2 = 5,  Remainder = 0                                          │
 * │  5 ÷ 2 = 2,  Remainder = 1                                          │
 * │  2 ÷ 2 = 1,  Remainder = 0                                          │
 * │  1 ÷ 2 = 0,  Remainder = 1                                          │
 * │ Reading remainders from bottom to top gives 10100.                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n should be a non-negative integer.                                 │
 * │ The resulting binary number should fit within the integer range.    │
 * │ This implementation stores the binary representation as an integer. │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize binary result and positional power to 0.        │
 * │ Step 2 : Find the remainder by dividing the number by 2.            │
 * │ Step 3 : Place the remainder at the correct decimal position using  │
 * │          10^power and add it to the binary result.                  │
 * │ Step 4 : Divide the number by 2 and increment the power.            │
 * │ Step 5 : Repeat until the number becomes 0 and return the result.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Number System Conversion | Mathematical Computation                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 20                                                          │
 * │ n = 20 → rem = 0 → binNum = 0                                       │
 * │ n = 10 → rem = 0 → binNum = 0                                       │
 * │ n = 5  → rem = 1 → binNum = 100                                     │
 * │ n = 2  → rem = 0 → binNum = 100                                     │
 * │ n = 1  → rem = 1 → binNum = 10100                                   │
 * │ Output : 10100                                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(log₂n)                                         │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Decimal_to_Binary {                                     ║
* ║     public static int decToBin(int n){                               ║
* ║         int myNum = n;                                               ║
* ║         int pow = 0;                                                 ║
* ║         int binNum = 0;                                              ║
* ║         while(n > 0){                                                ║
* ║             int rem = n % 2;                                         ║
* ║             binNum = binNum + (rem * (int)Math.pow(10, pow));        ║
* ║             pow++;                                                   ║
* ║             n /= 2;                                                  ║
* ║         }                                                            ║
* ║         return binNum;                                               ║
* ║     }                                                                ║
* ║     public static void main(String args[]){                          ║
* ║         int decimal = 20;                                            ║
* ║         int binary = decToBin(decimal);                              ║
* ║         System.out.println("BINARY OF "+decimal+" IS : "+binary);    ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Mathematical & Execution Breakdown for 20:                          ║
* ║                                                                      ║
* ║  Iter  |  n  | remainder (n%2) | calculation: binNum + (rem * 10^pow)║
* ║  ------|-----|-----------------|------------------------------------ ║
* ║   1    |  20 |        0        |   0 + (0 * 10^0) = 0                ║
* ║   2    |  10 |        0        |   0 + (0 * 10^1) = 0                ║
* ║   3    |   5 |        1        |   0 + (1 * 10^2) = 100              ║
* ║   4    |   2 |        0        | 100 + (0 * 10^3) = 100              ║
* ║   5    |   1 |        1        | 100 + (1 * 10^4) = 10100            ║
* ║                                                                      ║
* ║  Output:                                                             ║
* ║  BINARY OF 20 IS : 10100                                             ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
