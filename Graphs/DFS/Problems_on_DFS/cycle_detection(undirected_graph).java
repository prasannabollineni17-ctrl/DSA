class Solution {
    public static boolean dfs(int parent,List<List<Integer>> adj,boolean[]vis,int src){
        vis[src]=true;
        for(int num:adj.get(src)){
            if(!vis[num]){
                if(dfs(src,adj,vis,num)==true) return true;
            }
            else if(num!=parent) return true;
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj=  new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[]vis=  new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
               if(dfs(-1,adj,vis,i)) return true;
            }
        }
        return false;
    }
}
