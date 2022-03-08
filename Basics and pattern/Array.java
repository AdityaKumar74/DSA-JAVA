
public class Array {
    public static void main(String[] args) {
        System.out.println("length of a: " + getArray("aaabbc"));
    }
    public static int getArray(String str) {
        int i = 0;
        try {
            for (i = 0; ; i++) {
                str.charAt(i);
            }
        }
        catch (Exception e) {

        }
        return i;
    }

}
