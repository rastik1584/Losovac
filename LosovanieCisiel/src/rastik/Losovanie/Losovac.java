package rastik.Losovanie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Losovac {

	public static void main(String args[]) throws IOException {

		char zn1;
		int i, a, s, g, e, f;
		Random randomGenerator = new Random();

		ArrayList<Integer> los = new ArrayList<Integer>();

		zn1 = (char) System.in.read();
		if (zn1 == '1') {
			i = randomGenerator.nextInt(42);
			a = randomGenerator.nextInt(42);
			s = randomGenerator.nextInt(42);
			g = randomGenerator.nextInt(42);
			e = randomGenerator.nextInt(42);
			f = randomGenerator.nextInt(42);
			los.add(i);
			los.add(a);
			los.add(s);
			los.add(g);
			los.add(e);
			los.add(f);
			System.out.println(los);
		} else if (zn1 == '2') {
			i = randomGenerator.nextInt(100);
			a = randomGenerator.nextInt(100);
			s = randomGenerator.nextInt(100);
			g = randomGenerator.nextInt(100);
			e = randomGenerator.nextInt(100);
			f = randomGenerator.nextInt(100);
			los.add(i);
			los.add(a);
			los.add(s);
			los.add(g);
			los.add(e);
			los.add(f);
			System.out.println(los);
		}

	}

}