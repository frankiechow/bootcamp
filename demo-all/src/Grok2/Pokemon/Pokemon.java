package Grok2.Pokemon;

public abstract class Pokemon {
    String name;
    int hitPoints;
    int attackPower;
    String type;

    public Pokemon(String name, int hp, int attack, String type) {
        this.name = name;
        this.hitPoints = hp;
        this.attackPower = attack;
        this.type = type;
    }

    public abstract void attack(Pokemon opponent);

    public void receiveDamage(int damage) {
        this.hitPoints -= damage;
    }

    public boolean isFainted() {
        return hitPoints <= 0;
    }

    @Override
    public String toString() {
        return this.name + " (HP: " + this.hitPoints + ")";
    }
}
