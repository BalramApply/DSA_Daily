/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [03/06/26] → #2  [04/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 13: Average of Three Numbers                                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Capture three numbers (A, B, and C) from the user, compute their     │
 * │ mathematical average, and print the calculated result to the console.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input:  A = 10, B = 20, C = 30                                       │
 * │ Output: 20                                                           │
 * │                                                                      │
 * │ Explanation: Average = (10 + 20 + 30) / 3 = 60 / 3 = 20              │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Streaming Input: Capture three separate numeric tokens from the   │
 * │                     input stream reader.                             │
 * │ 2. Summation:       Compute the total value by adding all three      │
 * │                     variables together.                              │
 * │ 3. Evaluation:      Divide the accumulated sum by the count literal  │
 * │                     of elements (3) to find the final mean value.    │
 * │ 4. Flush:           Display the evaluated average to the console.    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Basic Arithmetic Operation / Central Tendency                │
 * │ Limit:  Ensure accurate data types (e.g., float or double) if precise│
 * │         fractional quotients are required for uneven divisions.      │
 * │                                                                      │
 * │ Time:   O(1) → Sequential addition and constant scalar division      │
 * │                execute in uniform, fixed instruction intervals.      │
 * │                                                                      │
 * │ Space:  O(1) → Footprint remains fixed, requiring only a constant    │
 * │                number of isolated numerical storage cells.            │
 * └──────────────────────────────────────────────────────────────────────┘
 */

import java.util.*;
public class Average {
    public static void main(String[] args) {

    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 13: Average of Three Numbers                                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Capture three numbers (A, B, and C) from the user, compute their     │
 * │ mathematical average, and print the calculated result to the console.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input:  A = 10, B = 20, C = 30                                       │
 * │ Output: 20                                                           │
 * │                                                                      │
 * │ Explanation: Average = (10 + 20 + 30) / 3 = 60 / 3 = 20              │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Streaming Input: Capture three separate numeric tokens from the   │
 * │                     input stream reader.                             │
 * │ 2. Summation:       Compute the total value by adding all three      │
 * │                     variables together.                              │
 * │ 3. Evaluation:      Divide the accumulated sum by the count literal  │
 * │                     of elements (3) to find the final mean value.    │
 * │ 4. Flush:           Display the evaluated average to the console.    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Basic Arithmetic Operation / Central Tendency                │
 * │ Limit:  Ensure accurate data types (e.g., float or double) if precise│
 * │         fractional quotients are required for uneven divisions.      │
 * │                                                                      │
 * │ Time:   O(1) → Sequential addition and constant scalar division      │
 * │                execute in uniform, fixed instruction intervals.      │
 * │                                                                      │
 * │ Space:  O(1) → Footprint remains fixed, requiring only a constant    │
 * │                number of isolated numerical storage cells.            │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// import java.util.*;
// public class Average {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); // Create Scanner object for input

//         // Taking three integer inputs from the user
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
        
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
        
//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();

//         // Calculating the average
//         int avg = (a + b + c) / 3;

//         // Displaying the average
//         System.out.println("Average: " + avg);

//         sc.close(); // Closing the Scanner to prevent resource leak
//     }
// }
