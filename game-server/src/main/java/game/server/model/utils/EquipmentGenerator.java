package game.server.model.utils;

import game.server.model.pawn.Equipment;

import java.util.ArrayList;

public class EquipmentGenerator implements BaseGenerator<Equipment> {
  public static EquipmentGenerator INSTANCE = new EquipmentGenerator();

  @Override
  public Equipment generate() {
    final Equipment equipment = new Equipment();
    equipment.setSlots(new ArrayList<>());
    return equipment;
  }
}
