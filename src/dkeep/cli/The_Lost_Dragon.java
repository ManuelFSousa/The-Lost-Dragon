package dkeep.cli;

import java.util.Scanner;
import dkeep.logic.*;

public class The_Lost_Dragon {
    public static void main(String[] args) throws Exception {
        Maps map = new Maps();
        Scanner scan = new Scanner(System.in);
        char mov;

        while(true){
            printMaze(map.maze);
            System.out.println("Por favor introduza a sua ação: ");
            mov = scan.next().charAt(0);
            
        }
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
