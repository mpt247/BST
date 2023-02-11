/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.viperbinaryseartree2nd;

/**
 *
 * @author irad_allen
 */
public class Viperbinaryseartree2nd {

    public static void main(String[] args) {
        
        ViperBST tree = new ViperBST();
        
        tree.add(10);
        tree.add(15);
        tree.add(5);
        tree.add(2);
        tree.add(7);
        tree.add(17);
        tree.add(12);
        
        System.out.println("IN ORDER");
        System.out.println(tree + "\n");
        
        System.out.println("PRE ORDER");
        System.out.println(tree.preOrder() + "\n");
        
        System.out.println("POST ORDER");
        System.out.println(tree.postOrder() + "\n");
        
        System.out.println("Tree height is " + tree.getHeight());
        System.out.println("Number of leaves is " + tree.getNumLeaves());
        System.out.println("Number of nodes is " + tree.getNumNodes());
        System.out.println("Number of levels is  " + tree.getNumLevels());
        System.out.println("Tree as a string  " + tree);
        if(tree.isFull())
            System.out.println("The tree is full");
        else
            System.out.println("The tree is not full");
        if(tree.isComplete())
            System.out.println("The tree is complete");
        else    
            System.out.println("The tree is not complete");
    }
}
