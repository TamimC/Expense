package tamim.springframework.expense.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "expense")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant expenseDate;
    private String description;
    @JsonIgnore
    @ManyToOne
    private User user;
    private String location;
    @ManyToOne
    private Category category;
}
