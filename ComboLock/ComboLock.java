public class ComboLock
{
    private int secret1;
    private int secret2;
    private int secret3;
    
    private int lockState;
    
    private int currentNumber;
    private boolean validSoFar;
    
    public ComboLock(int secret1, int secret2, int secret3)
    {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }
    
    public void reset()
    {
        this.lockState = 1;
        this.currentNumber = 0;
        this.validSoFar = false;
    }
    
    public void turnLeft(int ticks)
    {
        currentNumber = (currentNumber + ticks) % 40;
        if (lockState == 1)
        {
            if (currentNumber == secret2)
            {
                lockState = 2;
            }
        }
        else
        {
            validSoFar = false;
        }
    }
    
    public void turnRight(int ticks)
    {
        currentNumber = (currentNumber - ticks + 40) % 40;
        if (lockState == 0)
        {
            if (currentNumber == secret1)
            {
                lockState = 1;
            }
        }
        else if (lockState == 2)
        {
            lockState = 3;
        }
        else
        {
            validSoFar = false;
        }
    }
    
    public boolean open()
    {
        return lockState == 3 && validSoFar;
    }
}