package gui;

import game.ActionLis;
import game.Engine;
import game.KeyHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.Key;
import java.util.Objects;


public class Gui extends JFrame implements MouseListener, FocusListener {

    private MouseAdapter mouseListener;


    public static ImageIcon icon;
    public static ImageIcon iconwp = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/explo.png")));
    public static ImageIcon rauteAssp = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/RauteAss.png")));
    public static ImageIcon karo2p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/Karo2.png")));
    public static ImageIcon pick3p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/Pick3.png")));
    public static ImageIcon raute4p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/Karo4.png")));
    public static ImageIcon herz5p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/Herz5.png")));
    public static ImageIcon pick6p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/Pick6.png")));
    public static ImageIcon herz7p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/Herz7.png")));
    public static ImageIcon raute8p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/Raute8.png")));
    public static ImageIcon pick9p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/Pick9.png")));
    public static ImageIcon pickKing = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/PickKing.png")));
    public static ImageIcon herzBubeP = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/HerzBube.png")));
    public static ImageIcon herzDamep = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/HerzDame.png")));
    public static ImageIcon exlpo2 = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/firez.png")));
    public static ImageIcon womanp = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/bj.png")));
    public static ImageIcon m6p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/m6.png")));

    public static Gui framzz;

    public static JButton buttonN;
    public static JButton buttonC;
    public static JButton buttonX;
    public static JButton buttonD;
    public static JButton buttonS;
    public static JTextArea textArea5 = new JTextArea();
    public static JTextArea textArea4 = new JTextArea();
    public static JTextArea textArea3 = new JTextArea();

    public static JLabel dot = new JLabel();
    public static JLabel cardFire = new JLabel();
    public static JLabel dot2 = new JLabel();
    public static JLabel wp;
    public static JLabel m6;
    public static JLabel label;

    public static JTextArea textArea1;
    public static JTextArea textArea2;

    public static int cardsCounterDealer = 0;
    public static int dx;
    public static int dy;
    public static int bX = 550;



