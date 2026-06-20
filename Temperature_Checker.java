/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [08/06/26] → #2  [09/06/26] → #3  [10/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 39: Fever Detection using Temperature Threshold Check        ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a body temperature value, determine whether the person has a  │
 * │ fever or not based on a threshold value of 100.                     │
 * │                                                                     │
 * │ If temperature is greater than 100, print fever condition; otherwise│
 * │ print normal condition.                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : temp = 103.5                                               │
 * │ Output : YOU HAVE A FEVER : 103.5                                   │
 * │ Explanation : Temperature exceeds 100, so fever condition detected. │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • temp is a double/float value                                      │
 * │ • Threshold value is fixed at 100                                   │
 * │ • Simple conditional check only                                     │
 * │ • No loops or complex logic used                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize temperature value                               │
 * │ Step 2 : Compare temp with threshold (100)                          │
 * │ Step 3 : If temp > 100 → print fever message                        │
 * │ Step 4 : Else → print normal condition message                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Conditional Check (Threshold-Based Decision Making)                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)  (single comparison operation)              │
 * │ Space Complexity : O(1)  (constant memory usage)                    │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Temperature_Checker {
    public static void main(String args[]){
        
    }
}

 /*╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 39: Fever Detection using Temperature Threshold Check        ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a body temperature value, determine whether the person has a  │
 * │ fever or not based on a threshold value of 100.                     │
 * │                                                                     │
 * │ If temperature is greater than 100, print fever condition; otherwise│
 * │ print normal condition.                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : temp = 103.5                                               │
 * │ Output : YOU HAVE A FEVER : 103.5                                   │
 * │ Explanation : Temperature exceeds 100, so fever condition detected. │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • temp is a double/float value                                      │
 * │ • Threshold value is fixed at 100                                   │
 * │ • Simple conditional check only                                     │
 * │ • No loops or complex logic used                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize temperature value                               │
 * │ Step 2 : Compare temp with threshold (100)                          │
 * │ Step 3 : If temp > 100 → print fever message                        │
 * │ Step 4 : Else → print normal condition message                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Conditional Check (Threshold-Based Decision Making)                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)  (single comparison operation)              │
 * │ Space Complexity : O(1)  (constant memory usage)                    │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Temperature_Checker {                                   ║
* ║     public static void main(String args[]){                          ║
* ║         double temp = 103.5;                                         ║
* ║         if(temp > 100){                                              ║
* ║             System.out.print("YOU HAVE A FEVER :"+temp);             ║
* ║         }                                                            ║
* ║         else{                                                        ║
* ║              System.out.print("YOU DON'T HAVE A FEVER :"+temp);      ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
