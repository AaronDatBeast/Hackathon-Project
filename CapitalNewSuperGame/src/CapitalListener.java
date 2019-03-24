import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class CapitalListener extends JPanel implements MouseListener, KeyListener {
	private Capital[] capitals;
	private int score;
	private int mouseX;
	private int mouseY;
	private int capitalIndex = -1;
	public boolean b;
	private JLabel label;
	private JLabel label2;
	JPanel panel;

	public CapitalListener(JPanel panel, JLabel label, JLabel label2) {
		this.panel = panel;
		capitals = new Capital[48];
		capitals[0]= new Capital("Montgomery", 802, 554);
		capitals[1]= new Capital("Helena", 324, 143);
		capitals[2]= new Capital("Lincoln", 583, 343);
		capitals[3]= new Capital("Phoenix", 273, 494);
		capitals[4]= new Capital("Carson City", 159, 317);
		capitals[5]= new Capital("Little Rock", 671, 495);
		capitals[6]= new Capital("Concord", 1054, 220);
		capitals[7]= new Capital("Sacramento", 120, 312);
		capitals[8]= new Capital("Trenton", 1013, 308);
		capitals[9]= new Capital("Denver", 427, 357);
		capitals[10]= new Capital("Santa Fe", 404, 440);
		capitals[11]= new Capital("Hartford", 1043, 267);
		capitals[12]= new Capital("Albany", 1016, 242);
		capitals[13]= new Capital("Dover", 1003, 338);
		capitals[14]= new Capital("Raleigh", 952, 431);
		capitals[15]= new Capital("Tallahassee", 866, 585);
		capitals[16]= new Capital("Bismarck", 514, 191);
		capitals[17]= new Capital("Atlanta", 845, 502);
		capitals[18]= new Capital("Columbus", 857, 323);
		capitals[19]= new Capital("Oklahoma City", 563, 461);
		capitals[20]= new Capital("Boise", 242, 237);
		capitals[21]= new Capital("Salem", 140, 159);
		capitals[22]= new Capital("Springfield", 721, 372);
		capitals[23]= new Capital("Harrisburg", 965, 314);
		capitals[24]= new Capital("Indianapolis", 786, 347);
		capitals[25]= new Capital("Providence", 1065, 261);
		capitals[26]= new Capital("Des Moines", 635, 328);
		capitals[27]= new Capital("Columbia", 907, 483);
		capitals[28]= new Capital("Topeka", 592, 377);
		capitals[29]= new Capital("Pierre", 518, 244);
		capitals[30]= new Capital("Frankfort", 820, 386);
		capitals[31]= new Capital("Nashville", 789, 436);
		capitals[32]= new Capital("Baton Rouge", 698, 600);
		capitals[33]= new Capital("Austin", 548, 597);
		capitals[34]= new Capital("Augusta", 1073, 190);
		capitals[35]= new Capital("Salt Lake City", 301, 305);
		capitals[36]= new Capital("Annapolis", 981, 343);
		capitals[37]= new Capital("Montpelier", 1028, 198);
		capitals[38]= new Capital("Boston", 1064, 238);
		capitals[39]= new Capital("Richmond", 977, 385);
		capitals[40]= new Capital("Lansing", 809, 281);
		capitals[41]= new Capital("Olympia", 161, 103);
		capitals[42]= new Capital("St. Paul", 659, 234);
		capitals[43]= new Capital("Charleston", 886, 376);
		capitals[44]= new Capital("Jackson", 711, 560);
		capitals[45]= new Capital("Madison", 731, 284);
		capitals[46]= new Capital("Jefferson City", 673, 394);
		capitals[47]= new Capital("Cheyenne", 431, 317);


		panel.addMouseListener(this);
		panel.addKeyListener(this);
		this.label = label;
		this.label2 = label2;
		label.setFont(new Font("Comic Sans",Font.BOLD, 50) );
		label2.setFont(new Font("Comic Sans",Font.BOLD, 50) );
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		mouseX = e.getX();
		mouseY = e.getY();


		if (capitalIndex<capitals.length) {
try {
			if (Distance(capitals[capitalIndex], e.getX(), e.getY())<40) {
				score++;
				capitalIndex++;
				label.setText("Score: " + score);
				label2.setText("Capital: " + capitals[capitalIndex].getName());

			}
			else {
				capitalIndex++;
				label2.setText("Capital: " + capitals[capitalIndex].getName());

			}
			panel.repaint();
}
catch(Exception e69) {
	
}
		}
		else {
			label2.setText("GAME OVER!!!!!!!!!!!!!!!!!");
		}



	}

	public double Distance(Capital cap, int x, int y) {
		return Math.sqrt(Math.pow(x-cap.getxCo(), 2) + Math.pow(y-cap.getyCo(), 2));
	}

	@Override
	public void mousePressed(MouseEvent e) {


	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(capitals[capitalIndex].getxCo(), capitals[capitalIndex].getyCo(), 300000, 300000);
	}
	@Override
	public void mouseReleased(MouseEvent e) {


	}

	@Override
	public void mouseEntered(MouseEvent e) {


	}

	@Override
	public void mouseExited(MouseEvent e) {


	}

	public Capital[] getCapitals() {
		return capitals;
	}

	public void setCapitals(Capital[] capitals) {
		this.capitals = capitals;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getMouseX() {
		return mouseX;
	}

	public void setMouseX(int mouseX) {
		this.mouseX = mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	public void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}

	@Override
	public void keyTyped(KeyEvent e) {

		char key = e.getKeyChar(); // tells you the character typed, use this because capital and lowercase
		if(key == 'n') {
			try {
				capitalIndex++;
				label2.setText("Capital: " + capitals[capitalIndex].getName());
			} catch(ArrayIndexOutOfBoundsException eq) {
				label2.setText("GAME OVER!!!!!!!!!!!!!!!!!");

			}

		}
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}



}