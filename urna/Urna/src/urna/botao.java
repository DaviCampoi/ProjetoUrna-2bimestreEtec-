/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author aluno
 */
public class botao {
    
    public void Som (String soundName)
           {
//        Media pick = new Media(som); 
//        MediaPlayer player = new MediaPlayer(pick);
//        player.play();
 try
              {
                 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
                 Clip clip = AudioSystem.getClip();
                 clip.open(audioInputStream);
                 clip.start();
            }
            catch (Exception ex)
           {
               System.out.println("Erro ao executar SOM!");
               ex.printStackTrace();
          }
        }
}

