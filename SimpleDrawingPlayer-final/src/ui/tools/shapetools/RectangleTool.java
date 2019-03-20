package ui.tools.shapetools;

import model.shapes.Rectangle;
import ui.DrawingEditor;
import ui.tools.ShapeTool;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class RectangleTool extends ShapeTool {
    public RectangleTool(DrawingEditor editor, JComponent parent) {
        super(editor, parent);
    }

    @Override
    //EFFECTS: Returns the string for the label.
    protected String getLabel() {
        return "Rectangle";
    }

    @Override
    //EFFECTS: Constructs and returns the new rectangle
    protected void makeShape(MouseEvent e) {
        shape = new Rectangle(e.getPoint(), editor.getMidiSynth());
    }
}
