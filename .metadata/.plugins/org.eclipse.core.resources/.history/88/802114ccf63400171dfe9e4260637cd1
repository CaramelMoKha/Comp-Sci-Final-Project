import javax.swing.JFrame;

public class PlaySnek
{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Snek");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(40*26+10, 26*39+25);
		f.setVisible(true);
		
		final Game game = new Game();
		Snek s = new Snek(1, 20, 20);
		game.screen();
		s.paint();
		f.add(game);
	}
}
