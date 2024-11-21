package Grok2.Pokemon;

class Pikachu extends Pokemon {
    public Pikachu() {
        super("Pikachu", 160, 50, "Electric");
    }

    @Override
    public void attack(Pokemon opponent) {
        int damage = this.attackPower;
        if ("Electric".equals(this.type) && !"Electric".equals(opponent.type)) {
            damage *= 2;
            System.out.println("It's super effective!");
        }
        System.out.println(this.name + " uses Thunderbolt on " + opponent.name + " for " + damage + " damage!");
        opponent.receiveDamage(damage);
    }
}