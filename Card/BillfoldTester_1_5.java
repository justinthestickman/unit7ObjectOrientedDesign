public class BillfoldTester_1_5
{
    public static void main(String[] args)
    {
        Billfold billfold = new Billfold();
        IDCard card1 = new IDCard("Bob","12345");
        DriverLicense card2 = new DriverLicense("Bill",2000);
        billfold.addCard(card1);
        billfold.addCard(card2);
        System.out.println(billfold.formatCards());
    }
}