import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class SliderDemo extends Application
{


    public static void main(String[] args) 
    {
        //Launch the application
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)
    {
        //Create Label Controls.
        Label label1 = new Label("New Value");
        Label label2 = new Label("0.00");
        label2.setStyle("-fx-border-style: solid;" +
                        "-fx-border-alignment: center");
        label2.setPrefWidth(50.0);
        label2.setAlignment(Pos.CENTER);
        
      
        
        //Store in a HBox.
        HBox hbox = new HBox(10,label1, label2);
        hbox.setAlignment(Pos.CENTER);
        
        //Create Label Controls.
        Label label3 = new Label("Get Value");
        Label label4 = new Label("0.00");
        label4.setStyle("-fx-border-style: solid;" +
                        "-fx-border-alignment: center");
        label4.setPrefWidth(50.0);
        label4.setAlignment(Pos.CENTER);
        
        //Store in a HBox.
        HBox hbox2 = new HBox(10, label3, label4);
        hbox2.setAlignment(Pos.CENTER);
        
        //Create a Slider Object.
        Slider slider = new Slider(0.00, 1000.0, 0.00);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(100);
        slider.setMinorTickCount(5);
        slider.setShowTickLabels(true);
        slider.setSnapToTicks(true);
        slider.setPrefWidth(300);
        
        //Register an Event Handler.
        slider.valueProperty().addListener(
                (observable, oldValue, newValue) ->
                {
                    double value = slider.getValue();
                    
                    double answer = value * 2;
                    
                    label2.setText(String.format("%.2f", answer));
                    label4.setText(String.format("%.2f", value));
                    
                });
        
        //Store everything in a VBox.
        VBox vbox = new VBox(10, hbox, hbox2, slider);
        vbox.setAlignment((Pos.CENTER));
        
        //Create a Scene and display it.
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
}
