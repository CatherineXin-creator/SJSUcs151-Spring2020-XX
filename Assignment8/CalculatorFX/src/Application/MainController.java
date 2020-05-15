package Application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;


public class MainController {
    @FXML
    private Label result;
    private float n1 = 0;
    private String opr = "";
    private boolean start = true;
    private Test test = new Test();


    @FXML
    public void processNum(javafx.event.ActionEvent event){
        if (start) {
            result.setText("");
            start = false;
        }
            String value = ((Button)event.getSource()).getText();
            result.setText(result.getText() + value);
    }

    @FXML
    public void processOpr(javafx.event.ActionEvent event){
        String value = ((Button)event.getSource()).getText();

        if(!value.equals("=")){
            if(!opr.isEmpty())
                return;

                opr = value;
                n1 = Float.parseFloat(result.getText());
            result.setText("");
        }else{
            if(opr.isEmpty())
                return;

            float n2 = Float.parseFloat(result.getText()) ;
            float output = test.calculate(n1,n2,opr);
            result.setText(String.valueOf(output));
            opr = "";
            start = true;

        }
    }


}
