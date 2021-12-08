package ProtoType;


public class Book{
    private int bid;
    private String bname;

    public int getBid() {
        return bid;
    }
    public String getBname() {
        return bname;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book Id=" + bid +
                ", Book Name='" + bname + '\'' +
                '}';
    }
}
