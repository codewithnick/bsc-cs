/*
Write a program to accept the elements of the classes i.e

Emo no Basic pay, Dept.

These elements are passed through the applet using TextField. The

salary slips along with calculation of DA,HRA and CCA should be

printed on the applet. Where

DA=81% of Basic Salary if Basic Salary<5000

DA-51% of Basic Salary if Basic Salaryis in the range of 5000 to 7000 DA-1% of Basic Salary if Basic Salary 7000

HRA-15% of Basic Salary CCA 350/
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="TextFieldDemo" width=900 height=400>

</applet>*/

public class TextFieldDemo extends Applet implements ActionListener

{ TextField Emp_no, Basic_pay, Dept;

public void init()

{ 
    Label eno=new Label("EMPLOYEE NO. :", Label.RIGHT);
    Label bp=new Label("BASIC PAY :",Label.RIGHT); 
    Label dpt=new Label("DEPARTMENT :", Label. RIGHT);
    Emp_no=new TextField(20);
    Basic_pay=new TextField(20); 
    Dept=new TextField(30);

    add(eno);
    add(Emp_no);
    add(bp);
    add(Basic_pay);
    add(dpt);
    add(Dept);

    //event listener
    Basic_pay.addActionListener(this);
    Emp_no.addActionListener(this);
    Dept.addActionListener(this);
    setBackground(Color.pink);
    setForeground(Color.black);
    Font f=new Font("Tahoma",Font.BOLD,20);
    setFont(f);
}
public void actionPerformed(ActionEvent ae)
{
    //user presses enter key
    repaint();
}
public void paint(Graphics g)
{
    g.drawString("your emp no is "+Emp_no.getText(),20,100);
    g.drawString("your basic pay is "+Basic_pay.getText(),20,120);
    g.drawString("your dept is "+Dept.getText(),20,140);

    int BS=Integer.parseInt(Basic_pay.getText());
    int DA,HRA,CCA;
    CCA=350;
    HRA=(15*BS)/100;
    if(BS<5000)
    DA=(81*BS)/100;
    else if(BS>5000 && BS<7000)
    DA=(51*BS)/100; 
    else if(BS>7000)
    DA=(41*BS)/100;
    else
    DA=0;
    g.drawString("Your HRA is: "+HRA, 20,160);
    g.drawString("Your CCA is: "+CCA, 20,180);
    g.drawString("Your DA is: "+DA, 20, 200); 
}

}



