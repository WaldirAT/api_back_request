package ws.synopsis.req.service;

import java.util.List;
//import java.util.Optional;
import ws.synopsis.req.entity.User;
import ws.synopsis.req.model.UserModel;



public interface UserService {	
	
	public abstract UserModel addUser(UserModel userModel);
	
	public abstract List<UserModel> findAllUser();

	public abstract UserModel findUserModelById(int id);
	
	public abstract String deleteUser(int id);
	
	public abstract UserModel updateUser(UserModel userUpdate);
	
	
	public abstract User findUserById(int id);

}
