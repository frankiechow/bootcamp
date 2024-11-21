package Grok2.Pokemon;

class Bulbasaur extends Pokemon {
    public Bulbasaur() {
        super("Bulbasaur", 145, 50, "Grass");
    }

    @Override
    public void attack(Pokemon opponent) {
        int damage = this.attackPower;
        if ("Water".equals(opponent.type)) {
            damage *= 2;
            System.out.println("It's super effective!");
        }
        System.out.println(this.name + " uses Vine Whip on " + opponent.name + " for " + damage + " damage!");
        opponent.receiveDamage(damage);
    }
}
