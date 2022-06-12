public class Main {
    public static void main(String[] args) {

        double ticketPrice; // Цена билета с копейками
        int priceOfOneMile; // Стоимость одной бонусной мили
        int bonusMiles; // Количество полученных бонусных миль

        ticketPrice = 529.99;
        priceOfOneMile = 20;

        int ticketPriceInRub = (int) ticketPrice; // Цена билета в рублях без копеек

        bonusMiles = ticketPriceInRub / priceOfOneMile;

        System.out.println("За приобретенный Вами билет стоимостью: " + ticketPriceInRub + " рублей, Вы получите: " + bonusMiles + " бонусных миль");
    }
}