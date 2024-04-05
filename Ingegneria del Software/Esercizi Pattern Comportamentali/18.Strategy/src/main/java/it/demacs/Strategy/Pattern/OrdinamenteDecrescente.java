package it.demacs.Strategy.Pattern;

import java.util.List;

public class OrdinamenteDecrescente  implements Strategy {

	@Override
	public void stampaArray(List<Integer> l) {
		for(int i = 0; i < l.size(); ++i)
			System.out.println(l.get((l.size()-1)- i));
	}
}
