public class Elf extends Race{

    public Elf(Being b) {
    	super("Elf");
    	b.wis += 2;
    	b.tMP += 5;
    	b.tHP -= 2;
    }
    
    
}