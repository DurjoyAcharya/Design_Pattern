package SolidPrinciple.ifp.solution;

import java.util.List;
public interface Payment<T> {
    void initiatePayments(String args);
    T status();
    List<T> getPayments();
}
