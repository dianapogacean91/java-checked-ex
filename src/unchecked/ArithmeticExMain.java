package unchecked;

import java.util.Scanner;

public class ArithmeticExMain {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input a number: ");
            int x = sc.nextInt();
            //do a check before
            if (x==0){
                System.out.println("Cannot divide by zero");
                continue;
            }
            System.out.println("Divide 100 by this number: " + 100 / x);

        }
    }
}
