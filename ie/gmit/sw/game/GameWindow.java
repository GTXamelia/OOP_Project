package ie.gmit.sw.game;

import java.awt.*;
import javax.swing.*;

public class GameWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;

	/*
	 * This matrix represents the isometric game model, with each number mapping to an
	 * image in the images/ground/ directory.
	 */
	private int[][] model = { 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 2},
			{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 2},
			{ 0, 0, 2, 0, 0, 0, 0, 0, 0, 2},
			{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 2},
			{ 2, 2, 2, 2, 1, 0, 0, 0, 0, 2},
			{ 3, 3, 3, 3, 1, 1, 1, 0, 0, 1},
			{ 5, 5, 5, 5, 3, 3, 1, 1, 1, 1},
			{ 4, 4, 4, 5, 3, 3, 1, 0, 0, 0},
			{ 4, 4, 4, 4, 5, 3, 1, 6, 6, 6},
			{ 4, 4, 4, 4, 4, 3, 1, 7, 7, 7}
	};
	
	//This matrix is a representation of where objects (things) in the game are placed
	private int[][] objects = { 
			{0, 0, 0, 5, 5, 5, 5, 5, 5, 0},
			{5, 0, 0, 0, 5, 5, 5, 5, 5, 0},
			{5, 5, 0, 0, 0, 5, 5, 5, 5, 9},
			{5, 5, 2, 0, 0, 0, 5, 5, 5, 0},
			{0, 0, 0, 0, 0, 0, 0, 5, 5, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 5, 0},
			{0, 0, 0, 0, 0, 3, 0, 0, 0, 0},
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
					GameWindow window = new GameWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public GameWindow() throws Exception {
		
		final Image img = new ImageIcon(this.getClass().getResource("/resources/images/menu/castle.png")).getImage();
		
		frame = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
		frame.setIconImage(img);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		infoLabel = new JLabel("Welcome to the  tutorial!");
		panel.add(infoLabel);
		
		GameView view = new GameView(model, objects, infoLabel);
		Dimension d = new Dimension(GameView.DEFAULT_VIEW_SIZE, GameView.DEFAULT_VIEW_SIZE/2);
		view.setPreferredSize(d);
		view.setMinimumSize(d);
		view.setMaximumSize(d);
		frame.getContentPane().add(view);
		frame.addKeyListener(view);
		
		frame.setSize(1000, 1000);
		frame.setLocation(100, 100);
		frame.pack();;
		frame.setVisible(true);
		
		System.out.println(GameView.test);
	}
	
		// Closes the frame
		public void CloseFrame() {
			super.dispose();
		}
}