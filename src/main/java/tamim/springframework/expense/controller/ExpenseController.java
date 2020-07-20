package tamim.springframework.expense.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tamim.springframework.expense.model.Expense;
import tamim.springframework.expense.repositories.ExpenseRepository;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ExpenseController {

    private ExpenseRepository expenseRepository;

    public ExpenseController(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @GetMapping("/expenses")
    List<Expense> getExpenses(){
        List<Expense> expenseList = new ArrayList<>();
        for (Expense expense : expenseRepository.findAll()){
            expenseList.add(expense);
        }
        return expenseList;
    }

    @DeleteMapping("/expenses/{id}")
    ResponseEntity<?> deleteExpense(@PathVariable Long id){
        expenseRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/expenses")
    ResponseEntity<Expense> createExpense(@Valid @RequestBody Expense expense) throws URISyntaxException {
        Expense result= expenseRepository.save(expense);
        ResponseEntity<Expense> response = ResponseEntity.created(new URI("/api/expenses" + result.getId())).body(result);
        return response;
    }
}
