package Grok2.Pokemon;

class Squirtle extends Pokemon {
    public Squirtle() {
        super("Squirtle", 145, 50, "Water");
    }

    @Override
    public void attack(Pokemon opponent) {
        int damage = this.attackPower;
        if ("Fire".equals(opponent.type)) {
            damage *= 2;
            System.out.println("It's super effective!");
        }
        System.out.println(this.name + " uses Water Gun on " + opponent.name + " for " + damage + " damage!");
        opponent.receiveDamage(damage);
    }
}
