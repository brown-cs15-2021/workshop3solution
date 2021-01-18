package workshop3solution;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cookie {
    public Cookie(Pane alienPane) {
        Circle circle = new Circle();
        circle.setFill(Color.YELLOW);
        circle.setCenterX(Constants.ALIEN_POSITION);
        circle.setCenterY(Constants.ALIEN_POSITION);
        circle.setRadius(Constants.ALIEN_RADIUS);
        //forget to add to pane and have students catch the mistake!
        alienPane.getChildren().add(circle);
    }
}
