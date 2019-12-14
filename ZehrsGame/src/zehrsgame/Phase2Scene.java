
package zehrsgame;

import java.util.ArrayList;


public class Phase2Scene {
    String character;
    
    ArrayList<String> description;
    
    ArrayList<String[]> dialogue;
    
    public Phase2Scene(String character, ArrayList<String> description, ArrayList<String[]> dialogue){
        this.character = character;
        this.description = description;
        this.dialogue = dialogue;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }

    public ArrayList<String[]> getDialogue() {
        return dialogue;
    }

    public void setDialogue(ArrayList<String[]> dialogue) {
        this.dialogue = dialogue;
    }

    
    public void playScene(Display d, Menu m, int n){
        d.setCharacter(character);
        d.repaint();
        try {
            for (int i = 0; i < dialogue.get(n).length; i++) {
                m.setDialogue(dialogue.get(n)[i]);
                
                Thread.sleep(4000);
            }
            
            
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
}
