package game.server.model.pawn;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class KillCount {
    private String enemyName;
    private BigDecimal count;
}
