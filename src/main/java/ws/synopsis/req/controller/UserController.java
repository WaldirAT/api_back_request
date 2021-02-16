package ws.synopsis.req.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ws.synopsis.req.model.UserModel;
import ws.synopsis.req.service.UserService;

@RestController
@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	@PostMapping("/add")
	public ResponseEntity<UserModel> addUser(@RequestBody UserModel userModel) {
		return new ResponseEntity<UserModel>(userService.addUser(userModel), HttpStatus.OK);
	}

	@GetMapping("/list")
	public ResponseEntity<List<UserModel>> list() {
		return new ResponseEntity<List<UserModel>>(userService.findAllUser(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id")@RequestBody int id) {
		return new ResponseEntity<String>(userService.deleteUser(id), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<UserModel> update(@RequestBody UserModel userModel) {
		return new ResponseEntity<UserModel>(userService.updateUser(userModel), HttpStatus.OK);

	}

	@GetMapping("/find/{id}")
	public ResponseEntity<UserModel> findId(@PathVariable("id") int id) {
		return new ResponseEntity<UserModel>(userService.findUserModelById(id), HttpStatus.OK);
	}

}
