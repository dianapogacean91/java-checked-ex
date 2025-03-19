package unchecked;

public class NPEMain {

    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.println(str);
        int x=str.length();
        str= null;
        int y = x+1;

        System.out.println(str.length());
    }
}
