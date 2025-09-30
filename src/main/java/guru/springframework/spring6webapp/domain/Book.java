package guru.springframework.spring6webapp.domain;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;
    @ToString.Include
    private String title;
    @ToString.Include
    private String isbn;
    @ManyToMany
    @JoinTable(name = "author_book", 
        joinColumns = @jakarta.persistence.JoinColumn(name = "book_id"), 
        inverseJoinColumns = @jakarta.persistence.JoinColumn(name = "author_id"))
    private Set<Author> authors;
}
