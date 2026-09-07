Step by Step Approach of Sorting Algorithms like:-
1.Insertion Sort
2.Bubble Sort
3.Selection Sort
4.Quick Sort
5.Merge Sort
---------------------------------------------------------------------------------------------------
1.INSERTION SORT
---------------------------------------------------------------------------------------------------
Start: 
Begin with the second element in the array, assuming the first element is already in its own "sorted" section.

Compare: 
Take the current element and compare it to the sorted elements before it, moving from right to left.

Shift: 
If a previous element is larger than your current element, shift that larger element one position to the right to make room.

Insert: 
Once you find an element smaller than your current one (or reach the beginning), insert your current element into the empty space.

Repeat: 
Move to the next unsorted element and repeat steps 2-4 until the entire array is sorted.

----------------------------------------------------------------------------------------------------
2.BUBBLE SORT
----------------------------------------------------------------------------------------------------
Start: 
Begin at the first element of the array.

Compare: 
Look at the current element and the one immediately next to it.

Swap: 
If the first element is larger than the second one, swap their positions.

Bubble Up: 
Move one position to the right and repeat the compare-and-swap process until you reach the end. (By the end of this pass, the largest number will have "bubbled" to the very end).

Repeat: 
Go back to the beginning and repeat steps 1-4 for the remaining unsorted elements until you can go through the entire array without making any swaps.

------------------------------------------------------------------------------------------------------
3.SELECTION SORT
------------------------------------------------------------------------------------------------------
Start: 
Begin at the first position of the unsorted array. Assume the element currently at this position is the smallest.

Search: 
Scan through the rest of the unsorted elements to the right to look for an even smaller number.

Find Minimum: 
As you scan, if you find a smaller number, keep track of its position as the new "minimum."

Swap: 
Once you finish scanning the rest of the array, swap the smallest number you found with the number at your starting position.

Repeat: 
Move your starting position one spot to the right and repeat steps 1-4 for the remaining unsorted section until the whole array is sorted.
