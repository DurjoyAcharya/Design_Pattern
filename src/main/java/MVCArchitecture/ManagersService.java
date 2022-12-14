package MVCArchitecture;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class ManagersService {
    public Optional<Managers> getManager(int id) {
        switch (id) {
            case 1:
                return Optional.of(new Managers(1, "John", "Doe"));
            case 2:
                return Optional.of(new Managers(2, "Jane", "Goodall"));
            case 3:
                return Optional.of(new Managers(3, "Max", "Born"));
            default:
                return Optional.empty();
        }
    }
}
