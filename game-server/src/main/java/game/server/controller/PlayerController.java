package game.server.controller;

import game.server.model.player.Player;
import game.server.model.utils.PlayerGenerator;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
https://doc.oroinc.com/api/http-methods/
Get - read
POST - create
PATCH - update
DELETE - remove
 */
@RestController
@RequestMapping(value = "/v1/player", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlayerController {
  @GetMapping(value = "/login")
  public static Player login() {
    return PlayerGenerator.INSTANCE.generate();
  }

  @GetMapping(value = "/load")
  public static Player load() {
    // Update to return specific character data
    return PlayerGenerator.INSTANCE.generate();
  }
}
