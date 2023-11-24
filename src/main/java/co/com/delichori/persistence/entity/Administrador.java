package co.com.delichori.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador {

    @Id
    private Integer cedulaAdministrador;

    private String nombreAdministrador;

    private String apellidoAdministrador;

    private String email;

    private String clave;

    //Getters and Setters

    public Integer getCedulaAdministrador() {
        return cedulaAdministrador;
    }

    public void setCedulaAdministrador(Integer cedulaAdministrador) {
        this.cedulaAdministrador = cedulaAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getApellidoAdministrador() {
        return apellidoAdministrador;
    }

    public void setApellidoAdministrador(String apellidoAdministrador) {
        this.apellidoAdministrador = apellidoAdministrador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
