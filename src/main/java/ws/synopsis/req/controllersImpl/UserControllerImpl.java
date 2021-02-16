package ws.synopsis.req.controllersImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ws.synopsis.req.controller.UserController;
import ws.synopsis.req.entities.User;
import ws.synopsis.req.service.UserService;


@RestController
public class UserControllerImpl implements UserController {

	@Autowired
	UserService userService;

	// http://localhost:8080/users (GET)
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	@Override
	public List<User> getUsers() {
		return userService.findAllUser();
	}

	// http://localhost:8080/users/1 (GET)
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = "application/json")
	@Override
	public Optional<User> getUserById(@PathVariable Long id) {
		return userService.findUserByID(id);
	}

	// http://localhost:8080/users/add (ADD)
	@Override
	@RequestMapping(value = "/users/add", method = RequestMethod.POST, produces = "application/json")
	public User addUser(@RequestBody User user) {
		System.out.println("agregado correctamente");
		return userService.saveUser(user);
	}

	// http://localhost:8080/users/delete/1 (GET)
	@Override
	@RequestMapping(value = "/users/delete/{id}", method = RequestMethod.GET, produces = "applications/json")
	public String deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}

	// http://localhost:8080/users/update (PATCH)
	@Override
	@RequestMapping(value = "/users/update", method = RequestMethod.PATCH, produces = "application/json")
	public String updateUser(@RequestBody User userNew) {
		return userService.updateUser(userNew);
	}

	// http://localhost:8080/test (GET)
//	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
//	@Override
//	public String test() {
//		// TODO Auto-generated method stub
//		return "Test done";
//	}

}
