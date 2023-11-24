package co.com.delichori.persistence.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DetallePedidoPK implements Serializable {

    private Integer idPedido;

    private Integer idProducto;

    //Getters and Setters

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
