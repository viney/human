import service.Man;
import service.Woman;

/**
 * @author viney
 * 
 *         2013-8-7
 */
public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		man.SetName("»ÆÏþÃ÷");

		System.out.println("man: " + man.Name + "\t" + man.Sex);

		man.Dress();
		man.Say();

		Woman woman = new Woman();
		woman.SetName("AngelBaby");
		System.out.println("woman: " + woman.Name + "\t" + woman.Sex);

		woman.Dress();
		woman.Say();
	}
}