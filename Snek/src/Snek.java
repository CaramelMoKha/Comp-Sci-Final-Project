
public class Snek
{
	private static final long serialVersionUID = 1L;
	
	final int SNEKLENGTH = 1;
	private int snekX;
	private int snekY;
	
	public Snek(int x, int y)
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

	
	public void moveUp()
	{
		this.snekY ++;
	}
	
	public void moveDown()
	{
		this.snekY --;
	}
	
	public void moveLeft()
	{
		this.snekX --;
	}
	
	public void moveRight()
	{
		this.snekX ++;
	}
}
