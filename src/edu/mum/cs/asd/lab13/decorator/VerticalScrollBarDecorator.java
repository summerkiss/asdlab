package edu.mum.cs.asd.lab13.decorator;

public class VerticalScrollBarDecorator extends WindowDecorator {
    public VerticalScrollBarDecorator (GUIContainer windowToBeDecorated) {
        super(windowToBeDecorated);
    }
    @Override
    public void paint() {
        super.paint();
        paintVerticalScrollBar();
    }
    private void paintVerticalScrollBar() {

    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", adding vertical scrollbar";
    }
}
