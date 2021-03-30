package lesson_12;
// The LinkedList class is a collection based on a linked list instead of
// an array like the ArrayList.They are good when you plan to add and delete
// items.When using a linked list you don't have to move items around when you
// add or delete an item.They aren't particularly suited to providing access based off
// of index searches like an array though.Each object in a linked list contains a pointer
// to the objects that proceed and follow it.

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {

        // Creates a LinkedList object
        LinkedList linkedListOne = new LinkedList();

        // Creates a LinkedList that contains Strings
        LinkedList<String> names = new LinkedList<String>();

        // You can use add to add items to the Linked List
        names.add("Ahmed Bennani");
        names.add("Ali Syed");

        // addLast places the object last in the list
        names.addLast("Nathan Martin");

        // addFirst places the object first in the list
        names.addFirst("Joshua Smith");

        // define what position to place the object in
        names.add(0,"Noah Peeters");

        // replace a value in an index with set()
        names.set(2, "Paul Newman");

        // remove items  either by providing the index, or the value
        names.remove(4);
        names.remove("Joshua Smith");

        // removeFirst() removes the first element
        // removeLast() removes the last element
        // removeFirstOccurrence(Object) removes the first Object that matches what you passed

        for(String name : names)
        {
            System.out.println(name);
        }

        /* OUTPUT
         * Noah Peeters
         * Paul Newman
         * Ali Syed
         */

        // You can retrieve values with get()
        System.out.println("\nFirst Index: " + names.get(0)); // output: First Index: Noah Peeters

        // Retrieve the first value with getFirst()
        System.out.println("\nFirst Index: " + names.getFirst()); // output: First Index: Noah Peeters

        // Retrieve the last value with getLast()
        System.out.println("\nLast Index: " + names.getLast()); // output: Last Index: Ali Syed

        LinkedList<String> nameCopy = new LinkedList<String>(names);

        // To print out the LinkedList itself the toString method is called
        System.out.println("\nnameCopy: " + nameCopy); // output: nameCopy: [Noah Peeters, Paul Newman, Ali Syed]

        // contains() is used to check if an object is in the list
        if(names.contains("Noah Peeters"))
        {
            System.out.println("\nNoahs Here"); // output: Noahs Here
        }

        // containsAll() is used to check if everything in one list is in another
        if(names.containsAll(nameCopy))
        {
            System.out.println("\nCollections are the same"); // output: Collections are the same
        }

        // indexOf() return the index for an object
        System.out.println("\nIndex of Ali is: " + names.indexOf("Ali Syed")); // output: Index of Ali is: 2

        // isEmpty() is used to check if a list is empty
        System.out.println("\nList Empty: " + names.isEmpty()); // output: List Empty: false

        // get the number of items in the list with size
        System.out.println("How many values: " + names.size()); // output: How many values: 3

        // peek() retrieves the first element, but doesn't throw an error
        // if there is no element to  retrieve
        System.out.println("Look without error: " + names.peek()); // output: Look without error: Noah Peeters

        // poll() returns the first value and deletes it from the list
        System.out.println("Remove first element: " + nameCopy.poll()); // output: Remove first element: Noah Peeters

        // pollLast() returns the last value and deletes it from the list
        System.out.println("Remove last element: " + nameCopy.pollLast()); // output: Remove last element: Ali Syed

        // push puts a new element on the front of the list
        nameCopy.push("Noah Peeters");

        // pop removes an element on the front of the list
        nameCopy.pop();

        System.out.println("\nnameCopy: " + nameCopy); // output: nameCopy: [Paul Newman]

        // create a new array to hold values from the LinkedList
        Object[] nameArray = new Object[4];

        // toArray converts the LinkedList into an array of objects
        nameArray = names.toArray();

        // toString converts items in the array into a String
        System.out.println(Arrays.toString(nameArray)); // output: [Noah Peeters, Paul Newman, Ali Syed]

        // clear() deletes everything in the LinkedList
        names.clear();

    }

}
