package co.com.delichori.persistence;

import co.com.delichori.persistence.crud.AdministradorCrudRepository;
import co.com.delichori.persistence.entity.Administrador;
import org.springframework.stereotype.Repository;

@Repository
public class AdministradorRepository {

    private AdministradorCrudRepository administradorCrudRepository;

    //Registrar un administrador
    public Administrador save(Administrador administrador){
        return administradorCrudRepository.save(administrador);
    }

    //Eliminar un administrador por el número de cédula
    public void delete(int cedulaAdministrador){
        administradorCrudRepository.deleteById(cedulaAdministrador);
    }

    //¿Iniciar sesión y cerrar sesión?
}
