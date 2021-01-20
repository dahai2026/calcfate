

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class time {
	public static void main(String[] args) throws Exception {		
		FileWriter fw = new FileWriter("F:\\ac.txt");
		// OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream("F:\\ac.txt"),"UTF-8"); 
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("F:\\new\\new\\calm\\src\\fff_v8"),"UTF-8"));
		//BufferedReader br = new BufferedReader(new FileReader("F:\\\\new\\\\new\\\\calm\\\\src\\\\fff_v8"));
		String line = "";
		List<String> list = new ArrayList<String>();
		while((line=br.readLine())!=null) {
			//if(line.matches("\\s+\\d+:\\d+:\\d+")){
			//if(line.matches("小寒")) {
				//System.out.println("Ok");
				//System.out.println(line);
				list.add(line);
			//}
		}
		fw.flush();
		fw.close();
		br.close();		
		
		br = new BufferedReader(new FileReader("F:\\wan\\data.txt"));
		line = "";
		List<String> list3 = new ArrayList<String>();
		while((line=br.readLine())!=null) {
			//if(line.matches("\\s+\\d+:\\d+:\\d+")){
			//if(line.matches("小寒")) {
				//System.out.println("Ok");
				//System.out.println(line);
				list3.add(line);
			//}
		}
		br.close();		
		//System.out.println(list.size() + "==" +list3.size());
		
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i) + " " + list3.get(i));
			String t = list.get(i) + " " + list3.get(i);
			if(t.contains("2092/8/24")) {
				System.out.println(t);
			}
		}
		
	}
}
