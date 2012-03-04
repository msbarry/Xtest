package helpers;

/**
 * Simple java class to test java/xtest interaction
 * 
 * @author Michael Barry
 */
public class StaticMembers {
    public static int pub = 1;

    private static int priv = 2;

    public static int getSugared() {
        return 3;
    }

    public static void setSugared(int val) {

    }
}
