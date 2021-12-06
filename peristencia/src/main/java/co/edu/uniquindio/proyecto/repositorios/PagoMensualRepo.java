package co.edu.uniquindio.proyecto.repositorios;



import co.edu.uniquindio.proyecto.entidades.Mascota;
import co.edu.uniquindio.proyecto.entidades.PagoMensual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoMensualRepo extends JpaRepository<PagoMensual,Integer> {
}







//repositorio pago mensual
