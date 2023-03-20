# Merge Sort (Non-Recursive)

Merge Sort is a divide-and-conquer algorithm that sorts an array by dividing it into two halves, sorting each half recursively, and then merging the two halves. Unlike the recursive implementation, the non-recursive implementation uses a stack to keep track of the subarrays.

## Algorithm Steps

1. Divide the array into subarrays of size 1 and push them onto the stack.
2. Pop two subarrays from the stack, merge them, and push the merged subarray onto the stack.
3. Repeat step 2 until there is only one subarray on the stack.

## Complexity

The time complexity of Merge Sort is O(n*log(n)) in the average and worst case, and the space complexity is O(n). The non-recursive implementation has the same time and space complexity as the recursive implementation. However, it has a higher constant factor due to the use of the stack.
