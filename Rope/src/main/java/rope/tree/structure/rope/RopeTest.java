package rope.tree.structure.rope;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Here all tests are provided in the main-method. 
 */
public class RopeTest {
    public static void main(String[] args) 
	    {
	        Scanner scan = new Scanner(System.in);
	        /** Creating object of Rope **/
	        Rope r = new Rope(); 
	        System.out.println("Rope Test\n");          
	        char ch;
                
	        /**  Perform rope operations  **/
	        do    
	        {    
	            System.out.println("\nRope Operations\n");
	            System.out.println("1. concatenation ");
	            System.out.println("2. get character at index");
	            System.out.println("3. substring");
	            System.out.println("4. clear");
	 
	            int choice = scan.nextInt();            
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter string to concat");
	                r.concat( scan.next() );                     
	                break;                          
	            case 2 : 
	                System.out.println("Enter index");
	                System.out.println("Character at index = "+ r.indexAt(scan.nextInt()));
	                break;                         
	            case 3 : 
	                System.out.println("Enter integer start and end limit");
	                System.out.println("Substring : "+ r.substring( scan.nextInt(), scan.nextInt() ));
	                break;                                          
	            case 4 :  
	                System.out.println("\nRope Cleared\n");
	                r.makeEmpty();
	                break;            
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;   
	            }
	            /**  Display rope  **/ 
	            System.out.print("\nRope : ");
	            r.print();
	 
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);                        
	        } while (ch == 'Y'|| ch == 'y'); 
	    }

}
