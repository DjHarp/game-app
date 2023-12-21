package game.server.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
public class User {
    private String id = UUID.randomUUID().toString();
    private String username = "User 0";
    private int level = 1;
    private BigDecimal expCap = new BigDecimal("50.00");
    private BigDecimal experience = BigDecimal.ZERO;

    public void applyExperience(BigDecimal gainedExperience) {
        experience = experience.add(gainedExperience);

        levelUp();
    }

    private void levelUp() {
        if (experience.compareTo(expCap) >= 0) {
            level++;
            experience = experience.subtract(expCap);
            levelUp();
        }
    }
}
