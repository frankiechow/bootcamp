package week7;

public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 1_000_000; i++){
            sb3.append3("a");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(sb3.length());
        String s10 = "";
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 100_000; i++){
            s10 += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(s10.length());
    }
}
