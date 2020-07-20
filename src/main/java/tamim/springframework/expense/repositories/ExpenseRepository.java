package tamim.springframework.expense.repositories;

import org.springframework.data.repository.CrudRepository;
import tamim.springframework.expense.model.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
}
