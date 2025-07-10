import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;

        if(n<5){
            System.out.println("Give a number higher than 5");
        }
        else {
            for (int i = 0; i <= n; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                if (count==5){
                    System.out.println("Matching at : " + i);
                }
        count++;
            }
        }
    }
}
