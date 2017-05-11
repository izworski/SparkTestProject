package model;

/**
 * Created by Marcin Izworski on 11/05/2017.
 */
public class Student
{
    private static int nextAvailableID = 0;

    private int id;
    private String first_name;
    private String last_name;

    public Student(String first_name, String last_name)
    {
        this.id = getNextAvailableId(); // I generate unique id by myself - normally it's database's job
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getId()
    {
        return this.id;
    }

    public String getFirstName()
    {
        return this.first_name;
    }

    public String getLastName()
    {
        return this.last_name;
    }

    private int getNextAvailableId()
    {
        nextAvailableID +=1;
        return nextAvailableID;
    }
}
