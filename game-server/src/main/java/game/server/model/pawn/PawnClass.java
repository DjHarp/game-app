package game.server.model.pawn;

import lombok.Getter;

// Add additional as decided
@Getter
public enum PawnClass {
    WARRIOR ("Warrior"),
    MAGE ("Mage"),
    THIEF ("Thief");

    private final String className;

    PawnClass(String className) {
        this.className = className;
    }
}
