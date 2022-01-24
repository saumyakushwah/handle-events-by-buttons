package exp14;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exp14 {

	Exp14(){
        Frame f = new Frame();
        f.setSize(500,500);

        TextField tf = new TextField();
        tf.setBounds(100,100,150,20);
        f.add(tf);

        Button b1 = new Button("Clear Textfield");
        b1.setBounds(100,200,200,20);
        f.add(b1);

        Button b2 = new Button("Print Textfield");
        b2.setBounds(100,300,200,20);
        f.add(b2);

        b1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                    tf.setText(null);
                    System.out.println("Clear TextField Button Clicked");
              }
        });

        b2.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                    System.out.println("Print Textfield Button Clicked\nText in TextField is : "+tf.getText());
              }
        });
        f.setLayout(null);
        f.setVisible(true);
  }

  public static void main(String[] args) {
        Exp14 lb = new Exp14();
  }

}