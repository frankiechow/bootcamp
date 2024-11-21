package Grok2.Pokemon;

class Gengar extends Pokemon {
    public Gengar() {
        super("Gengar", 160, 65, "Ghost");
    }

    @Override
    public void attack(Pokemon opponent) {
        int damage = this.attackPower;
        if ("Psychic".equals(opponent.type)) { // Ghost is immune to Normal and Fighting, but weak to Psychic
            damage *= 2;
            System.out.println("It's super effective!");
        }
        System.out.println(this.name + " uses Shadow Ball on " + opponent.name + " for " + damage + " damage!");
        opponent.receiveDamage(damage);
    }
}
