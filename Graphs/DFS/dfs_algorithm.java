class Solution {
    public static void  helper(ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer> ans,int v){
        visited[v]=true;
        ans.add(v);
        for(int num:adj.get(v)){
            if(!visited[num]){
                helper(adj,visited,ans,num);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        boolean[] visited= new boolean[adj.size()];
        Arrays.fill(visited,false);
        helper(adj,visited,ans,0);
        return ans;
        
    }
}
