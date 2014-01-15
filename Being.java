import java.util.Map;
import java.util.HashMap;

public abstract class Being{
	static Map<String, Race> stringToRace = new HashMap<String, Race>();

	public String name;
	public Race race;
	public int str = 10, agi = 10, con = 10, wis = 10, HP, MP, tHP, tMP, lvl;
	
	//Object Creator

	public Being(String n, String rce){
		name = n;
		tHP = (con/2) + 10;
		tMP = (wis/2) + 10;
		race = getRace(rce, this);
		HP = tHP;
		MP = tMP;
		lvl = 1;
	}

	public Race getRace(String rce, Being b){
		return stringToRace.get(rce);
	}

	public void stats(){
		System.out.println("--"+name+"--");
		System.out.println("Race " + race.name);
		System.out.println("---");
		System.out.println("HP " + HP + "/" + tHP);
		System.out.println("MP " + MP + "/" + tMP);
		System.out.println("---");
		System.out.println("Strength " + str);
		System.out.println("Agility " + agi);
		System.out.println("Constitution " + con);
		System.out.println("Wisdom " + wis);
		System.out.println();
	}
}