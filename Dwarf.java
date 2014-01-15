public class Dwarf extends Race{

	public Dwarf(Being b){
		super("Dwarf");
		b.str += 2;
		b.tHP += 2;
		b.tMP -= 3;
		b.wis -= 2;
	}
}