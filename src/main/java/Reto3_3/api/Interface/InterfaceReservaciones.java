package Reto3_3.api.Interface;

import Reto3_3.api.Modelo.Reservaciones;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceReservaciones extends CrudRepository<Reservaciones,Integer> {
}
