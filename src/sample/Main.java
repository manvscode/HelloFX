package sample;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        final Group root = new Group();
        final Scene scene = new Scene(root, 600, 500, Color.BLACK);

        final Image icon = new Image("sample/img.png");
        stage.getIcons().add(icon);


        Text text = new Text("Hello World");
        text.setTextAlignment(TextAlignment.CENTER);
        text.setFont(Font.font("Verdana", 70));
        text.setFill(Color.YELLOW);
        text.setStroke(Color.RED);
        text.setStrokeWidth(1);
        text.setX(60);
        text.setY(60);
        root.getChildren().add(text);

        final Line line = new Line(50, 70, 500, 450);
        line.setStroke(Color.RED);
        line.setStrokeWidth(5);
        root.getChildren().add(line);

        final Rectangle rectangle = new Rectangle(100, 100, Color.LIMEGREEN);
        rectangle.setX(110);
        rectangle.setY(300);
        rectangle.setStroke(Color.RED);
        rectangle.setStrokeWidth(2);
        root.getChildren().add(rectangle);


        final Polygon triangle = new Polygon();
        triangle.setFill(Color.LIGHTSKYBLUE);
        triangle.setStroke(Color.RED);
        triangle.setStrokeWidth(2);

        final Point2D position = new Point2D(400, 200);
        for (int i = 0; i < 3; i += 1) {
            triangle.getPoints().add(position.getX() + 100 * Math.cos(Math.toRadians(120 * i)));
            triangle.getPoints().add(position.getY() + 100 * Math.sin(Math.toRadians(120 * i)));
        }
        root.getChildren().add(triangle);


        final Circle circle = new Circle(300, 300, 30);
        circle.setFill(Color.ORANGE);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(2);
        root.getChildren().add(circle);

        stage.setResizable(false);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Hello World");
        stage.show();
    }
}
