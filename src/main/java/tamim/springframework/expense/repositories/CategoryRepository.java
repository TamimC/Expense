package tamim.springframework.expense.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tamim.springframework.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
