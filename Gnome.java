public class Gnome extends Race{

    public Gnome(Being b) {
    	super("Gnome");
    	b.agi += 2;
    	b.str += 1;
    	b.tHP -= 1;
    }
    
    
}