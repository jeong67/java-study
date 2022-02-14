import java.util.Scanner;

public class Sam08 {

public static void main(String[] args) {
    //1,2,3,4,5,6,7,8,9,10,11,12
    //달마다 31일, 28일, 30일 등 일의 수가 다르다. 

    Scanner scanner = new Scanner(System.in);
    
    
     
    int month = scanner.nextInt();
    int day = 0;
    

    switch (month) {
        case 1:
            day = 31;
            break;

        case 2:
            day = 28;
            break;
            
        case 3:
            day = 30;
            break;


    }


    /*
    int day = 0;

    if (month == 1) {
        day = 31;
    } else if (month == 2) {
        day = 28;
    } else if (month == 3) {
        day = 31;
    } else if (month == 4) {
        day = 30;
    } else if (month == 5) {
        day = 31;
    } else if (month == 6) {
        day = 30;
    } else if (month == 7) {
        day = 31;
    } else if (month == 8) {
        day = 31;
    } else if (month == 9) {
        day = 30;
    } else if (month == 10) {
        day = 31;
    } else if (month == 11) {
        day = 30;
    } else if (month == 12) {
        day = 31;
    } else {
        System.out.println("month값이 유효하지 않습니다.");
    }
    */

    System.out.println("day" + day);

}



}