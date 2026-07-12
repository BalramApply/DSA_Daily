/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [14/06/26] → #2  [15/06/26] → #3  [16/06/26]                    │
 * │  #4  [17/06/26] → #5  [18/06/26] → #6  [19/06/26]                    │
 * │  #7  [20/06/26] → #8  [21/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 70: Convert Binary Number to Decimal                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a binary number represented as an integer, convert it into    │
 * │ its equivalent decimal (base-10) number.                            │
 * │ Process each binary digit from right to left using positional       │
 * │ values of powers of 2.                                              │
 * │ Input: A binary integer. Output: Corresponding decimal integer.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 10100                                                      │
 * │ Output : 20                                                         │
 * │ Explanation :                                                       │
 * │ 1×2⁴ + 0×2³ + 1×2² + 0×2¹ + 0×2⁰ = 16 + 4 = 20                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Binary number should contain only digits 0 and 1.                   │
 * │ Input is represented as an integer (not a string).                  │
 * │ Number should fit within the integer range.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize decimal result and power as 0.                  │
 * │ Step 2 : Extract the last binary digit using modulus (%) operation. │
 * │ Step 3 : Multiply the digit by 2^power and add it to the result.    │
 * │ Step 4 : Increment power and remove the processed digit.            │
 * │ Step 5 : Repeat until all digits are processed and return result.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Number System Conversion | Mathematical Computation                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 10100                                                       │
 * │ Digit = 0, Power = 0 → Decimal = 0                                  │
 * │ Digit = 0, Power = 1 → Decimal = 0                                  │
 * │ Digit = 1, Power = 2 → Decimal = 4                                  │
 * │ Digit = 0, Power = 3 → Decimal = 4                                  │
 * │ Digit = 1, Power = 4 → Decimal = 20                                 │
 * │ Output : 20                                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(d)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where d = number of binary digits.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Binary_to_Decimal {
    
    public static void main(String args[]){
        int binary = 10100;
        
    }
}

/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [14/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 70: Convert Binary Number to Decimal                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a binary number represented as an integer, convert it into    │
 * │ its equivalent decimal (base-10) number.                            │
 * │ Process each binary digit from right to left using positional       │
 * │ values of powers of 2.                                              │
 * │ Input: A binary integer. Output: Corresponding decimal integer.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 10100                                                      │
 * │ Output : 20                                                         │
 * │ Explanation :                                                       │
 * │ 1×2⁴ + 0×2³ + 1×2² + 0×2¹ + 0×2⁰ = 16 + 4 = 20                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Binary number should contain only digits 0 and 1.                   │
 * │ Input is represented as an integer (not a string).                  │
 * │ Number should fit within the integer range.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize decimal result and power as 0.                  │
 * │ Step 2 : Extract the last binary digit using modulus (%) operation. │
 * │ Step 3 : Multiply the digit by 2^power and add it to the result.    │
 * │ Step 4 : Increment power and remove the processed digit.            │
 * │ Step 5 : Repeat until all digits are processed and return result.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Number System Conversion | Mathematical Computation                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 10100                                                       │
 * │ Digit = 0, Power = 0 → Decimal = 0                                  │
 * │ Digit = 0, Power = 1 → Decimal = 0                                  │
 * │ Digit = 1, Power = 2 → Decimal = 4                                  │
 * │ Digit = 0, Power = 3 → Decimal = 4                                  │
 * │ Digit = 1, Power = 4 → Decimal = 20                                 │
 * │ Output : 20                                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(d)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where d = number of binary digits.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Binary_to_Decimal {                                     ║
* ║     public static int BinaryToDecimal(int binNum){                   ║
* ║         int myNum = binNum;                                          ║
* ║         int pow = 0;                                                 ║
* ║         int decNum = 0;                                              ║
* ║         while(binNum > 0){                                           ║
* ║             int lastDigit = binNum % 10;                             ║
* ║             decNum = decNum + (lastDigit * (int)Math.pow(2,pow));    ║
* ║             pow++;                                                   ║
* ║             binNum /= 10;                                            ║
* ║         }                                                            ║
* ║         return decNum;                                               ║
* ║     }                                                                ║
* ║     public static void main(String args[]){                          ║
* ║         int binary = 10100;                                          ║
* ║         int decimal = BinaryToDecimal(binary);                       ║
* ║         System.out.println("DECIMAL OF "+binary+" IS : "+decimal);   ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Mathematical & Execution Breakdown for 10100:                       ║
* ║                                                                      ║
* ║  Iter  | binNum | lastDigit | calculation: decNum + (ld * 2^pow)     ║
* ║  ------|--------|-----------|--------------------------------------  ║
* ║   1    |  10100 |     0     |   0  + (0 * 2^0) = 0                   ║
* ║   2    |   1010 |     0     |   0  + (0 * 2^1) = 0                   ║
* ║   3    |    101 |     1     |   0  + (1 * 2^2) = 4                   ║
* ║   4    |     10 |     0     |   4  + (0 * 2^3) = 4                   ║
* ║   5    |      1 |     1     |   4  + (1 * 2^4) = 4 + 16 = 20         ║
* ║                                                                      ║
* ║  Output:                                                             ║
* ║  DECIMAL OF 10100 IS : 20                                            ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
