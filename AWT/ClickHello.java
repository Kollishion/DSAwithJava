import java.awt.*;
import java.awt.event.*;

public class ClickHello extends Frame implements MouseListener{
    public ClickHello(){
    super("Click Hello");
    setSize(400, 300);
    addMouseListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        Graphics g = getGraphics();
        g.drawString("HELLO!", e.getX(), e.getY());
        g.dispose();
    }
    public void mousePressed(MouseEvent e){} public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){} public void mouseExited(MouseEvent e){}

    public static void main(String[] args) {
        new ClickHello();
    }
}