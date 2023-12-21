package game.server.controller;

import game.server.manager.UserManager;
import game.server.model.User;
import game.server.model.UserCreationRequest;
import game.server.model.UserExperienceRequest;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@SuppressWarnings("unused")
public class UserController {

  @GetMapping("/")
  public String index() {
    return "Server live!";
  }

//  Remove or auth for testing only
  @GetMapping("/users")
  public ResponseEntity<List<User>> getAllUsers() {
    return new ResponseEntity<>(UserManager.getAllUsers(), HttpStatus.OK);
  }

  @GetMapping("/user/{id}")
  public ResponseEntity<User> getUser(@PathVariable("id") String id) {
    return new ResponseEntity<>(UserManager.getUser(id), HttpStatus.OK);
  }

  @PostMapping("/user/create")
  public ResponseEntity<User> createUser(@RequestBody UserCreationRequest request) {
    return new ResponseEntity<>(UserManager.createUser(request), HttpStatus.OK);
  }

  @PatchMapping(value = "/user/{id}/experience")
  public ResponseEntity<User> gainExperience(
      @PathVariable("id") String id, @RequestBody UserExperienceRequest request) {
    User user = UserManager.getUser(id);
    user.applyExperience(request.getExperienceToApply());
    return new ResponseEntity<>(user, HttpStatus.OK);
  }
}
