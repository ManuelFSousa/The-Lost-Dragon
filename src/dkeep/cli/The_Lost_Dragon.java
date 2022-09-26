package dkeep.cli;

import dkeep.logic.*;

public class The_Lost_Dragon {
    public static void main(String[] args) throws Exception {
        Maps map = new Maps();
        printMaze(map.maze);
    }

    private static void printMaze(char[][] maze){
        for(int i = 0 ; i < maze.length ; i++){
            for(int j = 0 ; j < maze[i].length ; j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}
