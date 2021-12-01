package com.example.AuthService.services;

import com.example.AuthService.Entities.User;
import com.example.AuthService.Interfaces.UserRepository;
import com.example.AuthService.domain.TipoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repositorio;
    public void iniciar(){
        repositorio.save(new User("locador","123",TipoUsuario.LOCADOR));
        repositorio.save(new User("locatario","123",TipoUsuario.LOCATARIO));
    }
    public User cadastraUsuario(User usuario){
        repositorio.save(usuario);
        return usuario;
    }
    public List busca(){
        return repositorio.findAll();
    }
    public Optional<User> buscaUsuario(Long id){
        return repositorio.findById(id);
    }
    public void delete(Long id){
        repositorio.deleteById(id);
    }

//    public String valida(String user, String senha) {
//        User usuario= listaUsuarios.stream().filter(iterator->iterator.getUsuario().equals(user)).findFirst().get();
//        if(usuario.getSenha().equals(senha)&& usuario.getTipo().equals(TipoUsuario.LOCADOR)){
//            boolean locadorLogado = true;
//            return "Locador Logado";
//        }else if(usuario.getSenha().equals(senha)&& usuario.getTipo().equals(TipoUsuario.LOCADOR)){
//            boolean locatarioLogado = true;
//            return "Locatario Logado";
//        }
//        return "Não logado";
//    }
}
