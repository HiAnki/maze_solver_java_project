import java.util.ArrayList;

public class DFS {
    public static boolean searchPath(int[][] maze, int row, int col, ArrayList<Integer> path) {
        // base condition
        if(row<0 || col<0 || row==maze.length || col==maze[0].length || maze[row][col]==1 || maze[row][col]==2) return false;

        // path reaches destination
        if(maze[row][col]==9) {
            path.add(row);
            path.add(col);
            return true;
        }

        // mark current cell and travel all 4 directions
        maze[row][col] = 2;
        if(searchPath(maze,row+1,col,path)) {
            path.add(row);
            path.add(col);
            return true;
        }
        if(searchPath(maze,row-1,col,path)) {
            path.add(row);
            path.add(col);
            return true;
        }
        if(searchPath(maze,row,col+1,path)) {
            path.add(row);
            path.add(col);
            return true;
        }
        if(searchPath(maze,row,col-1,path)) {
            path.add(row);
            path.add(col);
            return true;
        }
        return false;
    }
}
