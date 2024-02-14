package game.server.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {
    private String id = UUID.randomUUID().toString();
    private String username;
    private int level = 1;
    private BigDecimal expCap;
    private BigDecimal experience;

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
