package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
