package ws.synopsis.req.service.impl;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ws.synopsis.req.component.ConverterUser;
import ws.synopsis.req.entity.User;
import ws.synopsis.req.model.UserModel;
import ws.synopsis.req.repository.UserRepository;
import ws.synopsis.req.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;

	@Autowired
	@Qualifier("converterUser")
	private ConverterUser converterUser;

	@Override
	public UserModel addUser(UserModel userModel) {
		User user = userRepository.save(converterUser.converterUserModelToUser(userModel));
		return converterUser.converterUserToUserModel(user);

	}

	@Override
	public List<UserModel> findAllUser() {
		List<User> listUser = userRepository.findAll();
		List<UserModel> listUserModel = new ArrayList<UserModel>();

		for (User user : listUser) {
			listUserModel.add(converterUser.converterUserToUserModel(user));
		}
		return listUserModel;
	}

	@Override
	public UserModel findUserModelById(int id) {
		User user = userRepository.findById(id);
		return converterUser.converterUserToUserModel(user);
	}

	@Override
	public String deleteUser(int id) {
		User user = userRepository.findById(id);
		if (user != null) {
			userRepository.delete(user);				
		}
		return "User Deleted";		
	}

	@Override
	public UserModel updateUser(UserModel userUpdate) {

		User user = userRepository.save(converterUser.converterUserModelToUser(userUpdate));
		return converterUser.converterUserToUserModel(user);
	}

	@Override
	public User findUserById(int id) {
		
		return userRepository.findById(id);
	}

}
