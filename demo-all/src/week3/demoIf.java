package week3;

public class demoIf {
    public static void main(String[] args) {
        int x = 3;
        if(x > 2) {
            System.out.println("x > 2");
        }

        int age = 66;
        if (age >= 65) {
            System.out.println("Elderly"); //print
        } else {
            System.out.println("Not Adult");
        }
        boolean isElderly = age >= 65;
        if(isElderly){
            System.out.println("It's Elderly");
        }
        String s = "hello";
        if (s.length() > 4){
            System.out.println("length > 4"); 
        } else {
            System.out.println("length <= 4");
        }

        int a = 101;
        int b = 100;
        int max = -1;
        if(a > b){
            max = a;
        } else {
            max = b;
        }
        System.out.println("max = " + max);  //101
        
        int historyScore = 60;
        int passingScore = 60;
        boolean result = false;
        if (historyScore >= passingScore){
            result = true;
        } else {
            result = false;
        }
        if(result){
            System.out.println("result pass");
        } else {
            System.out.println("resulf fail");
        }

        // else if
        String color = "";
        if (historyScore > passingScore){ //event 1
            color = "Green";
        } else if(historyScore == passingScore){ //event 2
            color = "yellow";
        } else { //event 3
            color = "Red";
        }
        System.out.println(color + " color");

        char grade = 'A';
        int score = 85;
        if(score >= 90){
            grade = 'A';
        } else if(score >= 80){
            grade = 'B';
        } else if(score >= 70){
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        // and && , or ||
        if(score >= 90){
            grade = 'A';
        } else if(score >= 80 && score <= 89){
            grade = 'B';
        } else if(score >= 70 && score <= 79){
            grade = 'C';
        } else{
            grade = 'F';
        }
        boolean isGradeB = score >= 80 && score <= 89;
        System.out.println("Grade is B : " + isGradeB);

        int age1 = 70;
        char gender = 'M';
        int baseFee = 100;
        if(gender != 'F'){
            baseFee *= 1.1;
        } else if(gender == 'F' && age1 > 60){
            baseFee *= 1.08;
        } else {
            baseFee *= 1.1;
        }
        System.out.println("Fee: $" + baseFee);

        if(gender == 'M' || gender == 'F' && age1 <= 60){
            baseFee *= 1.1;
        } else if(gender == 'F' && age1 > 60){
            baseFee *= 1.08;
        }
        System.out.println("basefee : $" + baseFee);

        String str = "hello world";
        // if string value contains "w", print "Contain w."
        // if string value contain "w" and length > 7, print "*****"
        // Position 3 is upper case, print "upper case."
        // You may print more than one sentence.
        boolean contains = str.contains("w");
        boolean Length = str.length() > 7;
        boolean PositionUpper = str.charAt(2) >= 65 && str.charAt(2) <= 90;
        if(contains){
            System.out.println("Contain w");
        }
        if(Length){
            System.out.println("*****");
        }
        if(PositionUpper){
            System.out.println("upper case");
        }

    }
}
