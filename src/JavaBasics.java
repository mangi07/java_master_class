/**
 * Created by IntelliJ IDEA.
 * User: mpmenne
 * Date: 3/17/14
 * Time: 6:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class JavaBasics {

    public static void main(String[] varArgs) {
        System.out.println("we have command line arguments");
        if (varArgs.length > 1) {
            System.out.println("This is our command line argument" + varArgs[0]);
        }

        int myNumber = 5;
        System.out.println("Hello  " + myNumber);

        String myString = "Hello";
        System.out.println("This is my string + " + myString);

        System.out.println("I can count to ten");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String someString = "hello";
        String completelyDifferentString = "hello";
        System.out.println("Strings are not equal!" +someString == completelyDifferentString);
        System.out.println("Strings unless call .equals()" +someString.equals(completelyDifferentString));
    }

}
