package game.server.model.pawn;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Equipment {
    private List<Slot> slots;
}
