import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Grading {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton b1=new JButton("HOME");
        b1.setBounds(10,30,80,25);
        f.add(b1);
        JButton b2=new JButton("STUDENT");
        b2.setBounds(100,30,90,25);
        f.add(b2);
        JButton b3=new JButton("LECTURERS");
        b3.setBounds(200,30,110,25);
        f.add(b3);
        JButton b4=new JButton("HELP");
        b4.setBounds(320,30,80,25);
        f.add(b4);
        JLabel l1=new JLabel("CHEMISTRY /40:");
        l1.setBounds(25,75,100,35);
        f.add(l1);
        JTextField tf1=new JTextField();
        tf1.setBounds(130,83,270,20);
        f.add(tf1);
        JLabel l2=new JLabel("BIOLOGY /40:");
        l2.setBounds(39,110,100,35);
        f.add(l2);
        JTextField tf2=new JTextField();
        tf2.setBounds(130,118,270,20);
        f.add(tf2);
        JLabel l3=new JLabel("PHYSICS /40:");
        l3.setBounds(40,148,100,35);
        f.add(l3);
        JTextField tf3=new JTextField();
        tf3.setBounds(130,156,270,20);
        f.add(tf3);
        JLabel l4=new JLabel("MATHS /40:");
        l4.setBounds(48,183,100,35);
        f.add(l4);
        JTextField tf4=new JTextField();
        tf4.setBounds(130,191,270,20);
        f.add(tf4);
        JButton b5=new JButton("DISPLAY ALL THE ANSWERS DOWN HERE");
        b5.setBounds(30,231,360,20);
        f.add(b5);
        
        JButton b6=new JButton("PERCENTAGE");
        b6.setBounds(10,270,120,23);
        f.add(b6);
        JTextField tf5=new JTextField();
        tf5.setBounds(10,310,120,30);
        f.add(tf5);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s1=tf1.getText();
                String s2=tf2.getText();
                String s3=tf3.getText();
                String s4=tf4.getText();

                float a =Float.parseFloat(s1);
                float b=Float.parseFloat(s2);
                float c= Float.parseFloat(s3);
                float d= Float.parseFloat(s4);
                float marks;
                marks= ((a+b+c+d)/160)*100;
                String result=String.valueOf(marks);
                tf5.setText(result);
            }
        });
        JButton b7=new JButton("AVERAGE");
        b7.setBounds(180,270,100,23);
        f.add(b7);
        JTextField tf6=new JTextField();
        tf6.setBounds(180,310,100,30);
        f.add(tf6);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s1=tf1.getText();
                String s2=tf2.getText();
                String s3=tf3.getText();
                String s4=tf4.getText();

                float a =Float.parseFloat(s1);
                float b=Float.parseFloat(s2);
                float c= Float.parseFloat(s3);
                float d= Float.parseFloat(s4);
                float avg;
                avg= ((a+b+c+d)/4);
                String resul=String.valueOf(avg);
                tf6.setText(resul);
            }
        });
        JButton b8=new JButton("GRADE");
        b8.setBounds(320,270,80,23);
        JTextField tf7=new JTextField();
        tf7.setBounds(320,310,80,30);
        f.add(tf7);
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s1=tf1.getText();
                String s2=tf2.getText();
                String s3=tf3.getText();
                String s4=tf4.getText();

                float a =Float.parseFloat(s1);
                float b=Float.parseFloat(s2);
                float c= Float.parseFloat(s3);
                float d= Float.parseFloat(s4);
                float marks;
                marks= ((a+b+c+d)/160)*100;
                if(marks>=80 && marks<=100){
                String result=String.valueOf(marks);
                tf7.setText("GRADE A");
                }
                if(marks>=70 && marks<=79){
                    String result=String.valueOf(marks);
                    tf7.setText("GRADE B");
                }
                if(marks>=60 && marks<=69){
                    String result=String.valueOf(marks);
                    tf7.setText("GRADE C");
                }
                if(marks>=50 && marks<=59){
                    String result=String.valueOf(marks);
                    tf7.setText("GRADE D");
                }
                if(marks<50){
                    String result=String.valueOf(marks);
                    tf7.setText("FAILED");
                }

            }
        });
        f.add(b8);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = tf1.getText();
                String s2 = tf2.getText();
                String s3 = tf3.getText();
                String s4 = tf4.getText();

                float a = Float.parseFloat(s1);
                float b = Float.parseFloat(s2);
                float c = Float.parseFloat(s3);
                float d = Float.parseFloat(s4);

                float marks = ((a + b + c + d) / 160) * 100;
                String percentage = String.valueOf(marks);
                tf5.setText(percentage);

                float avg = (a + b + c + d) / 4;
                String average = String.valueOf(avg);
                tf6.setText(average);

                if (marks >= 80 && marks <= 100) {
                    tf7.setText("GRADE A");
                } else if (marks >= 70 && marks <= 79) {
                    tf7.setText("GRADE B");
                } else if (marks >= 60 && marks <= 69) {
                    tf7.setText("GRADE C");
                } else if (marks >= 50 && marks <= 59) {
                    tf7.setText("GRADE D");
                } else {
                    tf7.setText("FAILED");
                }
            }
        }); 
       
        f.setLayout(null);
        f.setSize(430,410);
        f.setVisible(true);
    }
    
}
