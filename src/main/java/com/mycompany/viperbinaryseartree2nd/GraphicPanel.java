/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viperbinaryseartree2nd;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
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
        
        // Clear all of the panel content before drawing
        super.paintComponent(g);
        
        // Code to draw graphics
        
    }
    
}
