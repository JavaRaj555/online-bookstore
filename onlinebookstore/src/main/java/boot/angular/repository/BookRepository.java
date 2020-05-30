package boot.angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import boot.angular.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
