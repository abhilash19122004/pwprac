import java.util.*;

class conditions {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int operator = sc.nextInt();

    /**
     * 1 -> +
     * 2 -> -
     * 3 -> *
     * 4 -> /
     * 5 -> %
     */

    switch(operator)  {
      case 1 : System.out.println(a+b);
      break;
      case 2 : System.out.println(a-b); 
      break;
      case 3 : System.out.println(a*b);
      break;
      case 4 : if(b==0) {
        System.out.println("Invalid division");
      } else{
        System.out.println(a/b);
      }
      break;
      case 5 :  if(b==0) {
        System.out.println("Invalid division");
      } else{
        System.out.println(a%b);
      }
      break;
      default : System.out.println("Invalid operator");
    }



    // if(button == 1) {
    //   System.out.println("Hello");
    // } else if(button == 2)  {
    //   System.out.println("Namaste");
    // } else if(button == 3) {
    //   System.out.println("Bonjour");
    // } else {
    //   System.out.println("Invalid Button");
    // }

    // switch(button)  {
    //   case 1 : System.out.println("Hello");
    //   break;
    //   case 2 : System.out.println("Namaste");
    //   break;
    //   case 3 : System.out.println("Bonjour");
    //   break;
    //   default : System.out.println("Invalid Button");
    // }
    


  }
}





        

       
        
    
    
    


