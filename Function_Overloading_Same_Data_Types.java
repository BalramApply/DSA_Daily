/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [14/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 66: Demonstrate Function Overloading with Same Data Types    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Implement method overloading by creating multiple methods with the  │
 * │ same name but different numbers of parameters.                      │
 * │ Return the sum of either two integers or three integers depending   │
 * │ on the method invoked.                                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : sum(5, 2), sum(5, 2, 6)                                    │
 * │ Output : 7                                                          │
 * │          13                                                         │
 * │ Explanation : The compiler selects the appropriate overloaded       │
 * │ method based on the number of arguments passed.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Parameters must be of type int.                                     │
 * │ Overloaded methods must differ in their parameter list.             │
 * │ Compile-time polymorphism determines the correct method call.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Define a method sum(int, int) to add two integers.         │
 * │ Step 2 : Define another method sum(int, int, int) to add three      │
 * │          integers.                                                  │
 * │ Step 3 : Invoke each overloaded method with the corresponding       │
 * │          number of arguments.                                       │
 * │ Step 4 : Print the returned sums.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Object-Oriented Programming (OOP) | Compile-Time Polymorphism       │
 * │ (Function/Method Overloading)                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Function_Overloading_Same_Data_Types {
    

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
 * ║ PROBLEM 67: Demonstrate Function Overloading with Same Data Types    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Implement method overloading by creating multiple methods with the  │
 * │ same name but different numbers of parameters.                      │
 * │ Return the sum of either two integers or three integers depending   │
 * │ on the method invoked.                                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : sum(5, 2), sum(5, 2, 6)                                    │
 * │ Output : 7                                                          │
 * │          13                                                         │
 * │ Explanation : The compiler selects the appropriate overloaded       │
 * │ method based on the number of arguments passed.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Parameters must be of type int.                                     │
 * │ Overloaded methods must differ in their parameter list.             │
 * │ Compile-time polymorphism determines the correct method call.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Define a method sum(int, int) to add two integers.         │
 * │ Step 2 : Define another method sum(int, int, int) to add three      │
 * │          integers.                                                  │
 * │ Step 3 : Invoke each overloaded method with the corresponding       │
 * │          number of arguments.                                       │
 * │ Step 4 : Print the returned sums.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Object-Oriented Programming (OOP) | Compile-Time Polymorphism       │
 * │ (Function/Method Overloading)                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔═══════════════════════════════════════════════════════════════════════╗
* ║ public class Function_Overloading_Same_Data_Types {                   ║
* ║     public static int sum(int a, int b){                              ║
* ║         return a + b;                                                 ║
* ║     }                                                                 ║
* ║                                                                       ║
* ║     public static int sum(int a, int b, int c){                       ║
* ║         return a + b + c;                                             ║
* ║     }                                                                 ║
* ║                                                                       ║
* ║     public static void main(String args[]){                           ║
* ║         System.out.println("SUM OF TWO NUMBERS :" + sum(5, 2));       ║
* ║         System.out.println("SUM OF THREE NUMBERS :" + sum(5, 2, 6));  ║
* ║     }                                                                 ║
* ║ }                                                                     ║
* ╠═══════════════════════════════════════════════════════════════════════╣
* ║  Concept Breakdown: Overloading by Parameter Count                    ║
* ║  - Function overloading can be achieved by changing the number of     ║
* ║    parameters, even if their data types are identical.                ║
* ║  - sum(5, 2) passes two int arguments -> invokes sum(int, int)        ║
* ║  - sum(5, 2, 6) passes three int arguments -> invokes sum(int,int,int)║
* ║                                                                       ║
* ║  Output:                                                              ║
* ║  SUM OF TWO NUMBERS :7                                                ║
* ║  SUM OF THREE NUMBERS :13                                             ║
* ╚═══════════════════════════════════════════════════════════════════════╝
*/
