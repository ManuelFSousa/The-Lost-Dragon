package dkeep.logic;

public class Element {
    Maps map;
    int posx;
    int posy;

    public Element(Maps map, int posx, int posy){
        this.map = map;
        this.posx = posx;
        this.posy = posy;
    }

    public int Getx(){
        return posx;
    }

    public int Gety(){
        return posy;
    }

    public void SetX(int x) {
        this.posx = x;
    }
    
    public void SetY(int y) {
        this.posy = y;
    }

    public boolean Overlap(Element other){
        if((posx == other.posx) && (posy == other.posy))
            return true;
    }

    public boolean AdjacentTo(Element other){
        if((posx - 1 == other.posx) && (posy == other.posy)) return true;
        if((posx + 1 == other.posx) && (posy == other.posy)) return true;
        if((posx == other.posx) && (posy - 1 == other.posy)) return true;
        if((posx == other.posx) && (posy + 1 == other.posy)) return true;

        return false;
    }
}
