package dkeep.logic;

public class Game {
    Maze maze;
    Hero hero;
    
    public Game(){
        maze = new Maze();
        hero = new Hero(maze, 1, 1); 
        
    }
}
