import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LogInF extends JFrame {
	private int width = 300, height = 150;//窗口大小

//以下用户名、密码的标签和文本框，填写密码的组件用"密码框"，确认和取消按钮：
	private JLabel userL = new JLabel("用户名："), pwL = new JLabel("密    码：");
	private JTextField userT = new JTextField(10);
	private JPasswordField pwT = new JPasswordField(10);
	private JButton confirm = new JButton("确认"), cancel = new JButton("取消");
	
//以下三个面板，分别装用户名的标签的文本框，密码的标签和文本框，2个按钮：
	private JPanel userP = new JPanel(), pwP = new JPanel(), btnP = new JPanel();

//确认按钮 监听器接口：
	private ConfirmListener b1 = new ConfirmListener();

	//ActionListener接口只有一个方法：actionPerformed
	class ConfirmListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//判断账号密码是否正确：
			String user = userT.getText();
			String pw = String.valueOf(pwT.getPassword());
			
			//if (user.equals("admin") && pw.equals("123")) {
				//JOptionPane.showMessageDialog(rootPane, "登陆成功！");
				//dispose();//关闭登录窗口
				InfoF infof = new InfoF();//打开个人信息窗口

			//} else {
				//提示错误
				//JOptionPane.showMessageDialog(rootPane, "用户名或密码错误！");
			//}
		}
	}
//取消按钮 监听器接口：
	private CancleListener b2 = new CancleListener();
	class CancleListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(-1);//退出
		}
	}

//构造函数	
	public LogInF() {
		super("登录界面");
		InfoF infof = new InfoF();
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(width, height);//设置大小
//
////网格布局，3个面板，3行1列：
//		setLayout(new GridLayout(3, 1));
//
////添加3个面板：
//		add(userP);
//		add(pwP);
//		add(btnP);
//		
////面板上添加组件：
//		
//		//用户面板添加用户名标签和编辑框：
//		userP.add(userL);
//		userP.add(userT);
//
//		//密码面板添加密码标签和编辑框：
//		pwP.add(pwL);
//		pwP.add(pwT);
//		
//		//按钮面板添加2个按钮：
//		btnP.add(confirm);
//		btnP.add(cancel);
//
//		//输入密码时显示*，这里的编辑框是密码框
//		pwT.setEchoChar('*');
////按钮添加监听器		
//		confirm.addActionListener(b1);
//		cancel.addActionListener(b2);
//
////设置窗口位置，可见，不可更改大小		
//		setLocation(300, 250);
//		setVisible(true);
//		setResizable(false);
	}
}