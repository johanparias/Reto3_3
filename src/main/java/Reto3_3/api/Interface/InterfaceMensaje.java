package Reto3_3.api.Interface;

import Reto3_3.api.Modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer> {
}
