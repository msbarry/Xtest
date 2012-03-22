package helpers;

public class SubPrivateMembers extends PrivateMembers {
    private int i = 1;

    private int getC() {
        return 1;
    }

    private void setC(int val) {
        i = val;
    }
}
