package edu.mum.cs.asd.lab13.decorator;

import edu.mum.cs.asd.lab13.decorator.GUIContainer;

public abstract class WindowDecorator implements GUIContainer{
    protected GUIContainer windowToBeDecorated;
    public WindowDecorator (GUIContainer windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }
    @Override
    public void paint() {
        windowToBeDecorated.paint();
    }
    @Override
    public String getDescription() {
        return windowToBeDecorated.getDescription();
    }
}
