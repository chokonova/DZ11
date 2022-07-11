public final class OMRON extends Tonometr {
     private String model;
private String manufacturer;

    public OMRON(String model, String manufacturer, ShopTonometr shopTonometr, Type type, String name) {
        this.model = model;
        this.manufacturer = manufacturer;
super.setName(name);
        super.setShopTonometr(shopTonometr);
        super.setType(type);
    }
    public OMRON(String model, String manufacturer, ShopTonometr shopTonometr, Type type, String name,int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        super.setName(name);
        super.setShopTonometr(shopTonometr);
        super.setType(type);
   super.setYear(year);

    }



    @Override
    public String getInfo() {
        return super.getInfo()+"\nmodel "+model+
                "\nmanufacturer"+ manufacturer;

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void mekaVoice(){
        System.out.println("Piiik Piiik");
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }
}

