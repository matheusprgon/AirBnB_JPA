package com.example.AuthService.services;

import com.example.AuthService.Entities.Imovel;
import com.example.AuthService.Entities.User;
import com.example.AuthService.Interfaces.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImovelService {
    @Autowired
    ImovelRepository imovelRepository;
    public List buscaTodosImoveis() {
        return imovelRepository.findAll();
    }
    public Imovel cadastraImovel(Imovel imovel) {
        imovelRepository.save(imovel);
        return imovel;
    }
    public void delete(Long id){
        imovelRepository.deleteById(id);
    }
}
