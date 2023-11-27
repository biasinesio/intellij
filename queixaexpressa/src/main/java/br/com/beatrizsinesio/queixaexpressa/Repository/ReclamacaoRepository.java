package br.com.beatrizsinesio.queixaexpressa.Repository;

import br.com.beatrizsinesio.queixaexpressa.model.Reclamacao;
import br.com.beatrizsinesio.queixaexpressa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamacaoRepository extends JpaRepository<Reclamacao, Long> {

}