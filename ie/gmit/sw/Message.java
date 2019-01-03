package ie.gmit.sw;

import javax.swing.JLabel;

public class Message {

	private JLabel infoLabel;

	public JLabel getInfoLabel() {
		return infoLabel = new JLabel();
	}

	public void setInfoLabel(JLabel infoLabel) {
		this.infoLabel = infoLabel;
	}

	public Message(JLabel infoLabel) {
		super();
		this.infoLabel = infoLabel;
	}
	
	public void setInfoLabelText(String text) {
		this.infoLabel.setText(text);
	}
	
}
