package dkeep.logic;

import dkeep.logic.Maps.direction;

public class Movimento{
    //public Movimento( Maps maze, int x ,int y){
//}

public boolean Move(char ch, direction dir){
    int delta_x=0;
    int delta_y=0;

    if (dir == direction.Norte ) delta_x = -1;
    if (dir == direction.Sul)     delta_x = 1;
    if (dir == direction.Este)   delta_y = -1;
    if (dir == direction.Oeste ) delta_y = -1;

    //verificar se pode mover
     // se sim mover, e dar update. 
     if(Maps.PodeMover(delta_x , delta_y)){
    //falta mover no mapa/////////////////////////////////////////
    // Preciso de saber que memoria vou mudar, eles no exemplo usam um super que nao percebo o que e
       // x = delta_x;
        //y = delta_y;
        delta_x=1;
     return true;
     }
     return false;
}
}
