/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhika.client_2101082009.controller;

import com.dhika.client_2101082009.FormPengembalian;
import com.dhika.client_2101082009.model.Pengembalian;
import com.dhika.client_2101082009.service.PengembalianService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class PengembalianController {
    private final PengembalianService pengembalianService;
        private final FormPengembalian formPengembalian;
    
      public PengembalianController(FormPengembalian formPengembalian){
        this.formPengembalian = formPengembalian;
        pengembalianService = new PengembalianService();
    }
    
    public void bersihForm(){
        formPengembalian.getTxtPengembalianId().setText("");
        formPengembalian.getTxtPeminjamanId().setText("");
        formPengembalian.getTxtTglDikembalikan().setText("");
        formPengembalian.getTxtTerlambat().setText("");
        formPengembalian.getTxtDenda().setText("");
    }
    
    public void getPengembalianId(){
        Long id = Long.parseLong(formPengembalian.getTxtPengembalianId().getText());
        PengembalianController pengembalian = pengembalianService.getPengembalian(id);
        if(pengembalian!=null){
            formPengembalian.getTxtTglDikembalikan().setText(pengembalian.getTglDikembalikan());
            formPengembalian.getTxtTerlambat().setText(pengembalian.getTerlamabat());
            formPengembalian.getTxtDenda().setText(pengembalian.getDenda());
        }else{
            JOptionPane.showMessageDialog(formPengembalian, "Data Tidak Ada");
        }
    }
    
    public void savePengembalian(){
        PengembalianController pengembalian = new PengembalianController();
        pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
        pengembalian.setTerlambat(formPengembalian.getTxtTerlambat().getText());
        pengembalian.setDenda(formPengembalian.getTxtDenda().getText());
        pengembalian = pengembalianService.savePengembalian(pengembalian);
        if(pengembalian != null){
            formPengembalian.getTxtengembalianId().setText(pengembalian.getPengembalianId().toString());
            JOptionPane.showMessageDialog(formPengembalian, "Entri Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formPengembalian, "Entri Data Gagal");
        }
    }
    
    public void UpdatePengembalian(){
        Pengembalian pengembalian = new Pengembalian();
        pengembalian.setPengembalianId(Long.parseLong(formPengembalian.getTxtPengembalianId().getText()));
        pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
        pengembalian.setTerlamabat(formPengembalian.getTxtTerlambat().getText());
        pengembalian.setDenda(formPengembalian.getTxtDenda().getText());
        pengembalian = pengembalianService.updatePengembalian(pengembalian);
        if(pengembalian!= null){
            formPengembalian.getTxtPengembalianId().setText(pengembalian.getPengembalianId().toString());
            JOptionPane.showMessageDialog(formPengembalian, "Update Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formPengembalian, "Update Data Gagal");
        }
    }
    
    public void deletePengembalian(){
        Long id = Long.parseLong(formPengembalian.getTxtPengembalianId().getText());
        pengembalianService.deletePengembalian(id);
        JOptionPane.showMessageDialog(formPengembalian, "Delete Data Berhasil");
    }
    
   public void viewTabel(){
        DefaultTableModel tableModel = (DefaultTableModel)
                formPengembalian.getTablePengembalian().getModel();
        tableModel.setRowCount(0);
        List<Pengembalian> pengembalianList =pengembalianService.getAllPengembalian();
        for (Pengembalian pengembalian : pengembalianList){
            Object[] row = {
               pengembalian.getPengembalianId(),
                pengembalian.getPeminjamanId(),
                pengembalian.getTglDikembalikan(),
                pengembalian.getTerlambat(),
                pengembalian.getDenda(),
            };
            tableModel.addRow(row);
        }
    }


}
