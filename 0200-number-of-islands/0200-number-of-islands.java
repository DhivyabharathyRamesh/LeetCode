class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count++;
                    dfs(i,j,visited,grid);

                }
                
            }
        }
        return count;
    }
    public void dfs(int row, int col,boolean[][] visited,char[][] grid){
        
        if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]=='0'||(visited[row][col])){
            return ;
        }
        visited[row][col]=true;
        
        dfs(row-1,col,visited,grid);
        dfs(row+1,col,visited,grid);
        dfs(row,col-1,visited,grid);
        dfs(row,col+1,visited,grid);

    
    }
    
}