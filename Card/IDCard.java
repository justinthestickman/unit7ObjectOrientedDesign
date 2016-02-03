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
    
    public boolean equals(Object other)
    {
        // first, check if this object and the other object are of the same class
        if (this.getClass() == other.getClass())
        {
            // if so, cast the other object to an IDCard
            IDCard otherIDCard = (IDCard) other;
            // second, check if the superclass (Card) determines that this object and the other
            // object are equal
            boolean isEqual = super.equals(otherIDCard);
            
            // third, check if the instance variables of this object and the other object are equal
            return isEqual && this.idNumber.equals(otherIDCard.idNumber);
        }
        return false;
    }
}