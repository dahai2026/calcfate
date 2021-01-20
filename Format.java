

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Format {
	public static void main(String[] args) throws Exception {		
		FileWriter fw = new FileWriter("F:\\ac.txt");
		// OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream("F:\\ac.txt"),"UTF-8"); 
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("F:\\new\\new\\calm\\src\\db"),"UTF-8"));
		// BufferedReader br = new BufferedReader(new FileReader("F:\\wan\\wannianli_v3.txt"));
		String line = "";
		while((line=br.readLine())!=null) {
			line = line.replaceAll("雨水\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("春分\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("谷雨\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("小满\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("夏至\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("大暑\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("处暑\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("秋分\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("霜降\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("小雪\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("冬至\\s+\\d+:\\d+\\:\\d+", "");
			line = line.replaceAll("大寒\\s+\\d+:\\d+\\:\\d+", "");
			System.out.println(line);
			fw.append(line + "\n");
		}
		fw.flush();
		fw.close();
		br.close();
	}
}
