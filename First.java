

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="China12345America678922England342343434Mexica";
		System.out.println(str.replaceAll("\\d+", " "));
		
		String sr = "1970/2/19	星期四	1970	正月	十四	庚戌	狗	0	戊寅	庚午	雨水	9:41:46";
		System.out.println(sr.replaceAll("雨水\\s+\\d+:\\d+:\\d+", ""));
		
	}

}
