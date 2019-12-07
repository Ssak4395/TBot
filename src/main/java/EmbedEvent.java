import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class EmbedEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
        EmbedBuilder embedBuilder = new EmbedBuilder();


        ArrayList<String> URLlist = new ArrayList<>();
        URLlist.add("https://cdn.baeblemusic.com/images/bblog/3-29-2019/e9c95cc6blog_cropped-580.jpg");
        URLlist.add("https://a.wattpad.com/cover/173873321-256-k778089.jpg");
        URLlist.add("https://pm1.narvii.com/6956/21d332eff726e656bf14ed0f830972bc1c795aa5r1-1075-1096v2_hq.jpg");
        URLlist.add("https://i.pinimg.com/236x/7a/bb/f7/7abbf723be0cbfd62bc643d526922415--peeps.jpg");
        URLlist.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRlEaOPNXh6fzh943HCdt0yFI0VQLKNIuT7N8XCIMqnxmGTYBGi&s");




        String message = event.getMessage().getContentRaw();

        if(message.equalsIgnoreCase("$hornyazzam"))
        {
            embedBuilder.setTitle("Horny boy ");
            embedBuilder.setColor(Color.CYAN);
            embedBuilder.addField("Azzam is horny","Send Nudes baby i got the vaseline ready",true);

            embedBuilder.setImage("https://cdn.discordapp.com/attachments/475447807184994307/651433045693562911/IMG_20191204_014145.jpg");
            event.getChannel().sendMessage(embedBuilder.build()).queue();

        }

        if(message.equalsIgnoreCase("$fuckellish"))
        {
            embedBuilder.setTitle("Finally someone with good taste");
            embedBuilder.setColor(Color.BLUE);
            embedBuilder.addField("Fuck Eillish","This is suppose to be a role model, let that sink in for a moment.",true);
            Random random = new Random();
embedBuilder.setImage(URLlist.get(random.nextInt(URLlist.size())));
            event.getChannel().sendMessage(embedBuilder.build()).queue();

        }



    }
}
