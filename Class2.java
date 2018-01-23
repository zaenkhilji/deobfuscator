
import java.io.IOException;

public class Class2 implements Interface41
{
    static final long aLong22 = 500L;
    static final long aLong23 = 4611686018427387903L;
    static final long aLong24 = 4611686018427387904L;
    static int[] anIntArray25 = new int[32];
    Class493 aClass493_26 = new Class493(128);
    int[] anIntArray27
	= new int[-984407541 * Class406.aClass229_4904.anInt2946];
    public int[] anIntArray28
	= new int[Class406.aClass229_4904.anInt2946 * -984407541];
    static final long aLong29 = 1L;
    public static boolean aBool30;
    
    public int method223(int i) {
	Class375 class375
	    = Class328_Sub23.aClass356_7469.method4424(i, 435846919);
	int i_0_ = -227713791 * class375.anInt4602;
	int i_1_ = class375.anInt4603 * 340677921;
	int i_2_ = class375.anInt4604 * 1230410519;
	int i_3_ = anIntArray25[i_2_ - i_1_];
	return anIntArray28[i_0_] >> i_1_ & i_3_;
    }
    
    int method279(boolean bool, int i) {
	long l = Class312.method3765((byte) -90);
	for (Class328_Sub51 class328_sub51
		 = ((Class328_Sub51)
		    (bool ? ((Class2) this).aClass493_26.method6206((byte) 97)
		     : ((Class2) this).aClass493_26.method6203(1383942055)));
	     class328_sub51 != null;
	     class328_sub51 = (Class328_Sub51) ((Class2) this).aClass493_26
						   .method6203(1383942055)) {
	    if ((-9137405677539835479L * class328_sub51.aLong7762
		 & 0x3fffffffffffffffL)
		< l) {
		if (0L != (class328_sub51.aLong7762 * -9137405677539835479L
			   & 0x4000000000000000L)) {
		    int i_4_ = (int) (-557062242220330983L
				      * class328_sub51.aLong3991);
		    anIntArray28[i_4_] = ((Class2) this).anIntArray27[i_4_];
		    class328_sub51.method3960(-1433497304);
		    return i_4_;
		}
		class328_sub51.method3960(-752558633);
	    }
	}
	return -1;
    }
    
    public void method280(int i, int i_5_, byte i_6_) {
	anIntArray28[i] = i_5_;
	Class328_Sub51 class328_sub51
	    = ((Class328_Sub51)
	       ((Class2) this).aClass493_26.method6198((long) i));
	if (class328_sub51 != null)
	    class328_sub51.aLong7762 = (Class312.method3765((byte) -24)
					+ 500L) * -986984557847874919L;
	else {
	    class328_sub51
		= new Class328_Sub51(Class312.method3765((byte) -13) + 500L);
	    ((Class2) this).aClass493_26.method6200(class328_sub51, (long) i);
	}
    }
    
    void method281(int i, int i_7_, short i_8_) {
	((Class2) this).anIntArray27[i] = i_7_;
	Class328_Sub51 class328_sub51
	    = ((Class328_Sub51)
	       ((Class2) this).aClass493_26.method6198((long) i));
	if (null != class328_sub51) {
	    if (class328_sub51.aLong7762 * -9137405677539835479L
		!= 4611686018427387905L)
		class328_sub51.aLong7762
		    = (Class312.method3765((byte) -80) + 500L
		       | 0x4000000000000000L) * -986984557847874919L;
	} else {
	    class328_sub51 = new Class328_Sub51(4611686018427387905L);
	    ((Class2) this).aClass493_26.method6200(class328_sub51, (long) i);
	}
    }
    
    void method282(byte i) {
	for (int i_9_ = 0;
	     i_9_ < Class406.aClass229_4904.anInt2946 * -984407541; i_9_++) {
	    ((Class2) this).anIntArray27[i_9_] = 0;
	    anIntArray28[i_9_] = 0;
	}
	((Class2) this).aClass493_26 = new Class493(128);
    }
    
    void method283(int i, int i_10_, byte i_11_) {
	Class375 class375
	    = Class328_Sub23.aClass356_7469.method4424(i, 480635534);
	int i_12_ = class375.anInt4602 * -227713791;
	int i_13_ = class375.anInt4603 * 340677921;
	int i_14_ = 1230410519 * class375.anInt4604;
	int i_15_ = anIntArray25[i_14_ - i_13_];
	if (i_10_ < 0 || i_10_ > i_15_)
	    i_10_ = 0;
	i_15_ <<= i_13_;
	method281(i_12_,
		  (((Class2) this).anIntArray27[i_12_] & (i_15_ ^ 0xffffffff)
		   | i_10_ << i_13_ & i_15_),
		  (short) 255);
    }
    
    public int method226(int i) {
	return anIntArray28[i];
    }
    
    public int method224(int i, byte i_16_) {
	Class375 class375
	    = Class328_Sub23.aClass356_7469.method4424(i, -1183873653);
	int i_17_ = -227713791 * class375.anInt4602;
	int i_18_ = class375.anInt4603 * 340677921;
	int i_19_ = class375.anInt4604 * 1230410519;
	int i_20_ = anIntArray25[i_19_ - i_18_];
	return anIntArray28[i_17_] >> i_18_ & i_20_;
    }
    
