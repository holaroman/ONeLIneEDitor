package OneLineEditor;


import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textField1;
    public Button saveButton;
    public TextArea myBigArea;
    public ListView bigList;

public void userSavedText(){

    String textToSave = textField1.getText();
    myBigArea.setText(textToSave);
    textField1.setText("");
    System.out.println(textToSave);
    saveButton.setText("Saved");
    bigList.getItems().add(textToSave);


}




}
