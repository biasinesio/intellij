package br.com.beatrizsinesio.queixaexpressa.Repository;

import br.com.beatrizsinesio.queixaexpressa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}