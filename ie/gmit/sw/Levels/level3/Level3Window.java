package ie.gmit.sw.Levels.level3;

import java.awt.*;
import javax.swing.*;

import ie.gmit.sw.Levels.Level1.Level1Settings;

public class Level3Window extends JFrame {
	
	private static final long serialVersionUID = 1L;

	/*
	 * This matrix represents the isometric game model, with each number mapping to an
	 * image in the images/ground/ directory.
	 */
	private int[][] model = { 
			{4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
			{4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
			{4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
			{1, 4, 4, 4, 4, 4, 4, 4, 4, 4},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
			{4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
			{4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
			{4, 4, 4, 4, 4, 4, 4, 4, 4, 4}
	};
	
	//This matrix is a representation of where objects (things) in the game are placed
	private int[][] objects = { 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
	
	private JFrame frame;
	private JPanel panel;
	private JLabel infoLabel;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Level3Window window = new Level3Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Level3Window() throws Exception {
		
		final Image img = new ImageIcon(this.getClass().getResource("/resources/images/menu/castle.png")).getImage();
		
		frame = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
		frame.setIconImage(img);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		infoLabel = new JLabel("Get to the end without hitting the knight");
		panel.add(infoLabel);
		
		Level3Settings view = new Level3Settings(model, objects, infoLabel, frame);
		Dimension d = new Dimension(Level1Settings.DEFAULT_VIEW_SIZE, Level1Settings.DEFAULT_VIEW_SIZE/2);
		view.setPreferredSize(d);
		view.setMinimumSize(d);
		view.setMaximumSize(d);
		frame.getContentPane().add(view);
		frame.addKeyListener(view);
		
		frame.setSize(1000, 1000);
		frame.setLocation(100, 100);
		frame.pack();;
		frame.setVisible(true);
	}
	
	// Closes the frame
	public void CloseFrame() {
		super.dispose();
	}
}