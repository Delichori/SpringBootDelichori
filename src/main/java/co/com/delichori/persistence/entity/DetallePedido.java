package co.com.delichori.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "detallepedido")
public class DetallePedido {

    @EmbeddedId
    private DetallePedidoPK id;

    private Integer cantidadProducto;

    private Double valorTotalPedido;


    //Relaciones DB
    @ManyToOne
    @JoinColumn(name = "idPedido", insertable = false, updatable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idProducto", insertable = false, updatable = false)
    private Producto producto;


    //Getters and Setters

    public DetallePedidoPK getId() {
        return id;
    }

    public void setId(DetallePedidoPK id) {
        this.id = id;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(Double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
