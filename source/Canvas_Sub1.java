
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas
{
    Component aComponent10306;
    
    public final void paint(Graphics graphics) {
	((Canvas_Sub1) this).aComponent10306.paint(graphics);
    }
    
    public final void update(Graphics graphics) {
	((Canvas_Sub1) this).aComponent10306.update(graphics);
    }
    
    Canvas_Sub1(Component component) {
	((Canvas_Sub1) this).aComponent10306 = component;
    }
}
