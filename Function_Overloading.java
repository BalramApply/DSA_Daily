/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [14/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 67: Function Overloading                                     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a program to demonstrate Function Overloading in Java by      │
 * │ creating multiple methods with the same name but different          │
 * │ parameter data types.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input :                                                             │
 * │ sum(5, 2)                                                           │
 * │ sum(5.6f, 9.2f)                                                     │
 * │                                                                     │
 * │ Output :                                                            │
 * │ SUM OF INTEGER NUMBERS : 7                                          │
 * │ SUM OF FLOAT NUMBERS : 14.8                                         │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Java calls the int version for integer arguments and the float      │
 * │ version for float arguments.                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Method names must be the same.                                    │
 * │ • Parameter list must be different (type, number, or order).        │
 * │ • Return type alone cannot overload a method.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create sum(int, int).                                      │
 * │ Step 2 : Create sum(float, float).                                  │
 * │ Step 3 : Call both methods with appropriate arguments.              │
 * │ Step 4 : Java selects the correct method at compile time.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ sum(5, 2)                                                           │
 * │ → Calls sum(int, int)                                               │
 * │ → Returns 7                                                         │
 * │                                                                     │
 * │ sum(5.6f, 9.2f)                                                     │
 * │ → Calls sum(float, float)                                           │
 * │ → Returns 14.8                                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── IMPORTANT CONCEPT ────────────────────────────────────────────────┐
 * │ Function Overloading means multiple methods can have the same name  │
 * │ if their parameter lists are different.                             │
 * │                                                                     │
 * │ Overloading can differ by:                                          │
 * │ • Number of parameters                                              │
 * │ • Data types of parameters                                          │
 * │ • Order of parameters                                               │
 * │                                                                     │
 * │ Return type alone cannot be used for overloading.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Compile-Time Polymorphism (Method Overloading)                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Function_Overloading {
    
    public static void main(String args[]){
        
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
 * ║ PROBLEM 66: Function Overloading                                     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a program to demonstrate Function Overloading in Java by      │
 * │ creating multiple methods with the same name but different          │
 * │ parameter data types.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input :                                                             │
 * │ sum(5, 2)                                                           │
 * │ sum(5.6f, 9.2f)                                                     │
 * │                                                                     │
 * │ Output :                                                            │
 * │ SUM OF INTEGER NUMBERS : 7                                          │
 * │ SUM OF FLOAT NUMBERS : 14.8                                         │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Java calls the int version for integer arguments and the float      │
 * │ version for float arguments.                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Method names must be the same.                                    │
 * │ • Parameter list must be different (type, number, or order).        │
 * │ • Return type alone cannot overload a method.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create sum(int, int).                                      │
 * │ Step 2 : Create sum(float, float).                                  │
 * │ Step 3 : Call both methods with appropriate arguments.              │
 * │ Step 4 : Java selects the correct method at compile time.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ sum(5, 2)                                                           │
 * │ → Calls sum(int, int)                                               │
 * │ → Returns 7                                                         │
 * │                                                                     │
 * │ sum(5.6f, 9.2f)                                                     │
 * │ → Calls sum(float, float)                                           │
 * │ → Returns 14.8                                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── IMPORTANT CONCEPT ────────────────────────────────────────────────┐
 * │ Function Overloading means multiple methods can have the same name  │
 * │ if their parameter lists are different.                             │
 * │                                                                     │
 * │ Overloading can differ by:                                          │
 * │ • Number of parameters                                              │
 * │ • Data types of parameters                                          │
 * │ • Order of parameters                                               │
 * │                                                                     │
 * │ Return type alone cannot be used for overloading.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Compile-Time Polymorphism (Method Overloading)                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔════════════════════════════════════════════════════════════════════════╗
* ║ public class Function_Overloading {                                    ║
* ║     public static int sum(int a, int b){                               ║
* ║         return a + b;                                                  ║
* ║     }                                                                  ║
* ║     public static float sum(float a, float b){                         ║
* ║         return a + b;                                                  ║
* ║     }                                                                  ║
* ║     public static void main(String args[]){                            ║
* ║         System.out.println("SUM OF INTEGERS NUMBERS :" + sum(5, 2));   ║
* ║         System.out.println("SUM OF FLOATS NUMBERS :" + sum(5.6f,9.2f));║
* ║                                                                        ║
* ║         // Output:                                                     ║
* ║         // SUM OF INTEGERS NUMBERS :7                                  ║
* ║         // SUM OF FLOATS NUMBERS :14.8                                 ║
* ║     }                                                                  ║
* ║ }                                                                      ║
* ╠════════════════════════════════════════════════════════════════════════╣
* ║  Concept Breakdown: Compile-time Polymorphism                          ║
* ║  - The Java compiler matches method calls based on the argument        ║
* ║    types passed during invocation (Method Resolution).                 ║
* ║  - Passing (5, 2) binds to the sum(int, int) signature.                ║
* ║  - Passing (5.6f, 9.2f) binds to the sum(float, float) signature.      ║
* ╚════════════════════════════════════════════════════════════════════════╝
*/
