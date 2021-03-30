package lesson_07;

class Monster {

    public final String TOMBSTONE = "Here Lies a Dead monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;
    public String name = "Big Monster";

    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if(health < 0)
        {
            alive = false;
        }
    }
    public void setHealth(double decreaseHealth)
    {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if(health < 0)
        {
            alive = false;
        }
    }

    public Monster(int health, int attack, int movement) {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
    }
    // Default constructor
    public Monster() {
    }

    /*
    * You can use the this keyword to call other constructors
    * public LessonSeven(int newHealth)
    * {
    *      health = newHeath;
    * }
    *
    * public LessonSeven(int newHealth, int newAttack)
    * {
    *     this(newHealth);
    *     attack = newAttack;
    * }
     */
}

public class Solution {
    public static void main(String[] args) {

        Monster Frank = new Monster();
        Frank.name = "Frank";
        System.out.println(Frank.name + " has an attack value of " + Frank.getAttack());
    }
}
