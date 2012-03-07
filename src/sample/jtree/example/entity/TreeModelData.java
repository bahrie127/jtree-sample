/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.jtree.example.entity;

import java.util.List;

/**
 *
 * ini adalah class TreeModelData
 */
public class TreeModelData {
    private int id;
    private String label;
    private String path;
    private List<TreeModelData> listTreeModel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<TreeModelData> getListTreeModel() {
        return listTreeModel;
    }

    public void setListTreeModel(List<TreeModelData> listTreeModel) {
        this.listTreeModel = listTreeModel;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TreeModelData other = (TreeModelData) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.label == null) ? (other.label != null) : !this.label.equals(other.label)) {
            return false;
        }
        if ((this.path == null) ? (other.path != null) : !this.path.equals(other.path)) {
            return false;
        }
        if (this.listTreeModel != other.listTreeModel && (this.listTreeModel == null || !this.listTreeModel.equals(other.listTreeModel))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + (this.label != null ? this.label.hashCode() : 0);
        hash = 97 * hash + (this.path != null ? this.path.hashCode() : 0);
        hash = 97 * hash + (this.listTreeModel != null ? this.listTreeModel.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return label;
    }
    
    
}
