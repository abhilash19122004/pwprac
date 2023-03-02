import java.util.*;

public class Patterns{
    public static void main(String args[]) {
        int n=5;

        for(int i=1; i<=n-1; i++)  {
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=(n*2)-i*2; j>=2; j--){
                System.out.print("* "); 
            }
            System.out.println();
        }
        
    }
}