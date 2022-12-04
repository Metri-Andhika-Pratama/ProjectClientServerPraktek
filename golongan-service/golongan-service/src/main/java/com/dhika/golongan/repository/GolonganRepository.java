/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dhika.golongan.repository;

import com.dhika.golongan.entity.Golongan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface GolonganRepository extends JpaRepository<Golongan, Long>  {
    
    public Golongan findByGolonganId(Long golonganId);
}
