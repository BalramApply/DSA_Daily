/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [02/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘ 
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 6: Input Handling                                            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate parsing and capturing primitive and reference data types │
 * │ from standard standard input stream (System.in) using structural     │
 * │ buffer scanner token evaluation methods.                             │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── STREAM TOKEN MATCHING ────────────────────────────────────────────┐
 * │ • Numeric Tokens  : nextInt(), nextFloat(), nextDouble(), nextLong() │
 * │ • Small Integers  : nextByte(), nextShort()                          │
 * │ • Word (Token)    : next()      -> Reads until white-space delimiter │
 * │ • Line (Buffer)   : nextLine()  -> Reads complete line sequence      │
 * │ • Logical State   : nextBoolean()                                    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Instantiation: Initialize stream token utility tracking objects.  │
 * │ 2. Sequence Scan: Execute targeted data-type parsers sequentially to │
 * │                   consume incoming console stream buffer contents.   │
 * │ 3. Capture & Clean: Clear residual line breaks when transitioning    │
 * │                     between token lookups and full text scans.       │
 * │ 4. Destruction:  Safely close stream listener dependencies.          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Stream Input / Output Processing                             │
 * │ Limit:  Incoming input formatting must match exact parser signatures  │
 * │                                                                      │
 * │ Time:   O(1) → Standard parse logic depends entirely on standard     │
 * │                input length bounds, running in fixed execution time. │
 * │                                                                      │
 * │ Space:  O(1) → Internal cache data structures remain completely fixed│
 * │                without runtime auxiliary accumulation.               │
 * └──────────────────────────────────────────────────────────────────────┘
 */

import java.util.*;

public class Input_Handling {
    public static void main(String[] args) {
        
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 6: Input Handling                                            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate parsing and capturing primitive and reference data types │
 * │ from standard standard input stream (System.in) using structural     │
 * │ buffer scanner token evaluation methods.                             │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── STREAM TOKEN MATCHING ────────────────────────────────────────────┐
 * │ • Numeric Tokens  : nextInt(), nextFloat(), nextDouble(), nextLong() │
 * │ • Small Integers  : nextByte(), nextShort()                          │
 * │ • Word (Token)    : next()      -> Reads until white-space delimiter │
 * │ • Line (Buffer)   : nextLine()  -> Reads complete line sequence      │
 * │ • Logical State   : nextBoolean()                                    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Instantiation: Initialize stream token utility tracking objects.  │
 * │ 2. Sequence Scan: Execute targeted data-type parsers sequentially to │
 * │                   consume incoming console stream buffer contents.   │
 * │ 3. Capture & Clean: Clear residual line breaks when transitioning    │
 * │                     between token lookups and full text scans.       │
 * │ 4. Destruction:  Safely close stream listener dependencies.          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Stream Input / Output Processing                             │
 * │ Limit:  Incoming input formatting must match exact parser signatures  │
 * │                                                                      │
 * │ Time:   O(1) → Standard parse logic depends entirely on standard     │
 * │                input length bounds, running in fixed execution time. │
 * │                                                                      │
 * │ Space:  O(1) → Internal cache data structures remain completely fixed│
 * │                without runtime auxiliary accumulation.               │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// import java.util.Scanner;

// public class Input_Handling {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter an integer: ");
//         int a = sc.nextInt();
        
//         System.out.print("Enter a float: ");
//         float b = sc.nextFloat();
        
//         System.out.print("Enter a double: ");
//         double c = sc.nextDouble();
        
//         System.out.print("Enter a word (single word): ");
//         String d = sc.next();  // Reads only a single word
        
//         sc.nextLine(); // Consume the leftover newline
        
//         System.out.print("Enter a full sentence: ");
//         String e = sc.nextLine();  // Reads a full sentence
        
//         System.out.print("Enter a long: ");
//         long f = sc.nextLong();
        
//         System.out.print("Enter a byte: ");
//         byte g = sc.nextByte();
        
//         System.out.print("Enter a short: ");
//         short h = sc.nextShort();
        
//         System.out.print("Enter a boolean: ");
//         boolean bol = sc.nextBoolean();
        
//         System.out.println("\nYour Inputs:");
//         System.out.println("int : " + a);
//         System.out.println("float : " + b);
//         System.out.println("double : " + c);
//         System.out.println("string (single word) : " + d);
//         System.out.println("string (full sentence) : " + e);
//         System.out.println("long : " + f);
//         System.out.println("byte : " + g);
//         System.out.println("short : " + h);
//         System.out.println("boolean : " + bol);

//         sc.close();  // Close scanner to avoid resource leak
//     }
// }