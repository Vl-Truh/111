import java.util.Scanner;;

public class App {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Num:");
        byte line = in.nextByte();

        System.out.printf("Your line is: %b \n", line);
        in.close();
    }
}