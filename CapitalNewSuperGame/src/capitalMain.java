import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class capitalMain {
	static JLabel label = new JLabel("Score: 0", SwingConstants.CENTER);
	static JLabel label2 = new JLabel("Press N to start! ", SwingConstants.LEFT);
	
	public static void main (String[] args) {
		
		
		JFrame frame = new JFrame("Cool Frame");
		JPanel panel = new JPanel();
		CapitalListener listener = new CapitalListener(panel, label,label2);
		
		frame.setSize(1200,1200);
		frame.setLocation(100, 100);
		frame.setContentPane(panel);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.add(label, BorderLayout.NORTH);
		frame.add(label2, BorderLayout.SOUTH);
		BufferedImage image = null;
		try { 
			image = ImageIO.read(new File("US map.png")); 
		} catch(IOException e) {

		}
		
		
		frame.add(new JLabel(new ImageIcon("US map.png")));
		frame.setVisible(true);
		
		
//		for (int i = 0; i < listener.getCapitals().length; i++) {
//			listener.Find(listener.getCapitals()[i], listener.getMouseX(), listener.getMouseY());
//		}
		
		panel.requestFocusInWindow();

	}

	
}