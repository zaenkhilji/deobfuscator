
import java.awt.EventQueue;

public class Class34
{
    int anInt607;
    int anInt608;
    float aFloat609;
    float aFloat610 = 1.0F;
    int anInt611;
    int anInt612;
    int anInt613;
    int anInt614;
    int anInt615;
    int anInt616;
    float aFloat617;
    static EventQueue anEventQueue618;
    public static Class318 aClass318_619;
    static Class294 aClass294_620;
    
    Class34(int i, float f, float f_0_, int i_1_, int i_2_, int i_3_) {
	((Class34) this).aFloat609 = 1.0F;
	((Class34) this).anInt607 = 462984017 * i;
	((Class34) this).aFloat610 = f;
	((Class34) this).aFloat609 = f_0_;
	((Class34) this).anInt608 = -914097357 * i_1_;
	((Class34) this).anInt611 = i_2_ * -1070221961;
	((Class34) this).anInt612 = i_3_ * -307944863;
    }
    
    void method678(Class34 class34_4_, int i) {
	((Class34) this).aFloat610 = ((Class34) class34_4_).aFloat610;
	((Class34) this).aFloat609 = ((Class34) class34_4_).aFloat609;
	((Class34) this).anInt608 = ((Class34) class34_4_).anInt608 * 1;
	((Class34) this).anInt611 = 1 * ((Class34) class34_4_).anInt611;
	((Class34) this).anInt607 = ((Class34) class34_4_).anInt607 * 1;
	((Class34) this).anInt612 = 1 * ((Class34) class34_4_).anInt612;
    }
    
    Class34(int i) {
	((Class34) this).aFloat609 = 1.0F;
	((Class34) this).anInt607 = 462984017 * i;
    }
    
    Class34 method679(int i) {
	return new Class34(((Class34) this).anInt607 * -1467705935,
			   ((Class34) this).aFloat610,
			   ((Class34) this).aFloat609,
			   ((Class34) this).anInt608 * 115111931,
			   ((Class34) this).anInt611 * -78269369,
			   -1427963487 * ((Class34) this).anInt612);
    }
    
    public static Class350 method680(Archive class275, String string,
				     boolean bool, byte i) {
	int i_5_ = class275.method3323(string, (byte) -79);
	if (i_5_ == -1)
	    return new Class350(0);
	int[] is = class275.method3318(i_5_, 1608755547);
	Class350 class350 = new Class350(is.length);
	int i_6_ = 0;
	int i_7_ = 0;
	while (i_6_ < -2135217643 * class350.anInt4341) {
	    Buffer class328_sub31
		= new Buffer(class275.method3337(i_5_, is[i_7_++],
							 (short) 370));
	    int i_8_ = class328_sub31.readInt(1525663622);
	    int i_9_ = class328_sub31.readUShort((byte) -70);
	    int i_10_ = class328_sub31.readUByte(1345583218);
	    if (bool || 1 != i_10_) {
		class350.anIntArray4342[i_6_] = i_8_;
		class350.anIntArray4343[i_6_] = i_9_;
		i_6_++;
	    } else
		class350.anInt4341 -= -1774824131;
	}
	return class350;
    }
    
    static final void method681(Class412 class412, int i) {
	boolean bool = ((((Class412) class412).anIntArray4927
			 [((((Class412) class412).anInt4944 -= 1336678779)
			   * -1097736781)])
			== 1);
	Class196.preferences.method7201((Class196.preferences
						  .aClass464_Sub10_7611),
						 bool ? 2 : 1, -1937433093);
	Class196.preferences.method7201((Class196.preferences
						  .aClass464_Sub10_7625),
						 bool ? 2 : 1, -1499881562);
	Class460.method5837((byte) 1);
	Class365.method4554((byte) 99);
	client.aBool8259 = false;
    }
    
    static final void method682(Class121 class121, Class122 class122,
				Class412 class412, byte i) {
	String string = (String) (((Class412) class412).anObjectArray4933
				  [(((Class412) class412).anInt4938
				    -= -1905978417) * 783749935]);
	if (Class331.method4019(string, class412, (byte) 30) != null)
	    string = string.substring(0, string.length() - 1);
	class121.anObjectArray1506
	    = Class465.method5927(string, class412, -383973009);
	class121.aBool1433 = true;
    }
    
    static void method683
	(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_,
	 int i_16_, Class328_Sub45_Sub5 class328_sub45_sub5, Font class9,
	 FontSpecification class508, int i_17_, int i_18_, byte i_19_) {
	if (i > i_12_ && i < i_12_ + i_14_
	    && i_11_ > i_16_ - -1179570097 * class508.anInt6844 - 1
	    && i_11_ < class508.anInt6848 * 702698829 + i_16_
	    && ((Class328_Sub45_Sub5) class328_sub45_sub5).aBool10094)
	    i_17_ = i_18_;
	int[] is = client.method7834(class328_sub45_sub5, 117730470);
	String string = Class224.method2667(class328_sub45_sub5, 1429752953);
	if (null != is)
	    string = new StringBuilder().append(string).append
			 (Class11.method424(is, (byte) 1)).toString();
	class9.method399(string, 3 + i_12_, i_16_, i_17_, 0,
			 client.aRandom8044, -888676805 * Class246.anInt3086,
			 Class390_Sub2.aClass72Array7852,
			 Class456.anIntArray6226, (byte) 118);
	if (((Class328_Sub45_Sub5) class328_sub45_sub5).aBool10095)
	    Class456_Sub1.aClass72_7876.method1061
		(5 + i_12_ + class508.textWidth(string, -1941016942),
		 i_16_ - class508.anInt6844 * -1179570097);
    }
    
    static final void method684(Class412 class412, int i) {
	Class403 class403 = (((Class412) class412).aBool4954
			     ? ((Class412) class412).aClass403_4936
			     : ((Class412) class412).aClass403_4934);
	Class121 class121 = ((Class403) class403).aClass121_4887;
	Class122 class122 = ((Class403) class403).aClass122_4888;
	Class273.method3280(class121, class122, class412, -2004566623);
    }
}
