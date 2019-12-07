import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PrayTimeEvent extends ListenerAdapter {

    private PrayTime prayTime = new PrayTime();





    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();

        prayTime.calculate();

        if (message.equalsIgnoreCase("getprayertime"))
        {
            event.getChannel().sendMessage("Times are +- 1 to 2 minutes off"+"\n"+"Fajr: " + " " + prayTime.calculate().get(0)+ "\n" + "Sunrise: " + " " + prayTime.calculate().get(1)
            + "\n"+ "Dhuhr: " + prayTime.calculate().get(2) + "\n"+"Asr: " + prayTime.calculate().get(3)+"\n"+"Maghrib: "+ prayTime.calculate().get(4) + "\n"+"Isha: "+ prayTime.calculate().get(6)).queue();
        }
    }
}
