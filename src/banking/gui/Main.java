/*
 * 
 * File: Main.java
 * Author Kevinagary
 * Date: 2/20/16
 * 
 * Description: Entry point for the program, Instantiates a JFrame and sets it visible
 * 
 */


package banking.gui;

import javax.swing.JFrame;

/**
 * main method for running the program.
 * @author kevinagary
 *
 */
final class Main {
	/**
	  Class: Main
	  
	  Description: Entry point for the program
	*/
	/**
	 * Private constructor to address STYLE issue.
	 */
	private Main() {
	}
	
	/**
	 * All methods should have a Javadoc according to STYLE.
	 * @param args command-line arguments
	 * @throws Exception as per typical main specifications
	 */
	public static void main(final String[] args) throws Exception {

		if (args.length != 1) {
			System.out.println("Usage: java FormMain <property file>");
			System.exit(1);
		}
	
		String propertyFile = args[0];
		JFrame frame = new MainFrame(propertyFile);
		frame.setVisible(true);

	}
}
