package zjc.examples.spring.webflux.mongodb.repository;

import zjc.examples.spring.webflux.mongodb.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
    
}
