
public class Year {
	public static boolean yearJudge(String ganzhi) {
		String[] wds = "甲 丙 戊 庚 壬".split("\\s+");
		for(int i=0;i<wds.length;i++) {
			if(ganzhi.contains(wds[i])) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		System.out.println(yearJudge("庚子"));
	}
}
