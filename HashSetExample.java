import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<Integer> evenIntegers = new HashSet<Integer>(); // Empty set of integers

        /* add some values */
        evenIntegers.add(0);
        evenIntegers.add(2);
        evenIntegers.add(4);
        evenIntegers.add(6);
        evenIntegers.add(8);
        evenIntegers.add(10);
        System.out.println("The set of even Integers is " + evenIntegers);
        
        for(int i=2;i<=20;i+=2)
            evenIntegers.add(i);
        
        System.out.println("After insertion, the set of even Integers is " + evenIntegers);         

        System.out.println("Does the set of even Integers contain odd numbers?");
        if (evenIntegers.contains(3)) {
            System.out.println("Contains odd numbers.");
        } else {
            System.out.println("Does not contain odd numbers");
        }

        System.out.println("Does the set of even Integers contain 4?");
        if (evenIntegers.contains(4)) {
            System.out.println("Yes, contains 4.");
        } else {
            System.out.println("No, does not contain 4.");
        }

        HashSet<Integer> multiplesOf5 = new HashSet<Integer>();
        multiplesOf5.add(0);
        multiplesOf5.add(5);
        multiplesOf5.add(15);
        multiplesOf5.add(25);
        multiplesOf5.add(20);
        multiplesOf5.add(35);
        multiplesOf5.add(50);

        System.out.println("The set of multiples of 5 is " + multiplesOf5 + ".");

        
    }
}
