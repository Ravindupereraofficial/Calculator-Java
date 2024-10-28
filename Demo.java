import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame{
	private JButton[] buttonArray;
	private JTextField txtDisplay;
	int num1;
	int num2;
	int result;
	char op;
	
	Calculator(){
		setSize(300,300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
				
		txtDisplay=new JTextField();
		txtDisplay.setFont(new Font("",1,20));
		txtDisplay.setHorizontalAlignment(JTextField.RIGHT);
		add("North",txtDisplay);
			
		JPanel buttonPanel=new JPanel();
		buttonPanel.setLayout(new GridLayout(4,4));	
		buttonArray=new JButton[16];
		String[] buttonText={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","%"};
		for (int i = 0; i < 16; i++){
			buttonArray[i]=new JButton(buttonText[i]);
			buttonArray[i].setFont(new Font("",1,20));
			buttonPanel.add(buttonArray[i]);
		}
		//button-->7[0]
		buttonArray[0].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[0].getText());
			}
		});
		//button-->8[1]
		buttonArray[1].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[1].getText());
			}
		});
		//button-->9[2]
		buttonArray[2].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[2].getText());
			}
		});
		
				//button-->4[4]
		buttonArray[4].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[4].getText());
			}
		});
		
					//button-->5[5]
		buttonArray[5].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[5].getText());
			}
		});
		
					//button-->6[6]
		buttonArray[6].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[6].getText());
			}
		});
		
					//button-->1[8]
		buttonArray[8].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[8].getText());
			}
		});
		
						//button-->2[9]
		buttonArray[9].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[9].getText());
			}
		});
		
						//button-->3[10]
		buttonArray[10].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[10].getText());
			}
		});
		
		
						//button-->0[12]
		buttonArray[12].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[12].getText());
			}
		});
		
							//button-->.[13]
		buttonArray[13].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				txtDisplay.setText(txtDisplay.getText()+buttonArray[13].getText());
			}
		});
		
		
		
		//button-->*[3] (Mul)
		buttonArray[3].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				num1=Integer.parseInt(txtDisplay.getText());
				op='*';
				txtDisplay.setText("");
			}
		});
		//button-->/[7] (Division)
		buttonArray[7].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				num1=Integer.parseInt(txtDisplay.getText());
				op='/';
				txtDisplay.setText("");
			}
		});
		
		//button-->%[15] (Division)
		buttonArray[15].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				num1=Integer.parseInt(txtDisplay.getText());
				op='%';
				txtDisplay.setText("");
			}
		});
		
		//button-->=(14) (Equals)
		buttonArray[14].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				num2=Integer.parseInt(txtDisplay.getText());
				switch(op){
					case '*':
						result=num1*num2;
						break;
					case '/':
						result=num1/num2;
						break;
					case '%':
						result=num1%num2;
						break;
				}
				txtDisplay.setText(""+result);
			}
		});
		add("Center",buttonPanel);
	}
}
class Demo{
	public static void main(String args[]){
		new Calculator().setVisible(true);
		
	}
}

