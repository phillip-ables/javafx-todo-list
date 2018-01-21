import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author user
 */
public class GuiController implements Initializable {    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        datePicker.setValue(LocalDate.now());
    }
    @FXML
    Button addButton;
    @FXML
    DatePicker datePicker;
    @FXML
    TextField descriptionTextField; 
    @FXML
    ListView<LocalEvent> eventList;
    
    //in order to populate the event list observable
    ObservableList<LocalEvent> list = FXCollections.observableArrayList();
    
    @FXML
    private void addEvent(Event e){
        
    };
    
}
