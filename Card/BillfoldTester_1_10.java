public class BillfoldTester_1_10
{
    public static void main(String[] args)
    {
        Billfold billfold = new Billfold();
        CallingCard callingCard = new CallingCard("Joe",1234567890,1234);
        DriverLicense driverLicense = new DriverLicense("Jim",2000);
        billfold.addCard(callingCard);
        billfold.addCard(driverLicense);
        System.out.println(billfold.getExpiredCardCount());
    }
}