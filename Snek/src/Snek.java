import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snek extends JPanel
{
	private int snek;
	private int snekLength;
	private int snekX;
	private int snekY;
	
	public Snek(int length, int x, int y)
	{
		snekLength = length;
		snekX = x;
		snekY = y;
	}
	
	public void paint()
	{
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.RED);
		int height = snekLength;
		int width = 1;
		g.fillRect(snekX, snekY, width, height);
	}
	
	public void move(int x, int y)
	{
		snekX += x;
		snekY += y;
	}
}
