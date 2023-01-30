package web.PP_3_12.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.PP_3_12.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}