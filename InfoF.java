import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class InfoF extends JFrame {
	private int width = 850, height = 600;//窗口大小	
	//学号->年 姓名->月 出生日期->日
    //以下所有的面板：学号面板，姓名、性别、出生日期、团员否、专业、地址、简介面板：
	private JPanel snoP = new JPanel(), nameP = new JPanel(), sexP = new JPanel(), birthP = new JPanel(),
			memP = new JPanel(), spetP = new JPanel(), addP = new JPanel(), brifeP = new JPanel(), btnP = new JPanel();
	
//以下各标签：
	private JLabel snoL = new JLabel("年："), nameL = new JLabel("月："),
			sexL = new JLabel("性         别："), birthL = new JLabel("日："), memL = new JLabel("团         员："),
			spetL = new JLabel("时："), addL = new JLabel("家庭地址："), brifeL = new JLabel("推           算：");
	
//以下各文本框或复选框或按钮组或单选按钮或组合框等：
//要让单选按钮（单选框）表现排他行为，需要把它们加入到一个按钮组ButtonGroup中
	private JTextField snoT = new JTextField(10), nameT = new JTextField(6), birthT = new JTextField(10),
			addT = new JTextField(15);

	private ButtonGroup sexBtn = new ButtonGroup();
	private JRadioButton rb1 = new JRadioButton("男", false), rb2 = new JRadioButton("女", true);

	private JCheckBox memC = new JCheckBox("是");

	private String[] spetStrings = { "23-1", "1-3", "3-5", "5-7", "7-9" , "9-11", "11-13" , "13-15", "15-17" , "17-19", "19-21" , "21-23"};
	private JComboBox spetC = new JComboBox(spetStrings);

	private JTextArea brifeT = new JTextArea(15, 20);// 简历文本区域	
	
//以下2个按钮，保存和取消：
	private JButton store = new JButton("开始预测"), cancle = new JButton("取消");// 保存、取消按钮

//构造函数：
	public InfoF() {
		super("信息录入窗口");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width, height);
		setLocation(600, 200);

//BoxLayout和GridLayout类似，BoxLayout可以在水平或者垂直方向控制组件的位置
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

//以下各面板设置流式布局，左对齐，并添加各标签和文本框
		snoP.setLayout(new FlowLayout(FlowLayout.LEFT));
		snoP.add(snoL);
		snoP.add(snoT);

		nameP.setLayout(new FlowLayout(FlowLayout.LEFT));
		nameP.add(nameL);
		nameP.add(nameT);

		sexP.setLayout(new FlowLayout(FlowLayout.LEFT));
		sexP.add(sexL);
//单选按钮要添加到一个按钮组中：		
		sexBtn.add(rb1);
		sexBtn.add(rb2);
//2个单选按钮加入到性别面板中：		
		sexP.add(rb1);
		sexP.add(rb2);

		birthP.setLayout(new FlowLayout(FlowLayout.LEFT));
		birthP.add(birthL);
		birthP.add(birthT);
		
		memP.setLayout(new FlowLayout(FlowLayout.LEFT));
		memP.add(memL);
		memP.add(memC);

		spetP.setLayout(new FlowLayout(FlowLayout.LEFT));
		spetP.add(spetL);
		spetP.add(spetC);

		addP.setLayout(new FlowLayout(FlowLayout.LEFT));
		addP.add(addL);
		addP.add(addT);

		brifeP.setLayout(new FlowLayout(FlowLayout.LEFT));
		brifeP.add(brifeL);
		brifeP.add(brifeT);
//简历文本区域不可编辑：		
		brifeT.setEditable(false);

//2个按钮添加到按钮面板中：		
		btnP.add(store);
		btnP.add(cancle);

//以下添加各面板，是BoxLayout的垂直布局方式：	
		add(sexP);
		add(snoP);
		add(nameP);
		//add(sexP);
		add(birthP);
		//add(memP);
		add(spetP);
		//add(addP);
		add(brifeP);
		add(btnP);
		
		//按钮添加监听器：比登录窗口里实现的方法简洁一点：
		store.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String[] s60 = new String[]{"甲子","乙丑","丙寅","丁卯","戊辰","己巳","庚午","辛未","壬申","癸酉","甲戌","乙亥","丙子","丁丑","戊寅","己卯","庚辰","辛巳","壬午","癸未","甲申","乙酉","丙戌","丁亥","戊子","己丑","庚寅","辛卯","壬辰","癸巳","甲午","乙未","丙申","丁酉","戊戌","己亥","庚子","辛丑","壬寅","癸卯","甲辰","乙巳","丙午","丁未","戊申","己酉","庚戌","辛亥","壬子","癸丑","甲寅","乙卯","丙辰","丁巳","戊午","己未","庚申","辛酉","壬戌","癸亥","甲子","乙丑","丙寅","丁卯","戊辰","己巳","庚午","辛未","壬申","癸酉","甲戌","乙亥","丙子","丁丑","戊寅","己卯","庚辰","辛巳","壬午","癸未","甲申","乙酉","丙戌","丁亥","戊子","己丑","庚寅","辛卯","壬辰","癸巳","甲午","乙未","丙申","丁酉","戊戌","己亥","庚子","辛丑","壬寅","癸卯","甲辰","乙巳","丙午","丁未","戊申","己酉","庚戌","辛亥","壬子","癸丑","甲寅","乙卯","丙辰","丁巳","戊午","己未","庚申","辛酉","壬戌","癸亥"};
				brifeT.setText("");//先清空
				int year_num = Integer.valueOf(snoT.getText()).intValue();
				int month_num = Integer.valueOf(nameT.getText()).intValue();
				String date = snoT.getText() + "/" + nameT.getText() + "/" + birthT.getText();
				//brifeT.append("学号：" + snoT.getText() + "\n");
				//brifeT.append("姓名：" + nameT.getText() + "\n");
				//一个条件表达式：
				//brifeT.append("性别：" + (rb1.isSelected() ? "男" : "女") + "\n");
				//brifeT.append("出生日期：" + birthT.getText() + "\n");
				//又一个条件表达式：
				//brifeT.append("是否为团员：" + (memC.isSelected()  ? "是" : "否") + "\n");
				//brifeT.append("专业：" + spetC.getSelectedItem() + "\n");
				//brifeT.append("家庭住址：" + addT.getText() + "\n");
				brifeT.append(date + "\n");
				BufferedReader br;
				String year_ganzhi = "";
				String month_ganzhi = "";
				String day_ganzhi = "";
				String hour_ganzhi = "";
				try {
					br = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\new\\new\\calm\\src\\fff_v9"),"UTF-8"));
					String line = "";
					List<String> list = new ArrayList<String>();
					while((line=br.readLine())!=null) {
						if(line.contains(date)) {
							System.out.println(line);
							brifeT.append(line + "\n");
							String[] wds = line.split("\\s+");
							year_ganzhi = wds[5];
							month_ganzhi = wds[8];
							day_ganzhi = wds[9];
							int st = Integer.valueOf(wds[wds.length-2]).intValue();
							int se = Integer.valueOf(wds[wds.length-1]).intValue();							
							brifeT.append("时辰：" + spetC.getSelectedItem() + "\n");
							float tf = shichengstring2float(String.valueOf(spetC.getSelectedItem()));
							brifeT.append("时辰：" + tf + "\n");
							String shichengganzhi = shichengganzhi(String.valueOf(day_ganzhi.charAt(0)),tf);
							System.out.println("##################" + shichengganzhi);
							String year_s10_up = gan10states(String.valueOf(day_ganzhi.charAt(0)).toString(),String.valueOf(year_ganzhi.charAt(0)).toString());
							String month_s10_up = gan10states(String.valueOf(day_ganzhi.charAt(0)).toString(),String.valueOf(month_ganzhi.charAt(0)).toString());
							String time_s10_up = gan10states(String.valueOf(day_ganzhi.charAt(0)).toString(),String.valueOf(shichengganzhi.charAt(0)).toString());			
							
							String year_s10_down = dizhis10(String.valueOf(day_ganzhi.charAt(0)).toString(),String.valueOf(year_ganzhi.charAt(1)).toString());
							String month_s10_down = dizhis10(String.valueOf(day_ganzhi.charAt(0)).toString(),String.valueOf(month_ganzhi.charAt(1)).toString());
							String day_s10_down = dizhis10(String.valueOf(day_ganzhi.charAt(0)).toString(),String.valueOf(day_ganzhi.charAt(1)).toString());
							String time_s10_down = dizhis10(String.valueOf(day_ganzhi.charAt(0)).toString(),String.valueOf(shichengganzhi.charAt(1)).toString());			
							
							brifeT.append("十神\t" + year_s10_up + "\t"+ month_s10_up + "\t" + "日主" + "\t" + time_s10_up + "\n");
							brifeT.append("乾造\t" + year_ganzhi + "\t"+ month_ganzhi + "\t" + day_ganzhi + "\t" + shichengganzhi + "\n");
							brifeT.append("十神\t" + year_s10_down + "\t"+ month_s10_down + "\t" + day_s10_down + "\t" + time_s10_down + "\n");
							brifeT.append("五行\t" + ganzhi2wuxing(year_ganzhi) + "\t"+ ganzhi2wuxing(month_ganzhi) + "\t" + ganzhi2wuxing(day_ganzhi) + "\t" + ganzhi2wuxing(shichengganzhi) + "\n");
							int pos = 0;
					AA:		for(int i=0;i<s60.length;i++) {
								if(s60[i].equals(month_ganzhi)){
									pos = i;
									System.out.println("position=" + pos);
									break AA;
								}
							}
							String bigluck = "";
							if(yearJudge(year_ganzhi)){
								if(rb1.isSelected()){       //boy
									for(int i=0;i<10;i++) {
										pos++;
										bigluck = bigluck + s60[pos] + "\t";
									}
									brifeT.append("\n大运\t"+bigluck);
									brifeT.append("\nst:" + st + "  se:" + se + "\n");
									float see = se/3.0f;
									int year_addint = (int)see;
									float temp = (see - year_addint)*12;
									int month_addint = (int)temp;
									int final_month = month_addint + month_num;
									int final_year = year_num + year_addint;
									if(final_month>=12) {
										final_month = final_month - 12;
										final_year = final_year + 1;
									}
									brifeT.append("\n年份\t");
									for(int i=0;i<10;i++) {
										brifeT.append(final_year + "/" + final_month + "\t");
										final_year = final_year + 10;
									}
								}else {                     //girl
									pos = pos + 60;
									for(int i=0;i<10;i++) {
										pos--;
										bigluck = bigluck + s60[pos] + "\t";
									}
									brifeT.append("大运\t" + bigluck + "\n");
									brifeT.append("st:" + st + "  se:" + se + "\n");
									float see = st/3.0f;
									int year_addint = (int)see;
									float temp = (see - year_addint)*12;
									int month_addint = (int)temp;
									int final_month = month_addint + month_num;
									int final_year = year_num;
									if(final_month>=12) {
										final_month = final_month - 12;
										final_year = final_year + 1;
									}
									brifeT.append("\n年份\t");
									for(int i=0;i<10;i++) {
										brifeT.append(final_year + "/" + final_month + "\t");
										final_year = final_year + 10;
									}
								}
							}else{
								System.out.println("========================================");
								if(!rb1.isSelected()){
									for(int i=0;i<10;i++) {
										pos++;
										bigluck = bigluck + s60[pos] + "\t";
									}
									brifeT.append("大运\t"+bigluck);
									float see = se/3.0f;
									int year_addint = (int)see;
									float temp = (see - year_addint)*12;
									int month_addint = (int)temp;
									int final_month = month_addint + month_num;
									int final_year = year_num + year_addint;
									if(final_month>=12) {
										final_month = final_month - 12;
										final_year = final_year + 1;
									}
									brifeT.append("\n年份\t");
									for(int i=0;i<10;i++) {
										brifeT.append(final_year + "/" + final_month + "\t");
										final_year = final_year + 10;
									}
								}else{
									pos = pos + 60;
									for(int i=0;i<10;i++) {
										pos--;
										bigluck = bigluck + s60[pos] + "\t";
									}
									brifeT.append("大运\t"+bigluck + "\n");
									brifeT.append("st:" + st + "  se:" + se + "\n");
									brifeT.append("st:" + st + "  se:" + se + "\n");
									float see = st/3.0f;
									int year_addint = (int)see;
									float temp = (see - year_addint)*12;
									int month_addint = (int)temp;
									int final_month = month_addint + month_num;
									int final_year = year_num;
									if(final_month>=12) {
										final_month = final_month - 12;
										final_year = final_year + 1;
									}
									brifeT.append("\n年份\t");
									for(int i=0;i<10;i++) {
										brifeT.append(final_year + "/" + final_month + "\t");
										final_year = final_year + 10;
									}
								}
							}							
							break;							
							
						}
					}
					br.close();		
				} catch (UnsupportedEncodingException e1) {
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				catch (IOException e1) {
					e1.printStackTrace();
				}				
				
			}
		});
		
