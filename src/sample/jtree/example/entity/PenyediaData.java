/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.jtree.example.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * ini adalah class PenyediaData
 */
public class PenyediaData {

    public static List<TreeModelData> getListTreeModel() {

        TreeModelData nasiLiwet = new TreeModelData();
        //nasiLiwet.setId(1);
        nasiLiwet.setLabel("Nasi Liwet");
        nasiLiwet.setPath("/sample/jtree/images/nasiliwet.jpg");

        TreeModelData gudeg = new TreeModelData();
        //gudeg.setId(1);
        gudeg.setLabel("Gudeg");
        gudeg.setPath("/sample/jtree/images/gudeg.jpg");

        TreeModelData nasiGoreng = new TreeModelData();
        //nasiGoreng.setId(1);
        nasiGoreng.setLabel("Nasi Goreng");
        nasiGoreng.setPath("/sample/jtree/images/nasigoreng.jpg");

        List<TreeModelData> listNasi = new ArrayList<TreeModelData>();
        listNasi.add(nasiLiwet);
        listNasi.add(gudeg);
        listNasi.add(nasiGoreng);

        TreeModelData nasi = new TreeModelData();
        //nasi.setId(1);
        nasi.setLabel("Nasi");
        //nasi.setPath("");
        nasi.setListTreeModel(listNasi);

        TreeModelData mieAyam = new TreeModelData();
        //mieAyam.setId(1);
        mieAyam.setLabel("Mie Ayam");
        mieAyam.setPath("/sample/jtree/images/mieayam.jpg");

        TreeModelData bakso = new TreeModelData();
        //bakso.setId(1);
        bakso.setLabel("Bakso");
        bakso.setPath("/sample/jtree/images/bakso.jpg");

        List<TreeModelData> listMakanan = new ArrayList<TreeModelData>();
        listMakanan.add(mieAyam);
        listMakanan.add(bakso);
        listMakanan.add(nasi);

        TreeModelData makanan = new TreeModelData();
        //makanan.setId(1);
        makanan.setLabel("Makanan");
        //makanan.setPath("");
        makanan.setListTreeModel(listMakanan);

        TreeModelData semangka = new TreeModelData();
        semangka.setId(1);
        semangka.setLabel("Semangka");
        semangka.setPath("/sample/jtree/images/watermelon.jpg");

        TreeModelData pisang = new TreeModelData();
        //pisang.setId(1);
        pisang.setLabel("Pisang");
        pisang.setPath("/sample/jtree/images/banana.jpg");

        TreeModelData strowberry = new TreeModelData();
        //strowberry.setId(1);
        strowberry.setLabel("Strowberry");
        strowberry.setPath("/sample/jtree/images/strawberry.jpg");

        TreeModelData apel = new TreeModelData();
        //apel.setId(1);
        apel.setLabel("Apel");
        apel.setPath("/sample/jtree/images/apple.jpg");

        List<TreeModelData> listBuah = new ArrayList<TreeModelData>();
        listBuah.add(semangka);
        listBuah.add(pisang);
        listBuah.add(strowberry);
        listBuah.add(apel);

        TreeModelData buah = new TreeModelData();
        //buah.setId();
        buah.setLabel("Buah");
        //buah.setPath("");
        buah.setListTreeModel(listBuah);

        List<TreeModelData> listAll = new ArrayList<TreeModelData>();
        listAll.add(buah);
        listAll.add(makanan);
//        listTreeModel.add(buah);
//        listTreeModel.add(makanan);
        return listAll;
    }

    public static TreeModelData cariTreeModelData(List<TreeModelData> listTree, String name) {
        if (listTree == null) {
            return null;
        }
       // TreeModelData modelData = new TreeModelData();
        for (TreeModelData tmd : listTree) {
            if (tmd.getLabel().equals(name)) {
                return tmd;
            }
           TreeModelData model=cariTreeModelData(tmd.getListTreeModel(), name);
           if(model!=null){
               return model;
           }
        }
        return null;
    }
}
