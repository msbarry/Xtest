package helpers;

/**
 * Simple java class to test java/xtest interaction
 * 
 * @author Michael Barry
 */
public class PrivateMembers {
    private int i = 0;

    private int getC() {
        return 1;
    }

    private void setC(int val) {
        i = val;
    }

    private static class Inner {
        private final int c = 9;
    }
}
