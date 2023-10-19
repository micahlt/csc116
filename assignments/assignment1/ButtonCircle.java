import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.util.Random;

public class ButtonCircle extends Application {
    @Override
    public void start(Stage stage) {
        Random rand = new Random();
        Circle circle = new Circle(250, 250, 25);
        circle.setFill(Color.web("#ff3a3a"));
        Button button = new Button("Click me");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                circle.setCenterX(rand.nextInt(500));
                circle.setCenterY(rand.nextInt(500));
            }
        });

        Pane pane = new Pane();
        pane.getChildren().addAll(button, circle);
        Scene scene = new Scene(pane, 500, 500);
        scene.setFill(Color.BLACK);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
