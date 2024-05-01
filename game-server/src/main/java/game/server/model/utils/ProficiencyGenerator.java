package game.server.model.utils;

import game.server.model.player.Proficiency;

import java.math.BigDecimal;

public class ProficiencyGenerator implements BaseGenerator<Proficiency> {
    public static final ProficiencyGenerator INSTANCE = new ProficiencyGenerator();

    @Override
    public Proficiency generate() {
        final Proficiency proficiency = new Proficiency();
        proficiency.setPassive(false);
        proficiency.setType(Proficiency.ProficiencyType.MINING);
        proficiency.setValue(BigDecimal.ZERO);
        return proficiency;
    }
}
