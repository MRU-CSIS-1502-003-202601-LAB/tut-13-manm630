package main;

public class Consumable extends Loot {

    private int restoreAmount;

    public Consumable(String name, String rarity, int restoreAmount) {
        super(name, rarity);
        this.restoreAmount = restoreAmount;
    }

    public String getEffectDescription() {
        return String.format("Big pot of Shield (common): %d Sheild", restoreAmount);

    }

    
    public String asCsvRow() {
        return String.format("Consumable,%s,%s,%d", getName(), getRarity(), restoreAmount );
    }
 }
