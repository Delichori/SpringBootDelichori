package co.com.delichori.domain.repository;

import co.com.delichori.domain.Administrator;
import co.com.delichori.domain.Order;

import java.util.List;
import java.util.Optional;

public interface AdministratorRepository {

    Administrator save(Administrator administrator);
    void delete(int managerId);

}
