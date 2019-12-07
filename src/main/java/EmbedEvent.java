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
             embedBuilder.setImage(new StringRandomizer().getRandom());
            event.getChannel().sendMessage(embedBuilder.build()).queue();

        }



    }
}
