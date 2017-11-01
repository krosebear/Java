import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
// import java.util.HashMap;
public class HashMapping {
  public void printSongLyrics(){
    HashMap<String, String> trackList = new HashMap<>();
    trackList.put("Funny", "I have found myself diving into peanut butter");
    trackList.put("Serious", "I'll keep your number saved");
    trackList.put("Light", "Feathers keep me lifted");
    trackList.put("Dark", "My pride finds my, it roars");
    String track = trackList.get("Serious");
        System.out.println(track);

        for(String key : trackList.keySet()) {
            System.out.println(key + " : " + trackList.get(key));
        }
  }
}
