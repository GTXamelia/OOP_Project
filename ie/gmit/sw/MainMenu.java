package ie.gmit.sw;

import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private MainMenu() {
		frame = new JFrame("Animation");
		frame.setBounds(100, 100, 500, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel(new ImageIcon(MainMenu.class.getResource("/resources/images/menu/castle.png")));
		label.setSize(268, 258);
		label.setLocation(79, 11);
		frame.getContentPane().add(label);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					frame.dispose();
					GameWindow.main();
					
			}
		});
		btnPlay.setBounds(171, 280, 89, 23);
		frame.getContentPane().add(btnPlay);
	}
	
	// A function which closes the frame
	public void CloseFrame() {
		super.dispose();
	}
}
