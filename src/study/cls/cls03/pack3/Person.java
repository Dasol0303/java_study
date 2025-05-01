package study.cls.cls03.pack3;

public class Person {
	public String name;
	private String job;
	private int age;
	public boolean healthState;
	
	//name의 getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//job의 getter setter
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	//age의 getter setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//healthState의 getter setter
	public boolean isHealthState() {
		return healthState;
	}
	public void setHealthState(boolean healthState) {
		this.healthState = healthState;
	}
	
	
	
}
