package workshop3solution;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cookie {
    private Pane _cookiePane;
    private Circle _cookieBase;
    private Circle _chocChip1;
    private Circle _chocChip2;
    private Circle _chocChip3;
    private Circle _chocChip4;

    // Cookie Constructor
    public Cookie(Pane cookiePane) {
        // initialize _cookiePane instance variable
        _cookiePane = cookiePane;

        // make cookie base
        this.makeCookieBase();

        // add chocolate chips (1-4)
        _chocChip1 = this.addChocChip(28,40);
        _chocChip2 = this.addChocChip(-40,8);
        _chocChip3 = this.addChocChip(12,-2);
        _chocChip4 = this.addChocChip(19,-34);
        _chocChip4 = this.addChocChip(-24,-35);
        // forget to add to pane and have students catch the mistake!
        // students might ask "what if we added to the pane in addChocChip?"
        //  |-> this should be okay because we are assigning these shapes (line 24-28) by reference.
        _cookiePane.getChildren().addAll(_chocChip1, _chocChip2, _chocChip3, _chocChip4);
    }

    private void makeCookieBase(){
        // Instantiate cookie base
        _cookieBase = new Circle();
        _cookieBase.setFill(Color.BURLYWOOD);
        _cookieBase.setCenterX(Constants.COOKIE_POSITION);
        _cookieBase.setCenterY(Constants.COOKIE_POSITION);
        _cookieBase.setRadius(Constants.COOKIE_RADIUS);
        _cookiePane.getChildren().add(_cookieBase);
    }

    private Circle addChocChip(double x_pos, double y_pos){
            // Instantiate chocolate chip
            Circle myChocChip = new Circle();
            myChocChip.setFill(Color.ROSYBROWN);
            myChocChip.setCenterX(Constants.COOKIE_POSITION+x_pos);
            myChocChip.setCenterY(Constants.COOKIE_POSITION+y_pos);
            myChocChip.setRadius(Constants.CHOCO_CHIP_RADIUS);
            return myChocChip;
    }
}
