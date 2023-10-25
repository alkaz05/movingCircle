package com.example.movingcircle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Circle myCircle;

    @FXML
    Slider speedSlider;

    //double speed=10;

    @FXML
    void moveLeft() {
        double x = myCircle.getCenterX();
        x-=speedSlider.getValue();
        myCircle.setCenterX(x);
    }

    @FXML
    void moveRight() {
        double x = myCircle.getCenterX();   //узнаем, где сейчас окружность
        x+=speedSlider.getValue();          //вычисляем новую координату по оси x
        myCircle.setCenterX(x);             //телепортируем окружность на новое место
    }

    @FXML
    void moveUp() {
        double y = myCircle.getCenterY();
        y-=speedSlider.getValue();
        myCircle.setCenterY(y);
    }

    @FXML
    void moveDown() {
        double y = myCircle.getCenterY();
        y+=speedSlider.getValue();;
        myCircle.setCenterY(y);
    }


}
