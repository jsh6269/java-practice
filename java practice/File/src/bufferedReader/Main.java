package bufferedReader;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		Reader rin = new FileReader("input.txt");
		BufferedReader in = new BufferedReader(rin);
		Writer rout = new FileWriter("output.txt");
		BufferedWriter out = new BufferedWriter(rout);
		String cmd;
		while((cmd=in.readLine())!=null) {
			System.out.println(cmd);
			out.write(cmd+"\n");
		}
		if(in!=null) in.close();
		if(out!=null) out.close();
	}
}
