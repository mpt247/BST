/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viperbinaryseartree2nd;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author mattanpaluy
 */
public class GraphicPanel extends JPanel{
    
    private ViperBST tree;
    
    
    public void processData(ViperBST tree) {
        this.tree = tree;
        
        // Calls the paint, update, and paintComponent methods
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        // halt if tree not defined
        
        
        // Clear all of the panel content before drawing
        super.paintComponent(g);
        
        // Code to draw graphics
        int center = getWidth()/2;
        LinkedList<VTreeNode> Q = new LinkedList<VTreeNode>();
        int xNode = center, yNode = 0;
        
        if (tree != null)
            drawTree(tree.getRootNode(), xNode, yNode, center/2, g);
    }

    private void drawNode(int xNode, int yNode, int delta, String value, Graphics g) {
        int width = 40, height = 40; 
        int levelHeight = height * 2;
        //oval
        g.drawOval(xNode - width/2, yNode, width, height);
        g.drawString(value, xNode + 5,yNode + 25);
        
        //Lines
        int xLine = xNode;
        int yLine = yNode + height;
        int nextY = yNode + levelHeight;
        int nextLeftX = xLine - delta;
        int nextRightX = xLine + delta;
        
        
        
        //left
        g.drawLine(xLine, yLine, nextLeftX, nextY);
        
        
        //right
        g.drawLine(xLine, yLine, nextRightX, nextY);
        
    }
    
    private void drawTree(VTreeNode root, int xNode, int yNode, int delta, Graphics g){
        if (root != null){
            drawNode(xNode, yNode, delta, root.getVal() + "", g);
            int childrenDelta = delta / 2;
            drawTree(root.getLeft(), xNode - delta, yNode + 80, childrenDelta, g);
            drawTree(root.getRight(), xNode + delta, yNode + 80, childrenDelta, g);
        }
    }
}
