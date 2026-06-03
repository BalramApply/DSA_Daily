/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [03/06/26] → #2  [04/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 14: Area of a Square                                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Capture the side length of a square from the user, calculate its     │
 * │ total area using the geometric formula Area = side * side, and print │
 * │ the resulting value to the console.                                  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input:  side = 4                                                     │
 * │ Output: 16                                                           │
 * │                                                                      │
 * │ Explanation: Area = 4 * 4 = 16 (Geometric product of equal sides)    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Streaming Input: Capture the side length dimension from the input │
 * │                     stream reader.                                   │
 * │ 2. Evaluation:      Compute the squaring operation by multiplying the│
 * │                     side value by itself.                            │
 * │ 3. Flush:           Display the evaluated area total directly onto the│
 * │                     system console stream.                           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Formula-Based Geometric Calculation                          │
 * │ Limit:  Side length must be a non-negative numerical value (s ≥ 0)   │
 * │                                                                      │
 * │ Time:   O(1) → Executing a single scalar multiplication operation    │
 * │                runs in uniform, constant machine clock cycles.       │
 * │                                                                      │
 * │ Space:  O(1) → Footprint remains fixed, requiring a constant count   │
 * │                of primitive registers with zero dynamic overhead.     │
 * └──────────────────────────────────────────────────────────────────────┘
 */
import java.util.*;
public class Area_of_Square {
    public static void main(String[] args) {
        
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 14: Area of a Square                                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Capture the side length of a square from the user, calculate its     │
 * │ total area using the geometric formula Area = side * side, and print │
 * │ the resulting value to the console.                                  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input:  side = 4                                                     │
 * │ Output: 16                                                           │
 * │                                                                      │
 * │ Explanation: Area = 4 * 4 = 16 (Geometric product of equal sides)    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Streaming Input: Capture the side length dimension from the input │
 * │                     stream reader.                                   │
 * │ 2. Evaluation:      Compute the squaring operation by multiplying the│
 * │                     side value by itself.                            │
 * │ 3. Flush:           Display the evaluated area total directly onto the│
 * │                     system console stream.                           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Formula-Based Geometric Calculation                          │
 * │ Limit:  Side length must be a non-negative numerical value (s ≥ 0)   │
 * │                                                                      │
 * │ Time:   O(1) → Executing a single scalar multiplication operation    │
 * │                runs in uniform, constant machine clock cycles.       │
 * │                                                                      │
 * │ Space:  O(1) → Footprint remains fixed, requiring a constant count   │
 * │                of primitive registers with zero dynamic overhead.     │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// import java.util.*;
// public class Area_of_Square {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); // Create Scanner object

//         // Prompting the user for input
//         System.out.print("Enter the side length of the square: ");
        
//         // Taking integer input for the side of the square
//         int side = sc.nextInt();

//         // Calculating the area of the square
//         int area = side * side;

//         // Displaying the area
//         System.out.println("Area of the square: " + area);

//         sc.close(); // Closing the Scanner to prevent resource leak
//     }
// }
