package dkeep.logic;

public class Elements{
    Maze maze;
    int x;
    int y;

    public Elements(Maze maze, int x, int y){
        this.x = x;
        this.y = y;
        this.maze = maze;
    }



    public int GetX(){
    return x;
    };

    public int GetY(){
    return y;
    };

} 