    public void run() {



        framzz = new Gui();

        framzz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framzz.setSize(1024, 1000);
        framzz.setLayout(null);
        framzz.addKeyListener(new KeyHandler());
        framzz.setVisible(true);
        framzz.setLayout(null);
        framzz.toFront();
        framzz.setState(Frame.NORMAL);
        framzz.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                framzz.hasFocus();

            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });


            mouseListener = new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    System.out.println("clicked");
                }
            };
        textArea1 = new JTextArea();
        textArea1.setSize(400, 1000);
        textArea1.setBackground(Color.BLACK);
        textArea1.setLocation(10, 10);
        textArea1.setForeground(new Color(10, 80, 200));
        textArea1.setFont(new Font("Arial", Font.BOLD, 18));
        textArea1.setFocusable(false);
        textArea1.setVisible(false);
        textArea1.requestFocus(false);
        framzz.add(textArea1);


        label = new JLabel();
        label.setBounds(0, 0, 90, 768);
        label.setBackground(Color.red);
        framzz.add(label);
        framzz.setVisible(true);



        buttonD = new JButton("(d)Double");
        buttonD.setSize(90,20);
        buttonD.setLocation(bX,750);
        buttonD.setFocusable(false);
        buttonD.setBackground(new Color(0, 17, 52, 255));
        buttonD.setForeground(new Color(154, 147, 154, 255));
        framzz.add(buttonD);
        buttonD.setVisible(true);
        buttonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (((JButton) e.getSource()).getText().equals("(d)Double")) {
                    try {
                        Engine.doubleDown();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        buttonS = new JButton("(s)Split");
        buttonS.setSize(90,30);
        buttonS.setLocation(bX+125,770);
        buttonS.setFocusable(false);
        buttonS.setBackground(new Color(19, 43, 223, 255));
        buttonS.setForeground(new Color(252, 104, 108, 255));
        framzz.add(buttonS);
        buttonS.setVisible(false);
        buttonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (((JButton) e.getSource()).getText().equals("(s)Split")) {
                    Engine.splitCards();
                }
            }
        });


        buttonX = new JButton("(x)Stand");
        buttonX.setSize(120,30);
        buttonX.setLocation(bX,800);
        buttonX.setBackground(new Color(192, 0, 0, 203));
        buttonX.setForeground(new Color(178, 178, 153, 255));
        buttonX.setFocusable(false);
        framzz.add(buttonX);
        buttonX.setVisible(true);
        buttonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (((JButton) e.getSource()).getText().equals("(x)Stand")) {
                    KeyHandler.xButton();
                }
            }
        });

        buttonC = new JButton("(c)Hit");
        buttonC.setSize(120,30);
        buttonC.setLocation(bX,770);
        buttonC.setBackground(new Color(49, 15, 72, 255));
        buttonC.setForeground(new Color(173, 123, 127, 255));
        buttonC.setFocusable(false);
        framzz.add(buttonC);
        buttonC.setVisible(true);
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (((JButton) e.getSource()).getText().equals("(c)Hit")) {
                    try {
                        Engine.check();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });


        buttonN = new JButton("(n)New Game");
        buttonN.setSize(120,35);
        buttonN.setLocation(bX,832);
        buttonN.setFont(new Font("Arial", Font.BOLD, 12));
        buttonN.setFocusable(false);
        framzz.add(buttonN);
        buttonN.setVisible(true);
        buttonN.addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  if (((JButton) e.getSource()).getText().equals("(n)New Game")) {
                      try {
                          Engine.newGame();
                      } catch (InterruptedException ex) {
                          ex.printStackTrace();
                      }

                  }

              }

          });


        dot2 = new JLabel();
        dot2.setBounds(0, 0, 200, 320);
        dot2.setLocation(800, 600);
        dot2.setIcon(womanp);
        dot2.setBackground(Color.red);
        framzz.add(dot2);
        dot2.setVisible(true);


        cardFire = new JLabel();
        cardFire.setBounds(0, 0, 200, 66);
        cardFire.setLocation(740, 285);
        cardFire.setIcon(exlpo2);
        cardFire.setBackground(Color.red);
        framzz.add(cardFire);
        cardFire.setVisible(false);


        dot = new JLabel();
        dot.setBounds(0, 0, 200, 150);
        dot.setLocation(263, 320);
        dot.setIcon(iconwp);
        dot.setBackground(Color.red);
        framzz.add(dot);
        dot.setVisible(false);


        m6 = new JLabel();
        m6.setBounds(0, 0, 190, 150);
        m6.setLocation(520, 160);
        m6.setIcon(m6p);
        m6.setBackground(Color.red);
        framzz.add(m6);
        m6.setVisible(true);


        textArea2 = new JTextArea();
        textArea2.setSize(300, 50);
        textArea2.setBackground(Color.BLACK);
        textArea2.setCaretColor(Color.RED);
        textArea2.setLocation(750, 650);
        textArea2.setText("HotKeys\n - v - Screen   i - Intro  c - Hit  d - Double\n" +
                "s - Split  x - Stand  n - New game ");
        textArea2.setFocusable(false);
        framzz.getContentPane().setBackground(Color.black);
        framzz.add(textArea2);
        textArea2.setVisible(true);



        icon = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("img/242002505_1252775645170726_3784503533134612784_n.jpg")));
        wp = new JLabel();
        wp.setBounds(0, 0, 1024, 768);
        wp.setIcon(icon);
        wp.setBackground(Color.red);
        framzz.add(wp);
        wp.setVisible(true);
        Gui.wp.setVisible(true);
        Gui.wp.setVisible(false);
        Gui.wp.setVisible(true);



        textArea3 = new JTextArea();
        textArea3.setForeground(new Color(10, 80, 200));
        textArea3.setFont(new Font("Arial", Font.PLAIN, 18));
        textArea3.setSize(270, 140);
        textArea3.setBackground(Color.BLACK);
        textArea3.setCaretColor(Color.RED);
        textArea3.setFocusable(false);
        textArea3.setLocation(740, 180);
        framzz.getContentPane().setBackground(Color.black);
        framzz.add(textArea3);
        textArea3.setVisible(true);



        textArea4 = new JTextArea();
        textArea4.setForeground(new Color(10, 80, 200));
        textArea4.setFont(new Font("Arial", Font.PLAIN, 18));
        textArea4.setSize(270, 120);
        textArea4.setBackground(Color.BLACK);
        textArea4.setCaretColor(Color.RED);
        textArea4.setFocusable(false);
        textArea4.setLocation(740, 340+190);
        framzz.getContentPane().setBackground(Color.black);
        framzz.add(textArea4);
        textArea4.setVisible(true);
        textArea4.setText("press (n) for new game");



        textArea5 = new JTextArea();
        textArea5.setForeground(new Color(10, 80, 200));
        textArea5.setFont(new Font("Arial", Font.PLAIN, 18));
        textArea5.setSize(150, 120);
        textArea5.setBackground(Color.BLACK);
        textArea5.setFocusable(false);
        textArea5.setCaretColor(Color.RED);
        textArea5.setLocation(320, 770);
        framzz.getContentPane().setBackground(Color.black);
        framzz.add(textArea5);
        textArea5.setVisible(false);
        textArea5.setVisible(true);



    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
