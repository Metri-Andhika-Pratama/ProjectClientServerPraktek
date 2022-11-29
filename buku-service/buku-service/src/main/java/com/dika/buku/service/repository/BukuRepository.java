/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dika.buku.service.repository;

import com.dika.buku.service.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface BukuRepository extends JpaRepository<Buku, Long> {
    

    public Buku findByBukuId(Long bukuId);
}
