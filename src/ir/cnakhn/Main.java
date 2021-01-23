package ir.cnakhn;

public class Main {

    public static void main(String[] args) {
        StockGrabber grabber = new StockGrabber();
        StockObserver observer = new StockObserver(grabber);

        grabber.setIbmPrice(197.00);
        grabber.setAaplPrice(677.60);
        grabber.setGoogPrice(676.40);

        Runnable getIBM = new GetTheStock(grabber, 2, "IBM", 197.00);
        Runnable getAAPL = new GetTheStock(grabber, 2, "AAPL", 677.60);
        Runnable getGOOG = new GetTheStock(grabber, 2, "GOOG", 676.40);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();


    }
}
