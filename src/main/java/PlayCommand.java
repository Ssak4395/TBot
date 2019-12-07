import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import net.dv8tion.jda.api.entities.GuildVoiceState;
import net.dv8tion.jda.api.entities.VoiceChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;

public class PlayCommand extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {

        String message = event.getMessage().getContentRaw();


        if(message.equalsIgnoreCase("$join"))
        {
            AudioManager audioManager = event.getGuild().getAudioManager();
            GuildVoiceState memberVoiceState = event.getMember().getVoiceState();

            VoiceChannel voiceChannel = memberVoiceState.getChannel();

            audioManager.closeAudioConnection();

            audioManager.openAudioConnection(voiceChannel);
        }




        if(message.equalsIgnoreCase("$play")){



            PlayerManager manager = PlayerManager.getInstance();

            manager.loadAndPlay(event.getChannel(),"https://www.youtube.com/watch?v=8JnfIa84TnU");

            manager.getGuildMusicManager(event.getGuild()).player.setVolume(10);
        }


    }
}
