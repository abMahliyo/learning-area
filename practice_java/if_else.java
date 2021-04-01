import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner STDIN = new Scanner(System.in);
        int N = STDIN.nextInt();

        if(N%2 == 1) {
            System.out.println("Weird");
        } else {
            if(N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if(N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}
