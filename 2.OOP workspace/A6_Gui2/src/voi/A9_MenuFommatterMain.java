package voi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;


import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JFormattedTextField;

public class A9_MenuFommatterMain extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JLabel lblNumber;
	private JTextField tfNum2;
	private JLabel lblResult;
	private JTextField tfResult;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnCalc;
	private JMenuItem mntmExit;
	private JMenuItem mntmAdd;
	private JMenuItem mntmMin;
	private JRadioButtonMenuItem rdbtnmntmDue;
	private JRadioButtonMenuItem rdbtnmntmDiv;
	private JMenu mnOther;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JSeparator separator;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JLabel lblNewLabel_1;
	private JFormattedTextField ftTelno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A9_MenuFommatterMain frame = new A9_MenuFommatterMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A9_MenuFommatterMain() {
		setTitle("덧셈");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 522);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfNum1());
		contentPane.add(getLblNumber());
		contentPane.add(getTfNum2());
		contentPane.add(getLblResult());
		contentPane.add(getTfResult());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getFtTelno());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Number1 : ");
			lblNewLabel.setBounds(53, 58, 129, 43);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			tfNum1.setText("");
			tfNum1.setBounds(212, 64, 246, 32);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JLabel getLblNumber() {
		if (lblNumber == null) {
			lblNumber = new JLabel("Number2 : ");
			lblNumber.setBounds(53, 127, 129, 43);
		}
		return lblNumber;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//액션 
					addNum();
				}
			});
			tfNum2.setText("");
			tfNum2.setColumns(10);
			tfNum2.setBounds(212, 138, 246, 32);
		}
		return tfNum2;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("Result");
			lblResult.setBounds(53, 238, 129, 43);
		}
		return lblResult;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setText("");
			tfResult.setColumns(10);
			tfResult.setBounds(212, 249, 246, 32);
		}
		return tfResult;
	}
	
	//--------------------------------------------------------------------------------
	//메소드 작성 
	
	private void addNum() {
		
		// 텍스트를 가져와 정수로 바꾸고 바꾼값을 더하고 더한 값을 문자열로 만들고 문자열을 결과값에 세팅해주는 것을 한번에 해주는 과정
		
		 tfResult.setText(Integer.toString((Integer.parseInt(tfNum1.getText())+Integer.parseInt(tfNum2.getText()))));
	}
	private void minNum() {
		tfResult.setText(Integer.toString((Integer.parseInt(tfNum1.getText())-Integer.parseInt(tfNum2.getText()))));

	}
	private void dueNum() {
		tfResult.setText(Integer.toString((Integer.parseInt(tfNum1.getText())*Integer.parseInt(tfNum2.getText()))));
	}
	private void divNum() {
		tfResult.setText(Integer.toString((Integer.parseInt(tfNum1.getText())/Integer.parseInt(tfNum2.getText()))));

	}
	
	//------------------------------------------------
	//메뉴형성
	
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnCalc());
			menuBar.add(getMnOther());
			menuBar.add(getMnNewMenu_2());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnCalc() {
		if (mnCalc == null) {
			mnCalc = new JMenu("Calc");
			mnCalc.add(getMntmAdd());
			mnCalc.add(getSeparator());
			mnCalc.add(getMntmMin());
			mnCalc.add(getRdbtnmntmDue());
			mnCalc.add(getRdbtnmntmDiv());
		}
		return mnCalc;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//Exit 버튼
					System.exit(0);
				}
			});
		}
		return mntmExit;
	}
	private JMenuItem getMntmAdd() {
		if (mntmAdd == null) {
			mntmAdd = new JMenuItem("Add");
			mntmAdd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
			mntmAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//덧셈
					addNum();
				}
			});
		}
		return mntmAdd;
	}
	private JMenuItem getMntmMin() {
		if (mntmMin == null) {
			mntmMin = new JMenuItem("Min");
			mntmMin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//뺄셈
					minNum();
				}
			});
		}
		return mntmMin;
	}
	private JRadioButtonMenuItem getRdbtnmntmDue() {
		if (rdbtnmntmDue == null) {
			rdbtnmntmDue = new JRadioButtonMenuItem("Due");
			rdbtnmntmDue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//곱셈
					dueNum();
				}
			});
		}
		return rdbtnmntmDue;
	}
	private JRadioButtonMenuItem getRdbtnmntmDiv() {
		if (rdbtnmntmDiv == null) {
			rdbtnmntmDiv = new JRadioButtonMenuItem("Div");
			rdbtnmntmDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//나눗셈
					divNum();
				}
			});
		}
		return rdbtnmntmDiv;
	}
	//--------------------------------------------------------------------
	// 메뉴 안에 메뉴를 추가하면  메뉴 안에서 아이템을 추가할 수 있는 메뉴가 생긴다.
	// 메뉴를 누르고   속성에서 acceleate 에서 설정할 수 있음
	private JMenu getMnOther() {
		if (mnOther == null) {
			mnOther = new JMenu("other");
			mnOther.add(getMnNewMenu());
			mnOther.add(getMnNewMenu_1());
		}
		return mnOther;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Menu2");
		}
		return mnNewMenu;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("Menu3");
		}
		return mnNewMenu_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}
	// 도움말에서 새로운 창을 띄우는 과정
	private JMenu getMnNewMenu_2() {
		if (mnNewMenu_2 == null) {
			mnNewMenu_2 = new JMenu("도움말");
			mnNewMenu_2.add(getMntmNewMenuItem_1());
			mnNewMenu_2.add(getMntmNewMenuItem());
		}
		return mnNewMenu_2;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("about");
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("사용법");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					A9_MenuHelp help = new A9_MenuHelp();
					//화면에 보여주는 명령어 
					help.setVisible(true);
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Tel No : ");
			lblNewLabel_1.setBounds(53, 346, 84, 24);
		}
		return lblNewLabel_1;
	}
	// Formatter-----------------------------------------
	   private JFormattedTextField getFtTelno() {
		      if (ftTelno == null) {
		         ftTelno = new JFormattedTextField(createFormatter("###-####-####")); 
		         // 괄호 안에 선언한 형식대로 입력 가능하다 #이 번호이다.
		         // https://docs.oracle.com/javase/7/docs/api/javax/swing/text/MaskFormatter.html
		         ftTelno.setBounds(152, 201, 116, 24);
		      }
		      return ftTelno;
		   }

		   
		   private MaskFormatter createFormatter(String s) {
		      MaskFormatter formatter = null;
		      try {
		         formatter = new MaskFormatter(s);
		      }catch(java.text.ParseException e){
		         System.out.println(e.getMessage());
		      }
		      return formatter;
		   }
	
}
