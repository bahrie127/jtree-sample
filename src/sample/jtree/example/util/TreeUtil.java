/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.jtree.example.util;

import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import sample.jtree.example.entity.TreeModelData;

/**
 *
 * ini adalah class TreeUtil
 */
public class TreeUtil {

    // DefaultMutableTreeNode top = new DefaultMutableTreeNode("root");
    public static DefaultMutableTreeNode convertModelToNode(List<TreeModelData> listTreeModel, DefaultMutableTreeNode top) {
        if (listTreeModel == null) {
            return null;
        }
        DefaultMutableTreeNode children = null;
        for (TreeModelData tmd : listTreeModel) {
            children = new DefaultMutableTreeNode(tmd);
            top.add(children);
            convertModelToNode(tmd.getListTreeModel(), children);
        }
        return top;
    }
}
