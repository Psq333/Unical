<<<<<<< HEAD
package it.demacs.Memento;

import it.demacs.Memento.Pattern.CareTaker;
import it.demacs.Memento.Pattern.Originator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MementoController {

    @FXML
    private TextArea text_area;

    int primo = 0;
    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator();
    int num = 0, cont = 0;
    
    @FXML
    private Button undo_btn;
    
    boolean b = true;
    
    private void alert(String m) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(m);
		alert.setHeaderText("");
		alert.setContentText(m);
		alert.showAndWait();
    }
    
    public void initialize() {
    	text_area.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if(b && text_area.getText().length() > cont) {
				if(text_area.getText().lastIndexOf(" ") != -1 && primo != text_area.getText().lastIndexOf(" ")) {
					originator.SetMemento(text_area.getText(primo,text_area.getText().lastIndexOf(" ")));
					careTaker.add(originator.CreateMemento());
					primo = text_area.getText().lastIndexOf(" ");
					num++;
					for(int i = 0; i < num; ++i) {
						if( i == 0)
							System.out.println("----------");
							System.out.println(careTaker.get(i).getState());
						}
						cont = text_area.getText().length();
					}
				}
			}
        });
	}

    @FXML
    void undo_clicked(ActionEvent event) throws Exception {
    	b = false;
    	String last = "";
    	last = text_area.getText().split(" ")[(text_area.getText().split(" ").length)-1];
    	int int_elemento = -1;//text_area.getText().split(" ").length-1;
    	System.out.println("last " + last);
    	boolean esci = true;
    	System.out.println(careTaker.size());
    	for(int i = 0; i < careTaker.size() && esci; ++i) {
    		System.out.println(i);
    		System.out.println(careTaker.get(i).getState().replace(" ", "") + " - " + last);
    		if(careTaker.get(i).getState().replace(" ","").equals(last)) {
    			int_elemento = i;
    			esci = false;
    		}
    	}
    	if(int_elemento+1 >= careTaker.size()) return;
    	//if(int_elemento == 0) return;
    	
    	text_area.appendText(careTaker.get(int_elemento+1).getState());
    	
    }

}
=======
package it.demacs.Memento;

import it.demacs.Memento.Pattern.CareTaker;
import it.demacs.Memento.Pattern.Originator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MementoController {

    @FXML
    private TextArea text_area;

    int primo = 0;
    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator();
    int num = 0, cont = 0;
    
    @FXML
    private Button undo_btn;
    
    boolean b = true;
    
    private void alert(String m) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(m);
		alert.setHeaderText("");
		alert.setContentText(m);
		alert.showAndWait();
    }
    
    public void initialize() {
    	text_area.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if(b && text_area.getText().length() > cont) {
				if(text_area.getText().lastIndexOf(" ") != -1 && primo != text_area.getText().lastIndexOf(" ")) {
					originator.SetMemento(text_area.getText(primo,text_area.getText().lastIndexOf(" ")));
					careTaker.add(originator.CreateMemento());
					primo = text_area.getText().lastIndexOf(" ");
					num++;
					for(int i = 0; i < num; ++i) {
						if( i == 0)
							System.out.println("----------");
							System.out.println(careTaker.get(i).getState());
						}
						cont = text_area.getText().length();
					}
				}
			}
        });
	}

    @FXML
    void undo_clicked(ActionEvent event) throws Exception {
    	b = false;
    	String last = "";
    	last = text_area.getText().split(" ")[(text_area.getText().split(" ").length)-1];
    	int int_elemento = -1;//text_area.getText().split(" ").length-1;
    	System.out.println("last " + last);
    	boolean esci = true;
    	System.out.println(careTaker.size());
    	for(int i = 0; i < careTaker.size() && esci; ++i) {
    		System.out.println(i);
    		System.out.println(careTaker.get(i).getState().replace(" ", "") + " - " + last);
    		if(careTaker.get(i).getState().replace(" ","").equals(last)) {
    			int_elemento = i;
    			esci = false;
    		}
    	}
    	if(int_elemento+1 >= careTaker.size()) return;
    	//if(int_elemento == 0) return;
    	
    	text_area.appendText(careTaker.get(int_elemento+1).getState());
    	
    }

}
>>>>>>> 55f6c0ef7f10c3f799f15517738eb0527620974e
