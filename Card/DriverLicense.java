public class DriverLicense extends Card
{
    private int expirationYear;
    
    public DriverLicense(String n, int expYear)
    {
        super(n);
        this.expirationYear = expYear;
    }
    
    public String format()
    {
        String str = super.format();
        str += ", Expiration Year: " + expirationYear;
        return str;
    }
}