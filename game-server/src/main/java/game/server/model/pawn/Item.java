package game.server.model.pawn;

import lombok.Data;
import lombok.Getter;

@Data
public class Item {
    private int stackSize; // From player? From player character?
    private ItemType itemType;

    @Getter
    public enum ItemType {
        WEAPON,
        CONSUMABLE,
        MONSTER_PARTS,
        JUNK
    }
}
