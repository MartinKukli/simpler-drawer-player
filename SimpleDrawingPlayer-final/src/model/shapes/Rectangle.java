package model.shapes;

import model.Shape;
import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
        instrument = 1;
        playingColor = new Color(0, 250, 0);
    }

    @Override
    //EFFECTS: draws the rectangle
    protected void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    //EFFECTS: fills the rectangle
    protected void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }
}
