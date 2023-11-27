package br.com.beatrizsinesio.queixaexpressa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.autoconfigure.web.WebProperties;

@EqualsAndHashCode
@Data
@Entity
public class Reclamacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mensagem")
    private String mensagem;

    @Column(name = "email")
    private String email;

    @Column(name = "nome_usuario")
    private String usuario;
}