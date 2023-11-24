package co.com.delichori.persistence;

import co.com.delichori.persistence.crud.PedidoCrudRepository;
import co.com.delichori.persistence.entity.Pedido;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PedidoRepository {

    private PedidoCrudRepository pedidoCrudRepository;

    //Buscar un pedido con el número de cédula (Cliente)
    public Optional<Pedido> getPedidoCliente(int cedulaCliente) {
        return pedidoCrudRepository.findById(cedulaCliente);
    }

    //Guardar un producto
    public Pedido save(Pedido pedido){
        return pedidoCrudRepository.save(pedido);
    }

    //Eliminar un producto con el id
   public void delete(int idPedido){
        pedidoCrudRepository.deleteById(idPedido);
   }

}
