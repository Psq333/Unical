package it.demacs.Strategy.Pattern;

import java.util.List;

public class OrdinamentoCrescente implements Strategy {

	@Override
	public void stampaArray(List<Integer> l) {
		for(int i = 0; i < l.size(); ++i)
			System.out.println(l.get(i));
	}

}
