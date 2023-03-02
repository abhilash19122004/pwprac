public class Stringbuilding {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //character at index 0.
        System.out.println(sb.charAt(0));

        //set char at index 0.
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        //insert 
        sb.insert(4, 'S');
        System.out.println(sb);
    } 
        

}
