

public class Class36
{
    public int anInt624;
    int anInt625;
    public int anInt626;
    int anInt627;
    public int anInt628;
    int anInt629;
    public int anInt630;
    public int anInt631 = 5440981;
    public int anInt632;
    int anInt633;
    static Class366 aClass366_634 = new Class366(4);
    public static Class532 aClass532_635;
    
    static void method685() {
	aClass366_634.method4568(-626138153);
    }
    
    static void method686() {
	aClass366_634.method4565(2126673122);
    }
    
    static void method687() {
	aClass366_634.method4565(2124310642);
    }
    
    static void method688() {
	aClass366_634.method4568(-1420608691);
    }
    
    static void method689(int i) {
	aClass366_634.method4564(i, 1747032560);
    }
    
    static void method690(int i) {
	aClass366_634.method4564(i, 1747032560);
    }
    
    static void method691(int i) {
	aClass366_634.method4564(i, 1747032560);
    }
    
    Class36() {
	/* empty */
    }
    
    static void method692(int i) {
	aClass366_634.method4564(i, 1747032560);
    }
    
    public static int method693(byte i) {
	return Class229.aClass236_2947.method2740((byte) 12);
    }
    
    public static int method694(byte i) {
	return Class328_Sub45_Sub11.anInt10213 * -1044773515;
    }
    
    public static String method695(byte[] is, int i, int i_0_, int i_1_) {
	char[] cs = new char[i_0_];
	int i_2_ = 0;
	int i_3_ = i;
	int i_4_ = i + i_0_;
	while (i_3_ < i_4_) {
	    int i_5_ = is[i_3_++] & 0xff;
	    int i_6_;
	    if (i_5_ < 128) {
		if (i_5_ == 0)
		    i_6_ = 65533;
		else
		    i_6_ = i_5_;
	    } else if (i_5_ < 192)
		i_6_ = 65533;
	    else if (i_5_ < 224) {
		if (i_3_ < i_4_ && 128 == (is[i_3_] & 0xc0)) {
		    i_6_ = (i_5_ & 0x1f) << 6 | is[i_3_++] & 0x3f;
		    if (i_6_ < 128)
			i_6_ = 65533;
		} else
		    i_6_ = 65533;
	    } else if (i_5_ < 240) {
		if (i_3_ + 1 < i_4_ && (is[i_3_] & 0xc0) == 128
		    && 128 == (is[1 + i_3_] & 0xc0)) {
		    i_6_ = ((i_5_ & 0xf) << 12 | (is[i_3_++] & 0x3f) << 6
			    | is[i_3_++] & 0x3f);
		    if (i_6_ < 2048)
			i_6_ = 65533;
		} else
		    i_6_ = 65533;
	    } else if (i_5_ < 248) {
		if (i_3_ + 2 < i_4_ && (is[i_3_] & 0xc0) == 128
		    && (is[1 + i_3_] & 0xc0) == 128
		    && (is[2 + i_3_] & 0xc0) == 128) {
		    i_6_ = ((i_5_ & 0x7) << 18 | (is[i_3_++] & 0x3f) << 12
			    | (is[i_3_++] & 0x3f) << 6 | is[i_3_++] & 0x3f);
		    if (i_6_ < 65536 || i_6_ > 1114111)
			i_6_ = 65533;
		    else
			i_6_ = 65533;
		} else
		    i_6_ = 65533;
	    } else
		i_6_ = 65533;
	    cs[i_2_++] = (char) i_6_;
	}
	return new String(cs, 0, i_2_);
    }
    
    static final void method696(Class412 class412, int i) {
	Class403 class403 = (((Class412) class412).aBool4954
			     ? ((Class412) class412).aClass403_4936
			     : ((Class412) class412).aClass403_4934);
	Class121 class121 = ((Class403) class403).aClass121_4887;
	((Class412) class412).anIntArray4927
	    [(((Class412) class412).anInt4944 += 1336678779) * -1097736781 - 1]
	    = -2017346693 * class121.anInt1439;
    }
    
