package it.demacs.Strategy.Pattern;

import java.util.List;

public class OrdinamentoCrescenteDecrescente  implements Strategy {

	@Override
	public void stampaArray(List<Integer> l) {
		for(int i = l.size()/2; i < l.size(); ++i)
			System.out.println(l.get(i));
		for(int i = 0; i < l.size()/2; ++i)
			System.out.println(l.get(i));
	}
}
