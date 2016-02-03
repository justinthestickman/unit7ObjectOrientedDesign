public class Billfold
{
    private Card card1;
    private Card card2;
    public void addCard(Card card)
    {
        if (card1 == null)
        {
            this.card1 = card;
        }
        else if (card2 == null)
        {
            this.card2 = card;
        }
    }
    
    public String formatCards()
    {
        String str1 = "";
        String str2 = "";
        if (card1 != null)
        {
            str1 = card1.format();
        }
        if (card2 != null)
        {
            str2 = card2.format();
        }
        return "[" + str1 + " | " + str2 + "]";
    }
    
    public int getExpiredCardCount()
    {
        int counter = 0;
        if (card1.isExpired() == true)
        {
            counter++;
        }
        if (card2.isExpired() == true)
        {
            counter++;
        }
        return counter;
    }
}