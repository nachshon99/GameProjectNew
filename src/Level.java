import javax.swing.*;
import java.awt.*;

public abstract class Level extends JFrame {

    public final String cx ="xCar";
    public final String cy ="yCar";
    public final String tx ="xTruck";
    public final String ty ="yTruck";

    protected Car endLevel;

    protected Car xCar;
    protected Car aCar;
    protected Car bCar;
    protected Car cCar;
    protected Car dCar;
    protected Car eCar;
    protected Car fCar;
    protected Car gCar;
    protected Car hCar;
    protected Car iCar;
    protected Car jCar;
    protected Car kCar;

    protected Car oTruck;
    protected Car pTruck;
    protected Car qTruck;
    protected Car rTruck;

    private Car[] cars;

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Car getxCar() {
        return xCar;
    }

}
