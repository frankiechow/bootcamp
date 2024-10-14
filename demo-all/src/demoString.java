public class demoString { // class name = file name
    public static void main(String[] args) {
        // Integer decimal place

        // email address
        // "frankiechow@gmail.com" is a string value
        // emailAddress is a string variable
        String emailAddress = "frankiechow@gmail.com";
        System.out.println(emailAddress);


        // we cannot assign int value to String variable
        // String x = 2; is not work

        // String Operation: +
        String x = "hello";
        String x2 = " would";
        String x3 = x + x2;
        System.out.println("x3 = " + x3);

        // ! equals()
        // boolean result = x.equals("hello"); newbie style not good
        boolean result = "hello".equals(x);
        System.out.println(result); //true
        // boolean result2 = x.equals("hello!");
        boolean result2 = "hello!".equals(x);
        System.out.println(result2); //false

        // ! length()
        int len = x.length();
        System.out.println(len); // 5

        // ! charAt (index)
        // index starts from 0 to length -1
        System.out.println(x.charAt(0)); //h
        System.out.println(x.charAt(1)); //e
        System.out.println(x.charAt(2)); //l
        System.out.println(x.charAt(3)); //l
        System.out.println(x.charAt(4)); //o
        System.out.println(x.charAt(x.length() - 1)); // o

        int age = 60;
        String sentence = "I am at age " + age; // String + int -> String
        System.out.println(sentence);

        // double k = 0; avoid
        // double o = 0.0;

        int k = 0;
        System.out.println("before : " + k);
        k = 1;
        //System.out.println("after : " - k);
        System.out.println("k++ : " + k++); //post-increment
        System.out.println("++k : "+ ++k);// pre-increment

        int i = 5;
        int a;// default = 0
        a = i++;
        System.out.println("using i++");
        System.out.println("a = " + a);
        System.out.println("i =" + i);// 6, before a = i++

    }
}
