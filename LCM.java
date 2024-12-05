
public class LCM {

    public static void main(String[] args) {
        System.out.println("LCM : " + getLCM(12, 15));

    }

    public static long getLCM(int a, int b) {
        long longer, smaller;
        int commonDiff;
        if (a < b) {
            longer = b;
            commonDiff = b;
            smaller = a;
        } else {
            longer = a;
            commonDiff = a;
            smaller = b;
        }

        while (longer % smaller != 0) {
            longer += commonDiff;
        }

        return longer;
    }

}
