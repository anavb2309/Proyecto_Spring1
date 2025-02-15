/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interivalle.Proyecto_Spring.Repositorio;

import com.Interivalle.Proyecto_Spring.Modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ana Valencia
 */
@Repository
public interface Usuario_Repositorio extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
