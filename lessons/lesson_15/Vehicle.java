package lesson_15;

/* You define that you want a class to use an interface
 * with the implements keyword. This class must create
 * a method for each method defined in Drivable
 * You can implement more than 1 interface like
 * public class Vehicle implements Drivable, Crashable
 */

// You make a class part of an abstract class by using
// the extends keyword

public class Vehicle extends Crashable implements Drivable {

    int numOfWheels = 2;
    double theSpeed = 0;
    int carStrength = 0;

    // All methods must be as visible as those in the
    // interface.If they are public in the interface
    // they must be public in the subclass

    @Override
    public void setCarStrength(int carStrength) {
        this.carStrength = carStrength;
    }

    @Override
    public int getCarStrength() {
        return this.carStrength;
    }

    @Override
    public int getWheels() {
        return this.numOfWheels;
    }

    @Override
    public void setWheels(int numWheels) {
            this.numOfWheels = numWheels;
    }

    @Override
    public double getSpeed() {
        return this.theSpeed;
    }

    @Override
    public void setSpeed(double speed) {
         this.theSpeed = speed;
    }

    public  Vehicle(int wheels, double speed)
    {
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }
}
