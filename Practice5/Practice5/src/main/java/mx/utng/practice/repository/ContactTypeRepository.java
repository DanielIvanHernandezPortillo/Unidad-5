package mx.utng.practice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.ContactType;

@Repository
public interface ContactTypeRepository extends JpaRepository<ContactType, Long> {

}
