import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GUI {
    private JFrame frame;
    private Container buttonPane, contentPane;
    private JButton generate, reset;

    public GUI(){
        makeFrame();
    }

    public  void makeFrame(){
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(1000,1000));
        frame.setLayout(new BorderLayout());
        contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout(5,5));
        setButtonPane();


        frame.pack();
        frame.setVisible(true);
    }

    public void setButtonPane(){
        buttonPane = new Container();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.Y_AXIS));

        generate = new JButton("Generate");
        generate.addActionListener( e -> {

        });
        reset = new JButton("Reset");
        reset.addActionListener(e -> {

        });
        buttonPane.add(generate);
        buttonPane.add(reset);
        contentPane.add(buttonPane, BorderLayout.WEST);
    }




}
