
public class ganzhiwuxing {

	public static void main(String[] args) {
		
	}
	
	public static String ganzhi2wuxing(String ganzhi) {
		char c = ganzhi.charAt(0);
		String c1 = "";
		String c2 = "";
		String ccc = String.valueOf(c).toString();
		if(ccc.equals("甲")||ccc.equals("乙")) {
			c1 = "木";
		}else if(ccc.equals("丙")||ccc.equals("丁")) {
			c1 = "火";
		}else if(ccc.equals("戊")||ccc.equals("己")) {
			c1 = "土";
		}
		else if(ccc.equals("庚")||ccc.equals("辛")) {
			c1 = "金";
		}
		else if(ccc.equals("壬")||ccc.equals("癸")) {
			c1 = "水";
		}
		c = ganzhi.charAt(1);
		ccc = String.valueOf(c).toString();
		if(ccc.equals("寅")||ccc.equals("卯")) {
			c2 = "木";
		}else if(ccc.equals("巳")||ccc.equals("午")) {
			c2 = "火";
		}else if(ccc.equals("辰")||ccc.equals("丑")||ccc.equals("戌")||ccc.equals("未")) {
			c2 = "土";
		}
		else if(ccc.equals("申")||ccc.equals("酉")) {
			c2 = "金";
		}
		else if(ccc.equals("亥")||ccc.equals("子")) {
			c2 = "水";
		}
		return c1 + c2;
	}

}
