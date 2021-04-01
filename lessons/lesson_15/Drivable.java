package lesson_15;

/* Java doesn't allow you to inherit from more than one class.
 * To add additional functionality you should create an interface.
 * Interfaces are empty classes. They provide all of the methods
 * you must use, but none of the code.
 */

// Interfaces have a name that is an adjective
public interface Drivable {

    // You can put fields in an interface , but their
    // values are final and can't be changed.
    double PI = 3.14159265;

    // All methods in an interface must be implemented
    // They are public and abstract by default
    // An abstract method must be defined by any class
    // that uses the interface
    int getWheels();

    // You can't define a method as final and abstract
    // final means the method can't be changed and
    // abstract means it must be  changed
    void setWheels(int numWheels);

    double getSpeed();

    void setSpeed(double speed);


}
