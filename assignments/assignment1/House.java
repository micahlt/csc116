import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class House extends Application {
    @Override
    public void start(Stage stage) {
        Rectangle houseMain = new Rectangle(100, 150, 300, 300);
        houseMain.setFill(Color.web("#ef233c"));

        Rectangle ground = new Rectangle(0, 450, 500, 500);
        ground.setFill(Color.web("#9ec1a3"));

        Polygon smoke = new Polygon();
        smoke.getPoints().addAll(new Double[] {
                175.0, 80.0,
                150.0, 0.0,
                200.0, 0.0 });
        smoke.setFill(Color.web("#bbbbbb"));

        Ellipse cloud1 = new Ellipse(50, 70, 100, 20);
        cloud1.setFill(Color.web("#ffffff"));

        Ellipse cloud2 = new Ellipse(150, 40, 150, 22);
        cloud2.setFill(Color.web("#ffffff"));

        Ellipse cloud3 = new Ellipse(400, 65, 100, 22);
        cloud3.setFill(Color.web("#ffffff"));

        Rectangle chimney = new Rectangle(150, 50, 50, 150);
        chimney.setFill(Color.web("#6a040f"));

        Polygon roof = new Polygon();
        roof.getPoints().addAll(new Double[] {
                50.0, 150.0,
                450.0, 150.0,
                250.0, 75.0 });
        roof.setFill(Color.web("#370617"));

        Rectangle door = new Rectangle(300, 300, 75, 150);
        door.setFill(Color.web("#9a031e"));

        Circle knob = new Circle(360, 380, 5);
        knob.setFill(Color.web("#f08080"));

        Rectangle windowTop = new Rectangle(125, 200, 250, 75);
        windowTop.setFill(Color.web("#a8dadc"));

        Rectangle windowSide1 = new Rectangle(125, 300, 70, 100);
        windowSide1.setFill(Color.web("#a8dadc"));

        Rectangle windowSide2 = new Rectangle(210, 300, 70, 100);
        windowSide2.setFill(Color.web("#a8dadc"));

        Pane pane = new Pane();
        pane.getChildren().addAll(cloud1, cloud2, cloud3, smoke, chimney, roof, houseMain, ground, door, knob,
                windowTop, windowSide1,
                windowSide2);
        Scene scene = new Scene(pane, 500, 500);
        scene.setFill(Color.web("#caf0f8"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
