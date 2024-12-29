/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame{
    
    
   // Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    
    MyFrame(){
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.darkGray);
        this.setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(310,200);
       this.setResizable(false);
       
        timeFormat= new SimpleDateFormat("hh:mm:ss a");
       dayFormat= new SimpleDateFormat("EEEE");
       dateFormat= new SimpleDateFormat("MMMMM dd , yyyy");
        
        timeLabel= new JLabel();
        timeLabel.setFont(new Font("Arial",Font.BOLD,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        
        dayLabel=new JLabel();
       dayLabel.setFont(new Font("Noto Serif",Font.BOLD,35));
       dayLabel.setForeground(Color.red);
      
       
       dateLabel= new JLabel();
       dateLabel.setFont(new Font("Noto Serif",Font.BOLD,20));
       dateLabel.setForeground(Color.yellow);
        
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        
        setTime();
    }
    
    public void setTime(){
        while(true){
        time=timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        
         day=dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);
        
          date=dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);
        
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
