package number_puzzle;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Puzle extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private JButton resetBtn, xbtn,obtn;
    static int miliseconds = 0;
    static int seconds = 0;
    static boolean state = true;
    private JTextField tf, ttf;
    private int count = 0;
    private Font f1, f2, f3;
    private int x1, x2, x3, x4, x5, x6, x7, x8, x9;
    private JLabel lb, tlb;
    private Cursor csr;
    private ImageIcon icon;
    
    Puzle() {
        initComponents();
        disable();
    }
    
    void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(600, 100, 710, 800);
        this.setTitle("Number Puzzle");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(0, 191, 255));
        
        icon = new ImageIcon(getClass().getResource("Miscellaneous-Icon_1.jpg"));
        this.setIconImage(icon.getImage());
        
        f1 = new Font("Tahoma", Font.BOLD, 30);
        f2 = new Font("Bodoni MT Black", Font.BOLD, 48);
        f3 = new Font("Digital 7", Font.BOLD, 35);
        
        csr = new Cursor(Cursor.HAND_CURSOR);
        
        btn1 = new JButton("0");
        btn1.setBounds(70, 50, 150, 100);
        btn1.setFont(f2);
        btn1.setCursor(csr);
        c.add(btn1);
        
        btn2 = new JButton("0");
        btn2.setBounds(270, 50, 150, 100);
        btn2.setFont(f2);
        btn2.setCursor(csr);
        c.add(btn2);
        
        btn3 = new JButton("0");
        btn3.setBounds(470, 50, 150, 100);
        btn3.setFont(f2);
        btn3.setCursor(csr);
        c.add(btn3);
        
        btn4 = new JButton("0");
        btn4.setBounds(70, 200, 150, 100);
        btn4.setFont(f2);
        btn4.setCursor(csr);
        c.add(btn4);        
        
        btn5 = new JButton("0");
        btn5.setBounds(270, 200, 150, 100);
        btn5.setFont(f2);
        btn5.setCursor(csr);
        c.add(btn5);
        
        btn6 = new JButton("0");
        btn6.setBounds(470, 200, 150, 100);
        btn6.setFont(f2);
        btn6.setCursor(csr);
        c.add(btn6);
        
        btn7 = new JButton("0");
        btn7.setBounds(70, 350, 150, 100);
        btn7.setFont(f2);
        btn7.setCursor(csr);
        c.add(btn7);
        
        btn8 = new JButton("0");
        btn8.setBounds(270, 350, 150, 100);
        btn8.setFont(f2);
        btn8.setCursor(csr);
        c.add(btn8);
        
        btn9 = new JButton("0");
        btn9.setBounds(470, 350, 150, 100);
        btn9.setFont(f2);
        btn9.setCursor(csr);
        c.add(btn9);
        
        ttf = new JTextField("0");
        ttf.setBounds(70, 510, 150, 50);
        ttf.setFont(f3);
        ttf.setHorizontalAlignment(JTextField.CENTER);
        c.add(ttf);
        
        xbtn = new JButton("Stop");
        xbtn.setBounds(270, 510, 150, 50);
        xbtn.setFont(f3);
        xbtn.setBackground(Color.blue);
        xbtn.setForeground(Color.white);
        xbtn.setCursor(csr);
        c.add(xbtn);
        
        resetBtn = new JButton("Start");
        resetBtn.setFont(f1);
        resetBtn.setBounds(470, 510, 150, 50);
        resetBtn.setBackground(Color.GREEN);
        resetBtn.setForeground(Color.white);
        resetBtn.setCursor(csr);
        c.add(resetBtn);
        
        lb = new JLabel();
        lb.setBounds(70, 650, 260, 30);
        lb.setText("Your Score: ");
        lb.setFont(f1);
        c.add(lb);
        
        tf = new JTextField("" + 0);
        tf.setBounds(250, 640, 80, 50);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f1);
        c.add(tf);
        
        obtn = new JButton("Exit");
        obtn.setBounds(470, 640, 150, 50);
        obtn.setFont(f3);
        obtn.setBackground(Color.red);
        obtn.setForeground(Color.white);
        obtn.setCursor(csr);
        c.add(obtn);
        
        
        btn1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int a1 = Integer.parseInt(btn1.getText());
                int a2 = Integer.parseInt(btn2.getText());
                int a3 = Integer.parseInt(btn3.getText());
                int a4 = Integer.parseInt(btn4.getText());
                int a5 = Integer.parseInt(btn5.getText());
                int a6 = Integer.parseInt(btn6.getText());
                int a7 = Integer.parseInt(btn7.getText());
                int a8 = Integer.parseInt(btn8.getText());
                int a9 = Integer.parseInt(btn9.getText());
                
                int max = a1;
                if (max < a1) {
                    max = a1;
                }
                if (max < a2) {
                    max = a2;
                }
                if (max < a3) {
                    max = a3;
                }
                if (max < a4) {
                    max = a4;
                }
                if (max < a5) {
                    max = a5;
                }
                if (max < a6) {
                    max = a6;
                }
                if (max < a7) {
                    max = a7;
                }
                if (max < a8) {
                    max = a8;
                }
                if (max < a9) {
                    max = a9;
                }
                
                if (max == a1) {
                    count++;
                    tf.setText("" + count);
                    
                    x1 = random();
                    x2 = random();
                    x3 = random();
                    x4 = random();
                    x5 = random();
                    x6 = random();
                    x7 = random();
                    x8 = random();
                    x9 = random();
                    
                    btn1.setText("" + x1);
                    btn2.setText("" + x2);
                    btn3.setText("" + x3);
                    btn4.setText("" + x4);
                    btn5.setText("" + x5);
                    btn6.setText("" + x6);
                    btn7.setText("" + x7);
                    btn8.setText("" + x8);
                    btn9.setText("" + x9);
                    
                } else {
                    count = 0;
                    state = false;
                    disable();
                    JOptionPane.showMessageDialog(null, "Game Over");
                }
                
            }            
        });
        
        btn2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int a1 = Integer.parseInt(btn1.getText());
                int a2 = Integer.parseInt(btn2.getText());
                int a3 = Integer.parseInt(btn3.getText());
                int a4 = Integer.parseInt(btn4.getText());
                int a5 = Integer.parseInt(btn5.getText());
                int a6 = Integer.parseInt(btn6.getText());
                int a7 = Integer.parseInt(btn7.getText());
                int a8 = Integer.parseInt(btn8.getText());
                int a9 = Integer.parseInt(btn9.getText());
                
                int max = a1;
                if (max < a1) {
                    max = a1;
                }
                if (max < a2) {
                    max = a2;
                }
                if (max < a3) {
                    max = a3;
                }
                if (max < a4) {
                    max = a4;
                }
                if (max < a5) {
                    max = a5;
                }
                if (max < a6) {
                    max = a6;
                }
                if (max < a7) {
                    max = a7;
                }
                if (max < a8) {
                    max = a8;
                }
                if (max < a9) {
                    max = a9;
                }
                
                if (max == a2) {
                    count++;
                    tf.setText("" + count);
                    
                    x1 = random();
                    x2 = random();
                    x3 = random();
                    x4 = random();
                    x5 = random();
                    x6 = random();
                    x7 = random();
                    x8 = random();
                    x9 = random();
                    
                    btn1.setText("" + x1);
                    btn2.setText("" + x2);
                    btn3.setText("" + x3);
                    btn4.setText("" + x4);
                    btn5.setText("" + x5);
                    btn6.setText("" + x6);
                    btn7.setText("" + x7);
                    btn8.setText("" + x8);
                    btn9.setText("" + x9);
                    
                } else {
                    count = 0;
                    state = false;
                    disable();
                    JOptionPane.showMessageDialog(null, "Game Over");
                }
                
            }            
        });
        
        btn3.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int a1 = Integer.parseInt(btn1.getText());
                int a2 = Integer.parseInt(btn2.getText());
                int a3 = Integer.parseInt(btn3.getText());
                int a4 = Integer.parseInt(btn4.getText());
                int a5 = Integer.parseInt(btn5.getText());
                int a6 = Integer.parseInt(btn6.getText());
                int a7 = Integer.parseInt(btn7.getText());
                int a8 = Integer.parseInt(btn8.getText());
                int a9 = Integer.parseInt(btn9.getText());
                
                int max = a1;
                if (max < a1) {
                    max = a1;
                }
                if (max < a2) {
                    max = a2;
                }
                if (max < a3) {
                    max = a3;
                }
                if (max < a4) {
                    max = a4;
                }
                if (max < a5) {
                    max = a5;
                }
                if (max < a6) {
                    max = a6;
                }
                if (max < a7) {
                    max = a7;
                }
                if (max < a8) {
                    max = a8;
                }
                if (max < a9) {
                    max = a9;
                }
                
                if (max == a3) {
                    count++;
                    tf.setText("" + count);
                    
                    x1 = random();
                    x2 = random();
                    x3 = random();
                    x4 = random();
                    x5 = random();
                    x6 = random();
                    x7 = random();
                    x8 = random();
                    x9 = random();
                    
                    btn1.setText("" + x1);
                    btn2.setText("" + x2);
                    btn3.setText("" + x3);
                    btn4.setText("" + x4);
                    btn5.setText("" + x5);
                    btn6.setText("" + x6);
                    btn7.setText("" + x7);
                    btn8.setText("" + x8);
                    btn9.setText("" + x9);
                    
                } else {
                    count = 0;
                    state = false;
                    disable();
                    JOptionPane.showMessageDialog(null, "Game Over");
                }
                
            }            
        });
        
        btn4.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int a1 = Integer.parseInt(btn1.getText());
                int a2 = Integer.parseInt(btn2.getText());
                int a3 = Integer.parseInt(btn3.getText());
                int a4 = Integer.parseInt(btn4.getText());
                int a5 = Integer.parseInt(btn5.getText());
                int a6 = Integer.parseInt(btn6.getText());
                int a7 = Integer.parseInt(btn7.getText());
                int a8 = Integer.parseInt(btn8.getText());
                int a9 = Integer.parseInt(btn9.getText());
                
                int max = a1;
                if (max < a1) {
                    max = a1;
                }
                if (max < a2) {
                    max = a2;
                }
                if (max < a3) {
                    max = a3;
                }
                if (max < a4) {
                    max = a4;
                }
                if (max < a5) {
                    max = a5;
                }
                if (max < a6) {
                    max = a6;
                }
                if (max < a7) {
                    max = a7;
                }
                if (max < a8) {
                    max = a8;
                }
                if (max < a9) {
                    max = a9;
                }
                
                if (max == a4) {
                    count++;
                    tf.setText("" + count);
                    
                    x1 = random();
                    x2 = random();
                    x3 = random();
                    x4 = random();
                    x5 = random();
                    x6 = random();
                    x7 = random();
                    x8 = random();
                    x9 = random();
                    
                    btn1.setText("" + x1);
                    btn2.setText("" + x2);
                    btn3.setText("" + x3);
                    btn4.setText("" + x4);
                    btn5.setText("" + x5);
                    btn6.setText("" + x6);
                    btn7.setText("" + x7);
                    btn8.setText("" + x8);
                    btn9.setText("" + x9);
                    
                } else {
                    count = 0;
                    state = false;
                    disable();
                    JOptionPane.showMessageDialog(null, "Game Over");
                }
                
            }            
        });
        
        btn5.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int a1 = Integer.parseInt(btn1.getText());
                int a2 = Integer.parseInt(btn2.getText());
                int a3 = Integer.parseInt(btn3.getText());
                int a4 = Integer.parseInt(btn4.getText());
                int a5 = Integer.parseInt(btn5.getText());
                int a6 = Integer.parseInt(btn6.getText());
                int a7 = Integer.parseInt(btn7.getText());
                int a8 = Integer.parseInt(btn8.getText());
                int a9 = Integer.parseInt(btn9.getText());
                
                int max = a1;
                if (max < a1) {
                    max = a1;
                }
                if (max < a2) {
                    max = a2;
                }
                if (max < a3) {
                    max = a3;
                }
                if (max < a4) {
                    max = a4;
                }
                if (max < a5) {
                    max = a5;
                }
                if (max < a6) {
                    max = a6;
                }
                if (max < a7) {
                    max = a7;
                }
                if (max < a8) {
                    max = a8;
                }
                if (max < a9) {
                    max = a9;
                }
                
                if (max == a5) {
                    count++;
                    tf.setText("" + count);
                    
                    x1 = random();
                    x2 = random();
                    x3 = random();
                    x4 = random();
                    x5 = random();
                    x6 = random();
                    x7 = random();
                    x8 = random();
                    x9 = random();
                    
                    btn1.setText("" + x1);
                    btn2.setText("" + x2);
                    btn3.setText("" + x3);
                    btn4.setText("" + x4);
                    btn5.setText("" + x5);
                    btn6.setText("" + x6);
                    btn7.setText("" + x7);
                    btn8.setText("" + x8);
                    btn9.setText("" + x9);
                    
                } else {
                    count = 0;
                    state = false;
                    disable();
                    JOptionPane.showMessageDialog(null, "Game Over");
                }
                
            }            
        });
        
        btn6.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int a1 = Integer.parseInt(btn1.getText());
                int a2 = Integer.parseInt(btn2.getText());
                int a3 = Integer.parseInt(btn3.getText());
                int a4 = Integer.parseInt(btn4.getText());
                int a5 = Integer.parseInt(btn5.getText());
                int a6 = Integer.parseInt(btn6.getText());
                int a7 = Integer.parseInt(btn7.getText());
                int a8 = Integer.parseInt(btn8.getText());
                int a9 = Integer.parseInt(btn9.getText());
                
                int max = a1;
                if (max < a1) {
                    max = a1;
                }
                if (max < a2) {
                    max = a2;
                }
                if (max < a3) {
                    max = a3;
                }
                if (max < a4) {
                    max = a4;
                }
                if (max < a5) {
                    max = a5;
                }
                if (max < a6) {
                    max = a6;
                }
                if (max < a7) {
                    max = a7;
                }
                if (max < a8) {
                    max = a8;
                }
                if (max < a9) {
                    max = a9;
                }
                
                if (max == a6) {
                    count++;
                    tf.setText("" + count);
                    
                    x1 = random();
                    x2 = random();
                    x3 = random();
                    x4 = random();
                    x5 = random();
                    x6 = random();
                    x7 = random();
                    x8 = random();
                    x9 = random();
                    
                    btn1.setText("" + x1);
                    btn2.setText("" + x2);
                    btn3.setText("" + x3);
                    btn4.setText("" + x4);
                    btn5.setText("" + x5);
                    btn6.setText("" + x6);
                    btn7.setText("" + x7);
                    btn8.setText("" + x8);
                    btn9.setText("" + x9);
                    
                } else {
                    count = 0;
                    state = false;
                    disable();
                    JOptionPane.showMessageDialog(null, "Game Over");
                }
                
            }            
        });
        
        btn7.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int a1 = Integer.parseInt(btn1.getText());
                int a2 = Integer.parseInt(btn2.getText());
                int a3 = Integer.parseInt(btn3.getText());
                int a4 = Integer.parseInt(btn4.getText());
                int a5 = Integer.parseInt(btn5.getText());
                int a6 = Integer.parseInt(btn6.getText());
                int a7 = Integer.parseInt(btn7.getText());
                int a8 = Integer.parseInt(btn8.getText());
                int a9 = Integer.parseInt(btn9.getText());
                
                int max = a1;
                if (max < a1) {
                    max = a1;
                }
                if (max < a2) {
                    max = a2;
                }
                if (max < a3) {
                    max = a3;
                }
                if (max < a4) {
                    max = a4;
                }
                if (max < a5) {
                    max = a5;
                }
                if (max < a6) {
                    max = a6;
                }
                if (max < a7) {
                    max = a7;
                }
                if (max < a8) {
                    max = a8;
                }
                if (max < a9) {
                    max = a9;
                }
                
                if (max == a7) {
                    count++;
                    tf.setText("" + count);
                    
                    x1 = random();
                    x2 = random();
                    x3 = random();
                    x4 = random();
                    x5 = random();
                    x6 = random();
                    x7 = random();
                    x8 = random();
                    x9 = random();
                    
                    btn1.setText("" + x1);
                    btn2.setText("" + x2);
                    btn3.setText("" + x3);
                    btn4.setText("" + x4);
                    btn5.setText("" + x5);
                    btn6.setText("" + x6);
                    btn7.setText("" + x7);
                    btn8.setText("" + x8);
                    btn9.setText("" + x9);
                    
                } else {
                    
                    count = 0;
                    state = false;
                    disable();
                    JOptionPane.showMessageDialog(null, "Game Over");
                }
                
            }            
        });
        
        btn8.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int a1 = Integer.parseInt(btn1.getText());
                int a2 = Integer.parseInt(btn2.getText());
                int a3 = Integer.parseInt(btn3.getText());
                int a4 = Integer.parseInt(btn4.getText());
                int a5 = Integer.parseInt(btn5.getText());
                int a6 = Integer.parseInt(btn6.getText());
                int a7 = Integer.parseInt(btn7.getText());
                int a8 = Integer.parseInt(btn8.getText());
                int a9 = Integer.parseInt(btn9.getText());
                
                int max = a1;
                if (max < a1) {
                    max = a1;
                }
                if (max < a2) {
                    max = a2;
                }
                if (max < a3) {
                    max = a3;
                }
                if (max < a4) {
                    max = a4;
                }
                if (max < a5) {
                    max = a5;
                }
                if (max < a6) {
                    max = a6;
                }
                if (max < a7) {
                    max = a7;
                }
                if (max < a8) {
                    max = a8;
                }
                if (max < a9) {
                    max = a9;
                }
                
                if (max == a8) {
                    count++;
                    tf.setText("" + count);
                    
                    x1 = random();
                    x2 = random();
                    x3 = random();
                    x4 = random();
                    x5 = random();
                    x6 = random();
                    x7 = random();
                    x8 = random();
                    x9 = random();
                    
                    btn1.setText("" + x1);
                    btn2.setText("" + x2);
                    btn3.setText("" + x3);
                    btn4.setText("" + x4);
                    btn5.setText("" + x5);
                    btn6.setText("" + x6);
                    btn7.setText("" + x7);
                    btn8.setText("" + x8);
                    btn9.setText("" + x9);
                    
                } else {
                    count = 0;
                    state = false;
                    disable();
                    JOptionPane.showMessageDialog(null, "Game Over");
                }
                
            }            
        });
        
        btn9.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int a1 = Integer.parseInt(btn1.getText());
                int a2 = Integer.parseInt(btn2.getText());
                int a3 = Integer.parseInt(btn3.getText());
                int a4 = Integer.parseInt(btn4.getText());
                int a5 = Integer.parseInt(btn5.getText());
                int a6 = Integer.parseInt(btn6.getText());
                int a7 = Integer.parseInt(btn7.getText());
                int a8 = Integer.parseInt(btn8.getText());
                int a9 = Integer.parseInt(btn9.getText());
                
                int max = a1;
                if (max < a1) {
                    max = a1;
                }
                if (max < a2) {
                    max = a2;
                }
                if (max < a3) {
                    max = a3;
                }
                if (max < a4) {
                    max = a4;
                }
                if (max < a5) {
                    max = a5;
                }
                if (max < a6) {
                    max = a6;
                }
                if (max < a7) {
                    max = a7;
                }
                if (max < a8) {
                    max = a8;
                }
                if (max < a9) {
                    max = a9;
                }
                
                if (max == a9) {
                    count++;
                    tf.setText("" + count);
                    
                    x1 = random();
                    x2 = random();
                    x3 = random();
                    x4 = random();
                    x5 = random();
                    x6 = random();
                    x7 = random();
                    x8 = random();
                    x9 = random();
                    
                    btn1.setText("" + x1);
                    btn2.setText("" + x2);
                    btn3.setText("" + x3);
                    btn4.setText("" + x4);
                    btn5.setText("" + x5);
                    btn6.setText("" + x6);
                    btn7.setText("" + x7);
                    btn8.setText("" + x8);
                    btn9.setText("" + x9);
                    
                } else {
                    count = 0;
                    state = false;
                    disable();
                    JOptionPane.showMessageDialog(null, "Game Over");
                }
                
            }            
        });
        
        resetBtn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                enable();
                x1 = random();
                x2 = random();
                x3 = random();
                x4 = random();
                x5 = random();
                x6 = random();
                x7 = random();
                x8 = random();
                x9 = random();
                
                btn1.setText("" + x1);
                btn2.setText("" + x2);
                btn3.setText("" + x3);
                btn4.setText("" + x4);
                btn5.setText("" + x5);
                btn6.setText("" + x6);
                btn7.setText("" + x7);
                btn8.setText("" + x8);
                btn9.setText("" + x9);
                
                count = 0;
                seconds = 0;
                miliseconds = 0;
                tf.setText("0");
                ttf.setText("0");
                state = true;
                
                Thread t = new Thread() {
                    
                    public void run() {
                        for (;;) {
                            
                            if (state == true) {
                                try {
                                    sleep(1);
                                    
                                    if (miliseconds > 650) {
                                        miliseconds = 0;
                                        seconds++;
                                    }
                                    
                                    if (seconds % 4 == 0) {
                                        x1 = random();
                                        x2 = random();
                                        x3 = random();
                                        x4 = random();
                                        x5 = random();
                                        x6 = random();
                                        x7 = random();
                                        x8 = random();
                                        x9 = random();
                                        
                                        btn1.setText("" + x1);
                                        btn2.setText("" + x2);
                                        btn3.setText("" + x3);
                                        btn4.setText("" + x4);
                                        btn5.setText("" + x5);
                                        btn6.setText("" + x6);
                                        btn7.setText("" + x7);
                                        btn8.setText("" + x8);
                                        btn9.setText("" + x9);
                                    }
                                    
                                    if (seconds >= 59) {
                                        miliseconds = 0;
                                        seconds = 0;
                                        state = false;
                                        ttf.setText("0");
                                        seconds = 0;
                                        JOptionPane.showMessageDialog(null, "Game Over !!!!!!");
                                        break;
                                        
                                    }
                                    
                                    miliseconds++;
                                    
                                    ttf.setText("" + seconds);
                                    
                                } catch (Exception e) {
                                    
                                }
                            } else {
                                ttf.setText("0");
                                
                                break;
                            }
                        }
                    }
                    
                };
                t.start();
                
            }
            
        });
        
        xbtn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                state = false;
                
                seconds = 0;
                miliseconds = 0;
                count = 0;
                tf.setText("0");
                ttf.setText("");
                disable();
            }
            
        });
        
        
        obtn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                System.exit(0);
            }
            
        });

        //Timer Interval; 
        /*
         state = true;
        
         Thread t = new Thread(){
        
         public void run()
         {
         for ( ; ;) {
                    
         if (state == true) {
         try{
         sleep(1);
                            
         if (miliseconds>1000) {
         miliseconds=0;
         seconds++;
         }
                            
         if (seconds%4==0) {
         x1 = random();
         x2 = random();
         x3 = random();
         x4 = random();
         x5 = random();
         x6 = random();
         x7 = random();
         x8 = random();
         x9 = random();

         btn1.setText(""+x1);
         btn2.setText(""+x2);
         btn3.setText(""+x3);
         btn4.setText(""+x4);
         btn5.setText(""+x5);
         btn6.setText(""+x6);
         btn7.setText(""+x7);
         btn8.setText(""+x8);
         btn9.setText(""+x9);
         }
         if (seconds>59) {
         miliseconds=0;
         seconds=0;
         state =false;
         break;
         }
                           
    
         miliseconds++;
                            
                            
                            
         }
         catch(Exception e){
                        
         }
         }
                    
         else{
                        
         break;
         }
         }
         }
            
         };
         t.start();
         */
        // Timer Interval
    }
    
    public void disable()
    {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
    public void enable()
    {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
    }
    
    static int random() {
        Random r = new Random();
        int x = r.nextInt(100) + 1;
        return x;
    }

    public static void main(String[] args) {
        
        Puzle frame = new Puzle();
        frame.setVisible(true);
    }
}
