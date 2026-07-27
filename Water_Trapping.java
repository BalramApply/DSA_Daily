/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [21/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 105: Trapping Rain Water (Prefix Maximum Arrays)             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an array representing the height of elevation bars, determine │
 * │ the total amount of rainwater that can be trapped after raining.    │
 * │ Input: Integer array representing bar heights.                      │
 * │ Output: Total units of trapped rainwater.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [4, 2, 0, 6, 3, 2, 5]                                      │
 * │ Output : 11                                                         │
 * │ Explanation : Water trapped at each index is calculated using the   │
 * │ minimum of the left and right maximum boundaries. The total trapped │
 * │ water is 11 units.                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Height array contains non-negative integers.                        │
 * │ Array size should be at least 1.                                    │
 * │ Extra arrays are used to store left and right maximum heights.      │
 * │ Water cannot be trapped at the first and last indices.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a leftMax array and store the maximum height from   │
 * │          the left up to each index.                                 │
 * │ Step 2 : Create a rightMax array and store the maximum height from  │
 * │          the right up to each index.                                │
 * │ Step 3 : Traverse the array once more.                              │
 * │ Step 4 : Compute waterLevel = min(leftMax[i], rightMax[i]).         │
 * │ Step 5 : Water trapped at index i = waterLevel - height[i].         │
 * │ Step 6 : Add the trapped water at every index to the total.         │
 * │ Step 7 : Return the total trapped water.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Prefix Maximum Arrays | Dynamic Programming                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Height   : [4, 2, 0, 6, 3, 2, 5]                                    │
 * │ LeftMax  : [4, 4, 4, 6, 6, 6, 6]                                    │
 * │ RightMax : [6, 6, 6, 6, 5, 5, 5]                                    │
 * │                                                              Water  │
 * │ Index 0 : min(4,6) - 4 = 0                                          │
 * │ Index 1 : min(4,6) - 2 = 2                                          │
 * │ Index 2 : min(4,6) - 0 = 4                                          │
 * │ Index 3 : min(6,6) - 6 = 0                                          │
 * │ Index 4 : min(6,5) - 3 = 2                                          │
 * │ Index 5 : min(6,5) - 2 = 3                                          │
 * │ Index 6 : min(6,5) - 5 = 0                                          │
 * │ Total Trapped Water = 11                                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(n)                                             │
 * │ where n = number of bars (array length).                            │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Water_Trapping {
        
    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2,5};
       
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 105: Trapping Rain Water (Prefix Maximum Arrays)             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an array representing the height of elevation bars, determine │
 * │ the total amount of rainwater that can be trapped after raining.    │
 * │ Input: Integer array representing bar heights.                      │
 * │ Output: Total units of trapped rainwater.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [4, 2, 0, 6, 3, 2, 5]                                      │
 * │ Output : 11                                                         │
 * │ Explanation : Water trapped at each index is calculated using the   │
 * │ minimum of the left and right maximum boundaries. The total trapped │
 * │ water is 11 units.                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Height array contains non-negative integers.                        │
 * │ Array size should be at least 1.                                    │
 * │ Extra arrays are used to store left and right maximum heights.      │
 * │ Water cannot be trapped at the first and last indices.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a leftMax array and store the maximum height from   │
 * │          the left up to each index.                                 │
 * │ Step 2 : Create a rightMax array and store the maximum height from  │
 * │          the right up to each index.                                │
 * │ Step 3 : Traverse the array once more.                              │
 * │ Step 4 : Compute waterLevel = min(leftMax[i], rightMax[i]).         │
 * │ Step 5 : Water trapped at index i = waterLevel - height[i].         │
 * │ Step 6 : Add the trapped water at every index to the total.         │
 * │ Step 7 : Return the total trapped water.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Prefix Maximum Arrays | Dynamic Programming                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Height   : [4, 2, 0, 6, 3, 2, 5]                                    │
 * │ LeftMax  : [4, 4, 4, 6, 6, 6, 6]                                    │
 * │ RightMax : [6, 6, 6, 6, 5, 5, 5]                                    │
 * │                                                              Water  │
 * │ Index 0 : min(4,6) - 4 = 0                                          │
 * │ Index 1 : min(4,6) - 2 = 2                                          │
 * │ Index 2 : min(4,6) - 0 = 4                                          │
 * │ Index 3 : min(6,6) - 6 = 0                                          │
 * │ Index 4 : min(6,5) - 3 = 2                                          │
 * │ Index 5 : min(6,5) - 2 = 3                                          │
 * │ Index 6 : min(6,5) - 5 = 0                                          │
 * │ Total Trapped Water = 11                                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(n)                                             │
 * │ where n = number of bars (array length).                            │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Water_Trapping {                                        ║
* ║     public static int water(int height[]){                           ║
* ║         int n = height.length;                                       ║
* ║         int leftMax[] = new int[n];                                  ║
* ║         leftMax[0] = height[0];                                      ║
* ║                                                                      ║
* ║         // calculate left max boundary                               ║
* ║         for(int i=1; i<n; i++){                                      ║
* ║             leftMax[i] = Math.max(height[i], leftMax[i-1]);          ║
* ║         }                                                            ║
* ║                                                                      ║
* ║         int rightMax[] = new int[n];                                 ║
* ║         rightMax[n-1] = height[n-1];                                 ║
* ║                                                                      ║
* ║         // calculate right max boundary                              ║
* ║         for(int i=n-2; i>=0; i--){                                   ║
* ║             rightMax[i] = Math.max(height[i], rightMax[i+1]);        ║
* ║         }                                                            ║
* ║                                                                      ║
* ║         int trappedWater = 0;                                        ║
* ║                                                                      ║
* ║         for(int i=0; i<n; i++){                                      ║
* ║             int waterLevel = Math.min(leftMax[i], rightMax[i]);      ║
* ║             trappedWater += waterLevel - height[i];                  ║
* ║         }                                                            ║
* ║         return trappedWater;                                         ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String args[]){                          ║
* ║         int height[] = {4, 2, 0, 6, 3, 2, 5};                        ║
* ║         System.out.print("trapped water is : " +water(height));      ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Auxiliary Boundary Arrays Trace (height = [4, 2, 0, 6, 3, 2, 5]):   ║
* ║                                                                      ║
* ║  Index (i)    |  0  |  1  |  2  |  3  |  4  |  5  |  6               ║
* ║  ─────────────|─────|─────|─────|─────|─────|─────|────              ║
* ║  height[i]    |  4  |  2  |  0  |  6  |  3  |  2  |  5               ║
* ║  leftMax[i]   |  4  |  4  |  4  |  6  |  6  |  6  |  6               ║
* ║  rightMax[i]  |  6  |  6  |  6  |  6  |  5  |  5  |  5               ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Trapped Water Calculation per Bar:                                  ║
* ║                                                                      ║
* ║  Index | Min(leftMax, rightMax) | Water Level - height[i] | Water    ║
* ║  ──────|────────────────────────|─────────────────────────|────────  ║
* ║    0   |      Min(4, 6) = 4     |          4 - 4          |   0      ║
* ║    1   |      Min(4, 6) = 4     |          4 - 2          |   2      ║
* ║    2   |      Min(4, 6) = 4     |          4 - 0          |   4      ║
* ║    3   |      Min(6, 6) = 6     |          6 - 6          |   0      ║
* ║    4   |      Min(6, 5) = 5     |          5 - 3          |   2      ║
* ║    5   |      Min(6, 5) = 5     |          5 - 2          |   3      ║
* ║    6   |      Min(6, 5) = 5     |          5 - 5          |   0      ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║  trapped water is : 11                                               ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Algorithmic Dynamics & Complexity:                                  ║
* ║                                                                      ║
* ║  1. Core Trapping Formula:                                           ║
* ║     - $\textWater Level= \min(\text{leftMax}[i], \text{rightMax}[i])$║
* ║     - $\text{Trapped Water} = \text{Water Level} - \text{height}[i]$ ║
* ║                                                                      ║
* ║  2. Auxiliary Array Approach:                                        ║
* ║     - Time Complexity: $O(n)$ — Three sequential linear scans.       ║
* ║     - Space Complexity: $O(n)$ — Memory allocated for leftMax &      ║
* ║       rightMax arrays.                                               ║
* ║                                                                      ║
* ║  3. Next Level Optimization:                                         ║
* ║     - Can be solved in $O(1)$ extra space using a Two-Pointer        ║
* ║       approach (`left` and `right` indices closing in from edges).   ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/