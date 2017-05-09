import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private long score;
	private Color[][] screen;
	
	// Creates a border around the screen
	public void screen() 
	{
		screen = new Color[40][40];
		for (int i = 0; i < 40; i++) 
		{
			for (int j = 0; j < 39; j++) 
			{
				if (i == 0 || i == 39 || j == 38) 
					screen[i][j] = Color.GRAY;
				else 
					screen[i][j] = Color.BLACK;
			}
		}
		Snek s = new Snek(1, 20, 20);
		s.paint();
	}
	
	public void paintComponent(Graphics g)
	{
		// Paint the well
		g.fillRect(0, 0, 26*40, 26*39);
		for (int i = 0; i < 40; i++) 
		{
			for (int j = 0; j < 39; j++) 
			{
				Snek s = new Snek(1, 20, 20);
				g.setColor(screen[i][j]);
				g.fillRect(26*i, 26*j, 25, 25);
				s.paint();
			}
		}
		
		// Display the score
		g.setColor(Color.WHITE);
		g.drawString("" + score, 30, 25);
	}
}