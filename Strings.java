public class Strings { 
    public static void main(String args[]) { 
          
        String name1 = "Stark"; 
        String name2 = "Stark"; 
         
       if(name1==name2){ 
        System.out.println("name1 is Equal"); 
       } else if(name1.compareTo(name2) > 0){
        System.out.println("name1 is Greater"); 
       } else{                                                    
        System.out.println("name1 is smaller");
       }
       System.out.println("to name2"); 

       

    }
}
