package avanade2025.web.api.repository;

import avanade2025.web.api.handler.CampoObrigatorioException;
import avanade2025.web.api.model.Usuario;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()==null)
            //  Essa exceção informa com mais detalhe o motivo do error.
            throw new CampoObrigatorioException("Login");

        if(usuario.getPassword()==null)
            throw new CampoObrigatorioException("Senha");

        if(usuario.getId() == null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(usuario);
    }

    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("thiago","password"));
        usuarios.add(new Usuario("vinicius","masterpass"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("thiago","password");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new Usuario("thiago","password");

    }
}