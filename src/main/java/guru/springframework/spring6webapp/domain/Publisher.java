package guru.springframework.spring6webapp.domain;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Publisher {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;
    @ToString.Include
    private String publisherName;
    @ToString.Include
    private String address;
    @ToString.Include
    private String city;
    @ToString.Include
    private String state;
    @ToString.Include
    private String zipCode;
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;
}
