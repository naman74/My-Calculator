
package demo2;
import java.awt.*;
import java.awt.event.*;
public class Demo2 {

   
    public static void main(String[] args) {
      Gui g = new Gui();
        g.setVisible(true);
    }
    
}
 class Gui extends Frame{
      class A implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
              if(e.getSource()==b1)
          {
          
              t1.setText("");
              
   
          }
          }
          
      }
      class B implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
           if(e.getSource()==b2)
          {
            s3 = t1.getText();
            s4 = "7";
            s5 = s3+s4;
              t1.setText(s5);
          }  
          }
          
      }
      class C implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
              if(e.getSource()==b3)
          {
           t1.setText("8");

          }
          }
          
      }
      class D implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
              if(e.getSource()==b4)
          {
            s3 = t1.getText();
            s4 = "9";
            s5 = s3+s4;
              t1.setText(s5);
          }
          }
          
      }
      class E implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
               if(e.getSource()==b5)
          {
            s1 = t1.getText();
              t1.setText("");
              c=4;
   
          }
          }
          
      }
      class F implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
          if(e.getSource()==b6)
          {
            s3 = t1.getText();
            s4 = "4";
            s5 = s3+s4;
              t1.setText(s5);
          }   
          }
          
      }
      class G implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
             if(e.getSource()==b7)
          {
            s3 = t1.getText();
            s4 = "5";
            s5 = s3+s4;
              t1.setText(s5);
          }
          }
          
      }
      class H implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
              if(e.getSource()==b8)
          {
            s3 = t1.getText();
            s4 = "6";
            s5 = s3+s4;
              t1.setText(s5);
          } 
          }
          
      }
        class I implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
             if(e.getSource()==b9)
          {
            s1 = t1.getText();
              t1.setText("");
              c=3;
   
          } 
          }
            
        }
        class J implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
             if(e.getSource()==b10)
          {
             s3 = t1.getText();
             s4 = "1";
             s5 = s3+s4;
              t1.setText(s5);
          }
          }
            
        }
        class K implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
               if(e.getSource()==b11)
          {
             s3 = t1.getText();
             s4 = "2";
             s5 = s3+s4;
              t1.setText(s5);
          }
          }
            
        }
         class L implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
           if(e.getSource()==b12)
          {
             s3 = t1.getText();
             s4 = "3";
             s5 = s3+s4;
             t1.setText(s5);
          }   
          }
             
         }
         class M implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
               if(e.getSource()==b13)
          {
             s1 = t1.getText();
              t1.setText("");
             c=1;
   
          }
          }
             
         }
         class N implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
               if(e.getSource()==b14)
          {
             s3 = t1.getText();
             s4 = "0";
             s5 = s3+s4;
              t1.setText(s5);
          }
          }
             
         }
         class O implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b15)
          {
             s2 = t1.getText();
              if(c==1)
              {
                 n = Integer.parseInt(s1)+Integer.parseInt(s2);
                  t1.setText(String.valueOf(n));
              }
              else
              if(c==2)
              {
                 n = Integer.parseInt(s1)-Integer.parseInt(s2);
                  t1.setText(String.valueOf(n));
              }
              else
              if(c==3)
              {
                 n = Integer.parseInt(s1)*Integer.parseInt(s2);
                  t1.setText(String.valueOf(n));
              }
              if(c==4)
              {
                  try
                  {
                      int p=Integer.parseInt(s2);
                      if(p!=0)
                      {
                                     n = Integer.parseInt(s1)/Integer.parseInt(s2);
                      t1.setText(String.valueOf(n));
                       }
                       else
                          t1.setText("infinite");
   
                  }
                  catch(Exception i){}
              }
             
          }   
          }
             
         }
         class P implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
               if(e.getSource()==b16)
          {
             s1 = t1.getText();
              t1.setText("");
             c=2;
   
          }
          }
             
         }
       
        
      
      
   
     

      class WE extends WindowAdapter{
          public void windowClosing(WindowEvent e){
              dispose();
          }
      }
      Panel p1,p2;
      Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
      TextField t1;
      String s1,s2,s3,s4,s5;
      int c,n;
      Gui(){
          addWindowListener(new WE());
          setBackground(Color.yellow);
          setLayout(null);
          setVisible(true);
          setTitle("MyCalci");
          setSize(400,500);
//          setLayout(new FlowLayout());
          p1 = new Panel();
          p1.setBounds(50,70,300,80);
          p1.setLayout(null);
          p1.setBackground(Color.BLUE);
          add(p1);
          t1=new TextField();
          t1.setBounds(30,20,180,40);
          p1.add(t1);
          b1=new Button("C");
          b1.addActionListener(new A());
          b1.setBounds(220,20,40,40);
          b1.setForeground(Color.BLACK);
          b1.setBackground(Color.YELLOW);
          p1.add(b1);
          p2 = new Panel();
          p2.setBounds(50,170,300,270);
          p2.setLayout(null);
          p2.setBackground(Color.BLUE);
          add(p2);
          b2=new Button("7");
          b2.addActionListener(new B());
          b2.setBounds(25,20,40,40);
          b2.setForeground(Color.BLACK);
          b2.setBackground(Color.YELLOW);
          p2.add(b2);
          b3=new Button("8");
          b3.addActionListener(new C());
          b3.setBounds(90,20,40,40);
          b3.setForeground(Color.BLACK);
          b3.setBackground(Color.YELLOW);
          p2.add(b3);
          b4=new Button("9");
          b4.addActionListener(new D());
          b4.setBounds(155,20,40,40);
          b4.setForeground(Color.BLACK);
          b4.setBackground(Color.YELLOW);
          p2.add(b4);
          b5=new Button("/");
          b5.addActionListener(new E());
          b5.setBounds(220,20,40,40);
          b5.setForeground(Color.BLACK);
          b5.setBackground(Color.RED);
          p2.add(b5);
          b6=new Button("4");
          b6.addActionListener(new F());
          b6.setBounds(25,80,40,40);
          b6.setForeground(Color.BLACK);
          b6.setBackground(Color.YELLOW);
          p2.add(b6);
          b7=new Button("5");
          b7.addActionListener(new G());
          b7.setBounds(90,80,40,40);
          b7.setForeground(Color.BLACK);
          b7.setBackground(Color.YELLOW);
          p2.add(b7);
          b8=new Button("6");
          b8.addActionListener(new H());
          b8.setBounds(155,80,40,40);
          b8.setForeground(Color.BLACK);
          b8.setBackground(Color.YELLOW);
          p2.add(b8);
          b9=new Button("*");
          b9.addActionListener(new I());
          b9.setBounds(220,80,40,40);
          b9.setForeground(Color.BLACK);
          b9.setBackground(Color.RED);
          p2.add(b9);
          b10=new Button("1");
          b10.addActionListener(new J());
          b10.setBounds(25,145,40,40);
          b10.setForeground(Color.BLACK);
          b10.setBackground(Color.YELLOW);
          p2.add(b10);
          b11=new Button("2");
          b11.addActionListener(new K());
          b11.setBounds(90,145,40,40);
          b11.setForeground(Color.BLACK);
          b11.setBackground(Color.YELLOW);
          p2.add(b11);
          b12=new Button("3");
          b12.addActionListener(new L());
          b12.setBounds(155,145,40,40);
          b12.setForeground(Color.BLACK);
          b12.setBackground(Color.YELLOW);
          p2.add(b12);
          b13=new Button("+");
          b13.addActionListener(new M());
          b13.setBounds(220,145,40,40);
          b13.setForeground(Color.BLACK);
          b13.setBackground(Color.RED);
          p2.add(b13);
          b14=new Button("0");
          b14.addActionListener(new N());
          b14.setBounds(25,210,40,40);
          b14.setForeground(Color.BLACK);
          b14.setBackground(Color.YELLOW);
          p2.add(b14);
          b15=new Button("=");
          b15.addActionListener(new O());
          b15.setBounds(90,210,100,40);
          b15.setForeground(Color.BLACK);
          b15.setBackground(Color.YELLOW);
          p2.add(b15);
          b16=new Button("-");
          b16.addActionListener(new P());
          b16.setBounds(220,210,40,40);
          b16.setForeground(Color.BLACK);
          b16.setBackground(Color.RED);
          p2.add(b16);
      }}         



