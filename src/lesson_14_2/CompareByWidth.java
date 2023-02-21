package lesson_14_2;

import java.util.Comparator;

public class CompareByWidth implements Comparator<Commodity>{

	@Override
	public int compare(Commodity c1, Commodity c2) {
	
		return c1.getWidth() < c2.getWeight() ? 1 : -1;
	}

}
