package it.polito.tdp.libretto;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.libretto.model.Libretto;
import it.polito.tdp.libretto.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
	
	Libretto model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttInserisci;

    @FXML
    private DatePicker calendarioDate;

    @FXML
    private ComboBox<Integer> tendinaVoti;

    @FXML
    private TextField txtNomeCorso;

    @FXML
    private TextArea txtOutput;
    
    void handleInserisci(ActionEvent event) {
    	String corso = this.txtNomeCorso.getText();
    	Integer voto = this.tendinaVoti.getValue();
    	LocalDate data = this.calendarioDate.getValue();
    	Voto v = new Voto (corso,voto,data);
    	model.add(v);

    }
    
    @FXML
    void initialize() {
        assert bttInserisci != null : "fx:id=\"bttInserisci\" was not injected: check your FXML file 'main.fxml'.";
        assert calendarioDate != null : "fx:id=\"calendarioDate\" was not injected: check your FXML file 'main.fxml'.";
        assert tendinaVoti != null : "fx:id=\"tendinaVoti\" was not injected: check your FXML file 'main.fxml'.";
        assert txtNomeCorso != null : "fx:id=\"txtNomeCorso\" was not injected: check your FXML file 'main.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'main.fxml'.";

    }
        
      
    
	public void setModel(Libretto model) {
		this.model = model;
	}

	
	

}
