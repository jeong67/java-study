public class Sam02 {

    String name = "";


    public static void main(String[] args) {


        char c1 = ' ';      //공백
        char c2 = '\0';     //null
        char c3 = '\u0000'; //null

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);
    } 
}