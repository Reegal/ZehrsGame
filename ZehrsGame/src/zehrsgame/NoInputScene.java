
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
        try {
            for (int i = 0; i < dialogue.length; i++) {
                m.setDialogue(dialogue[i]);
                
                Thread.sleep(4000);
            }
            
            
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
