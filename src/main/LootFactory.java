package main;

public class LootFactory {

    public static final int EXPECTED_NUM_FIELDS = 4;

    public static Loot create(String[] asCsvRow) {

        if (asCsvRow == null || asCsvRow.length != EXPECTED_NUM_FIELDS) {
            return null;

        }

        String typeField = asCsvRow[0].toUpperCase();

        String name = asCsvRow[1];
        String rarity = asCsvRow[2];
        int value = Integer.parseInt(asCsvRow[3]);

        switch (typeField) {
            case "WEAPON":
                return new Weapon(name, rarity, value);
            case "CONSUMABLE":
                return new Consumable(name, rarity, value);

        }

        return null;



    }
    
}
