public abstract class Race{
	protected String name;

    public Race(String name) {
        this.name = name;
        Being.stringToRace.put(name, this);
    }

    public String getName() {
        return name;
    }
}