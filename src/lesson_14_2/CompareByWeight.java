package lesson_14_2;

import java.util.Comparator;

public class CompareByWeight implements Comparator<Commodity>{

	@Override
	public int compare(Commodity c1, Commodity c2) {
		
		return c1.getWeight() < c2.getWidth() ? 1 : -1;
	}

}
