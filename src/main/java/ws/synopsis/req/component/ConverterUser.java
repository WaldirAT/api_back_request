package ws.synopsis.req.component;

import org.springframework.stereotype.Component;

import ws.synopsis.req.entity.User;
import ws.synopsis.req.model.UserModel;

@Component("converterUser")
public class ConverterUser {

	public User converterUserModelToUser(UserModel userModel) {
		User user = new User();
		user.setId(userModel.getId());
		user.setName(userModel.getName());
		user.setLastname(userModel.getLastname());
		user.setPhone(userModel.getPhone());
		user.setPass(userModel.getPass());
		return user;
	}

	public UserModel converterUserToUserModel(User user) {
		UserModel userModel = new UserModel();
		userModel.setId(user.getId());
		userModel.setName(user.getName());
		userModel.setLastname(user.getLastname());
		userModel.setPhone(user.getPhone());
		userModel.setPass(user.getPass());
		return userModel;
	}

}
