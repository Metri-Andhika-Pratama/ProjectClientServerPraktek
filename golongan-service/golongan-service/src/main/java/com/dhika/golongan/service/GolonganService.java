/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhika.golongan.service;

import com.dhika.golongan.entity.Golongan;
import com.dhika.golongan.repository.GolonganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
  @Service
public class GolonganService {
  @Autowired 
  private GolonganRepository GolonganRepository;
    
    public Golongan saveGolongan(Golongan golongan){
        return GolonganRepository.save(golongan);
    }
    
    public Golongan findGolonganById(Long golonganId){
        return GolonganRepository.findByGolonganId(golonganId);
}
} 
