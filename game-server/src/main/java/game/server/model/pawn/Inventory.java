package game.server.model.pawn;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class Inventory {
    private Map<Integer, Item> items;
}
