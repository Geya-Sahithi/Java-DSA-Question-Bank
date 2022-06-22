//Rat in a Maze Problem
public class BacktrackingRat {

    public static boolean ratInMaze(int a[][],boolean vis[][],int i, int j) {

        //Base conditions
        if(i == a.length || j == a.length || a[i][j] == 0 || vis[i][j]){
            return false;     
        }
        //Base conditions for successfully reached
        if(i == a.length-1 && j == a.length-1) return true;
        
        //Mrk this cell as visited
        vis[i][j] = true;

        //check if a path is possible from down
        if(ratInMaze(a, vis, i+1, j)) return true;

        //check if a path is possible from right
        if(ratInMaze(a, vis, i, j+1)) return true;

        //Mark this cell as unvisited and backtrack
        vis[i][j] = false;

        return false;

    }
    public static void main(String[] args) {
        int a[][] = {
            {1, 1, 0, 1},
            {1, 1, 1, 1},
            {0, 0, 1, 0},
            {1, 1, 1, 1}
        };

        boolean vis[][] = new boolean[a.length][a.length];

        System.out.println(ratInMaze(a, vis, 4, 3));
    }    
}