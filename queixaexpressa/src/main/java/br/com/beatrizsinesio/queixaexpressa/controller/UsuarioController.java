package br.com.beatrizsinesio.queixaexpressa.controller;

import br.com.beatrizsinesio.queixaexpressa.Repository.UsuarioRepository;
import br.com.beatrizsinesio.queixaexpressa.model.Usuario;
import br.com.beatrizsinesio.queixaexpressa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> listar() {
        return usuarioService.listaUsuarios();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvaUsuario(usuario);
    }
}