package MVCArchitecture;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "ManagerServlet",
        urlPatterns = "/manager-record")
public class ManagerServlet extends HttpServlet {
    private ManagersService managersService = new ManagersService();
    private void processRequest(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String studentID = request.getParameter("id");
        if (studentID != null) {
            int id = Integer.parseInt(studentID);
            managersService.getManager(id)
                    .ifPresent(s -> request.setAttribute("managerRecord", s));
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(
                "/manager-record.jsp");
        dispatcher.forward(request, response);
    }
    @Override
    protected void doGet(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }
    @Override
    protected void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
