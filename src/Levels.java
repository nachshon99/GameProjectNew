import java.awt.*;

public class Levels extends Level{
    public static final int LEVEL_1 = 1;
    public static final int LEVEL_2 = 2;

    private int level;

    Levels()
    {
        endLevel = new Car(cx,3,6,Color.white);
        level = LEVEL_1;


        switch (level){
            case LEVEL_1:{
                level1();
                break;
            }
            case LEVEL_2:{
                level2();
                break;
            }
        }
    }
    public void level1(){
        xCar = new Car(cx,3,2,Color.red);
        aCar = new Car(cx,1,1,Color.green);
        bCar = new Car(cy,5,1,Color.orange);
        cCar = new Car(cx,5,5,Color.cyan);

        oTruck = new Car(ty,1,6,Color.yellow);
        pTruck = new Car(ty,2,1,Color.magenta);
        qTruck = new Car(ty,2,4,Color.blue);
        rTruck = new Car(tx,6,3,Color.green);

        setCars(new Car[]{xCar, aCar, bCar, cCar, oTruck, pTruck, qTruck, rTruck,endLevel});
    }
    public void level2(){
        xCar=new Car(cx,3,1, Color.red);
        aCar=new Car(cy,1,1,Color.green);
        bCar=new Car(cy,2,4,Color.orange);
        cCar=new Car(cy,3,5,Color.cyan);
        dCar=new Car(cy,5,3,Color.pink);
        eCar=new Car(cx,5,5,Color.magenta);
        fCar=new Car(cx,6,1,Color.green);
        gCar=new Car(cx,6,4,Color.black);

        oTruck=new Car(tx,1,4,Color.yellow);
        pTruck=new Car(ty,2,6,Color.magenta);
        qTruck=new Car(tx,4,1,Color.blue);

        setCars(new Car[]{xCar, aCar,bCar, cCar, dCar, eCar, fCar, gCar, oTruck, pTruck, qTruck,endLevel});
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}