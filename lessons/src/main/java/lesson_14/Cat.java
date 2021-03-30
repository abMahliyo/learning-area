package lesson_14;

// Cat is a Subclass of Animal
// You create subclasses with the extends keyword
// Now Cat has all the Methods and Fields that Animal defined
// This is known as inheritance because Cat inherits all
// the methods and fields defined in Animal

public class Cat extends Animal {

    // You can add new fields to the subclass
    public String favToy = "Yarn";

    // You can add new methods
    public void playWith() {
        System.out.println("Yeah " + favToy);
    }

    // Here I override the Animal walkAround method
    public void walkAround() {

        System.out.println(this.getName() + " stalks around and then sleeps");
    }

    public String getToy() {
        return this.favToy;
    }

    public Cat() {

    }

    public Cat(String name, String favFood, String favToy) {
        // super calls the constructor for the super class Animal
        super(name, favFood);

        /// we set the favToy value in Cat because  it doesn't
        // exist in tha Animal class
         this.favToy = favToy;
    }

}
