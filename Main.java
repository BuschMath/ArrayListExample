import java.util.ArrayList;

public class Main{
    static public void main(String[] args){
        /**
         * ArrayList type is a class where you can change the size of the array at runtime. Can only store reference types.
         * IE. Cannot store primitive types like int or float.
         */
        ArrayList<String> courses = new ArrayList<String>();

        /**
         * Adding items to the array list.
         */
        courses.add("Calculus 1");
        courses.add("Calculus 2");
        courses.add("C++");
        courses.add("Data Structures");

        /**
         * Outputting items to the console.
         */
        System.out.println(courses);

        /**
         * Access a single item and outputting to the console. Note: Java is zero indexed.
         */
        System.out.println(courses.get(2));

        /**
         * Changing an item and outtting to the console.
         */
        courses.set(2, "Java");
        System.out.println(courses.get(2));

        /**
         * Remove an item. Clear can be used to remove all items.
         */
        courses.remove(2);
        System.out.println(courses.get(2));

        /**
         * Accessing the size of the array list.
         */
        System.out.println(courses.size());
    }
}