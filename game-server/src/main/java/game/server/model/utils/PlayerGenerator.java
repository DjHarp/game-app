package game.server.model.utils;

import game.server.model.player.Player;

import java.util.ArrayList;

public class PlayerGenerator implements BaseGenerator<Player> {
  public static final PlayerGenerator INSTANCE = new PlayerGenerator();

  @Override
  public Player generate() {
    final Player newPlayer = new Player();
    newPlayer.setUsername("Zaipper");
    newPlayer.setPassword("Password");
    newPlayer.setCurrencies(new ArrayList<>());
    newPlayer.setPawns(new ArrayList<>());

    newPlayer.getPawns().add(PawnGenerator.INSTANCE.generate());
    newPlayer.setProficiencies(new ArrayList<>());

    newPlayer.getProficiencies().add(ProficiencyGenerator.INSTANCE.generate());

    return newPlayer;
  }
}
