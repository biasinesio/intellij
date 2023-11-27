package br.com.beatrizsinesio.queixaexpressa.service;

import br.com.beatrizsinesio.queixaexpressa.Repository.UsuarioRepository;
import br.com.beatrizsinesio.queixaexpressa.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvaUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> listaUsuarios(){
        return usuarioRepository.findAll();
    }
}