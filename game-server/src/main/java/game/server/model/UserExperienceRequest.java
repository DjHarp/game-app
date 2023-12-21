package game.server.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class UserExperienceRequest {
    private BigDecimal experienceToApply;
}
