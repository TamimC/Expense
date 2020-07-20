package tamim.springframework.expense.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
public class Category {

    @Id
    private Long id;
    private String name;

}
