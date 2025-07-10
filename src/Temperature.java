import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float c = inp.nextFloat();

        float f = (c * 9/5) + 32;
        System.out.println(f);

    }
}
