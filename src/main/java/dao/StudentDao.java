package dao;

import model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Izworski on 11/05/2017.
 */
public class StudentDao
{
    private ArrayList<Student> students = null;

    public List<Student> getAllStudents()
    {
        // students should be loaded from a database, but I'm mocking it ATM
        if(students == null)
        {
            students = new ArrayList<Student>();

            students.add(new Student("Jan", "Kowalski"));
            students.add(new Student("Adam", "Nowak"));
            students.add(new Student("Izabela", "Malinowska"));
        }

        return students;
    }

    public Student getStudentById(int id)
    {
        for(Student student: students)
        {
            if(id == student.getId())
            {
                return student;
            }
        }

        // if student is not on a list
        return null;
    }

}
