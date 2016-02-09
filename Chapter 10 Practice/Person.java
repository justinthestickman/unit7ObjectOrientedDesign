import java.util.Scanner;
import java.util.ArrayList;

public class Person implements Comparable<Person>
{
    private String name;
    
    public Person(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int compareTo(Person other)
    {
        return this.name.compareTo(other.name);
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<Person>();        
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Name of Person #" + (i + 1) + ": ");
            String name = scanner.next();
            Person person = new Person(name);
            people.add(person);
        }
        
        Person first = people.get(0);
        Person last = people.get(0);
        for (int j = 1; j < people.size(); j++)
        {
            Person person = people.get(j);
            
            if (person.compareTo(first) < 0)
            {
                first = person;
            }
            
            if (person.compareTo(last) > 0)
            {
                last = person;
            }
        }
        
        System.out.println("First: " + first.getName());
        System.out.println("Last: " + last.getName());
    }
}