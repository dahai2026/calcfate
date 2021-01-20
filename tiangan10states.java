
public class tiangan10states {

	public static void main(String[] args) {
		
	}
	
	public static String gan10states(String day,String other) {
		String[] s10 = new String[]{"比肩","劫财","食神","伤官","偏财","正财","七杀","正官","偏印","正印"};
		if(day.equals("甲")) {
			String order = "甲乙丙丁戊己庚辛壬癸";
			for(int i=0;i<order.length();i++) {
				String temp = String.valueOf(order.charAt(i)).toString();
				if(temp.equals(other)) {
					return s10[i];
				}
			}
		}else if(day.equals("乙")) {
			String order = "乙甲丁丙己戊辛庚癸壬";
			for(int i=0;i<order.length();i++) {
				String temp = String.valueOf(order.charAt(i)).toString();
				if(temp.equals(other)) {
					return s10[i];
				}
			}
		}else if(day.equals("丙")) {
			String order = "丙丁戊己庚辛壬癸甲乙";
			for(int i=0;i<order.length();i++) {
				String temp = String.valueOf(order.charAt(i)).toString();
				if(temp.equals(other)) {
					return s10[i];
				}
			}
		}else if(day.equals("丁")) {
			String order = "丁丙己戊辛庚癸壬乙甲";
			for(int i=0;i<order.length();i++) {
				String temp = String.valueOf(order.charAt(i)).toString();
				if(temp.equals(other)) {
					return s10[i];
				}
			}
		}else if(day.equals("戊")) {
			String order = "戊己庚辛壬癸甲乙丙丁";
			for(int i=0;i<order.length();i++) {
				String temp = String.valueOf(order.charAt(i)).toString();
				if(temp.equals(other)) {
					return s10[i];
				}
			}
		}else if(day.equals("己")) {
			String order = "己戊辛庚癸壬乙甲丁丙";
			for(int i=0;i<order.length();i++) {
				String temp = String.valueOf(order.charAt(i)).toString();
				if(temp.equals(other)) {
					return s10[i];
				}
			}
		}else if(day.equals("庚")) {
			String order = "庚辛壬癸甲乙丙丁戊己";
			for(int i=0;i<order.length();i++) {
				String temp = String.valueOf(order.charAt(i)).toString();
				if(temp.equals(other)) {
					return s10[i];
				}
			}
		}else if(day.equals("辛")) {
			String order = "辛庚癸壬乙甲丁丙己戊";
			for(int i=0;i<order.length();i++) {
				String temp = String.valueOf(order.charAt(i)).toString();
				if(temp.equals(other)) {
					return s10[i];
				}
			}
		}else if(day.equals("壬")) {
			String order = "壬癸甲乙丙丁戊己庚辛";
			for(int i=0;i<order.length();i++) {
				String temp = String.valueOf(order.charAt(i)).toString();
				if(temp.equals(other)) {
					return s10[i];
				}
			}
		}else if(day.equals("癸")) {
			String order = "癸壬乙甲丁丙己戊辛庚";
			for(int i=0;i<order.length();i++) {
				String temp = String.valueOf(order.charAt(i)).toString();
				if(temp.equals(other)) {
					return s10[i];
				}
			}
		}
		return null;
	}

}
