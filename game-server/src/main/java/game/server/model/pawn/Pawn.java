package game.server.model.pawn;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class Pawn {
    private PawnClass pawnClass;
    private String pawnName;
    private int level;
    private List<Skill> skills;
    private Equipment equipment;
    private Inventory inventory;
//    Does this need to be a separate object?
    private Map<String,KillCount> killCount;
//    Name of type to carry capacity
    private Map<String, Integer> carryCapacities;
}
