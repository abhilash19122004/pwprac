import java.util.*;

public class EX1Q4 {
    public static Double getCircumference(Double radius) {
        return 2*(22/7)*radius;
    }
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        System.out.println(getCircumference(radius));
    }
            
        
}

