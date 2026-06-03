/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [02/06/26] → #2  [03/06/26] → #3  [04/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘ 
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 8: User Input Multiplication                                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Capture two integers dynamically from user input via the console,    │
 * │ compute their arithmetic product, and display the result.            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input:  2 3                                                          │
 * │ Output: 6                                                            │
 * │                                                                      │
 * │ Explanation: 2 * 3 = 6 (Dynamic evaluation from stream inputs)       │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Initialization: Create a Scanner listener linked to System.in.    │
 * │ 2. Stream Capture: Extract the next two available integer tokens.     │
 * │ 3. Evaluation:     Multiply the extracted operands using the `*` flag.│
 * │ 4. Output:         Print the resulting value and close the stream.    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Dynamic I/O & Basic Arithmetic                               │
 * │ Limit:  Operands must stay within language-specific integer bounds   │
 * │                                                                      │
 * │ Time:   O(1) → Processing a fixed pair of numerical inputs executes  │
 * │                in constant CPU instructions.                         │
 * │                                                                      │
 * │ Space:  O(1) → Utilizes a static set of primitive variables alongside│
 * │                a localized stream reference instance.                │
 * └──────────────────────────────────────────────────────────────────────┘
 */

import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        
    }
}

/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 8: User Input Multiplication                                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Capture two integers dynamically from user input via the console,    │
 * │ compute their arithmetic product, and display the result.            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input:  2 3                                                          │
 * │ Output: 6                                                            │
 * │                                                                      │
 * │ Explanation: 2 * 3 = 6 (Dynamic evaluation from stream inputs)       │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Initialization: Create a Scanner listener linked to System.in.    │
 * │ 2. Stream Capture: Extract the next two available integer tokens.     │
 * │ 3. Evaluation:     Multiply the extracted operands using the `*` flag.│
 * │ 4. Output:         Print the resulting value and close the stream.    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Dynamic I/O & Basic Arithmetic                               │
 * │ Limit:  Operands must stay within language-specific integer bounds   │
 * │                                                                      │
 * │ Time:   O(1) → Processing a fixed pair of numerical inputs executes   │
 * │                in constant CPU instructions.                         │
 * │                                                                      │
 * │ Space:  O(1) → Utilizes a static set of primitive variables alongside│
 * │                a localized stream reference instance.                │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// import java.util.*;
// public class Multiplication {
//     public static void main(String[] args) {
//         //Creating a Scanner object to take user input
//         Scanner sc = new Scanner(System.in);

//         // Prompt the user to enter two numbers
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         // Calculate the product of two numbers
//         int product = a * b;

//         // Display the result
//         System.out.println("Product: " + product);

//         // Close the scanner to prevent resource leak
//         sc.close();
//     }
// }
