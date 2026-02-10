import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class MyAssistant {
    public static void main(String[] args) {
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("kevin16"); // default voice
        if (voice != null) {
            voice.allocate(); // allocate resources
            voice.speak("Hello, I am your personal assistant in Java!");
            voice.deallocate();
        } else {
            System.out.println("Voice not found.");
        }
    }
}
