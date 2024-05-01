package game.server.model.player;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class Currency {
  private CurrencyType type;
  @Setter private BigDecimal value;

  @Getter
  public enum CurrencyType {
//    Add more as decided
    COIN("Coin"),
    CRYSTAL("Crystal");

    private final String name;

    CurrencyType(String name) {
      this.name = name;
    }
  }
}
