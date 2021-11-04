package Reto3_3.api.Interface;

import Reto3_3.api.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
}
