package week2;
import java.util.Scanner;
//import case 1 , Quick fix
// import 2 , ctrl + shift + o -> auto import
public class demoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input a number : ");
        int number = input.nextInt();
        System.out.println("number is " + number);

        if(number > 100)
        System.out.println("number > 100");
        if(number < 100)
        System.out.println("number < 100");
        if(number == 100)
        System.out.println("number = 100");
        
        switch(number) {
            case 100:
            System.out.println("number is 100");
            break;
            case 101:
            System.out.println("number is " + number);
            break;
            case 99:
            System.out.println("number is " + number);
            default:
            System.out.println("number is not 100 / 101 / 99");
            break;
            
        }
    }
}
