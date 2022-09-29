package dkeep.logic;

public class Elemento {
    Maps maze;
    int x;
    int y;

    public Elemento(Maps maze, int x, int y){
        this.maze = maze;
        this.x = x;
        this.y = y;
    };

    public int GetX(){
        return x;
    };

    public int GetY(){
        return y;
    };

    public void SetX(int x){
        this.x=x;
    };

    public void SetY(int y){
        this.y=y;
    };
}
