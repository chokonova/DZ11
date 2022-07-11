import java.time.Year;

public class Main {
    public static void main(String[] args) {

        ShopTonometr shopTonometr = new ShopTonometr("PLAZMA","DJAL ARTIS20");
        OMRON omron= new OMRON("L23", "KYRGYZSTAN", shopTonometr,Type.AUTO, "OMRON" );
        System.out.println(omron.getInfo());
        omron.mekaVoice();

        System.out.println("----------------------------------------------------------------------------------");

        OMRON livemax= new OMRON("mbassik", "USA", shopTonometr,Type.MECHANICAL, "livemax", 2022);
        System.out.println(livemax.getInfo());
        livemax.mekaVoice();
    }
}