package LayoutExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutExample extends JFrame implements ActionListener {
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonAdd,buttonSub,buttonMult,buttonDiv,buttonFact,buttonSquare,buttonEqualto,buttonCLear;
    JPanel buttonpanel;
    String input="";
    Font f1,f2;
    String operator;
    int num1,num2,result=0;

    JTextField text;
        GridLayoutExample(){
        this.setTitle("CAlULATOR");
        this.setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        f1=new Font("Arial",Font.BOLD,35);
        f2=new Font("Arial",Font.BOLD,30);

        text=new JTextField();
        text.setBounds(40,40,390,80);
        text.setHorizontalAlignment(JTextField.RIGHT);
        add(text);



        buttonpanel=new JPanel();
        buttonpanel.setLayout(new GridLayout(4,3,20,20));
        buttonpanel.setPreferredSize(new Dimension(80,100));
        buttonpanel.setBackground(Color.BLACK);




        button1=new JButton("1");
        buttonpanel.add(button1);



        button2=new JButton("2");
        buttonpanel.add(button2);


        button3=new JButton("3");
        buttonpanel.add(button3);

        buttonAdd=new JButton("+");
        buttonpanel.add(buttonAdd);




        button4=new JButton("4");
        buttonpanel.add(button4);


        button5=new JButton("5");
        buttonpanel.add(button5);


        button6=new JButton("6");
        buttonpanel.add(button6);

        buttonSub=new JButton("-");
        buttonpanel.add(buttonSub);


        button7=new JButton("7");
        buttonpanel.add(button7);

        button8=new JButton("8");
        buttonpanel.add(button8);

        button9=new JButton("9");
        buttonpanel.add(button9);

        buttonMult=new JButton("*");
        buttonpanel.add(buttonMult);

            buttonCLear=new JButton("AC");
            buttonpanel.add(buttonCLear);

        button0=new JButton("0");
        buttonpanel.add(button0);

        buttonEqualto=new JButton("=");
        buttonpanel.add(buttonEqualto);



        buttonDiv=new JButton("/");
        buttonpanel.add(buttonDiv);


        button0.setBackground(new Color(0x505050));
        button1.setBackground(new Color(0x505050));
        button2.setBackground(new Color(0x505050));
        button3.setBackground(new Color(0x505050));
        button4.setBackground(new Color(0x505050));
        button5.setBackground(new Color(0x505050));
        button6.setBackground(new Color(0x505050));
        button7.setBackground(new Color(0x505050));
        button8.setBackground(new Color(0x505050));
        button9.setBackground(new Color(0x505050));
        buttonAdd.setBackground(new Color(0xFF9500));
        buttonSub.setBackground(new Color(0xFF9500));
        buttonMult.setBackground(new Color(0xFF9500));
        buttonDiv.setBackground(new Color(0xFF9500));
        buttonCLear.setBackground(new Color(0xD2D2D4));
        buttonEqualto.setBackground(new Color(0xD2D2D4));



        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMult.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonCLear.addActionListener(this);
        buttonEqualto.addActionListener(this);
        buttonpanel.setBounds(40, 130, 390, 350); // Increase size!

            button0.setFont(f2);
            button1.setFont(f2);
            button2.setFont(f2);
            button3.setFont(f2);
            button4.setFont(f2);
            button5.setFont(f2);
            button6.setFont(f2);
            button7.setFont(f2);
            button8.setFont(f2);
            button9.setFont(f2);
            buttonAdd.setFont(f2);
            buttonSub.setFont(f2);
            buttonMult.setFont(f2);
            buttonDiv.setFont(f2);
            buttonEqualto.setFont(f2);
            buttonCLear.setFont(f2);

            button0.setForeground(Color.WHITE);
            button1.setForeground(Color.WHITE);
            button2.setForeground(Color.WHITE);
            button3.setForeground(Color.WHITE);
            button4.setForeground(Color.WHITE);
            button5.setForeground(Color.WHITE);
            button6.setForeground(Color.WHITE);
            button7.setForeground(Color.WHITE);
            button8.setForeground(Color.WHITE);
            button9.setForeground(Color.WHITE);
            buttonAdd.setForeground(Color.WHITE);
            buttonSub.setForeground(Color.WHITE);
            buttonMult.setForeground(Color.WHITE);
            buttonDiv.setForeground(Color.WHITE);
            buttonEqualto.setForeground(Color.WHITE);
            buttonCLear.setForeground(Color.WHITE);



            text.setFont(f1);
            text.setBackground(Color.BLACK);
            text.setForeground(Color.WHITE);



        add(buttonpanel);
        setSize(480,550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    input=text.getText();


    if(e.getSource()==button0){
       input=input+"0";
        text.setText(input);
    }
    else if(e.getSource()==button1){
        input=input+"1";
        text.setText(input);
    }
    else if(e.getSource()==button2){
        input=input+"2";
        text.setText(input);
    }
    else if(e.getSource()==button3){
        input=input+"3";
        text.setText(input);
    }
    else if(e.getSource()==button4){
        input=input+"4";
        text.setText(input);
    }

    else if(e.getSource()==button5){
        input=input+"5";
        text.setText(input);
    }
    else if(e.getSource()==button6){
        input=input+"6";
        text.setText(input);
    }
    else if(e.getSource()==button7){
        input=input+"7";
        text.setText(input);
    }
    else if(e.getSource()==button8){
        input=input+"8";
        text.setText(input);
    }
    else if(e.getSource()==button9){
        input=input+"9";
        text.setText(input);
    }


    if(e.getSource()==buttonAdd){
        num1=Integer.parseInt(text.getText());
        operator="+";
        text.setText("");
        input="";
    }
    if(e.getSource()==buttonSub)
    {
        num1=Integer.parseInt(text.getText());
        operator="-";
        text.setText("");
        input="";
    }
        if(e.getSource()==buttonMult)
        {
            num1=Integer.parseInt(text.getText());
            operator="*";
            text.setText("");
            input="";
        }
        if(e.getSource()==buttonDiv)
        {
            num1=Integer.parseInt(text.getText());
            operator="/";
            text.setText("");
            input="";
        }
        if(e.getSource()==buttonCLear)
        {
            text.setText("");
            input="";
        }

    if(e.getSource()==buttonEqualto){
        num2=Integer.parseInt(text.getText());
        text.setText("");
        input="";

        switch(operator){
            case "+":
                result=num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                try {
                    result = num1 / num2;
                }
                catch(ArithmeticException r){
                    System.out.println("cannot be divided by 0");
                    break;
                }

                break;
            default:
                System.out.println("?");

        }
        text.setText(String.valueOf(result));
    }
    }
}
