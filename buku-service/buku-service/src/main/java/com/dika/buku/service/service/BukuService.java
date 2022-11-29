/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dika.buku.service.service;

import com.dika.buku.service.entity.Buku;
import com.dika.buku.service.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class BukuService {
  @Autowired 
  private BukuRepository BukuRepository;
    
    public Buku saveBuku(Buku buku){
        return BukuRepository.save(buku);
    }
    
    public Buku findBukuById(Long bukuId){
        return BukuRepository.findByBukuId(bukuId);
}
}


    
  