public class BillfoldTester
{
    public static void main(String[] args)
    {
        Billfold billfold = new Billfold();
        IDCard card1 = new IDCard("Bill","12345");
        DriverLicense card2 = new DriverLicense("Joe",2000);
        billfold.addCard(card1);
        billfold.addCard(card2);
        System.out.println(billfold.formatCards());
    }
}