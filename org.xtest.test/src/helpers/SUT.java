package helpers;

/**
 * Simple java class to test java/xtest interaction
 * 
 * @author Michael Barry
 */
public class SUT {
    public static int staticField = 3;

    public static int getStatic() {
        return 2;
    }

    public static int getStatic2() {
        return 2;
    }

    public int get2() {
        return 2;
    }

    public static class InnerClass {
        public static int innerField = 1;

        public static int getStatic() {
            return 1;
        }

        public int nonStaticField = 1;

        public int getNonStatic() {
            return 1;
        }
    }
}
