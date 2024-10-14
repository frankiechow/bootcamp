package week3;

public class demoSwitch {
    public static void main(String[] args) {
        int dayOfWeek = 5;
        String dayName = "";
        switch (dayOfWeek) { // !! No range checking
            case 1:
            dayName = "Monday";
            break;
            case 2:
            dayName = "Tuesday";
            break;
            case 3:
            dayName = "Wednesday";
            break;
            case 4:
            dayName = "Thurday";
            break;
            default:
            dayName = "Error 404";
        }
        System.out.println("day of name : " + dayName);

        int money = 0;
        char x = 'C';
        switch(x){
            case 'A':
            money += 10;
            // break;
            case 'B':
            money += 10;
            // break;
            case 'C':
            money += 10;
            break;
            default:
            money = 0;
        }
        System.out.println("money : $" + money);

        int score = 75;
        char grade = ' ';

    }
}
