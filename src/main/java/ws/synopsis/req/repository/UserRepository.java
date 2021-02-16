package ws.synopsis.req.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ws.synopsis.req.entity.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	
	public abstract User findById(int id);

}
