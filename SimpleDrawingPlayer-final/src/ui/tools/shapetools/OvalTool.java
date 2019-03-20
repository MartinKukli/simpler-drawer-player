package ui.tools.shapetools;

import model.shapes.Oval;
import ui.DrawingEditor;
import ui.tools.ShapeTool;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class OvalTool extends ShapeTool {
    public OvalTool(DrawingEditor editor, JComponent parent) {
        super(editor, parent);
    }

    @Override
    //EFFECTS: Returns the string for the label.
    protected String getLabel() {
        return "Oval";
    }

    @Override
    //EFFECTS: Constructs and returns the new oval
    protected void makeShape(MouseEvent e) {
        shape = new Oval(e.getPoint(), editor.getMidiSynth());
    }
}
