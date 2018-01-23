

public class Class11
{
    static Class11 aClass11_122 = new Class11();
    static Class11 aClass11_123 = new Class11();
    static int anInt124;
    static Class435 aClass435_125;
    
    Class11() {
	/* empty */
    }
    
    static String method424(int[] is, byte i) {
	StringBuilder stringbuilder = new StringBuilder();
	int i_0_ = Class131.anInt1654 * 467628381;
	for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
	    Class395 class395
		= Class157.aClass392_2035.method4893(is[i_1_], (byte) -94);
	    if (-1 != class395.anInt4797 * 1448247693) {
		Class72 class72
		    = (Class72) (Class15.aClass366_174.method4559
				 ((long) (class395.anInt4797 * 1448247693)));
		if (class72 == null) {
		    Image class99
			= ImageUtils.loadFirst(Class136.aClass275_1854,
					     1448247693 * class395.anInt4797,
					     0);
		    if (null != class99) {
			class72
			    = Class328_Sub4.aClass425_7332.method5322(class99,
								      true);
			Class15.aClass366_174.method4570
			    (class72,
			     (long) (class395.anInt4797 * 1448247693));
		    }
		}
		if (null != class72) {
		    Class390_Sub2.aClass72Array7852[i_0_] = class72;
		    stringbuilder.append(" <img=").append(i_0_).append(">");
		    i_0_++;
		}
	    }
	}
	return stringbuilder.toString();
    }
    
    static final void method425(Class412 class412, int i) {
	Class403 class403 = (((Class412) class412).aBool4954
			     ? ((Class412) class412).aClass403_4936
			     : ((Class412) class412).aClass403_4934);
	Class121 class121 = ((Class403) class403).aClass121_4887;
	Class448.method5677(class121, class412, -2004592599);
    }
    
    static final void method426(Class412 class412, byte i) {
	Class403 class403 = (((Class412) class412).aBool4954
			     ? ((Class412) class412).aClass403_4936
			     : ((Class412) class412).aClass403_4934);
	Class121 class121 = ((Class403) class403).aClass121_4887;
	((Class412) class412).anIntArray4927
	    [(((Class412) class412).anInt4944 += 1336678779) * -1097736781 - 1]
	    = class121.anInt1452 * -518672901;
    }
    
    static final void method427(Class412 class412, byte i) {
	int i_2_ = (((Class412) class412).anIntArray4927
		    [((((Class412) class412).anInt4944 -= 1336678779)
		      * -1097736781)]);
	Class328_Sub44 class328_sub44
	    = (Class328_Sub44) client.aClass493_8134.method6198((long) i_2_);
	if (null != class328_sub44)
	    ((Class412) class412).anIntArray4927
		[((((Class412) class412).anInt4944 += 1336678779) * -1097736781
		  - 1)]
		= 1;
	else
	    ((Class412) class412).anIntArray4927
		[((((Class412) class412).anInt4944 += 1336678779) * -1097736781
		  - 1)]
		= 0;
    }
    
    static final void method428(Class121 class121, Class122 class122,
				Class412 class412, int i) {
	class121.anInt1480 = (((Class412) class412).anIntArray4927
			      [((((Class412) class412).anInt4944 -= 1336678779)
				* -1097736781)]) * 87057707;
    }
    
    static void method429(int i) {
	if (Class512.method6443(1350954085)) {
	    if (Class356.aStringArray4420 == null)
		Class106.method1449(-1827975979);
	    Class44.aBool731 = true;
	    Class44.anInt734 = 0;
	}
    }
}
