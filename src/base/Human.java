package base;

/**
 * @author viney
 * 
 *         2013-8-6
 */
public abstract class Human {
	public String Name;
	public String Sex;

	public void SetName(String name) {
		this.Name = name;
	}

	public String Name() {
		return this.Name;
	}

	public void SetSex(String sex) {
		this.Sex = sex;
	}

	public String Sex() {
		return this.Sex;
	}

	public abstract void Dress();
}