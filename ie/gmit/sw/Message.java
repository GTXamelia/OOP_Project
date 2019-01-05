package ie.gmit.sw;

import javax.swing.*;

public class Message {

	private JLabel infoLabel = new JLabel("Test");

	public synchronized JLabel getInfoLabel() {
		return this.infoLabel;
	}

	public synchronized void setInfoLabel(JLabel infoLabel) {
		this.infoLabel = infoLabel;
	}
	
	public synchronized void setInfoLabelText(String text) {
		this.infoLabel.setText(text);
	}
	
}
