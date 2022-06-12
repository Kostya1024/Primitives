public class Main {
    public static void main(String[] args) {

        double ticketPrice;
        int priceOfOneMile;
        int bonusMiles;

        ticketPrice = 529.99;
        priceOfOneMile = 20;

        int ticketPriceInRub = (int) ticketPrice;

        bonusMiles = ticketPriceInRub / priceOfOneMile;

        System.out.println("За приобретенный Вами билет стоимостью: " + ticketPriceInRub + " рублей, Вы получите: " + bonusMiles + " бонусных миль");
    }
}