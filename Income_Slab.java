/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [07/06/26] → #2  [08/06/26] → #3  [09/06/26]                    │
 * │  #4  [10/06/26] → #5  [11/06/26] → #6  [12/06/26]                    │
 * │  #7  [13/06/26] → #8  [14/06/26] → #9  [15/06/26]                    │
 * │  #10 [16/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 32: Income Tax Calculation using Slab System                 ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an annual income, calculate the tax based on slab rates:      │
* │                                                                     │
* │ • Income < 5,00,000 → No tax                                        │
* │ • 5,00,000 ≤ Income < 10,00,000 → 20% tax                           │
* │ • Income ≥ 10,00,000 → 30% tax                                      │
* │                                                                     │
* │ Output the total tax amount.                                        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : income = 750000                                            │
* │ Output : YOUR TAX IS :150000                                        │
* │ Explanation : 20% of 750000 = 150000                                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • income is a non-negative integer                                  │
* │ • Tax is calculated using slab-based percentage                     │
* │ • Floating-point result is cast to integer                          │
* │ • Standard input is used for reading value                          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Read income from user input using Scanner                  │
* │ Step 2 : Check income range using conditional statements            │
* │ Step 3 : Assign tax = 0 if income < 500000                          │
* │ Step 4 : Apply 20% tax if income is between 500000 and 1000000      │
* │ Step 5 : Apply 30% tax if income ≥ 1000000                          │
* │ Step 6 : Print final calculated tax                                 │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Logic (Else-If Ladder / Slab-Based Calculation)         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (fixed number of comparisons & operations) │
* │ Space Complexity : O(1)  (constant extra space used)                │
* └─────────────────────────────────────────────────────────────────────┘
  */


import java.util.Scanner;
public class Income_Slab {
    public static void main(String args[]){
        
    }
}

/**
 *╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 32: Income Tax Calculation using Slab System                 ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an annual income, calculate the tax based on slab rates:      │
* │                                                                     │
* │ • Income < 5,00,000 → No tax                                        │
* │ • 5,00,000 ≤ Income < 10,00,000 → 20% tax                           │
* │ • Income ≥ 10,00,000 → 30% tax                                      │
* │                                                                     │
* │ Output the total tax amount.                                        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : income = 750000                                            │
* │ Output : YOUR TAX IS :150000                                        │
* │ Explanation : 20% of 750000 = 150000                                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • income is a non-negative integer                                  │
* │ • Tax is calculated using slab-based percentage                     │
* │ • Floating-point result is cast to integer                          │
* │ • Standard input is used for reading value                          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Read income from user input using Scanner                  │
* │ Step 2 : Check income range using conditional statements            │
* │ Step 3 : Assign tax = 0 if income < 500000                          │
* │ Step 4 : Apply 20% tax if income is between 500000 and 1000000      │
* │ Step 5 : Apply 30% tax if income ≥ 1000000                          │
* │ Step 6 : Print final calculated tax                                 │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Logic (Else-If Ladder / Slab-Based Calculation)         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (fixed number of comparisons & operations) │
* │ Space Complexity : O(1)  (constant extra space used)                │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║ public class Income_Slab {                                           ║
* ║     public static void main(String args[]){                          ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║         int income = sc.nextInt();                                   ║
* ║         int tax;                                                     ║
* ║         if(income < 500000){                                         ║
* ║             tax = 0;                                                 ║
* ║         }                                                            ║
* ║         else if(income >= 500000 && income < 1000000){               ║
* ║             tax = (int)(income*0.2);                                 ║
* ║         }                                                            ║
* ║         else{                                                        ║
* ║             tax = (int)(income*0.3);                                 ║
* ║         }                                                            ║
* ║         System.out.println("YOUR TAX IS :"+tax);                     ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/