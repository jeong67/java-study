public class Sam04 {


    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 10;
        
        
        int j1 = 20;
        int j2 = 30;


        System.out.println(i1 > i2);
        System.out.println(i1 >= i2);
        System.out.println(i1 < i2);
        System.out.println(i1 <= i2);
        System.out.println(i1 == i2);
        System.out.println(i1 != i2);

        System.out.println("------------");



        System.out.println((i1 < i2) && (j1 < j2)); //이미 첫번째가 거짓이라서 뒤에가 진실이어도 거짓으로 표시됨
        System.out.println((i1 < i2) || (j1 < j2)); //하나라도 진실이 있어서 참으로 표시
        System.out.println((i1 < i2) ^ (j1 < j2));  //하나는 참 하나는 거짓으로 서로 다른 값이어서 참으로 표시
        System.out.println(!(i1 < i2));             //결과값이 거짓이고 그것의 부정이라서 참이 나옴
        
        

    }
    
}
