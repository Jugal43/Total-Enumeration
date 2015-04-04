/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jugal
 */
public class TotalEnumeration {

    private Node iterator = null;

    public TotalEnumeration(String[][] multilist) {
        Node root = null;
        Node temp = null;
        for (String[] col : multilist) {
            temp = new Node(new LinkedList<>(Arrays.asList(col)), temp, root);
            if (root == null) {
                root = temp;
            }
        }
        iterator = temp;
    }

    public List genarate() {
        while (iterator.hasNext()) {
            Node tt = iterator;
            System.out.print(tt.current());
            while (tt.prev != null) {
                
                System.out.print(tt.prev.current());
                tt = tt.prev;
            }
            iterator.next();
            System.out.println();
        }
        return null;
    }
}
