/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jugal
 */
public class Node implements Iterator<String> {

    Node root = null;
    Node prev = null;

    int position = 0;
    List<String> col = new LinkedList<>();
    int totalIndex = 0;

    public Node(List<String> col, Node prev, Node root) {
        super();
        this.col = col;
        this.prev = prev;
        this.totalIndex = col.size() - 1;
        this.position = 0;
        this.root = root;
    }

    @Override
    public boolean hasNext() {
        try {
            if (this.root != null && this.root.position <= this.root.totalIndex) {
                return true;
            } else if (this.position > this.totalIndex) {
                return false;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String next() {
        if (this.position >= this.totalIndex) {
            if (this.prev != null) {
                this.position = 0;
                this.prev.next();

            } else {
                ++this.position;
            }
        } else {
            ++this.position;
        }
        return null;
    }

    public String current() {
        return col.get(this.position);
    }

    @Override
    public void remove() {

        throw new UnsupportedOperationException("Not supported yet.");
    }

}
