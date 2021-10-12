package workshop3solution;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cookie {
    private Pane cookiePane;

    // Cookie Constructor
    public Cookie(Pane cookiePane) {
        // initialize this.cookiePane instance variable
        this.cookiePane = cookiePane;

        // make cookie base
        this.makeCookieBase();

        // add chocolate chips (1-4)
        this.addChocChip(28,40);
        this.addChocChip(-40,8);
        this.addChocChip(12,-2);
        this.addChocChip(-24,-35);

    }

    private void makeCookieBase(){
        // Instantiate cookie base
        Circle cookieBase = new Circle();
        cookieBase.setFill(Color.BURLYWOOD);
        cookieBase.setCenterX(Constants.COOKIE_POSITION);
        cookieBase.setCenterY(Constants.COOKIE_POSITION);
        cookieBase.setRadius(Constants.COOKIE_RADIUS);
        this.cookiePane.getChildren().add(cookieBase);
    }

    private void addChocChip(double x_pos, double y_pos){
        // Instantiate chocolate chip
        Circle myChocChip = new Circle();
        myChocChip.setFill(Color.ROSYBROWN);
        myChocChip.setCenterX(Constants.COOKIE_POSITION+x_pos);
        myChocChip.setCenterY(Constants.COOKIE_POSITION+y_pos);
        myChocChip.setRadius(Constants.CHOCO_CHIP_RADIUS);
        this.cookiePane.getChildren().add(myChocChip);
    }
}
