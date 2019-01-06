package ie.gmit.sw.menu;

import javax.swing.*;

import ie.gmit.sw.Levels.Level1Window;
import ie.gmit.sw.Levels.Level2Window;
import ie.gmit.sw.Levels.TutorialWindow;

import java.awt.EventQueue;
import java.awt.Image;
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
		frame = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
		Image img = new ImageIcon(this.getClass().getResource("/resources/images/menu/castle.png")).getImage();
		frame.setIconImage(img);
		frame.setBounds(100, 100, 500, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel(new ImageIcon(MainMenu.class.getResource("/resources/images/menu/castle.png")));
		label.setSize(268, 258);
		label.setLocation(100, 11);
		frame.getContentPane().add(label);
		
		JButton btnTutorial = new JButton("Tutorial");
		btnTutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TutorialWindow.main();
			}
		});
		btnTutorial.setBounds(194, 280, 89, 23);
		frame.getContentPane().add(btnTutorial);
		
		JButton btnLevel1 = new JButton("Level 1");
		btnLevel1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Level1Window.main();
			}
		});
		btnLevel1.setBounds(194, 314, 89, 23);
		frame.getContentPane().add(btnLevel1);
		
		JButton btnLevel2 = new JButton("Level 2");
		btnLevel2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Level2Window.main();
			}
		});
		btnLevel2.setBounds(194, 348, 89, 23);
		frame.getContentPane().add(btnLevel2);
		
		JButton btnLevel3 = new JButton("Level 3");
		btnLevel3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLevel3.setBounds(194, 382, 89, 23);
		frame.getContentPane().add(btnLevel3);
		
		JLabel lblGmit = new JLabel("GMIT");
		lblGmit.setBounds(10, 461, 273, 14);
		frame.getContentPane().add(lblGmit);
		
		JLabel lblBscInComputing = new JLabel("B.Sc. in Computing (Software Development)");
		lblBscInComputing.setBounds(10, 486, 273, 14);
		frame.getContentPane().add(lblBscInComputing);
		
		JLabel lblNewLabel = new JLabel("Cian Gannon G00337022");
		lblNewLabel.setBounds(10, 511, 273, 14);
		frame.getContentPane().add(lblNewLabel);
	}
	
	// Closes the frame
	public void CloseFrame() {
		super.dispose();
	}
}
