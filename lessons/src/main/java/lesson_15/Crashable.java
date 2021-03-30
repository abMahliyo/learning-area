package lesson_15;

/*
 * If you want to create a class in which every method
 * doesn't have to be implemented use abstract classes.
 */
public abstract class Crashable {

    boolean carDrivable = true;

    public void youCrashed() {
        this.carDrivable = false;
    }

    public abstract void setCarStrength(int carStrength);

    public abstract int getCarStrength();

    public abstract void setWheels(int numWheels);
}

