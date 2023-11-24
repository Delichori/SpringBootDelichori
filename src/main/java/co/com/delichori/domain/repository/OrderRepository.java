package co.com.delichori.domain.repository;

import co.com.delichori.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {

    List <Order> getAll();
    Optional<List<Order>> getByClient(String clientId);
    Order save(Order oder);
    void delete(int OrderId);

}
