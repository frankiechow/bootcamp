package week12.Sport;

public class Ball2 {
    private static final String BRAND = "tesla";
    private int size;
    private Color2 color;

    public Ball2(Color2 color){
        return this.color = color;
    }
    public Color2 getColor2(){
        return this.color;
    }

    public String Color2 {
        private String value;

        public static String printBRAND() {
            return Ball2.BRAND;
        }
    }

    public static void main(String[] args) {
        Ball2 b1 = new Ball2(3);
        b1.setColor2(b1.new Color2("BLUE"));

        Ball2.Color2 c2 = b1.new Color2("RED")
    }
}
