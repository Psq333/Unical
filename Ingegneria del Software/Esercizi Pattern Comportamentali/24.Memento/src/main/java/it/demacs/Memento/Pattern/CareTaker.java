<<<<<<< HEAD
package it.demacs.Memento.Pattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> list = new ArrayList<Memento>();
	
	public void add(Memento state) {
		list.add(state);
	}
	
	public Memento get(int i) {
		return list.get(i);
	}
	
	public int size() {
		return list.size();
	}
}
=======
package it.demacs.Memento.Pattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> list = new ArrayList<Memento>();
	
	public void add(Memento state) {
		list.add(state);
	}
	
	public Memento get(int i) {
		return list.get(i);
	}
	
	public int size() {
		return list.size();
	}
}
>>>>>>> 55f6c0ef7f10c3f799f15517738eb0527620974e
