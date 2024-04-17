package zjc.examples.quarkus.reactive.panache;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Cacheable
public class Product extends PanacheEntity {

    @Column(length = 40, unique = true)
    public String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

}
