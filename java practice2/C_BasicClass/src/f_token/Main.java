package f_token;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("PM:01:23:41", ":");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " ");
		}
		System.out.println();

		StringTokenizer sta = new StringTokenizer("PM:01:23:41", ":", true);
		while(sta.hasMoreTokens()) {
			System.out.print(sta.nextToken() + " ");
		}
		System.out.println();

		
		
		StringTokenizer st2 = new StringTokenizer("12 + 35 - 23 * 5 /1=23", "+-*/= ");
		while(st2.hasMoreTokens())
			System.out.print(st2.nextToken() + " ");
	}
}
