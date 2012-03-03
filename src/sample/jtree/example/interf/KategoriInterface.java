/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.jtree.example.interf;

import java.util.List;
import sample.jtree.example.entity.Kategori;
import sample.jtree.example.entity.TreeModelData;

/**
 *
 * @author : Saiful Bahri
 * Blog    : http://bahrie27.wordpress.com/
 * Twitter : @bahrie127
 */
public interface KategoriInterface {
    
    public List<Kategori> getAll();
    public Kategori getByKat(String kategori);
    public List<TreeModelData> getAllTreeModelData();
    
}
