
public class dizhi10states {
	public static String dizhis10(String dayzhu,String dizhi) {
		String tiangan = "甲乙丙丁戊己庚辛壬癸";
		if(dizhi.equals("子")){
			String[] order = "正印 偏印 正官 七杀 正财 偏财 伤官 食神 劫财 比肩".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("丑")){
			String[] order = "正财 偏财 伤官 食神 劫财 比肩 正印 偏印 正官 七杀".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("寅")){
			String[] order = "比肩 劫财 偏印 正印 七杀 正官 偏财 正财 食神 伤官".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("卯")){
			String[] order = "劫财 比肩 正印 偏印 正官 七杀 正财 偏财 伤官 食神".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("辰")){
			String[] order = "偏财 正财 食神 伤官 比肩 劫财 偏印 正印 七杀 正官".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("巳")){
			String[] order = "伤官 食神 劫财 比肩 正印 偏印 正官 七杀 正财 偏财".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("午")){
			String[] order = "食神 伤官 比肩 劫财 偏印 正印 七杀 正官 偏财 正财".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("未")){
			String[] order = "正财 偏财 伤官 食神 劫财 比肩 正印 偏印 正官 七杀".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("申")){
			String[] order = "七杀 正官 偏财 正财 食神 伤官 比肩 劫财 偏印 正印".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("酉")){
			String[] order = "正官 七杀 正财 偏财 伤官 食神 劫财 比肩 正印 偏印".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("戌")){
			String[] order = "偏财 正财 食神 伤官 比肩 劫财 偏印 正印 七杀 正官".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("亥")){
			String[] order = "偏印 正印 七杀 正官 偏财 正财 食神 伤官 比肩 劫财".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dizhi)) {
					return order[i];
				}
			}
		}
		return null;
	}
}
