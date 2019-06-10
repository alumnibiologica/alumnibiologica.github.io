package pt.ist.alumnibiologica.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.ist.alumnibiologica.website.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}