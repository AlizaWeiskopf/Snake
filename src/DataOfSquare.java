import java.awt.Color;
import java.util.ArrayList;

public class DataOfSquare {

	// ArrayList that'll contain the colors
	ArrayList<Color> C = new ArrayList<Color>();
	int color; // 0: background , 1: food, 2:snake - grey, 3:snake - red,
				// 4:snake - green
	SquarePanel square;

	public DataOfSquare(int col) {

		// Lets add the color to the arrayList
		C.add(Color.white); // 0
		C.add(Color.BLUE); // 1
		C.add(Color.darkGray);// 2
		C.add(Color.RED);// 3
		C.add(Color.GREEN);// 4
		color = col;
		square = new SquarePanel(C.get(color));
	}

	public void lightMeUp(int c) {
		square.ChangeColor(C.get(c));
	}
}
