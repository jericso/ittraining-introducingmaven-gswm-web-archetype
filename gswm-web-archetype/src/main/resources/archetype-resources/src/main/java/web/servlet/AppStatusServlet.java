#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/status")
public class AppStatusServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("OK");
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
