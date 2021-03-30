package lesson_11;

/*
* Java ArrayLists make it easy to keep track of groups of objects.
* A Java ArrayList  differs from a Java Array  that it automatically resizes
* itself when you add or remove values.
* Collection classes were created to make it easy to keep track
* of groups of objects.ArrayLists are easy to add to and delete from.
 */

import com.sun.source.tree.LiteralTree;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Solution {

    public static void main(String[] args) {

        // create an ArrayList variable
        ArrayList arrayListOne;

        // create an ArrayList object
        // you don't have to declare the ArrayList size like you
        // do with arrays
        arrayListOne = new ArrayList();

        // create the ArrayList on one line
        ArrayList arrayListTwo = new ArrayList();

        // define the type of elements the ArrayList will hold
        ArrayList<String> names = new ArrayList<String>();

        // add elements to an ArrayList
        names.add("John Smith");
        names.add("John Smith");
        names.add("John Smith");

        // add an element in a specific position
        names.add(2, "Jack Ryan");

        // you can retrieve values in an ArrayList with get
        // arrayListName.size() returns the size of ArrayList
        for(int i = 0; i< names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        // you can replace a value using the set method
        names.set(0, "John Adams");

        // remove an item with remove
        names.remove(3);

        // you can remove the first and second item with
        // the removeRange method
        // names.removeRange(0, 1);

        System.out.println(names);

        for(String i : names)
        {
            System.out.println(i);
        }
        System.out.println();

        // before the enhanced for you had to use an iterator
        // to print out values in an ArrayList

        // creates an iterator object with methods that allow
        // you to iterate through the values in the ArrayList
        Iterator indivItems = names.iterator();

        // when hasNext is called it return true or false
        // depending on whether there are more items in the list

        while(indivItems.hasNext())
        {
            // next retrieves the next item in the ArrayList
            System.out.println(indivItems.next());
        }

        // I create an ArrayList without stating the type of values it contains
        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        // addAll adds everything in one ArrayList to another
        nameCopy.addAll(names);
        System.out.println(nameCopy);

        String paulYong = "Paul Young";

        // you can add variable values to an ArrayList
        names.add(paulYong);

        if(names.containsAll(nameCopy))
        {
            System.out.println("Everything in nameCopy is in names");
        }
        // clear deletes everything in the ArrayList
        names.clear();

        // isEmpty returns a boolean value based on if the ArrayList
        // is empty
        if(names.isEmpty())
        {
            System.out.println("The ArrayList is empty");
        }

        Object[] moreNames = new Object[4];

        // toArray converts the ArrayList into an array of objects
        moreNames = nameCopy.toArray();

        // toString converts items in the array into a STring
        System.out.println(Arrays.toString(moreNames));


    }
}
