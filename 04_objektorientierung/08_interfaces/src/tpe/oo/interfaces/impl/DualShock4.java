package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements DigitalController,AnalogController
{
   private DigitalController digStick = new DigitalControllerImpl();
   private AnalogController anaStick = new AnalogControllerImpl();


    @Override
    public void up(double percentage) {
        anaStick.up(percentage);

    }

    @Override
    public void down(double percentage) {
        anaStick.down(percentage);

    }

    @Override
    public void left(double percentage) {
        anaStick.left(percentage);

    }

    @Override
    public void right(double percentage) {
        anaStick.right(percentage);

    }

    @Override
    public void up() {
        digStick.up();

    }

    @Override
    public void down() {
        digStick.down();

    }

    @Override
    public void left() {
        digStick.left();

    }

    @Override
    public void right() {
        digStick.right();

    }

    @Override
    public Point getPosition() {
        Point resultAnalog = anaStick.getPosition();
        Point resultDig = digStick.getPosition();
        Point result = new Point();
        result.x = resultAnalog.x + resultDig.x;
        result.y = resultAnalog.y + resultDig.y;
        return result;
    }


}
