
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Class27
{
    Class72[] aClass72Array520;
    static final String aString521
	= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7";
    int[] anIntArray522;
    static int anInt523
	= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
	      .length();
    static int[] anIntArray524 = new int[256];
    boolean aBool525 = false;
    int anInt526;
    int anInt527;
    int[] anIntArray528 = new int[4];
    
    Class27(Class425 class425, int i, boolean bool, Component component) {
	((Class27) this).aBool525 = false;
	((Class27) this).aClass72Array520 = new Class72[256];
	((Class27) this).anIntArray522 = new int[256];
	Font font = new Font("Helvetica", bool ? 1 : 0, i);
	FontMetrics fontmetrics = component.getFontMetrics(font);
	for (int i_0_ = 0; i_0_ < anInt523; i_0_++)
	    method594
		(class425, font, fontmetrics,
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		     .charAt(i_0_),
		 i_0_, false);
	if (bool && ((Class27) this).aBool525) {
	    ((Class27) this).aBool525 = false;
	    font = new Font("Helvetica", 0, i);
	    fontmetrics = component.getFontMetrics(font);
	    for (int i_1_ = 0; i_1_ < anInt523; i_1_++)
		method594
		    (class425, font, fontmetrics,
		     "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			 .charAt(i_1_),
		     i_1_, false);
	    if (!((Class27) this).aBool525) {
		((Class27) this).aBool525 = false;
		for (int i_2_ = 0; i_2_ < anInt523; i_2_++)
		    method594
			(class425, font, fontmetrics,
			 "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			     .charAt(i_2_),
			 i_2_, true);
	    }
	}
    }
    
    int method587() {
	return ((Class27) this).anInt526;
    }
    
    int method588() {
	return ((Class27) this).anInt526;
    }
    
    int method589() {
	return ((Class27) this).anInt527 - 1;
    }
    
    void method590(Class425 class425, String string, int i, int i_3_, int i_4_,
		   boolean bool) {
	int i_5_ = method595(string) / 2;
	class425.qa(((Class27) this).anIntArray528);
	if (i - i_5_ <= ((Class27) this).anIntArray528[2]
	    && i + i_5_ >= ((Class27) this).anIntArray528[0]
	    && (i_3_ - ((Class27) this).anInt526
		<= ((Class27) this).anIntArray528[3])
	    && (i_3_ + ((Class27) this).anInt527
		>= ((Class27) this).anIntArray528[1]))
	    method591(class425, string, ((Class27) this).anIntArray528,
		      i - i_5_, i_3_, i_4_, bool);
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_6_
		= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		      .indexOf(i);
	    if (i_6_ == -1)
		i_6_ = 74;
	    anIntArray524[i] = i_6_;
	}
    }
    
    void method591(Class425 class425, String string, int[] is, int i, int i_7_,
		   int i_8_, boolean bool) {
	if (i_8_ == 0)
	    bool = false;
	i_8_ |= ~0xffffff;
	for (int i_9_ = 0; i_9_ < string.length(); i_9_++) {
	    int i_10_ = anIntArray524[string.charAt(i_9_)];
	    if (bool)
		((Class27) this).aClass72Array520[i_10_]
		    .method1059(i + 1, i_7_ + 1, 0, -16777216, 1);
	    ((Class27) this).aClass72Array520[i_10_].method1059(i, i_7_, 0,
								i_8_, 1);
	    i += ((Class27) this).anIntArray522[i_10_];
	}
    }
    
    int method592() {
	return ((Class27) this).anInt526;
    }
    
    int method593(String string) {
	int i = 0;
	for (int i_11_ = 0; i_11_ < string.length(); i_11_++) {
	    int i_12_ = anIntArray524[string.charAt(i_11_)];
	    i += ((Class27) this).anIntArray522[i_12_];
	}
	return i;
    }
    
    void method594(Class425 class425, Font font, FontMetrics fontmetrics,
		   char c, int i, boolean bool) {
	int i_13_ = fontmetrics.charWidth(c);
	int i_14_ = i_13_;
	if (bool) {
	    try {
		if (c == '/')
		    bool = false;
		if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k'
		    || c == 'x' || c == 'y' || c == 'A' || c == 'V'
		    || c == 'W')
		    i_13_++;
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	int i_15_ = fontmetrics.getMaxAscent();
	int i_16_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
	int i_17_ = fontmetrics.getHeight();
	Image image = Class507.aCanvas6842.createImage(i_13_, i_16_);
	Graphics graphics = image.getGraphics();
	graphics.setColor(Color.black);
	graphics.fillRect(0, 0, i_13_, i_16_);
	graphics.setColor(Color.white);
	graphics.setFont(font);
	graphics.drawString(new StringBuilder().append(c).append("")
				.toString(),
			    0, i_15_);
	if (bool)
	    graphics.drawString(new StringBuilder().append(c).append("")
				    .toString(),
				1, i_15_);
	int[] is = new int[i_13_ * i_16_];
	PixelGrabber pixelgrabber
	    = new PixelGrabber(image, 0, 0, i_13_, i_16_, is, 0, i_13_);
	try {
	    pixelgrabber.grabPixels();
	} catch (Exception exception) {
	    /* empty */
	}
	image.flush();
	Object object = null;
	int i_18_ = 0;
    while_113_:
	for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
	    for (int i_20_ = 0; i_20_ < i_13_; i_20_++) {
		int i_21_ = is[i_20_ + i_19_ * i_13_];
		if ((i_21_ & 0xffffff) != 0) {
		    i_18_ = i_19_;
		    break while_113_;
		}
	    }
	}
	for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
	    if ((is[i_22_] & 0xffffff) == 0)
		is[i_22_] = 0;
	}
	((Class27) this).anInt526 = i_15_ - i_18_;
	((Class27) this).anInt527 = i_17_;
	((Class27) this).anIntArray522[i] = i_14_;
	((Class27) this).aClass72Array520[i]
	    = class425.method5321(is, 0, i_13_, i_13_, i_16_, 1215905187);
    }
    
    int method595(String string) {
	int i = 0;
	for (int i_23_ = 0; i_23_ < string.length(); i_23_++) {
	    int i_24_ = anIntArray524[string.charAt(i_23_)];
	    i += ((Class27) this).anIntArray522[i_24_];
	}
	return i;
    }
}
