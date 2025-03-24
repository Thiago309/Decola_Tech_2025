package avanade2025.web.api.controller;

import avanade2025.web.api.model.Usuario;
import avanade2025.web.api.repository.UsuarioRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/* @RestController = Um controller é um recurso que disponibiliza as funcionalidades de negócio da aplicação atraves
   do protocolo HTTP. Ou seja, obtem da aplicação toda logica do negocio. Analogia: Esse serviço funciona de forma
   local, mas agora quero disponibilizar pra internet atraves de uma API.*/
@RestController
/*A anotação @RequestMapping serve para centralizar um pre-fixo para requisições http de acesso às funções da class
  UsuarioController. */
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    /*para evitar redundancias/conflito de execução durante a inicialização do spring devemos adicionar uma URI, neste
      caso utilizei user, mas poderia ser qualquer outro nome. O nome serve somente para distinção dos mapeamentos.
      @GetMapping("/users") O /users é uma URI. URI significa Uniform Resource Identifier (Identificador Uniforme de
      Recursos). É uma string de caracteres usada para identificar ou nomear um recurso na internet ou em uma rede.URIs
      são amplamente utilizados em APIs, na web e em outros contextos para localizar e interagir com recursos.*/

    @Operation(summary = "Adiciona um novo usuario no sistema", description = "Este endpoint retorna uma mensagem sucesso ou falha.")
    @PostMapping("")
    public void post(@RequestBody Usuario usuario){repository.save(usuario);}

    @Operation(summary = "Lista todos os usuario do sistema", description = "Este endpoint retorna ou não todos os usuarios.")
    @GetMapping()
    public List<Usuario> getAll(){return repository.listAll();}

    @Operation(summary = "Procura por um usuario do sistema através do id.", description = "Este endpoint retorna uma mensagem sucesso ou falha.")
    @GetMapping("/{id}")
    public Usuario getOne(@PathVariable("id") Integer id){return repository.finById(id);}

    @Operation(summary = "Deleta um usuario do sistema através do id.", description = "Este endpoint retorna uma mensagem sucesso ou falha.")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){repository.remove(id);}
}