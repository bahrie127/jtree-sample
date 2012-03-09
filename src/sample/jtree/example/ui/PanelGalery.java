/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelGalery.java
 *
 * Created on Feb 26, 2012, 12:39:33 AM
 */
package sample.jtree.example.ui;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import sample.jtree.example.entity.PenyediaData;
import sample.jtree.example.entity.TreeModelData;
import sample.jtree.example.util.GaleryListener;

/**
 *
 * @author bahrie
 */
public class PanelGalery extends javax.swing.JPanel {

    /** Creates new form PanelGalery */
    public PanelGalery() {
        initComponents();
       lebarLayar=this.getPreferredSize().width;
       tinggiLayar=this.getPreferredSize().height;
     
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        gridContent = new javax.swing.JPanel();

        gridContent.setMaximumSize(new java.awt.Dimension(80, 80));
        gridContent.setPreferredSize(new java.awt.Dimension(80, 80));
        gridContent.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                gridContentComponentResized(evt);
            }
        });

        javax.swing.GroupLayout gridContentLayout = new javax.swing.GroupLayout(gridContent);
        gridContent.setLayout(gridContentLayout);
        gridContentLayout.setHorizontalGroup(
            gridContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        gridContentLayout.setVerticalGroup(
            gridContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(gridContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void gridContentComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_gridContentComponentResized
    gridContent.removeAll();
    
    lebarLayar=this.getWidth();
       tinggiLayar=this.getHeight();
       
       isiGalery();
      
}//GEN-LAST:event_gridContentComponentResized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gridContent;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
    private int idKat;
    private String nama;
    private GaleryListener listener;
    private GridBagConstraints constraints;
    
    private int widthCell=90;
    private int heightCell=90;
    private int jumlahGambar;
    private int colomGrid;
    private int barisGrid;
    private int lebarLayar;
    private int tinggiLayar;

    public GaleryListener getListener() {
        return listener;
    }

    public void setListener(GaleryListener listener) {
        this.listener = listener;
    }

    public int getIdKat() {
        return idKat;
    }

    public void setIdKat(int idKat) {
        this.idKat = idKat;
    }
    
    public void setNama(String name){
        this.nama=name;
    }

    
    public void isiGalery() {

        TreeModelData tmd = PenyediaData.cariTreeModelData(PenyediaData.getListTreeModel(), nama);
       
        jumlahGambar=tmd.getListTreeModel().size();
        gridContent.removeAll();
        
        siapkanVariable();
        
        int sisaGrid=(barisGrid*colomGrid)-jumlahGambar;
        gridContent.setLayout(new GridLayout(barisGrid, colomGrid, 20, 20));
        //gridContent.setLayout(new GridLayout(0, 4, 20, 20));
        for (TreeModelData data : tmd.getListTreeModel()) {
            PanelGambar pg = new PanelGambar();
            if (data.getPath() != null) {
                pg.setPath(data.getPath(), data.getId());
                pg.setListener(listener);
            } else {
                pg.setPath("/sample/jtree/images/folder.png", 0);
            }
            pg.setNameTitle(data.getLabel());

            gridContent.add(pg);
        }
//        
        for(int i=0;i<sisaGrid;i++){
            PanelGambar pg = new PanelGambar();
            pg.setPath(null, 0);
            gridContent.add(pg);
        }
        
        repaint();
//        
    }

    public static JComponent wrap(JComponent comp) {
        JPanel panel = new JPanel();
        panel.add(comp);
        return panel;
    }

   public void siapkanVariable(){
       
       colomGrid=(int) Math.ceil(lebarLayar/widthCell);
       barisGrid=(int) Math.ceil(jumlahGambar/colomGrid);
       if(barisGrid*heightCell<tinggiLayar){
           barisGrid=(int) Math.floor(tinggiLayar/heightCell);
       }
       
   }
   
   
}