//取消按钮增加监听器：		
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});
//设置可见，不可调整大小
		setVisible(true);
		setResizable(false);
	}
	
	public static boolean yearJudge(String ganzhi) {
		String[] wds = "甲 丙 戊 庚 壬".split("\\s+");
		for(int i=0;i<wds.length;i++) {
			if(ganzhi.contains(wds[i])) {
				return true;
			}
		}
		return false;
	}
	
	public static String dizhis10(String dayzhu,String dizhi) {
		String tiangan = "甲乙丙丁戊己庚辛壬癸";
		System.out.println("==" + dayzhu + "   ===" + dizhi);
		if(dizhi.equals("子")){
			String[] order = "正印 偏印 正官 七杀 正财 偏财 伤官 食神 劫财 比肩".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("丑")){
			String[] order = "正财 偏财 伤官 食神 劫财 比肩 正印 偏印 正官 七杀".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("寅")){
			String[] order = "比肩 劫财 偏印 正印 七杀 正官 偏财 正财 食神 伤官".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("卯")){
			String[] order = "劫财 比肩 正印 偏印 正官 七杀 正财 偏财 伤官 食神".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("辰")){
			String[] order = "偏财 正财 食神 伤官 比肩 劫财 偏印 正印 七杀 正官".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("巳")){
			String[] order = "食神 伤官  比肩 劫财 偏印 正印  七杀 正官 偏财 正财".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("午")){
			String[] order = "伤官 食神  劫财 比肩 正印 偏印  正官 七杀 正财 偏财".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("未")){
			String[] order = "正财 偏财 伤官 食神 劫财 比肩 正印 偏印 正官 七杀".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("申")){
			String[] order = "七杀 正官 偏财 正财 食神 伤官 比肩 劫财 偏印 正印".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("酉")){
			String[] order = "正官 七杀 正财 偏财 伤官 食神 劫财 比肩 正印 偏印".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("戌")){
			String[] order = "偏财 正财 食神 伤官 比肩 劫财 偏印 正印 七杀 正官".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}else if(dizhi.equals("亥")){
			String[] order = "偏印 正印 七杀 正官 偏财 正财 食神 伤官 比肩 劫财".split("\\s+");
			for(int i=0;i<tiangan.length();i++) {
				if(String.valueOf(tiangan.charAt(i)).toString().equals(dayzhu)) {
					return order[i];
				}
			}
		}
		return null;
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
	
	public static String shichengganzhi(String daygan,float time) {
		if(daygan.contains("甲")||daygan.contains("己")) {  
			if((time>=23)) {
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
		}else if(daygan.contains("乙")||daygan.contains("庚")) {
			if(time>23) {
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
		}else if(daygan.contains("丙")||daygan.contains("辛")) {
			if(time>23) {
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
		}else if(daygan.contains("丁")||daygan.contains("壬")) {
			if(time>23) {
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
		}else if(daygan.contains("戊")||daygan.contains("癸")) {
			if(time>23) {
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
	
	public static float shichengstring2float(String str) {
		String[] spetStrings = new String[]{ "23-1", "1-3", "3-5", "5-7", "7-9" , "9-11", "11-13" , "13-15", "15-17" , "17-19", "19-21" , "21-23"};
		float[] s = new float[]{23.5f,  1.5f,  3.5f,  5.5f,  7.5f,   9.5f,   11.5f,   13.5f,    15.5f,    17.5f,   19.5f,   21.5f};
		for(int i=0;i<spetStrings.length;i++) {
			if(spetStrings[i].equals(str)) {
				return s[i];
			}
		}
		return 0f;
	}
	
}