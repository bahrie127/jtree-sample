/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.jtree.example.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sample.jtree.example.connection.DatabaseUtilities;
import sample.jtree.example.entity.Buah;
import sample.jtree.example.entity.Kategori;
import sample.jtree.example.entity.TreeModelData;
import sample.jtree.example.interf.KategoriInterface;

/**
 *
 * ini adalah class ImplementKategori
 */
public class ImplementKategori implements KategoriInterface{

  @Override
    public List<Kategori> getAll() {
        try {
            Statement st = DatabaseUtilities.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select *from kategori");
            List<Kategori> list = new ArrayList<Kategori>();
            while (rs.next()) {
                Kategori k = new Kategori();
                k.setId(rs.getInt("id"));

                Statement st2 = DatabaseUtilities.getConnection().createStatement();
                ResultSet rs2 = st2.executeQuery("select *from buah where id_kat= " + k.getId());
                List<Buah> list2 = new ArrayList<Buah>();
                while (rs2.next()) {
                    Buah b = new Buah();
                    b.setId(rs2.getInt("id"));
                    b.setNama(rs2.getString("nama"));
                    b.setPath(rs2.getString("path"));
                    list2.add(b);
                }
                k.setListBuah(list2);
                k.setNama(rs.getString("nama"));
                list.add(k);
            }

            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ImplementKategori.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Kategori getByKat(String kategori) {
        try {
            PreparedStatement st = DatabaseUtilities.getConnection().prepareStatement("select *from kategori where nama=?");
            st.setString(1, kategori);
            ResultSet rs = st.executeQuery();
            
            Kategori k = new Kategori();
            if(rs.next()){
            k.setId(rs.getInt("id"));
            
            Statement st2 = DatabaseUtilities.getConnection().createStatement();
            ResultSet rs2 = st2.executeQuery("select *from buah where id_kat= " + k.getId());
            List<Buah> list2 = new ArrayList<Buah>();
            while (rs2.next()) {
                Buah b = new Buah();
                b.setId(rs2.getInt("id"));
                b.setNama(rs2.getString("nama"));
                b.setPath(rs2.getString("path"));
                list2.add(b);
            }
            
            k.setListBuah(list2);
            k.setNama(rs.getString("nama"));
            }
            return k;
        } catch (SQLException ex) {
            Logger.getLogger(ImplementKategori.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<TreeModelData> getAllTreeModelData() {
        
        
        
        List<TreeModelData> listTreeModel=new ArrayList<TreeModelData>();
        
        
        
        return listTreeModel;
    }
}
