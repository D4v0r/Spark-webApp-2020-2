package edu.escuelaing.arem.web;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class SparkWebApp
{
    public static void main( String[] args )
    {
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");;
        get("/hello/:name", ((request, response) ->{
            return "Hello, "+ request.params(":name")+" !!";
        } ));
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
