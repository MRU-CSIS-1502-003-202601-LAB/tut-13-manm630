package main;

public class Weapon extends Loot {

    private int damage;

    public Weapon(String name, String rarity, int damage) {
        super(name,rarity);
        this.damage = damage;

    }

    public String getEffectDescription() {
        return String.format(" Poisonous Sword (elite): %d", damage);
    }
    
    public String asCsvRecord() {
        return String.format("Weapon,%s,%s,%d", getName(), getRarity(), damage );
    }
}
