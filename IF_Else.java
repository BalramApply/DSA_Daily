/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [06/06/26] → #2  [07/06/26] → #3  [08/06/26]                    │
 * │  #4  [09/06/26] → #5  [10/06/26] → #6  [11/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔════════════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 28: Age Classification using Conditional Branching (If-Else Logic) ║
* ╚════════════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an age value, classify the person into categories based on    │
* │ conditional checks: adult, teenager, or not adult.                  │
* │                                                                     │
* │ Output messages depend on the age range evaluation.                 │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : age = 16                                                   │
* │ Output : TEENAGER                                                   │
* │ Explanation :                                                       │
* │ 16 satisfies (age > 13 && age < 18), so "TEENAGER" is printed.      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • age is a non-negative integer                                     │
* │ • Only basic conditional logic is used                              │
* │ • Age ranges are mutually evaluated using if/else conditions        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Read integer value age                                     │
* │ Step 2 : Check if age >= 18 → print ADULT message                   │
* │ Step 3 : Check if age is between 13 and 18 → print TEENAGER         │
* │ Step 4 : If none of above conditions match → print NOT ADULT        │
* │ Step 5 : Execute conditional flow sequentially                      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Logic (If-Else / Range-Based Classification)            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant number of comparisons)           │
* │ Space Complexity : O(1)  (no extra memory used)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */


public class IF_Else {
    public static void main(String args[]){
        
    }
}

/*
* ╔════════════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 28: Age Classification using Conditional Branching (If-Else Logic) ║
* ╚════════════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an age value, classify the person into categories based on    │
* │ conditional checks: adult, teenager, or not adult.                  │
* │                                                                     │
* │ Output messages depend on the age range evaluation.                 │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : age = 16                                                   │
* │ Output : TEENAGER                                                   │
* │ Explanation :                                                       │
* │ 16 satisfies (age > 13 && age < 18), so "TEENAGER" is printed.      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • age is a non-negative integer                                     │
* │ • Only basic conditional logic is used                              │
* │ • Age ranges are mutually evaluated using if/else conditions        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Read integer value age                                     │
* │ Step 2 : Check if age >= 18 → print ADULT message                   │
* │ Step 3 : Check if age is between 13 and 18 → print TEENAGER         │
* │ Step 4 : If none of above conditions match → print NOT ADULT        │
* │ Step 5 : Execute conditional flow sequentially                      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Logic (If-Else / Range-Based Classification)            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant number of comparisons)           │
* │ Space Complexity : O(1)  (no extra memory used)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */


/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class IF_Else {                                               ║
* ║     public static void main(String args[]){                          ║
* ║         int age = 16;                                                ║
* ║         if(age >= 18){                                               ║
* ║             System.out.println("ADULT : DRIVE, VOTE");               ║
* ║         }                                                            ║
* ║         if(age > 13 && age < 18){                                    ║
* ║             System.out.println("TEENAGER");                          ║
* ║         }                                                            ║
* ║         else{                                                        ║
* ║              System.out.println("not ADULT");                        ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
