package basicJava;

import com.sun.jdi.Method;

public class MethodOverrideTwo {
    static int Apple=60;
    static int Orange=50;

    public static void test() {

        if (Apple == 60) {

            System.out.println(Apple);
        } else {

            System.out.println(Orange);
        }

    }
}