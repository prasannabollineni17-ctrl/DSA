class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // BFS traversal of a graph(represented  using adjacency list)
        ArrayList<Integer> list= new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        boolean []  visited= new  boolean[adj.size()];
        Arrays.fill(visited,false);
        visited[0]=true;
        q.add(0);
        while(!q.isEmpty()){
            int val=q.poll();
            list.add(val);
            for(int num:adj.get(val)){
                if(!visited[num]){
                    visited[num]=true;
                    q.add(num);
                }
            }
        }
        return list;
    }
}
