package ws.synopsis.req.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ws.synopsis.req.entities.User;
import ws.synopsis.req.repository.UserRepository;
import ws.synopsis.req.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;	

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findUserByID(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}

	@Override
	public User saveUser(User UserNew) {
		if (UserNew != null) {
			return userRepository.save(UserNew);
		}
		return new User();
	}

	@Override
	public String deleteUser(Long id) {
		if (userRepository.findById(id).isPresent()) {
			userRepository.deleteById(id);
			return "User successfully removed";
		}
		return "Error! user dosent's exits";
	}

	@Override
	public String updateUser(User userUpdate) {
		
		Long num = userUpdate.getId();
		
		if(userRepository.findById(num).isEmpty()){
			User userToUpdate = new User();
			userToUpdate.setId(userUpdate.getId());
			userToUpdate.setName(userUpdate.getName());
			userToUpdate.setLastname(userUpdate.getLastname());			
			userToUpdate.setPhone(userUpdate.getPhone());
			userToUpdate.setPass(userUpdate.getPass());
			userRepository.save(userToUpdate);
			return "modified user";
			
		}
		return "Error!! modifying user";
	}

}
