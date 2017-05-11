import controller.StudentController;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.sql.SQLException;

import  static spark.Spark.*;


public class Main {

    public static void main(String[] args) {

        exception(Exception.class, (e, req, res) -> e.printStackTrace());
        port(8888);

        // Always start with more specific routes
        get("/hello", (req, res) -> "Hello World");

        // list all students
        get("/students", StudentController::renderStudentsList, new ThymeleafTemplateEngine());

        // edit selected student
        get("/students/edit/:id", StudentController::renderEditStudent, new ThymeleafTemplateEngine());


    }


}