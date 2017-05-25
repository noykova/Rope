/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rope.tree.structure.rope;

/**
 *
 * This class realize the node of the rope three
 */

import java.util.Scanner;

public class RopeNode {

    RopeNode left, right;
	    int weight;   
            String data;
	    /** Constructor **/
	    public RopeNode(String data)
	    {
	        this.data = data;
	        left = null;
	        right = null;
	        weight = data.length();
	    }
	    /** Constructor **/
	    public RopeNode()
	    {
	        data = null;
	        left = null;
	        right = null;
	        weight = 0;
	    }
	}






	 


