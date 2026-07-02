/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐*
 * │  #1  [13/06/26] → #2  [14/06/26] → #3  [15/06/26]                    │
 * │  #4  [16/06/26] → #5  [17/06/26] → #6  [18/06/26]                    │
 * │  #7  [19/06/26] → #8  [20/06/26] → #9  [21/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 61: Print "Hello World" Using a Function                     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Create a function that prints the message "Hello World" three       │
 * │ times. Invoke the function from the main() method to display the    │
 * │ output.                                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Output :                                                            │
 * │ Hello World                                                         │
 * │ Hello World                                                         │
 * │ Hello World                                                         │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ The function is called once, and it contains three print            │
 * │ statements that display the message.                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Define a separate function.                                       │
 * │ • Call the function from main().                                    │
 * │ • Print the message exactly three times.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Define a method printHelloWorld().                         │
 * │ Step 2 : Place three print statements inside the method.            │
 * │ Step 3 : Call printHelloWorld() from the main() method.             │
 * │ Step 4 : The function executes and prints the message three times.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ main()                                                              │
 * │   │                                                                 │
 * │   └──► printHelloWorld()                                            │
 * │           │                                                         │
 * │           ├── Print "Hello World"                                   │
 * │           ├── Print "Hello World"                                   │
 * │           └── Print "Hello World"                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Function Definition and Function Call                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    Executes a fixed number (3) of print statements. │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Functions_Call {
    public static void print(){
        System.out.println("hello world");
    }
    public static void main(String args[]){
        print();
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 61: Print "Hello World" Using a Function                     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Create a function that prints the message "Hello World" three       │
 * │ times. Invoke the function from the main() method to display the    │
 * │ output.                                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Output :                                                            │
 * │ Hello World                                                         │
 * │ Hello World                                                         │
 * │ Hello World                                                         │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ The function is called once, and it contains three print            │
 * │ statements that display the message.                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Define a separate function.                                       │
 * │ • Call the function from main().                                    │
 * │ • Print the message exactly three times.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Define a method printHelloWorld().                         │
 * │ Step 2 : Place three print statements inside the method.            │
 * │ Step 3 : Call printHelloWorld() from the main() method.             │
 * │ Step 4 : The function executes and prints the message three times.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ main()                                                              │
 * │   │                                                                 │
 * │   └──► printHelloWorld()                                            │
 * │           │                                                         │
 * │           ├── Print "Hello World"                                   │
 * │           ├── Print "Hello World"                                   │
 * │           └── Print "Hello World"                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Function Definition and Function Call                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    Executes a fixed number (3) of print statements. │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Functions_Call {                                        ║
* ║     public static void printHelloWorld(){                            ║
* ║         System.out.println("HeLLO World");                           ║
* ║         System.out.println("HeLLO World");                           ║
* ║         System.out.println("HeLLO World");                           ║
* ║     }                                                                ║
* ║     public static void main(String args[]){                          ║
* ║         printHelloWorld();                                           ║
* ║         // Output: Prints "HeLLO World" 3 times                      ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/