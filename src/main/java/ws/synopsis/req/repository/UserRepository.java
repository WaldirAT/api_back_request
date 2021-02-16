package ws.synopsis.req.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ws.synopsis.req.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Void save(Optional<User> userToUpdate);
	
}
