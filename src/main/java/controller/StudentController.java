package controller;

import dao.StudentDao;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;

/**
 * Created by Marcin Izworski on 11/05/2017.
 */
public class StudentController
{
    public static ModelAndView renderStudentsList(Request req, Response res)
    {
        HashMap params = new HashMap<>();
        params.put("studentsList", new StudentDao().getAllStudents());
        return new ModelAndView(params, "student/index");
    }

    public static ModelAndView renderEditStudent(Request req, Response res)
    {
        HashMap params = new HashMap<>();
        String chosenStudentId = req.params(":id");
        Integer studentId = Integer.parseInt(chosenStudentId);

        params.put("student", new StudentDao().getStudentById(studentId));
        return new ModelAndView(params, "student/edit");
    }
}