    static final void method697(Class412 class412, byte i) {
	int i_7_ = (((Class412) class412).anIntArray4927
		    [((((Class412) class412).anInt4944 -= 1336678779)
		      * -1097736781)]);
	((Class412) class412).anIntArray4927
	    [(((Class412) class412).anInt4944 += 1336678779) * -1097736781 - 1]
	    = (((Class412) class412).aClass328_Sub7_4943.aClass160Array7342
	       [i_7_].anInt2045) * -1680800723;
    }
    
    static final void method698(Class412 class412, int i) {
	String string = (String) (((Class412) class412).anObjectArray4933
				  [(((Class412) class412).anInt4938
				    -= -1905978417) * 783749935]);
	((Class412) class412).anObjectArray4933
	    [(((Class412) class412).anInt4938 += -1905978417) * 783749935 - 1]
	    = Class408.method5162(string, -18584180);
    }
    
    static final void method699(Class412 class412, byte i) {
	Class328_Sub39 class328_sub39 = Class196.preferences;
	Class464_Sub6 class464_sub6
	    = Class196.preferences.aClass464_Sub6_7647;
	int i_8_;
	if ((((Class412) class412).anIntArray4927
	     [(((Class412) class412).anInt4944 -= 1336678779) * -1097736781])
	    == 1) {
	    if (i >= 1)
		return;
	    i_8_ = 1;
	} else
	    i_8_ = 0;
	class328_sub39.method7201(class464_sub6, i_8_, -83596963);
	client.aClass297_8008.method3606(1561800838);
	Class365.method4554((byte) 31);
	client.aBool8259 = false;
    }
    
    static final void method700(Class412 class412, int i) {
	if (client.anInt7951 * 379716649 == 15)
	    Class476.aBool6463 = (((Class412) class412).anIntArray4927
				  [(((Class412) class412).anInt4944
				    -= 1336678779) * -1097736781]) == 1;
    }
    
    static Class328_Sub28 method701(Buffer class328_sub31, int i) {
	class328_sub31.readUByte(475745043);
	int i_9_ = class328_sub31.readUByte(-1014606726);
	Class328_Sub28 class328_sub28
	    = Class144_Sub2.method8577(i_9_, (byte) 14);
	((Class328_Sub28) class328_sub28).anInt7506
	    = class328_sub31.readUByte(-2018981838) * 885769609;
	int i_10_ = class328_sub31.readUByte(853242793);
	for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
	    int i_12_ = class328_sub31.readUByte(383885942);
	    class328_sub28.method6989(i_12_, class328_sub31, -222167591);
	}
	class328_sub28.method6988(1729630921);
	return class328_sub28;
    }
    
    static final void method702(Class412 class412, int i) {
	int i_13_ = (((Class412) class412).anIntArray4927
		     [((((Class412) class412).anInt4944 -= 1336678779)
		       * -1097736781)]);
	Class116 class116 = Class390_Sub1.method7405(i_13_, -1849451155);
	String string = "";
	if (null != class116 && null != class116.aString1341)
	    string = class116.aString1341;
	((Class412) class412).anObjectArray4933
	    [(((Class412) class412).anInt4938 += -1905978417) * 783749935 - 1]
	    = string;
    }
    
    static final void method703(Class412 class412, int i) {
	int i_14_ = (((Class412) class412).anIntArray4927
		     [((((Class412) class412).anInt4944 -= 1336678779)
		       * -1097736781)]);
	int i_15_ = client.aClass293Array8132[i_14_].method3474(1303284714);
	((Class412) class412).anIntArray4927
	    [(((Class412) class412).anInt4944 += 1336678779) * -1097736781 - 1]
	    = 2 == i_15_ ? 1 : 0;
    }
    
    public static int method704(int i, byte i_16_) {
	int i_17_ = i >>> 1;
	i_17_ |= i_17_ >>> 1;
	i_17_ |= i_17_ >>> 2;
	i_17_ |= i_17_ >>> 4;
	i_17_ |= i_17_ >>> 8;
	i_17_ |= i_17_ >>> 16;
	return i & (i_17_ ^ 0xffffffff);
    }
}
