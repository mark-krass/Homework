import java.util.Scanner;

public class One extends Interpol{

private final double START = -1.0;
private final double SIZE = 2.0;
private int N;
	
public One() {
	Scanner in = new Scanner(System.in);
	System.out.print("Сколько частей у отрезка: ");
	N = in.nextInt();
	Chet();
}

private void Chet() {
	double x = START;
	double step = SIZE/(N-1);
	System.out.print("Ваше разбиение: ");
	for(int i = 0; i < N; i++)
	{
		Data obj = new Data();
		obj.setX(x);
		list.add(obj);
		System.out.print(x+", ");
		x = x + step;
	}
	System.out.println();
}
}