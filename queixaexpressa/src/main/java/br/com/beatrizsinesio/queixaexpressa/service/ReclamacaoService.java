package br.com.beatrizsinesio.queixaexpressa.service;

import br.com.beatrizsinesio.queixaexpressa.Repository.ReclamacaoRepository;
import br.com.beatrizsinesio.queixaexpressa.Repository.UsuarioRepository;
import br.com.beatrizsinesio.queixaexpressa.model.Reclamacao;
import br.com.beatrizsinesio.queixaexpressa.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamacaoService {
    @Autowired
    private ReclamacaoRepository reclamacaoRepository;

    public Reclamacao salvaReclamacao(Reclamacao reclamacao) {
        return reclamacaoRepository.save(reclamacao);
    }
    public List<Reclamacao>listaReclamacao(){
        return reclamacaoRepository.findAll();
    }
}
