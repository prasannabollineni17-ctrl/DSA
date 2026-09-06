// LEETCODE PROBLEM 547
class Solution {
// dfs taversal
    public static void dfs(int node,List<List<Integer>> adj,int[] visited){
        visited[node]=1;
        for(int num:adj.get(node)){
            if(visited[num]==0){
                dfs(num,adj,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
// converting adjacency matrix into adjacency list
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1&& i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count=0;
// creating visited array
        int [] visited=new int[isConnected.length];
        Arrays.fill(visited,0);
// finding number of provinces(no of connected components)..
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==0){
                count++;
                dfs(i,adj,visited);
            }
        }
        return count;
    }
}
