/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [13/06/26] → #2  [14/06/26] → #3  [15/06/26]                    │
 * │  #4  [16/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 64: Product of Two Numbers Using Functions                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a program that takes two integers as input and returns their  │
 * │ product using a separate function. The function should accept two   │
 * │ numbers and return the multiplication result.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input :                                                             │
 * │ a = 24                                                              │
 * │ b = 12                                                              │
 * │                                                                     │
 * │ Output :                                                            │
 * │ PRODUCT IS : 288                                                    │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ multiply(24, 12) returns 24 × 12 = 288.                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Inputs must be valid integers.                                    │
 * │ • Supports positive, negative, and zero values.                     │
 * │ • No overflow handling required for small integers.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a function multiply(int a, int b).                  │
 * │ Step 2 : Return the product (a * b).                                │
 * │ Step 3 : Initialize or read two integers in main().                 │
 * │ Step 4 : Call multiply(a, b).                                       │
 * │ Step 5 : Store and print the returned product.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ a = 24                                                              │
 * │ b = 12                                                              │
 * │                                                                     │
 * │ Function Call : multiply(24, 12)                                    │
 * │ product = 24 × 12 = 288                                             │
 * │ Return 288                                                          │
 * │                                                                     │
 * │ Output : PRODUCT IS : 288                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Function Call + Basic Arithmetic                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    Multiplication is a constant-time operation.     │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses only a few variables.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Product_of_Two {
    
    public static void main(String args[]){
        int num1 = 24;
        int num2 = 12;
        
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
 * ║ PROBLEM 64: Product of Two Numbers Using Functions                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a program that takes two integers as input and returns their  │
 * │ product using a separate function. The function should accept two   │
 * │ numbers and return the multiplication result.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input :                                                             │
 * │ a = 24                                                              │
 * │ b = 12                                                              │
 * │                                                                     │
 * │ Output :                                                            │
 * │ PRODUCT IS : 288                                                    │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ multiply(24, 12) returns 24 × 12 = 288.                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Inputs must be valid integers.                                    │
 * │ • Supports positive, negative, and zero values.                     │
 * │ • No overflow handling required for small integers.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a function multiply(int a, int b).                  │
 * │ Step 2 : Return the product (a * b).                                │
 * │ Step 3 : Initialize or read two integers in main().                 │
 * │ Step 4 : Call multiply(a, b).                                       │
 * │ Step 5 : Store and print the returned product.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ a = 24                                                              │
 * │ b = 12                                                              │
 * │                                                                     │
 * │ Function Call : multiply(24, 12)                                    │
 * │ product = 24 × 12 = 288                                             │
 * │ Return 288                                                          │
 * │                                                                     │
 * │ Output : PRODUCT IS : 288                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Function Call + Basic Arithmetic                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    Multiplication is a constant-time operation.     │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses only a few variables.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Product_of_Two {                                        ║
* ║     public static int multiply(int a, int b){                        ║
* ║         int product = a * b;                                         ║
* ║         return product;                                              ║
* ║     }                                                                ║
* ║     public static void main(String args[]){                          ║
* ║         int a = 24;                                                  ║
* ║         int b = 12;                                                  ║
* ║                                                                      ║
* ║         int pro = multiply(a, b);                                    ║
* ║         System.out.println("PRODUCT is :" + pro);                    ║
* ║         // Output: PRODUCT is :288                                   ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/