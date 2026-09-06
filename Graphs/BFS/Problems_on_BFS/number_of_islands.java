class pair{
    int first;
    int second;
    public pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
  //bfs traversal
    public void bfs(int row,int col,char[][]grid,int[][] visited){
        visited[row][col]=1;
        int m=grid.length;
        int n=grid[0].length;
        Queue<pair> q= new LinkedList<>();
        q.add(new pair(row,col));
        while(!q.isEmpty()){
            int ro=q.peek().first;
            int co=q.peek().second;
            q.remove();
          // traversing in all four directions
            int[] delrow={-1,0,1,0};
            int[] delcol={0,-1,0,1};
            for(int i=0;i<4;i++){
                    int nrow=ro+delrow[i];
                    int ncol=co+delcol[i];
                    if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]=='1' && visited[nrow][ncol]==0){
                        visited[nrow][ncol]=1;
                        q.add(new pair(nrow,ncol));
                    }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int answer=0;
        int m=grid.length;
        int n=grid[0].length;
        int [][] visited= new int[m][n];
        
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(visited[row][col]==0 && grid[row][col]=='1'){
                    answer++;
                    bfs(row,col,grid,visited);
                }
            }
        }
        return answer;
    }
}
