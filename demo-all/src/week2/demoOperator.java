package week2;
public class demoOperator {
    public static void main(String[] args) {
        // "!=" -> not equals to
        boolean result = 3 != 2; // 3 != 2 is a statement
        System.out.println(result); // true

        // "==" -> check if equals to
        // "="" -> assignment
        boolean result2 = 3 == 2;
        System.out.println(result2); // false

        // || or, && and
        // event A or event B
        // event A and event B
        boolean eventA = 3 > 5; // false
        boolean eventB = 10 % 2 == 0; // true
        boolean combine = eventA && eventB;
        System.out.println(combine);// false
        combine = eventA || eventB;
        System.out.println(combine);
        // ==, !=, >=, <=, >, < comparison -> event result

        // !eventA -> oppsite of eventA
        System.out.println(!eventA);// true

        int age = 18;
        if (age >= 18) {
            System.out.println("Adult"); //print
        } else {
            System.out.println("Not Adult");
        }
        char gender = 'M';
        if (!(age >= 18 && gender == 'M')) { 
            System.out.println("Not Male Adult");
        } else {
            System.out.println("Male Adult");
        }

        // Condition
    char grade = 'C';

    switch (grade) {
      case 'A':
        System.out.println("grade is A ");
        break;
      case 'B':
        System.out.println("grade is B ");
        break;
      case 'C':
        System.out.println("grade is C ");
        break;
      default:
        System.out.println("grade is D ");
        break;
    }

    }
}
