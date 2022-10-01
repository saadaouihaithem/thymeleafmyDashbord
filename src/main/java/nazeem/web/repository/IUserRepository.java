package nazeem.web.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import nazeem.web.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}