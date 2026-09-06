# Breadth-First Search (BFS)

This is a standard BFS traversal for a graph. 

WHAT  WE USED:
- Queue (LinkedList): Helps process nodes level by level (FIFO).
- visited[] (boolean array): Keeps track of nodes we've already seen so we don't get stuck in a loop.
- ArrayList: Stores the final order of the traversal.

HOW IT WORKS:
1. Set up the result list, queue, and visited array.
2. Mark the starting node (0) as visited and push it into the queue.
3. Loop until the queue is empty:
   - Pop the front node and add it to the result list.
   - Look at all its unvisited neighbors, mark them as visited, and push them into the queue.
4. Return the result list once the queue is empty.
