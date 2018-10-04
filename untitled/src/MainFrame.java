import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{

        private Container cp;
        private JPanel jpn1 = new JPanel(new GridLayout(2,2,2,2));
        private JPanel jpn2 = new JPanel(new GridLayout(1,3,2,2));
        private JLabel jlb1 = new JLabel("ID");
        private JTextField jtf = new JTextField();
        private JLabel jlb2 = new JLabel("PASSWORD");
        private JPasswordField jpw = new JPasswordField();
        private JButton jbtn1 = new JButton("KEYBORD");
        private JButton jbtn2 = new JButton("LOGIN");
        private JButton jbtn3 = new JButton("EXIT");


    public MainFrame(){
        init();
    }

    public void init(){
        this.setLayout(null);
        this.setBounds(700,500,300,150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        cp =this.getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(jpn1,BorderLayout.CENTER);
        cp.add(jpn2,BorderLayout.SOUTH);

        jpn1.add(jlb1);
        jpn1.add(jtf);
        jpn1.add(jlb2);
        jpn1.add(jpw);

        jpn2.add(jbtn1);
        jpn2.add(jbtn2);
        jpn2.add(jbtn3);
        jbtn1.setBounds(10,10,80,30);



        jbtn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
