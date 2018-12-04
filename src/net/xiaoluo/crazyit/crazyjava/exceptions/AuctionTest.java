package net.xiaoluo.crazyit.crazyjava.exceptions;

public class AuctionTest {
    private double initPrice = 30.0;

    public void bid(String bidPrice) throws AuctionException {
        double d = 0;
        try {
            d = Double.parseDouble(bidPrice);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AuctionException("bid price must be a number");
        }
        if (initPrice > d) {
            throw new AuctionException("bid price must be higher than initial price");
        }
        initPrice = d;
    }

    public static void main(String[] args) {
        AuctionTest at = new AuctionTest();
        try {
            at.bid("df");
        } catch (AuctionException ae) {
            System.err.println(ae.getMessage());
        }
    }
}

class AuctionException extends Exception {
    public AuctionException() {
    }

    public AuctionException(String message) {
        super(message);
    }
}
