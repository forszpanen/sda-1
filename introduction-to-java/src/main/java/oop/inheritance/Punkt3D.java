package oop.inheritance;

/**
 * Created by RENT on 2017-07-21.
 */
public class Punkt3D extends Punkt2D {
    private int z;

    public Punkt3D(){
        super();
        z = 0;
    }

    Punkt3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    @Override
    public String Opisz(){
        String opis = super.Opisz();
        return opis + " a trzecia wspolrzedna to:" + z;
    }

}
