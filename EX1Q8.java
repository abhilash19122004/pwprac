import java.util.*;

public class EX1Q8 {
    public static void main(String args[]) {
        System.out.print("Enter x : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int result = 1;

        for(int i = 1; i<=n; i++){
            result = result * x;
        }
        System.out.print("x to the power n is : "+result+" " );

    }
}
