package game.server;

import game.server.model.User;
import java.math.BigDecimal;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PlayerTest {
  @ParameterizedTest
  @MethodSource("quests")
  public void levelUp(String experience, int levelAfterExperience) {
    User user = new User();
    Assertions.assertEquals(user.getLevel(), 1);
    user.applyExperience(new BigDecimal(experience));
    Assertions.assertEquals(user.getLevel(), levelAfterExperience);
  }

  private static Stream<Arguments> quests() {
    return Stream.of(Arguments.of("40", 1), Arguments.of("60", 2), Arguments.of("300", 7));
  }
}
