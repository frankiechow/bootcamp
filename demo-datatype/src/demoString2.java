public class demoString2 {
    public static void main(String[] args) {
        
        String str1 = "";
        String str2 = "frankie";
        String str3 = "frankie@gmail.com";
        String str4 = "嗨";
        String str5 = "  ";

        str1.equals(str2);
        System.out.println("str1.length() : " + str1.length());
        System.out.println("str5.length() : " + str5.length());

        str3.charAt(0);
        System.out.println("str3.charAt(0)" + str3.charAt(0));

        int str3Length = str3.length();

        System.out.println(str3.charAt(str3Length - 1));
        System.out.println(str3.charAt(str3.length() - 1));
       
        String str6 = "   Bootcamp   ";
        System.out.println("before : " + str6);
        System.out.println("after : " + str6.trim()); // trim去除多餘space

        String str7 = "   Bootcamp   xdxd";
        System.out.println("before : " + str7);
        System.out.println("after : " + str7.trim());

        String str8 = "   Diamond Hill   ";
        System.out.println(str8.replace('D' , 'd').trim());

        String str9 = "ABCDEFG";
        System.out.println("str9.toLowerCase : " + str9.toLowerCase());
        String str10 = "AbCdEfG";
        System.out.println("str10.toUpperCase : " + str10.toUpperCase());

        String str11 = "happy";
        String str12 = "birthday";
        System.out.println(str11 + str12);
        //concat()
        System.out.println(str12);

        //Exercise
        //Expect Result:
        //1. VENTURENIXLAB, JAVA
        //2. venturenixlab, java
        //3. V*NTUR*NIXLAB, JAVA!!
        String str13 = "Venturenixlab, Coding";
        String str14 = str13.replace("Coding" , "Java");
        System.out.println("1. " + str14.toUpperCase());
        System.out.println("2. " + str14.toLowerCase());
        System.out.println("3. " + str14.replace('e' , '*').toUpperCase() + "!!");

        String str15 = new String("");
        String str16 = new String("");
        System.out.println("case 1 : " + str15.equals(str16));
        System.out.println("case 2 : " + str15 == str16);

        String str17 = "str";
        String str18 = "str";
        if(str17.equals(str18)){
        System.out.println("we are equals");
        } else {

        }
        String s1 = "xd";
        String s2 = "xdd";
        String s3 = "xddd";
        String s4 = "x";


        s1.compareTo(s2); // result will have 3 case : + / - / 0
        System.out.println("case 1 : " + s1.compareTo(s1));
        System.out.println("case 2 : " + s1.compareTo(s2));
        System.out.println("case 3 : " + s1.compareTo(s3));
        System.out.println("case 4 : " + s1.compareTo(s4));

        //substring(int beginIndex, int endIndex)
        String s5 = "Diamond Hill";
        System.out.println("case 5 : " + s5.substring(5)); // output:nd Hill
        System.out.println("case 6 : " + s5.substring(3, 10)); // output: mond Hi
        //chain method
        System.out.println("case 7 : " + s5.substring(3, 10).equals("mond"));
        System.out.println("case 8 : " + s5.substring(3, 10).equals("mond Hi"));
        System.out.println("case 9 " + s5.charAt(3) == "C");// s5.charAt(3)='m'

        String s6 = "";
        String s7 = " ";
        System.out.println("check s6 is empty : " + s6.isEmpty());
        System.out.println("check s7 is empty : " + s7.isEmpty());
        System.out.println("check s6 is blank : " + s6.isBlank());
        System.out.println("check s7 is blank : " + s7.isBlank());

        String pw = "   ";
        if (pw.trim().isBlank()) {
            System.out.println("pw is blank");
        }

        String s8 = "Diamond Hill";
        // startsWith(String prefix)
    System.out.println("startsWith case 1 : " + s8.startsWith("D"));
    // startsWith(String prefix, int toffset)
    System.out.println("startsWith case 2 : " + s8.startsWith("D", 0));// true
    System.out.println("startsWith case 3 : " + s8.startsWith("D", 1));// false
    // endsWith
    System.out.println("endsWith : " + s8.endsWith("D"));
    System.out.println("endsWith : " + s8.endsWith("l"));


    }
}
