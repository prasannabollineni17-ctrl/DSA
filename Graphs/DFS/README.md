# Depth-First Search (DFS)

This is a standard recursive DFS traversal for a graph. 

WHAT WE USED:
- Recursion: Automatically handles going deep into the graph before backtracking.
- visited[] (boolean array): Keeps track of nodes we've already seen to avoid infinite loops.
- ArrayList: Stores the final order of the traversal.

HOW IT WORKS:
1. Set up the result list and a visited array, initializing all to false.
2. Call a recursive helper function starting with node 0.
3. Inside the helper function:
   - Mark the current node as visited and add it to the result list.
   - Loop through all its neighbors.
   - If a neighbor hasn't been visited yet, recursively call the helper function on it.
4. Return the final result list once all reachable nodes have been explored.
