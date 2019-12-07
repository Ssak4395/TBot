import java.util.ArrayList;
import java.util.Random;

public class StringRandomizer {

    private ArrayList<String> ProfaneRandomized;

    public StringRandomizer()
    {
        ProfaneRandomized = new ArrayList<>();
        ProfaneRandomized.add("https://cdn.baeblemusic.com/images/bblog/3-29-2019/e9c95cc6blog_cropped-580.jpg");
        ProfaneRandomized.add("https://a.wattpad.com/cover/173873321-256-k778089.jpg");
        ProfaneRandomized.add("https://pm1.narvii.com/6956/21d332eff726e656bf14ed0f830972bc1c795aa5r1-1075-1096v2_hq.jpg");
        ProfaneRandomized.add("https://i.pinimg.com/236x/7a/bb/f7/7abbf723be0cbfd62bc643d526922415--peeps.jpg");
        ProfaneRandomized.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRlEaOPNXh6fzh943HCdt0yFI0VQLKNIuT7N8XCIMqnxmGTYBGi&s");

    }

    public String getRandom()
    {
        Random random = new Random();
        return ProfaneRandomized.get(random.nextInt(ProfaneRandomized.size()));
    }
}
