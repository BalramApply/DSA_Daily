/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [13/06/26] → #2  [14/06/26] → #3  [15/06/26]                    │
 * │  #4  [16/06/26] → #5  [17/06/26] → #6  [18/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 63: Swap Two Numbers (Call by Value)                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a function to swap two integer values and demonstrate that    │
 * │ Java uses Call by Value for primitive data types.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input :                                                             │
 * │ a = 10                                                              │
 * │ b = 20                                                              │
 * │                                                                     │
 * │ Output inside function :                                            │
 * │ a is : 20                                                           │
 * │ b is : 10                                                           │
 * │                                                                     │
 * │ Output in main() :                                                  │
 * │ a is : 10                                                           │
 * │ b is : 20                                                           │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Java passes copies of primitive variables to methods. Therefore,    │
 * │ swapping inside the function does not change the original values.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Works with primitive integer variables.                           │
 * │ • Demonstrates Java's Call by Value mechanism.                      │
 * │ • Original variables remain unchanged after the function call.      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a function swaping(int a, int b).                   │
 * │ Step 2 : Store 'a' in a temporary variable.                         │
 * │ Step 3 : Assign b to a.                                             │
 * │ Step 4 : Assign temp to b.                                          │
 * │ Step 5 : Print swapped values inside the function.                  │
 * │ Step 6 : Print values in main() to verify they remain unchanged.    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Initial values in main()                                            │
 * │ a = 10, b = 20                                                      │
 * │                                                                     │
 * │ Function Call : swaping(10, 20)                                     │
 * │ temp = 10                                                           │
 * │ a = 20                                                              │
 * │ b = 10                                                              │
 * │ Prints : a = 20, b = 10                                             │
 * │                                                                     │
 * │ Back to main()                                                      │
 * │ a = 10, b = 20 (unchanged)                                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── IMPORTANT CONCEPT ────────────────────────────────────────────────┐
 * │ Java is ALWAYS Call by Value.                                       │
 * │ For primitive data types, a copy of the value is passed to methods. │
 * │ Therefore, modifications inside the method do not affect the        │
 * │ original variables in main().                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Function Call + Call by Value Demonstration                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    Constant number of operations.                   │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses one temporary variable.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Call_by_Value_Swap {
    
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 20;
        
    }
}

/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [13/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 63: Swap Two Numbers (Call by Value)                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a function to swap two integer values and demonstrate that    │
 * │ Java uses Call by Value for primitive data types.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input :                                                             │
 * │ a = 10                                                              │
 * │ b = 20                                                              │
 * │                                                                     │
 * │ Output inside function :                                            │
 * │ a is : 20                                                           │
 * │ b is : 10                                                           │
 * │                                                                     │
 * │ Output in main() :                                                  │
 * │ a is : 10                                                           │
 * │ b is : 20                                                           │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Java passes copies of primitive variables to methods. Therefore,    │
 * │ swapping inside the function does not change the original values.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Works with primitive integer variables.                           │
 * │ • Demonstrates Java's Call by Value mechanism.                      │
 * │ • Original variables remain unchanged after the function call.      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a function swaping(int a, int b).                   │
 * │ Step 2 : Store 'a' in a temporary variable.                         │
 * │ Step 3 : Assign b to a.                                             │
 * │ Step 4 : Assign temp to b.                                          │
 * │ Step 5 : Print swapped values inside the function.                  │
 * │ Step 6 : Print values in main() to verify they remain unchanged.    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Initial values in main()                                            │
 * │ a = 10, b = 20                                                      │
 * │                                                                     │
 * │ Function Call : swaping(10, 20)                                     │
 * │ temp = 10                                                           │
 * │ a = 20                                                              │
 * │ b = 10                                                              │
 * │ Prints : a = 20, b = 10                                             │
 * │                                                                     │
 * │ Back to main()                                                      │
 * │ a = 10, b = 20 (unchanged)                                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── IMPORTANT CONCEPT ────────────────────────────────────────────────┐
 * │ Java is ALWAYS Call by Value.                                       │
 * │ For primitive data types, a copy of the value is passed to methods. │
 * │ Therefore, modifications inside the method do not affect the        │
 * │ original variables in main().                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Function Call + Call by Value Demonstration                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    Constant number of operations.                   │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses one temporary variable.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Call_by_Value_Swap {                                    ║
* ║     public static void swaping(int a, int b){                        ║
* ║         int temp = a;                                                ║
* ║         a = b;                                                       ║
* ║         b = temp;                                                    ║
* ║         System.out.println("a is :"+a);                              ║
* ║         System.out.println("b is :"+b);                              ║
* ║     }                                                                ║
* ║     public static void main(String args[]){                          ║
* ║         int a = 10;                                                  ║
* ║         int b = 20;                                                  ║
* ║         swaping(a, b);                                               ║
* ║                                                                      ║
* ║         // Output inside swaping(): a is :20, b is :10               ║
* ║         // Note: Java always uses Call-by-Value. Changes made inside ║
* ║         // the method do not affect the original variables in main().║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/