package tamim.springframework.expense.repositories;

import org.springframework.data.repository.CrudRepository;
import tamim.springframework.expense.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
