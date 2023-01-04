import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {  
    JFrame jf;
    boolean isOperatorClicked=false;
    String oldValue;

    JLabel displyLabel;
    JButton eightButton;
    JButton sevenButton;
    JButton nineButton,fourButton,fiveButton;
    JButton sixButton,oneButton,twoButton,threeButton;
    JButton dotButton,zerButton,equalButton;
    JButton additionButton,subtractionButton;
    JButton multiplicationButton,divitionButton,clearButton;

    public Calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);

        displyLabel=new JLabel("");
        displyLabel.setBounds(30,50,540,50);
        displyLabel.setBackground(Color.orange);
        displyLabel.setOpaque(true);
        displyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displyLabel.setForeground(Color.black);
        jf.add(displyLabel);


        sevenButton=new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.setBackground(Color.orange);
        sevenButton.setFont(new Font("Arial", Font.PLAIN,40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.setBackground(Color.orange);
        eightButton.setFont(new Font("Arial", Font.PLAIN,40));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.setBackground(Color.orange);
        nineButton.setFont(new Font("Arial", Font.PLAIN,40));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.setBackground(Color.orange);
        fourButton.setFont(new Font("Arial", Font.PLAIN,40));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.setBackground(Color.orange);
        fiveButton.setFont(new Font("Arial", Font.PLAIN,40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.setBackground(Color.orange);
        sixButton.setFont(new Font("Arial", Font.PLAIN,40));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30,330,80,80);
        oneButton.setBackground(Color.orange);
        oneButton.setFont(new Font("Arial", Font.PLAIN,40));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.setBackground(Color.orange);
        twoButton.setFont(new Font("Arial", Font.PLAIN,40));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(230,330,80,80);
        threeButton.setBackground(Color.orange);
        threeButton.setFont(new Font("Arial", Font.PLAIN,40));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30,430,80,80);
        dotButton.setBackground(Color.orange);
        dotButton.setFont(new Font("Arial", Font.PLAIN,40));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zerButton=new JButton("0");
        zerButton.setBounds(130,430,80,80);
        zerButton.setBackground(Color.orange);
        zerButton.setFont(new Font("Arial", Font.PLAIN,40));
        zerButton.addActionListener(this);
        jf.add(zerButton);

        equalButton=new JButton("=");
        equalButton.setBounds(230,430,80,80);
        equalButton.setBackground(Color.orange);
        equalButton.setFont(new Font("Arial", Font.PLAIN,30));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        additionButton=new JButton("+");
        additionButton.setBounds(330,130,80,80);
        additionButton.setBackground(Color.orange);
        additionButton.setFont(new Font("Arial", Font.PLAIN,20));
        additionButton.addActionListener(this);
        jf.add(additionButton);

        subtractionButton=new JButton("-");
        subtractionButton.setBounds(330,230,80,80);
        subtractionButton.setBackground(Color.orange);
        subtractionButton.setFont(new Font("Arial", Font.PLAIN,30));
        subtractionButton.addActionListener(this);
        jf.add(subtractionButton);

        multiplicationButton=new JButton("X");
        multiplicationButton.setBounds(330,330,80,80);
        multiplicationButton.setBackground(Color.orange);
        multiplicationButton.setFont(new Font("Arial", Font.PLAIN,20));
        multiplicationButton.addActionListener(this);
        jf.add(multiplicationButton);

        divitionButton=new JButton("%");
        divitionButton.setBounds(330,430,80,80);
        divitionButton.setBackground(Color.orange);
        divitionButton.setFont(new Font("Arial", Font.PLAIN,20));
        divitionButton.addActionListener(this);
        jf.add(divitionButton);

        clearButton=new JButton("clear");
        clearButton.setBounds(430,430,120,80);
        clearButton.setBackground(Color.orange);
        clearButton.setFont(new Font("Arial", Font.PLAIN,20));
        clearButton.addActionListener(this);
        jf.add(clearButton);



        




        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){
            if(isOperatorClicked){
                displyLabel.setText("7");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"7");

            }
           
        }else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displyLabel.setText("8");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"8"); 
            }    
            
        }else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displyLabel.setText("9");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"9"); 
            }    
        }else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displyLabel.setText("4");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"4"); 
            }    
        }else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displyLabel.setText("5");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"5"); 
            }    
        }else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displyLabel.setText("6");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"6"); 
            }    
        }else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displyLabel.setText("1");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"1"); 
            }    
        }else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displyLabel.setText("2");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"2"); 
            }    
        }else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displyLabel.setText("3");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"3"); 
            }    
        }else if(e.getSource()==dotButton){
            if(isOperatorClicked){
                displyLabel.setText(".");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"."); 
            }    
        }else if(e.getSource()==zerButton){
            if(isOperatorClicked){
                displyLabel.setText("0");
                isOperatorClicked=false;
            }else{
                displyLabel.setText(displyLabel.getText()+"0"); 
            }    
        }else if(e.getSource()==equalButton){
            String newValue=displyLabel.getText();
            float oldValueF=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);
            float result=oldValueF+newValueF;
            result=oldValueF-newValueF;
            result=oldValueF*newValueF;
            result=oldValueF/newValueF;
            
            displyLabel.setText(result+"");

        }else if(e.getSource()==additionButton){
            isOperatorClicked=true;
            oldValue=displyLabel.getText();

        }else if(e.getSource()==subtractionButton){
            isOperatorClicked=true;
            oldValue=displyLabel.getText();

        }else if(e.getSource()==multiplicationButton){
            isOperatorClicked=true;
            oldValue=displyLabel.getText();

        }else if(e.getSource()==divitionButton){
            isOperatorClicked=true;
            oldValue=displyLabel.getText();

        }else if(e.getSource()==clearButton){
            displyLabel.setText("");
        }

        
        
    }
    
}

