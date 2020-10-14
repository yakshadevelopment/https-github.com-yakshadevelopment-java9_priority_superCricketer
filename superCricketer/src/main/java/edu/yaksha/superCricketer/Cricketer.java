package edu.yaksha.superCricketer;

public class Cricketer {
	String name;
	Integer runFirst;
	Integer runSecond;
	Integer avgRun;
	Integer wicketFirst;
	Integer wicketSecond;
	Integer avgWicket;
	public Cricketer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cricketer(String name, Integer runFirst, Integer runSecond, Integer wicketFirst,
			Integer wicketSecond ) {
		super();
		this.name = name;
		this.runFirst = runFirst;
		this.runSecond = runSecond;
		this.wicketFirst = wicketFirst;
		this.wicketSecond = wicketSecond;
	}
	
	public Cricketer(String name, Integer runFirst, Integer runSecond, Integer avgRun, Integer wicketFirst,
			Integer wicketSecond, Integer avgWicket) {
		super();
		this.name = name;
		this.runFirst = runFirst;
		this.runSecond = runSecond;
		this.avgRun = avgRun;
		this.wicketFirst = wicketFirst;
		this.wicketSecond = wicketSecond;
		this.avgWicket = avgWicket;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRunFirst() {
		return runFirst;
	}
	public void setRunFirst(Integer runFirst) {
		this.runFirst = runFirst;
	}
	public Integer getRunSecond() {
		return runSecond;
	}
	public void setRunSecond(Integer runSecond) {
		this.runSecond = runSecond;
	}
	public Integer getAvgRun() {
		return avgRun;
	}
	public void setAvgRun(Integer avgRun) {
		this.avgRun = avgRun;
	}
	public Integer getWicketFirst() {
		return wicketFirst;
	}
	public void setWicketFirst(Integer wicketFirst) {
		this.wicketFirst = wicketFirst;
	}
	public Integer getWicketSecond() {
		return wicketSecond;
	}
	public void setWicketSecond(Integer wicketSecond) {
		this.wicketSecond = wicketSecond;
	}
	public Integer getAvgWicket() {
		return avgWicket;
	}
	public void setAvgWicket(Integer avgWicket) {
		this.avgWicket = avgWicket;
	}
	@Override
	public String toString() {
		return  name ;
	}
	
	

}
