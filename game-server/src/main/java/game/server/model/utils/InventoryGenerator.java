package game.server.model.utils;

import game.server.model.pawn.Inventory;

import java.util.HashMap;

public class InventoryGenerator implements BaseGenerator<Inventory>{
    public static final InventoryGenerator INSTANCE = new InventoryGenerator();

    @Override
    public Inventory generate() {
        final Inventory inventory = new Inventory();
        inventory.setItems(new HashMap<>());

        return inventory;
    }
}
