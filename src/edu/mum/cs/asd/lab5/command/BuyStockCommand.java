package edu.mum.cs.asd.lab5.command;

public class BuyStockCommand implements Command{
    Receiver receiver = new Receiver();
    private Order order;

    public BuyStockCommand(Order order) {
        this.order = order;
    }

    @Override
    public boolean undo() {
        return receiver.cancel(order);
    }

    @Override
    public boolean execute() {
       return this.receiver.buy(order);
    }
}
