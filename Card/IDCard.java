public class IDCard extends Card
{
    private String idNumber;
    
    public IDCard(String n, String id)
    {
        super(n);
        this.idNumber = id;
    }
    
    public String format()
    {
        String str = super.format();
        str += ", ID Number: " + idNumber;
        return str;
    }
}