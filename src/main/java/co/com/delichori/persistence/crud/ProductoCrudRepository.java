package co.com.delichori.persistence.crud;

import co.com.delichori.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {



}
