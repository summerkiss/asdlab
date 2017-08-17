package edu.mum.cs.asd.lab5.command;

public class Order {
    private String symbol;
    private TYPE type;
    private double quantity;
    private double price;
    private STATUS status;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public static enum TYPE {
        BUY, SELL;
    }

    public static  enum STATUS{
        FULLFILLED,
        PARTIALLYFILLED,
        NOTFILLED,
        CANCELED;
    }

}
