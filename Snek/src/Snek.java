import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snek extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	Game g;
	private int snekLength;
	private int snekX;
	private int snekY;
	
	public Snek(int length, int x, int y, Game g)
	{
		snekLength = length;
		snekX = x;
		snekY = y;
		this.g = g;
	}
	
	public void addSnake()
	{
		g.getScreen()[snekX][snekY] = //put snake on the screen
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
		snekX = x;
		snekY = y;
	}
	
	public int getY()
	{
		return snekY;
	}
	
	public int getX()
	{
		return snekX;
	}
}
