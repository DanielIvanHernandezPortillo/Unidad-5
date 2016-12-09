package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
