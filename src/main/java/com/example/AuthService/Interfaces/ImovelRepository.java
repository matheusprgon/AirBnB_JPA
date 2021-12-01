package com.example.AuthService.Interfaces;

import com.example.AuthService.Entities.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}
