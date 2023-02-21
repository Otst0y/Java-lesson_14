package lesson_14_2;

import java.util.Comparator;

public class CompareByLength implements Comparator<Commodity>{

	

	@Override
	public int compare(Commodity c1, Commodity c2) {
		
		return c1.getLength() < c2.getLength() ? 1 : -1;
	}

}
