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
        Person[] people = new Person[10];        
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Name of Person #" + (i + 1) + ": ");
            people[i] = new Person(scanner.next());
        }
        
        Person first = people[0];
        Person last = people[0];
        for (int j = 1; j < 10; j++)
        {
            Person person = people[j];
            
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