import java.util.*;

public class Function {
    public static void printFactorial(int n) {
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int Fact = 1;
       for(int i=n; i>=1; i--){
        Fact = Fact * i;
       }
       System.out.println(Fact);
       return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);   
    }                            
}
