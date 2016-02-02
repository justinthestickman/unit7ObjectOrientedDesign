public class CallingCard extends Card
{
    private String cardNumber;
    private String pin;
    
    public CallingCard(String n, String num, String pin)
    {
        super(n);
        this.cardNumber = num;
        this.pin = pin;
    }
    
    public String format()
    {
        String str = super.format();
        str += ", Card Number: " + cardNumber;
        str += ", PIN: " + pin;
        return str;
    }
}