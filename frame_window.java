
import java.awt.*;
public class frame_window
{
	int c,n;
    String s1,s2,s3,s4,s5;
    Frame f;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    Panel p;
    TextField tf;
    GridLayout g;
    frame_window()
    {
        f = new Frame("My calculator");
p = new Panel();
f.setLayout(new FlowLayout());
b1 = new Button("0");
b2 = new Button("1");
b3 = new Button("2");
b4 = new Button("3");
b5 = new Button("4");
b6 = new Button("5");
b7 = new Button("6");
b8 = new Button("7");
b9 = new Button("8");
b10 = new Button("9");
b11 = new Button("+");
b12 = new Button("-");
b13 = new Button("*");
b14 = new Button("/");;
b15 = new Button("%");
b16 = new Button("=");
b17 = new Button("C");
tf = new TextField(20);
f.add(tf);
g = new GridLayout(4,4,10,20);
p.setLayout(g);
p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);p.add(b16);p.add(b17);
f.add(p);
f.setSize(300,300);
f.setVisible(true); 
}

public static void main(String[] abc)
{
	frame_window v = new frame_window();
}

}
