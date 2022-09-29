package dkeep.logic;

public class Maze {
    char[][] maze = {{'X','X','X','X','X','X','X','X','X','X'},
                    {'X','H',' ',' ',' ',' ',' ',' ',' ','X'},
                    {'X',' ','X','X',' ','X',' ','X',' ','X'},
                    {'X','D','X','X',' ','X',' ','X',' ','X'},
                    {'X',' ','X','X',' ','X',' ','X',' ','X'},
                    {'X',' ',' ',' ',' ',' ',' ','X',' ','E'},
                    {'X',' ','X','X',' ','X',' ','X',' ','X'},
                    {'X',' ','X','X',' ','X',' ','X',' ','X'},
                    {'X','K','X','X',' ',' ',' ',' ',' ','X'},
                    {'X','X','X','X','X','X','X','X','X','X'}};

    public char[][] getMaze(){
        return maze;
    }

    public boolean isDragon(int x, int y){
        return (maze[x][y] == 'D');
    }

    public boolean isKey(int x, int y){
        return (maze[x][y] == 'K');
    }

    public boolean isDragonNear(int x, int y){
        if(maze[x-1][y] == 'D')
            return true;
        else if(maze[x+1][y] == 'D')
            return true;
        else if(maze[x][y-1] == 'D')
            return true;
        else if(maze[x][y+1] == 'D')
            return true;
        else
            return false;
    }
    
}
