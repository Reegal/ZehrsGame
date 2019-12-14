
package zehrsgame;

public class NoInputScene {
    String name;
    String[] dialogue;
    
    public NoInputScene(String name, String[] dialogue){
        this.name = name;
        
        this.dialogue = dialogue;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDialogue() {
        return dialogue;
    }

    public void setDialogue(String[] dialogue) {
        this.dialogue = dialogue;
    }
    
    public void playScene(Display d, Menu m){
        d.setCharacter(name);
        d.repaint();
        
        String s = "";
        
        for (int i = 0; i < dialogue.length; i++) {
                s+=dialogue[i] + "\n";
             
        }
        
        m.setDialogue(s);
        
    }
}
