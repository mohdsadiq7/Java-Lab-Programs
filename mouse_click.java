import java.awt.event.*;
import java.awt.*;
public class mouse_click extends Frame implements MouseListener
{
	private static final long serialVersionUID = 1L;
	private int a,b,c,d,cl=0,r;
	mouse_click()
	{
		addMouseListener(this);
		setBackground(Color.black);
		setForeground(Color.red);
		setVisible(true);
		setSize(1000,1000);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent w) {System.exit(0);}});
		
	}
	public void mouseClicked(MouseEvent e) 
	{
		Graphics g=getGraphics();
		if(cl==0)
		{
			a=e.getX();
			b=e.getY();
			cl=1;
		}
		else if(cl==1)
		{
			c=e.getX();
			d=e.getY();
			if(a==c && b==d)
			{
				return;
			}
			else
			{
				int x,y;
				x=Math.abs(c-a);
				y=Math.abs(d-b);
				r=(int)Math.sqrt(x*x + y*y);
				g.drawOval(a-r,b-r,2*r,2*r);
			}
			cl=2;
		}
		else
		{
			r=r+1;
			g.clearRect(a-r,b-r,2*r,2*r);
			g.drawOval(a-r,b-r,2*r,2*r);
		}
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public static void main(String[] args)
	{
		mouse_click obj=new mouse_click();
	}
}

