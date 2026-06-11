/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [01/06/26] → #2  [02/06/26] → #3  [03/06/26]                    │
 * │  #4  [04/06/26] → #5  [05/06/26] → #6  [06/06/26]                    │
 * │  #7  [07/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 3: Variables                                                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Declare three unique variables (`a`, `b`, and `name`), assign them   │
 * │ appropriate initial values, and output them to the console stream.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DATA TRACKING ────────────────────────────────────────────────────┐
 * │ • Variable 'a'    : Integer/Numeric Storage                         │
 * │ • Variable 'b'    : Integer/Numeric Storage                         │
 * │ • Variable 'name' : Character String Storage                        │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Allocate variable space inside stack frames using standard types. │
 * │ 2. Populate variable fields with static placeholder values.          │
 * │ 3. Standard print processing executes sequentially across instances. │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Basic Syntax / Memory Declaration                            │
 * │                                                                      │
 * │ Time:   O(1) → All lookups, allocations, and print instructions run  │
 * │                in uniform, constant computational time.              │
 * │                                                                      │
 * │ Space:  O(1) → Storage footprint remains static. Memory utilization  │
 * │                does not scale or depend on external input size.      │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Variables {
    public static void main (String args[]) {
        
     }  
}

/* 3. VARIABLES
 * create a variable a, b and name then print it
 * T.C : O(1)
 * Since all operations run in constant time, the overall time complexity is O(1) (constant time).
 * S.C : O(1)
 * The program does not use dynamic memory allocation or data structures that grow with input size.
 */

// public class Variables {
//     public static void main(String[] args) {
//         // Declare and initialize integer variables
//         int a = 10;
//         int b = 5;

//         // Print initial values
//         System.out.println("Initial value of a: " + a);
//         System.out.println("Initial value of b: " + b);

//         // Declare and print a string variable
//         String name = "Balram Patel";
//         System.out.println("Name: " + name);
//     }
// }