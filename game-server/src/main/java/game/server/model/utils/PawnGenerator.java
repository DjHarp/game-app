package game.server.model.utils;

import game.server.model.pawn.Pawn;
import game.server.model.pawn.PawnClass;

import java.util.ArrayList;
import java.util.HashMap;

public class PawnGenerator implements BaseGenerator<Pawn> {
  public static final PawnGenerator INSTANCE = new PawnGenerator();

  @Override
  public Pawn generate() {
    final Pawn newPawn = new Pawn();

    newPawn.setPawnClass(PawnClass.WARRIOR);
    newPawn.setLevel(1);

    newPawn.setEquipment(EquipmentGenerator.INSTANCE.generate());
    newPawn.setInventory(InventoryGenerator.INSTANCE.generate());
    newPawn.setSkills(new ArrayList<>());
    newPawn.setKillCount(new HashMap<>());

    return newPawn;
  }
}
