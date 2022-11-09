package SolidPrinciple.ifp.solution;

import java.util.ArrayList;
import java.util.List;

public class BankPayment implements Payment<Long> {
    private static  List<Long> list;
    public BankPayment()
    {
        list=new ArrayList<>();
    }

    @Override
    public void initiatePayments(String args) {
    //Build Logic
        list.add(500L);
        System.out.println("InitiatePayments by "+args);
    }
    @Override
    public Long status() {
        return list.get(0);
    }
    @Override
    public List<Long> getPayments() {
        list.add(1000L);
        list.add(2000L);
        list.add(3000L);
        return list;
    }
}
