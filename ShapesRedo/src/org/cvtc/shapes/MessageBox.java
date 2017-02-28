package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog {

	@Override
	public int show(String message, String title) {
		
		JOptionPane.showMessageDialog(null, message, title, 3);
		
		return JOptionPane.OK_OPTION;
	}

}
