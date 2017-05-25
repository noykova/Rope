/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rope.tree.structure.rope;

/**
 * This class builds the rope three - use RopeNodes and connect them by creating
 * connections between nodes, called edges. 
 * In this class all important functions, which realize concatenation, indexOf, 
 * get substring and pint via in-order traversal are provided. 
 */
public class Rope {
    RopeNode root;
	 
	    /** Constructor **/
	    public Rope()
	    {
	        root = new RopeNode("");
	    }
	    /** Function to clear rope **/
	    public void makeEmpty()
	    {
	        root = new RopeNode("");
	    }
	    /** Function to concatenate an element **/
	    public void concat(String str)
	    {
	        RopeNode nptr = new RopeNode(str);
	        RopeNode newRoot = new RopeNode();
	        newRoot.left = root;
	        newRoot.right = nptr;
	        newRoot.weight = newRoot.left.weight ;
	        if (newRoot.left.right != null)
	            newRoot.weight += newRoot.left.right.weight;
	        root = newRoot;

    }
            /** Function get character at a particular index **/
	    public char indexAt(int ind)
	    {
	        RopeNode tmp = root;
	        if (ind > tmp.weight)
	        {
	            ind -= tmp.weight;
	            return tmp.right.data.charAt(ind);
	        }
	        while (ind < tmp.weight)
	            tmp = tmp.left;
	        ind -= tmp.weight;
	        return tmp.right.data.charAt(ind);            
	    }
	    /** Function get substring between two indices **/
	    public String substring(int start, int end)
	    {
	        String str = "";
	        boolean found = false;
	        RopeNode tmp = root;
	        if (end > tmp.weight)
	        {
	            found = true;
	            end -= tmp.weight;
	            if (start > tmp.weight)
	            {
	                start -= tmp.weight;
	                str = tmp.right.data.substring(start, end);
	                return str;
	            }
	            else
	                str = tmp.right.data.substring(0, end);            
	        }        
	        if (!found)
	        {
	            while (end <= tmp.weight)
	                tmp = tmp.left;
	            end -= tmp.weight;
	            if (start >= tmp.weight)
	            {
	                start -= tmp.weight;
	                str = tmp.right.data.substring(start, end) + str;
	                return str;
	            }
	            str = tmp.right.data.substring(0, end);            
	        }    
	        tmp = tmp.left;
	        while (start < tmp.weight)
	        {
	            str = tmp.right.data + str;
	            tmp = tmp.left;
	        }
	        start -= tmp.weight;
	        str = tmp.right.data.substring(start) + str;    
	 
	        return str;        
	    }
	    /** Function to print Rope **/
	    public void print()
	    {
	        print(root);
	        System.out.println();
	    }
	    private void print(RopeNode r)
	    {
	        if (r != null)
	        {
	            print(r.left);
	            if (r.data != null)
	                System.out.print(r.data);
	            print(r.right);
	        }
	    }    
	}
	 

            
