
public class shicheng {

	public static void main(String[] args) {
		

	}
	
	public static float shichengstring2float(String str){
		String[] spetStrings = new String[]{ "23-1", "1-3", "3-5", "5-7", "7-9" , "9-11", "11-13" , "13-15", "15-17" , "17-19", "19-21" , "21-23"};
		float[] s = new float[]{23.5f  ,  1.5f,  3.5f,  5.5f,  7.5f,   9.5f,   11.5f,   13.5f,    15.5f,    17.5f,   19.5f,   21.5f};
		for(int i=0;i<spetStrings.length;i++) {
			if(spetStrings[i].equals(str)) {
				return s[i];
			}
		}
		return 0f;
	}

	public static String shichengganzhi(String daygan,float time) {
		if(daygan.equals("甲")||daygan.equals("己")) {
			if((time>23)&&(time<1)) {
				return "甲子";
			}else if((time>1)&&(time<3)) {
				return "乙丑";
			}else if((time>3)&&(time<5)) {
				return "丙寅";
			}else if((time>5)&&(time<7)) {
				return "丁卯";
			}else if((time>7)&&(time<9)) {
				return "戊辰";
			}else if((time>9)&&(time<11)) {
				return "己巳";
			}else if((time>11)&&(time<13)) {
				return "庚午";
			}else if((time>13)&&(time<15)) {
				return "辛未";
			}else if((time>15)&&(time<17)) {
				return "壬申";
			}else if((time>17)&&(time<19)) {
				return "癸酉";
			}else if((time>19)&&(time<21)) {
				return "甲戌";
			}else if((time>21)&&(time<23)) {
				return "乙亥";
			}			
		}else if(daygan.equals("乙")||daygan.equals("庚")) {
			if((time>23)&&(time<1)) {
				return "丙子";
			}else if((time>1)&&(time<3)) {
				return "丁丑";
			}else if((time>3)&&(time<5)) {
				return "戊寅";
			}else if((time>5)&&(time<7)) {
				return "己卯";
			}else if((time>7)&&(time<9)) {
				return "庚辰";
			}else if((time>9)&&(time<11)) {
				return "辛巳";
			}else if((time>11)&&(time<13)) {
				return "壬午";
			}else if((time>13)&&(time<15)) {
				return "癸未";
			}else if((time>15)&&(time<17)) {
				return "甲申";
			}else if((time>17)&&(time<19)) {
				return "乙酉";
			}else if((time>19)&&(time<21)) {
				return "丙戌";
			}else if((time>21)&&(time<23)) {
				return "丁亥";
			}			
		}else if(daygan.equals("丙")||daygan.equals("辛")) {
			if((time>23)&&(time<1)) {
				return "戊子";
			}else if((time>1)&&(time<3)) {
				return "己丑";
			}else if((time>3)&&(time<5)) {
				return "庚寅";
			}else if((time>5)&&(time<7)) {
				return "辛卯";
			}else if((time>7)&&(time<9)) {
				return "壬辰";
			}else if((time>9)&&(time<11)) {
				return "癸巳";
			}else if((time>11)&&(time<13)) {
				return "甲午";
			}else if((time>13)&&(time<15)) {
				return "乙未";
			}else if((time>15)&&(time<17)) {
				return "戊申";
			}else if((time>17)&&(time<19)) {
				return "己酉";
			}else if((time>19)&&(time<21)) {
				return "丙戌";
			}else if((time>21)&&(time<23)) {
				return "丁亥";
			}			
		}else if(daygan.equals("丁")||daygan.equals("壬")) {
			if((time>23)&&(time<1)) {
				return "庚子";
			}else if((time>1)&&(time<3)) {
				return "辛丑";
			}else if((time>3)&&(time<5)) {
				return "壬寅";
			}else if((time>5)&&(time<7)) {
				return "癸卯";
			}else if((time>7)&&(time<9)) {
				return "甲辰";
			}else if((time>9)&&(time<11)) {
				return "乙巳";
			}else if((time>11)&&(time<13)) {
				return "丙午";
			}else if((time>13)&&(time<15)) {
				return "丁未";
			}else if((time>15)&&(time<17)) {
				return "戊申";
			}else if((time>17)&&(time<19)) {
				return "己酉";
			}else if((time>19)&&(time<21)) {
				return "庚戌";
			}else if((time>21)&&(time<23)) {
				return "辛亥";
			}			
		}else if(daygan.equals("戊")||daygan.equals("癸")) {
			if((time>23)&&(time<1)) {
				return "壬子";
			}else if((time>1)&&(time<3)) {
				return "癸丑";
			}else if((time>3)&&(time<5)) {
				return "甲寅";
			}else if((time>5)&&(time<7)) {
				return "乙卯";
			}else if((time>7)&&(time<9)) {
				return "丙辰";
			}else if((time>9)&&(time<11)) {
				return "丁巳";
			}else if((time>11)&&(time<13)) {
				return "戊午";
			}else if((time>13)&&(time<15)) {
				return "己未";
			}else if((time>15)&&(time<17)) {
				return "庚申";
			}else if((time>17)&&(time<19)) {
				return "辛酉";
			}else if((time>19)&&(time<21)) {
				return "壬戌";
			}else if((time>21)&&(time<23)) {
				return "癸亥";
			}			
		}
		return "";
	}
}
