/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelGambar.java
 *
 * Created on Feb 25, 2012, 5:33:21 AM
 */
package sample.jtree.example.ui;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import sample.jtree.example.util.GaleryListener;

/**
 *
 * @author bahrie
 */
public class PanelGambar extends javax.swing.JPanel {

    /** Creates new form PanelGambar */
    public PanelGambar() {
        initComponents();

        //labelNama.setText("contoh");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gambar = new sample.jtree.example.util.JPPanel();
        title = new javax.swing.JLabel();

        gambar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gambarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gambarLayout = new javax.swing.GroupLayout(gambar);
        gambar.setLayout(gambarLayout);
        gambarLayout.setHorizontalGroup(
            gambarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        gambarLayout.setVerticalGroup(
            gambarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(gambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(gambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void gambarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gambarMouseClicked
    gambarMouseClicked();
}//GEN-LAST:event_gambarMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sample.jtree.example.util.JPPanel gambar;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    private String path;
    private String nameTitle;
    private GaleryListener listener;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
        Icon icon = new ImageIcon(getClass().getResource(path));
        gambar.setIcon(icon);
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
        title.setText(nameTitle);

    }

    public void gambarMouseClicked() {
        if (listener != null) {
            listener.clickThumbnail(path, nameTitle);
        }
    }

    public GaleryListener getListener() {
        return listener;
    }

    public void setListener(GaleryListener listener) {
        this.listener = listener;
    }
}
