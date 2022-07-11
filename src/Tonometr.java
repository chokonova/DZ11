import javax.naming.Name;

public class Tonometr {
    private String name;
    private int year;

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    private Type type;
    private ShopTonometr shopTonometr;

    public ShopTonometr getShopTonometr() {
        return shopTonometr;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setShopTonometr(ShopTonometr shopTonometr) {
        this.shopTonometr = shopTonometr;
    }

    public String getInfo(){
        return " name "  +name+
        "\nyear "+year+
                "\n Shop name" +shopTonometr.getName()+
                "\nShop adress" + shopTonometr.getAddress()+
                "\nType " +type;

    }
}

