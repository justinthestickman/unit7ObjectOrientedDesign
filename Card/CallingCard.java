public class CallingCard extends Card
{
    private int cardNum;
    private int pin;
    
    public CallingCard(String n, int num, int pin)
    {
        super(n);
        this.cardNum = num;
        this.pin = pin;
    }
    
    public String format()
    {
        String str = super.format();
        str += ", Card Number: " + cardNum;
        str += ", PIN: " + pin;
        return str;
    }
    
    public String toString()
    {
        String str = "CallingCard[";
        str += "Name: " + this.getName() + "]";
        str += "[Card Number: " + this.cardNum + "]";
        str += "[PIN: " + this.pin + "]";
        return str;
    }
}