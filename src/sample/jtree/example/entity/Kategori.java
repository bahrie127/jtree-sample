/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.jtree.example.entity;

import java.util.List;

/**
 *
 * ini adalah class Kategori
 */
public class Kategori {

    private int id;
    private String nama;
    private List<Buah> listBuah;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Buah> getListBuah() {
        return listBuah;
    }

    public void setListBuah(List<Buah> listBuah) {
        this.listBuah = listBuah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kategori other = (Kategori) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.nama == null) ? (other.nama != null) : !this.nama.equals(other.nama)) {
            return false;
        }
        if (this.listBuah != other.listBuah && (this.listBuah == null || !this.listBuah.equals(other.listBuah))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + (this.nama != null ? this.nama.hashCode() : 0);
        hash = 53 * hash + (this.listBuah != null ? this.listBuah.hashCode() : 0);
        return hash;
    }
}
