
import java.io.File;

public class Class16
{
    static final int anInt185 = 7;
    static final int anInt186 = 63;
    public static Class72 aClass72_187;
    
    Class16() throws Throwable {
	throw new Error();
    }
    
    public static void method494(Class436 class436, int i, byte i_0_) {
	if (-1366058543 * Class330.anInt4033 < 50
	    && (null != class436 && class436.anIntArrayArray6148 != null
		&& i < class436.anIntArrayArray6148.length
		&& class436.anIntArrayArray6148[i] != null)) {
	    int i_1_ = class436.anIntArrayArray6148[i][0];
	    int i_2_ = i_1_ >> 8;
	    int i_3_ = i_1_ >> 5 & 0x7;
	    if (class436.anIntArrayArray6148[i].length > 1) {
		int i_4_ = (int) (Math.random()
				  * (double) (class436.anIntArrayArray6148
					      [i]).length);
		if (i_4_ > 0)
		    i_2_ = class436.anIntArrayArray6148[i][i_4_];
	    }
	    int i_5_ = 256;
	    if (null != class436.anIntArray6131
		&& null != class436.anIntArray6146)
		i_5_ = Font.method413(class436.anIntArray6131[i],
					class436.anIntArray6146[i], (byte) 0);
	    int i_6_ = (null == class436.anIntArray6150 ? 255
			: class436.anIntArray6150[i]);
	    if (class436.aBool6134)
		Class202.method2505(i_2_, i_3_, 0, i_6_, false, i_5_,
				    (byte) -54);
	    else
		Class380_Sub2.method7337(i_2_, i_3_, 0, i_6_, i_5_,
					 -426849294);
	}
    }
    
    static final void method495(Class412 class412, byte i) {
	int i_7_ = (((Class412) class412).anIntArray4927
		    [((((Class412) class412).anInt4944 -= 1336678779)
		      * -1097736781)]);
	Class121 class121 = Class466.method5942(i_7_, (byte) 68);
	Class122 class122 = Class96.aClass122Array1098[i_7_ >> 16];
	Class472.method6023(class121, class122, class412, -1658708880);
    }
    
    public static Class156 method496(int i, short i_8_) {
	Class156[] class156s = Class20.method518((byte) 10);
	for (int i_9_ = 0; i_9_ < class156s.length; i_9_++) {
	    Class156 class156 = class156s[i_9_];
	    if (i == 897336377 * ((Class156) class156).anInt2021)
		return class156;
	}
	return null;
    }
    
    public static byte[] method497(File file, int i) {
	return Class44.method781(file, (int) file.length(), 1678495515);
    }
}
