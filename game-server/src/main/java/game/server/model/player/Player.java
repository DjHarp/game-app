package game.server.model.player;

import game.server.model.pawn.Pawn;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Player {
    private String username;
    private String password; // move to DB
    private List<Pawn> pawns; // assign variable here for limiting size
    private List<Currency> currencies;
    private List<Proficiency> proficiencies;
}
