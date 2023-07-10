import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class HelloEvent extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] message = event.getMessage().getContentRaw().split(" ");

        if (message[0].equalsIgnoreCase("hello") | message[0].equalsIgnoreCase("Salam")|message[0].equalsIgnoreCase("hi")) //{
            if (!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage("hello" + " " + event.getAuthor().getName()).queue();
                //   }
                // System.out.println(event.getAuthor().getName());
            }

    }
}

