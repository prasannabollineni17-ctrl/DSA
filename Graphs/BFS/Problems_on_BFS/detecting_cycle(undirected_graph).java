class Solution {
    static class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static boolean bfs(List<List<Integer>> adj,int src,boolean[] vis){
        Queue<pair> q= new LinkedList<>();
        q.add(new pair(src,-1));
        vis[src]=true;
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.remove();
            for(int num:adj.get(node)){
                if(!vis[num]){
                    vis[num]=true;
                    q.add(new pair(num,node));
                }
                else if(parent!=num)  return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
            
        }
        boolean [] vis= new boolean[V];
        
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(bfs(adj,i,vis)) return true;
            }
        }
        return false;
    }
}
