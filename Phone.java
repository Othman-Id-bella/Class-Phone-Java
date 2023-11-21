public class pohone{
    String name;
    int storage;
    String serialNum;
    double price;

    public void info(){
        System.out.println("Phone Details:");
        System.out.println("name"+name);
        System.out.println("serialNum"+serialNum);
        System.out.println("Storage Capacity: " + storage+ "GB");
        System.out.println("and his price"+price+"euro");
}
