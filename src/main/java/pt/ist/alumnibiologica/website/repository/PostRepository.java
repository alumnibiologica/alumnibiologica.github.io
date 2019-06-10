package pt.ist.alumnibiologica.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.ist.alumnibiologica.website.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}