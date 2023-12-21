package game.server.manager;

import game.server.model.User;
import game.server.model.UserCreationRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class UserManager {
  private static final Map<String, User> users = new HashMap<>();

//  Remove after initial testing
  static {
    User user = new User();
    user.setId("bddedb45-504b-4f3b-a65f-e50067cb4197");
    users.put(user.getId(), user);
  }

  private static void addUser(User user) {
    users.put(user.getId(), user);
  }

  // TODO: Remove this. This is only for initial testing.
  public static List<User> getAllUsers() {
    return users.values().stream().toList();
  }

  public static User getUser(String id) {
    return users.get(id);
  }

  public static User createUser(UserCreationRequest request) {
    User user = new User();
    user.setUsername(request.getUsername());

    addUser(user);

    return user;
  }
}
