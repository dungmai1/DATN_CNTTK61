package SocialNetwork.SocialNetwork.repositories;

import SocialNetwork.SocialNetwork.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByPhone(String Phone);
    Optional<User> findByUsname(String username);
}
