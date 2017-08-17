package edu.mum.cs.asd.lab5.command;

public class Receiver {
        public boolean buy(Order o){
            boolean result = true;
            return result;
        }

        public boolean sell(Order o){
            boolean result = true;
            return result;
        }

        public boolean cancel(Order o){
            boolean result = true;
            if (o.getStatus().equals(Order.STATUS.NOTFILLED)){

            }else {
                result = false;
            }

            return result;
        }
}
