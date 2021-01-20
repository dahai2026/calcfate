import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class t {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("F:\\new\\new\\calm\\src\\fff_v9"),"UTF-8"));
		//BufferedReader br = new BufferedReader(new FileReader("F:\\\\new\\\\new\\\\calm\\\\src\\\\fff_v8"));
		String line = "";
		List<String> list = new ArrayList<String>();
		while((line=br.readLine())!=null) {
			if(line.contains("2100/12/3")) {
				System.out.println(line);
			}
		}
		br.close();		
	}
}
