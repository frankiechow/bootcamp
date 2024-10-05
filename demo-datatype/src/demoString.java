public class demoString { // class name = file name
    public static void main(String[] args) {
        // Integer decimal place

        // email address
        // "frankiechow@gmail.com" is a string value
        // emailAddress is a string variable
        // String emailAddress = "frankiechow@gmail.com";

        // we cannot assign int value to String variable
        // String x = 2; is not work

        // String Operation: +
        String x = "hello";
        String x2 = "would";
        String x3 = x + x2;
        System.out.println("x3=" + x3);

        // double k = 0; avoid
        // double o = 0.0;

        int k = 0;
        System.out.println("before : " + k);
        k = 1;
        //System.out.println("after : " - k);
        System.out.println("k++ : " + k++); //post-increment
        System.out.println("++k : + ++k");// pre-increment

        int i = 5;
        int a;// default = 0
        a = i++;
        System.out.println("using i++");
        System.out.println("a = " + a);
        System.out.println("i =" + i);// 6, before a = i++

    }
}
