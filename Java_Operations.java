/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [15/06/26] → #2  [16/06/26] → #3  [17/06/26]                    │
 * │  #4  [18/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 75: Demonstrate Java Math Class Operations                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a Java program to demonstrate commonly used methods of the    │
 * │ Math class such as minimum, maximum, square root, power, and        │
 * │ absolute value using two sample numbers.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : a = 12.56, b = 13                                          │
 * │ Output :                                                            │
 * │ Minimum Value       : 12.56                                         │
 * │ Maximum Value       : 13.0                                          │
 * │ Square Root         : 3.544...                                      │
 * │ Power               : 12.56^13                                      │
 * │ Absolute Value      : 12.56                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Uses built-in methods provided by java.lang.Math.                   │
 * │ Note: Java does not provide a Math.avg() method. Average must be    │
 * │ calculated manually using (a + b) / 2.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize two numeric variables.                          │
 * │ Step 2 : Use Math.min() to find the smaller value.                  │
 * │ Step 3 : Use Math.max() to find the larger value.                   │
 * │ Step 4 : Use Math.sqrt() to compute the square root.                │
 * │ Step 5 : Use Math.pow() to calculate exponentiation.                │
 * │ Step 6 : Use Math.abs() to obtain the absolute value.               │
 * │ Step 7 : Print the results to the console.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematical Operations | Java Built-in Math Library                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ a = 12.56, b = 13                                                   │
 * │ Math.min(a, b)  → 12.56                                             │
 * │ Math.max(a, b)  → 13.0                                              │
 * │ Math.sqrt(a)    → 3.544...                                          │
 * │ Math.pow(a, b)  → 12.56^13                                          │
 * │ Math.abs(a)     → 12.56                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Java_Operations {
    public static void main(String args[]){
        double a = 12.56;
        int b=4;
        
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
 * ║ PROBLEM 75: Demonstrate Java Math Class Operations                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a Java program to demonstrate commonly used methods of the    │
 * │ Math class such as minimum, maximum, square root, power, and        │
 * │ absolute value using two sample numbers.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : a = 12.56, b = 13                                          │
 * │ Output :                                                            │
 * │ Minimum Value       : 12.56                                         │
 * │ Maximum Value       : 13.0                                          │
 * │ Square Root         : 3.544...                                      │
 * │ Power               : 12.56^13                                      │
 * │ Absolute Value      : 12.56                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Uses built-in methods provided by java.lang.Math.                   │
 * │ Note: Java does not provide a Math.avg() method. Average must be    │
 * │ calculated manually using (a + b) / 2.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize two numeric variables.                          │
 * │ Step 2 : Use Math.min() to find the smaller value.                  │
 * │ Step 3 : Use Math.max() to find the larger value.                   │
 * │ Step 4 : Use Math.sqrt() to compute the square root.                │
 * │ Step 5 : Use Math.pow() to calculate exponentiation.                │
 * │ Step 6 : Use Math.abs() to obtain the absolute value.               │
 * │ Step 7 : Print the results to the console.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematical Operations | Java Built-in Math Library                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ a = 12.56, b = 13                                                   │
 * │ Math.min(a, b)  → 12.56                                             │
 * │ Math.max(a, b)  → 13.0                                              │
 * │ Math.sqrt(a)    → 3.544...                                          │
 * │ Math.pow(a, b)  → 12.56^13                                          │
 * │ Math.abs(a)     → 12.56                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔═════════════════════════════════════════════════════════════════════════╗
* ║ public class Java_Operations {                                          ║
* ║     public static void main(String args[]){                             ║
* ║         double a = 12.56;                                               ║
* ║         int b = 13;                                                     ║
* ║                                                                         ║
* ║         System.out.println("MINIMUM OF TWO NUMBERS IS :"+Math.min(a,b));║
* ║         System.out.println("MAXIMUM OF TWO NUMBERS IS :"+Math.max(a,b));║
* ║         System.out.println("SQUARE ROOT OF NUMBER IS :"+Math.sqrt(a));  ║
* ║         System.out.println("POWER OF TWO NUMBERS IS :"+Math.pow(a, b)); ║
* ║         System.out.println("ABSOLUTE VALUE OF NUMBER IS :"+Math.abs(a));║
* ║     }                                                                   ║
* ║ }                                                                       ║
* ╠═════════════════════════════════════════════════════════════════════════╣
* ║  Method Execution & Automatic Type Promotion Details:                   ║
* ║                                                                         ║
* ║  1. Math.min(a, b) -> Compares 12.56 and 13.                            ║
* ║     - 'b' (int) is implicitly promoted to double (13.0).                ║
* ║     - Returns: 12.56                                                    ║
* ║                                                                         ║
* ║  2. Math.max(a, b) -> Compares 12.56 and 13.0.                          ║
* ║     - Returns: 13.0                                                     ║
* ║                                                                         ║
* ║  3. Math.sqrt(a) -> Computes √12.56.                                    ║
* ║     - Returns: ~3.544006207669526                                       ║
* ║                                                                         ║
* ║  4. Math.pow(a, b) -> Computes 12.56 raised to the power of 13.         ║
* ║     - Returns: ~2.812675662719602E14 (Scientific Notation)              ║
* ║                                                                         ║
* ║  5. Math.abs(a) -> Returns the positive magnitude of 12.56.             ║
* ║     - Returns: 12.56                                                    ║
* ╠═════════════════════════════════════════════════════════════════════════╣
* ║  Expected Console Output:                                               ║
* ║  MINIMUM OF TWO NUMBERS IS :12.56                                       ║
* ║  MAXIMUM OF TWO NUMBERS IS :13.0                                        ║
* ║  SQUARE ROOT OF NUMBER IS :3.544006207669526                            ║
* ║  POWER OF TWO NUMBERS IS :2.812675662719602E14                          ║
* ║  ABSOLUTE VALUE OF NUMBER IS :12.56                                     ║
* ╚═════════════════════════════════════════════════════════════════════════╝
*/   