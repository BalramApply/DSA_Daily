/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [02/06/26] → #2  [03/06/26] → #3  [04/06/26]                    │
 * │  #4  [05/06/26] → #5  [06/06/26] → #6  [07/06/26]                    │
 * │  #7  [08/06/26] → #8  [09/06/26] → #9  [10/00/00]                    │
 * │  #10 [00/00/00]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 06: Input Handling Using Scanner                             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read and store different primitive and reference data types from    │
 * │ the user using the Scanner class. Display all captured values to    │
 * │ verify successful input handling and parsing.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  :                                                            │
 * │ 10                                                                  │
 * │ 12.5                                                                │
 * │ 99.99                                                               │
 * │ Java                                                                │
 * │ Hello World                                                         │
 * │ 100000                                                              │
 * │ 8                                                                   │
 * │ 20                                                                  │
 * │ true                                                                │
 * │                                                                     │
 * │ Output :                                                            │
 * │ int : 10                                                            │
 * │ float : 12.5                                                        │
 * │ double : 99.99                                                      │
 * │ string (single word) : Java                                         │
 * │ string (full sentence) : Hello World                                │
 * │ long : 100000                                                       │
 * │ byte : 8                                                            │
 * │ short : 20                                                          │
 * │ boolean : true                                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Input values must match their respective data types.                │
 * │ Boolean input must be either true or false.                         │
 * │ Byte and short values must remain within valid ranges.              │
 * │ Scanner should be closed after use.                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for reading user input.            │
 * │ Step 2 : Read int, float, double, and String values.                │
 * │ Step 3 : Use next() for a single word input.                        │
 * │ Step 4 : Use nextLine() for a complete sentence input.              │
 * │ Step 5 : Read long, byte, short, and boolean values.                │
 * │ Step 6 : Print all collected inputs.                                │
 * │ Step 7 : Close the Scanner object.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Input / Output Handling (Scanner Class)                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Input_Handling {
    public static void main(String[] args) {
       
    }
}

/* ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 06: Input Handling Using Scanner                             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read and store different primitive and reference data types from    │
 * │ the user using the Scanner class. Display all captured values to    │
 * │ verify successful input handling and parsing.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  :                                                            │
 * │ 10                                                                  │
 * │ 12.5                                                                │
 * │ 99.99                                                               │
 * │ Java                                                                │
 * │ Hello World                                                         │
 * │ 100000                                                              │
 * │ 8                                                                   │
 * │ 20                                                                  │
 * │ true                                                                │
 * │                                                                     │
 * │ Output :                                                            │
 * │ int : 10                                                            │
 * │ float : 12.5                                                        │
 * │ double : 99.99                                                      │
 * │ string (single word) : Java                                         │
 * │ string (full sentence) : Hello World                                │
 * │ long : 100000                                                       │
 * │ byte : 8                                                            │
 * │ short : 20                                                          │
 * │ boolean : true                                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Input values must match their respective data types.                │
 * │ Boolean input must be either true or false.                         │
 * │ Byte and short values must remain within valid ranges.              │
 * │ Scanner should be closed after use.                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for reading user input.            │
 * │ Step 2 : Read int, float, double, and String values.                │
 * │ Step 3 : Use next() for a single word input.                        │
 * │ Step 4 : Use nextLine() for a complete sentence input.              │
 * │ Step 5 : Read long, byte, short, and boolean values.                │
 * │ Step 6 : Print all collected inputs.                                │
 * │ Step 7 : Close the Scanner object.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Input / Output Handling (Scanner Class)                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║                                                                      ║
* ║ public class Input_Handling {                                        ║
* ║     public static void main(String[] args) {                         ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║                                                                      ║
* ║         System.out.print("Enter an integer: ");                      ║
* ║         int a = sc.nextInt();                                        ║
* ║                                                                      ║
* ║         System.out.print("Enter a float: ");                         ║
* ║         float b = sc.nextFloat();                                    ║
* ║                                                                      ║
* ║         System.out.print("Enter a double: ");                        ║
* ║         double c = sc.nextDouble();                                  ║
* ║                                                                      ║
* ║         System.out.print("Enter a word (single word): ");            ║
* ║         String d = sc.next();  // Reads only a single word           ║
* ║                                                                      ║
* ║         sc.nextLine(); // Consume the leftover newline               ║
* ║                                                                      ║
* ║         System.out.print("Enter a full sentence: ");                 ║
* ║         String e = sc.nextLine();  // Reads a full sentence          ║
* ║                                                                      ║
* ║         System.out.print("Enter a long: ");                          ║
* ║         long f = sc.nextLong();                                      ║
* ║                                                                      ║
* ║         System.out.print("Enter a byte: ");                          ║
* ║         byte g = sc.nextByte();                                      ║
* ║                                                                      ║
* ║         System.out.print("Enter a short: ");                         ║
* ║         short h = sc.nextShort();                                    ║
* ║                                                                      ║
* ║         System.out.print("Enter a boolean: ");                       ║
* ║         boolean bol = sc.nextBoolean();                              ║
* ║                                                                      ║
* ║         System.out.println("\nYour Inputs:");                        ║
* ║         System.out.println("int : " + a);                            ║
* ║         System.out.println("float : " + b);                          ║
* ║         System.out.println("double : " + c);                         ║
* ║         System.out.println("string (single word) : " + d);           ║
* ║         System.out.println("string (full sentence) : " + e);         ║
* ║         System.out.println("long : " + f);                           ║
* ║         System.out.println("byte : " + g);                           ║
* ║         System.out.println("short : " + h);                          ║
* ║         System.out.println("boolean : " + bol);                      ║
* ║                                                                      ║
* ║         sc.close();  // Close scanner to avoid resource leak         ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/