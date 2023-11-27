package br.com.beatrizsinesio.queixaexpressa.controller;

import br.com.beatrizsinesio.queixaexpressa.Repository.ReclamacaoRepository;
import br.com.beatrizsinesio.queixaexpressa.model.Reclamacao;
import br.com.beatrizsinesio.queixaexpressa.model.Usuario;
import br.com.beatrizsinesio.queixaexpressa.service.ReclamacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reclamacao")
public class ReclamacaoController {

    @Autowired
    private ReclamacaoService reclamacaoService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Reclamacao> listar() {
        return reclamacaoService.listaReclamacao();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reclamacao salvar(@RequestBody Reclamacao reclamacao){
        return reclamacaoService.salvaReclamacao(reclamacao);
    }

}
