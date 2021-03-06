package co.edu.uniquindio.proyecto.repositorios;


import co.edu.uniquindio.proyecto.entidades.Mascota;
import co.edu.uniquindio.proyecto.entidades.Plan;
import co.edu.uniquindio.proyecto.entidades.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Negative;
import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, String> {

    List<Usuario> findAllByNombreContains(String nombre);

    Page<Usuario> findAll(Pageable paginador);

    Optional<Usuario> findByEmail(String email);

    @Query("delete   from  Usuario where codigo=:codigo")
    default void eliminaraMascotaUsuario(String codigo) {

    }


}
