package game.server.model.player;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class Proficiency {
  private ProficiencyType type;
  private boolean isPassive; // figure out if we want passive proficiencies
  private BigDecimal value; // could be a percentage increase or static decimal value?

  public void applyEffect() {
    // Apply the effect
  };

//  Add others as decided
  @Getter
  public enum ProficiencyType {
    MINING,
    CRAFTING
  }
}
