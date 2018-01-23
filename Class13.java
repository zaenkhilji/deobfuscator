

public class Class13
{
    int anInt131;
    public int anInt132;
    
    public int method434() {
	return anInt132 * -309392345 & 0x3fff;
    }
    
    public boolean method435(int i, int i_0_, int i_1_, byte i_2_) {
	int i_3_ = ((Class13) this).anInt131 * -1348398671;
	if (-309392345 * anInt132 == i
	    && 0 == -1348398671 * ((Class13) this).anInt131)
	    return false;
	boolean bool;
	if (0 == ((Class13) this).anInt131 * -1348398671) {
	    if (i > -309392345 * anInt132 && i <= i_0_ + -309392345 * anInt132
		|| (i < anInt132 * -309392345
		    && i >= -309392345 * anInt132 - i_0_)) {
		anInt132 = i * -874142825;
		return false;
	    }
	    bool = true;
	} else if (-1348398671 * ((Class13) this).anInt131 > 0
		   && i > anInt132 * -309392345) {
	    int i_4_
		= (-1348398671 * ((Class13) this).anInt131
		   * (-1348398671 * ((Class13) this).anInt131) / (i_0_ * 2));
	    int i_5_ = i_4_ + anInt132 * -309392345;
	    if (i_5_ >= i || i_5_ < anInt132 * -309392345)
		bool = false;
	    else
		bool = true;
	} else if (((Class13) this).anInt131 * -1348398671 < 0
		   && i < -309392345 * anInt132) {
	    int i_6_
		= (-1348398671 * ((Class13) this).anInt131
		   * (((Class13) this).anInt131 * -1348398671) / (i_0_ * 2));
	    int i_7_ = -309392345 * anInt132 - i_6_;
	    if (i_7_ <= i || i_7_ > anInt132 * -309392345)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt132 * -309392345) {
		((Class13) this).anInt131 += i_0_ * 851089233;
		if (0 != i_1_
		    && ((Class13) this).anInt131 * -1348398671 > i_1_)
		    ((Class13) this).anInt131 = i_1_ * 851089233;
	    } else {
		((Class13) this).anInt131 -= i_0_ * 851089233;
		if (i_1_ != 0
		    && ((Class13) this).anInt131 * -1348398671 < -i_1_)
		    ((Class13) this).anInt131 = -i_1_ * 851089233;
	    }
	    if (i_3_ != ((Class13) this).anInt131 * -1348398671) {
		int i_8_ = (((Class13) this).anInt131 * -1348398671
			    * (-1348398671 * ((Class13) this).anInt131)
			    / (2 * i_0_));
		if (i > anInt132 * -309392345) {
		    if (-309392345 * anInt132 + i_8_ > i)
			((Class13) this).anInt131 = 851089233 * i_3_;
		} else if (i < anInt132 * -309392345
			   && anInt132 * -309392345 - i_8_ < i)
		    ((Class13) this).anInt131 = 851089233 * i_3_;
	    }
	} else if (((Class13) this).anInt131 * -1348398671 > 0) {
	    ((Class13) this).anInt131 -= i_0_ * 851089233;
	    if (((Class13) this).anInt131 * -1348398671 < 0)
		((Class13) this).anInt131 = 0;
	} else {
	    ((Class13) this).anInt131 += i_0_ * 851089233;
	    if (-1348398671 * ((Class13) this).anInt131 > 0)
		((Class13) this).anInt131 = 0;
	}
	anInt132
	    += -874142825 * (((Class13) this).anInt131 * -1348398671 + i_3_
			     >> 1);
	return bool;
    }
    
    public void method436(int i, int i_9_) {
	anInt132 = -874142825 * i;
	((Class13) this).anInt131 = 0;
    }
    
    public int method437(int i) {
	return anInt132 * -309392345 & 0x3fff;
    }
    
    public void method438(int i) {
	anInt132 = -874142825 * (anInt132 * -309392345 & 0x3fff);
    }
    
    public void method439() {
	anInt132 = -874142825 * (anInt132 * -309392345 & 0x3fff);
    }
    
    public void method440(int i) {
	anInt132 = -874142825 * i;
	((Class13) this).anInt131 = 0;
    }
    
    public void method441(int i) {
	anInt132 = -874142825 * i;
	((Class13) this).anInt131 = 0;
    }
    
    public void method442(int i) {
	anInt132 = -874142825 * i;
	((Class13) this).anInt131 = 0;
    }
    
    static void method443(Class412 class412, byte i) {
	int[] is = ((Class412) class412).anIntArray4927;
	int i_10_ = ((Class412) class412).anInt4944 * -1097736781 - 2;
	int i_11_;
	if (Class157.aClass392_2035.method4893
		((((Class412) class412).anIntArray4927
		  [-1097736781 * ((Class412) class412).anInt4944 - 2]),
		 (byte) -7)
		.method4955
	    (Class146.aClass2_1948,
	     (((Class412) class412).anIntArray4927
	      [-1097736781 * ((Class412) class412).anInt4944 - 1]),
	     16711935)) {
	    if (i <= 0)
		return;
	    i_11_ = 1;
	} else
	    i_11_ = 0;
	is[i_10_] = i_11_;
	((Class412) class412).anInt4944 -= 1336678779;
    }
    
    static final void method444(Class412 class412, int i) {
	String string = (String) (((Class412) class412).anObjectArray4933
				  [(((Class412) class412).anInt4938
				    -= -1905978417) * 783749935]);
	Class77.method1141(string, (byte) 6);
    }
    
    static final void method445(Class412 class412, int i) {
	String string;
	if (null != Class399.localPlayer
	    && (Class399.localPlayer.aString10623
		!= null))
	    string = Class399.localPlayer
			 .method9524(false, 301484045);
	else
	    string = "";
	((Class412) class412).anObjectArray4933
	    [(((Class412) class412).anInt4938 += -1905978417) * 783749935 - 1]
	    = string;
    }
    
    static final void method446(Class412 class412, byte i) {
	Class196.preferences.method7201
	    (Class196.preferences.aClass464_Sub18_7632,
	     ((((Class412) class412).anIntArray4927
	       [(((Class412) class412).anInt4944 -= 1336678779) * -1097736781])
	      == 1) ? 2 : 0,
	     -139172470);
	client.aClass297_8008.method3606(2095200586);
	Class365.method4554((byte) 88);
	client.aBool8259 = false;
    }
    
    public static boolean method447(char c, int i) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
    
    static final void method448(Class412 class412, byte i) {
	int[] is = ((Class412) class412).anIntArray4927;
	int i_12_
	    = ((((Class412) class412).anInt4944 += 1336678779) * -1097736781
	       - 1);
	int i_13_;
	if (null != Class535.anObjectArray7098) {
	    if (i != 9)
		return;
	    i_13_ = 1;
	} else
	    i_13_ = 0;
	is[i_12_] = i_13_;
    }
    
    static final void method449(Class412 class412, byte i) {
	Class403 class403 = (((Class412) class412).aBool4954
			     ? ((Class412) class412).aClass403_4936
			     : ((Class412) class412).aClass403_4934);
	Class121 class121 = ((Class403) class403).aClass121_4887;
	((Class412) class412).anIntArray4927
	    [(((Class412) class412).anInt4944 += 1336678779) * -1097736781 - 1]
	    = class121.aBool1405 ? 1 : 0;
    }
}
