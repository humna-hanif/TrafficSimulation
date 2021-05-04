/********
 * Traffic Light Author: Humna Hanif Date: Spring 2021, SER-120
 * 
 * AutomaticHolder Class Holds the state of the regular button. If the ellipse
 * is automatically changing color the radio buttons will not work. If the state
 * is 2, meaning the user has stopped the automatic change, the user can freely
 * change color.
 *********/
public class AutomaticHolder {
	private int state;

	/*
	 * The state's default value is set to 1(meaning the circle is changing colors
	 * every three seconds)
	 */
	public AutomaticHolder() {
		state = 1;
	}

	/*
	 * Setting the state to the parameter passed.
	 */
	public void setState(int auto) {
		this.state = auto;
	}

	/*
	 * Returning the state.
	 */
	public int getState() {
		return state;
	}
}
