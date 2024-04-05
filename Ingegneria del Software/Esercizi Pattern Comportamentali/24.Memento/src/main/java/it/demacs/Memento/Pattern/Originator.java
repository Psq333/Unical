<<<<<<< HEAD
package it.demacs.Memento.Pattern;

public class Originator {
	
	private String state;
	
	public void SetMemento(String s) {
		state = s;
	}
	
	public Memento CreateMemento() {
		return new Memento(state);
	}
	
	public void getStateFromMemento(Memento memento){
	      state = memento.getState();
	   }
	
}
=======
package it.demacs.Memento.Pattern;

public class Originator {
	
	private String state;
	
	public void SetMemento(String s) {
		state = s;
	}
	
	public Memento CreateMemento() {
		return new Memento(state);
	}
	
	public void getStateFromMemento(Memento memento){
	      state = memento.getState();
	   }
	
}
>>>>>>> 55f6c0ef7f10c3f799f15517738eb0527620974e
