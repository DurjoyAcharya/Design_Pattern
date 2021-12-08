package ProtoType;
//ref telesku
public class ProtoTypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        var bs=new BookShop();
        bs.setShopName("Anupom Book Store");
        bs.loadData();
        bs.getBookList().remove(2);
        System.out.println(bs);
        System.out.println("------------------------------------");
        var bs1=bs.clone();
        bs1.setShopName("Shohag Book Store");
        bs1.loadData();
        System.out.println(bs1);
    }
}
