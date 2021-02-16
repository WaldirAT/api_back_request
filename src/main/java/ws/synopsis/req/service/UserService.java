package ws.synopsis.req.service;

import java.util.List;
import java.util.Optional;

import ws.synopsis.req.entities.User;

public interface UserService {

	public List<User> findAllUser();

	public Optional<User> findUserByID(Long id);
	
	public User saveUser(User userNew);
	
	public String deleteUser(Long id);
	
	public String updateUser(User userUpdate);

}
