package week12;

public class Burger {
    private String bun;
    private String meat;
    private String salad;
    private String cheese;
    private String sauce;

    private Burger(Builder builder) {
        this.bun = builder.bun;
        this.meat = builder.meat;
        this.salad = builder.salad;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
    }

    public String getBun() {
        return this.bun;
    }

    public String getMeat() {
        return this.meat;
    }

    public String getSalad() {
        return this.salad;
    }

    public String getCheese() {
        return this.cheese;
    }

    public String getSauce() {
        return this.sauce;
    }

    public static class Builder {
        private String bun;
        private String meat;
        private String salad;
        private String cheese;
        private String sauce;

        public Builder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder salad(String salad) {
            this.salad = salad;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", salad='" + salad + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
    
    public static void main(String[] args) {
        Burger burger = new Burger.Builder()
                    .bun("Whole Wheat")
                    .meat("Beef")
                    .salad("Lettuce")
                    .cheese("Cheddar")
                    .sauce("Ketchup")
                    .build();
                    System.out.println(burger);
    }
}