    static {
	int i = 2;
	for (int i_21_ = 0; i_21_ < 32; i_21_++) {
	    anIntArray25[i_21_] = i - 1;
	    i += i;
	}
    }
    
    void method284(int i, int i_22_) {
	((Class2) this).anIntArray27[i] = i_22_;
	Class328_Sub51 class328_sub51
	    = ((Class328_Sub51)
	       ((Class2) this).aClass493_26.method6198((long) i));
	if (null != class328_sub51) {
	    if (class328_sub51.aLong7762 * -9137405677539835479L
		!= 4611686018427387905L)
		class328_sub51.aLong7762
		    = (Class312.method3765((byte) -110) + 500L
		       | 0x4000000000000000L) * -986984557847874919L;
	} else {
	    class328_sub51 = new Class328_Sub51(4611686018427387905L);
	    ((Class2) this).aClass493_26.method6200(class328_sub51, (long) i);
	}
    }
    
    public void method285(int i, int i_23_) {
	anIntArray28[i] = i_23_;
	Class328_Sub51 class328_sub51
	    = ((Class328_Sub51)
	       ((Class2) this).aClass493_26.method6198((long) i));
	if (class328_sub51 != null)
	    class328_sub51.aLong7762 = (Class312.method3765((byte) -99)
					+ 500L) * -986984557847874919L;
	else {
	    class328_sub51
		= new Class328_Sub51(Class312.method3765((byte) -46) + 500L);
	    ((Class2) this).aClass493_26.method6200(class328_sub51, (long) i);
	}
    }
    
    void method286(int i, int i_24_) {
	((Class2) this).anIntArray27[i] = i_24_;
	Class328_Sub51 class328_sub51
	    = ((Class328_Sub51)
	       ((Class2) this).aClass493_26.method6198((long) i));
	if (null != class328_sub51) {
	    if (class328_sub51.aLong7762 * -9137405677539835479L
		!= 4611686018427387905L)
		class328_sub51.aLong7762
		    = (Class312.method3765((byte) -26) + 500L
		       | 0x4000000000000000L) * -986984557847874919L;
	} else {
	    class328_sub51 = new Class328_Sub51(4611686018427387905L);
	    ((Class2) this).aClass493_26.method6200(class328_sub51, (long) i);
	}
    }
    
    public int method228(int i, int i_25_) {
	return anIntArray28[i];
    }
    
    public int method225(int i) {
	return anIntArray28[i];
    }
    
    public void method287(int i, int i_26_, byte i_27_) {
	Class375 class375
	    = Class328_Sub23.aClass356_7469.method4424(i, 532908500);
	int i_28_ = -227713791 * class375.anInt4602;
	int i_29_ = 340677921 * class375.anInt4603;
	int i_30_ = 1230410519 * class375.anInt4604;
	int i_31_ = anIntArray25[i_30_ - i_29_];
	if (i_26_ < 0 || i_26_ > i_31_)
	    i_26_ = 0;
	i_31_ <<= i_29_;
	method280(i_28_, (anIntArray28[i_28_] & (i_31_ ^ 0xffffffff)
			  | i_26_ << i_29_ & i_31_), (byte) 1);
    }
    
    void method288() {
	for (int i = 0; i < Class406.aClass229_4904.anInt2946 * -984407541;
	     i++) {
	    ((Class2) this).anIntArray27[i] = 0;
	    anIntArray28[i] = 0;
	}
	((Class2) this).aClass493_26 = new Class493(128);
    }
    
    public int method227(int i) {
	Class375 class375
	    = Class328_Sub23.aClass356_7469.method4424(i, -408169682);
	int i_32_ = -227713791 * class375.anInt4602;
	int i_33_ = class375.anInt4603 * 340677921;
	int i_34_ = class375.anInt4604 * 1230410519;
	int i_35_ = anIntArray25[i_34_ - i_33_];
	return anIntArray28[i_32_] >> i_33_ & i_35_;
    }
    
    static void method289(int i) {
	if (null != Class19.aFileOutputStream206) {
	    try {
		Class19.aFileOutputStream206.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	Class19.aFileOutputStream206 = null;
    }
    
    static final void method290(Class412 class412, byte i) {
	int i_36_ = (((Class412) class412).anIntArray4950
		     [((Class412) class412).anInt4952 * 417925363]);
	((Class412) class412).anIntArray4927
	    [(((Class412) class412).anInt4944 += 1336678779) * -1097736781 - 1]
	    = ((Class405_Sub1_Sub4_Sub3_Sub1)
	       ((Class412) class412).aClass405_Sub1_Sub4_Sub3_4949)
		  .aClass82_10593.method1188(i_36_, 1300408010);
    }
    
    static final void method291(Class412 class412, int i) {
	((Class412) class412).anIntArray4927
	    [(((Class412) class412).anInt4944 += 1336678779) * -1097736781 - 1]
	    = Class399.localPlayer.aClass13_10496
		  .method437(-1132972466) >> 3;
    }
    
    static final void method292(Class412 class412, int i) {
	((Class412) class412).anIntArray4927
	    [(((Class412) class412).anInt4944 += 1336678779) * -1097736781 - 1]
	    = Class196.preferences.aClass464_Sub9_7618
		  .method7503(-1603424166) == 1 ? 1 : 0;
    }
    
    public static boolean method293(int i, int i_37_) {
	return i == 0 || 2 == i;
    }
}
