package Grok2.Pokemon;

class Charizard extends Pokemon {
    public Charizard() {
        super("Charizard", 220, 40, "Fire");
    }

    @Override
    public void attack(Pokemon opponent) {
        int damage = this.attackPower;
        System.out.println(this.name + " uses Flamethrower on " + opponent.name + " for " + damage + " damage!");
        opponent.receiveDamage(damage);
    }
}
