
import java.awt.Canvas;
import java.util.Date;

public class Class3
{
    public static int anInt31;
    
    static void method294() {
	/* empty */
    }
    
    static void method295() {
	/* empty */
    }
    
    Class3() throws Throwable {
	throw new Error();
    }
    
    static void method296() {
	/* empty */
    }
    
    public static int method297() {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class425 class425
	    = Class339.method4140(0, canvas, null, null, 0, 1546091080);
	long l = Class312.method3765((byte) -13);
	for (int i = 0; i < 10000; i++)
	    class425.method5396(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i = (int) (Class312.method3765((byte) -49) - l);
	class425.method5304(0, 0, 100, 100, -16777216, -93711587);
	class425.method5382(384652306);
	return i;
    }
    
    public static int method298(int i, int i_0_, int i_1_, int i_2_) {
	i_1_ &= 0x3;
	if (0 == i_1_)
	    return i;
	if (i_1_ == 1)
	    return i_0_;
	if (2 == i_1_)
	    return 4095 - i;
	return 4095 - i_0_;
    }
    
    public static int method299(short i) {
	return -1653133637 * Class393.anInt4762;
    }
    
    static final void method300(Class412 class412, byte i) {
	if (Class455.aBool6210) {
	    Class451[] class451s = Class480.method6071(298106052);
	    ((Class412) class412).anIntArray4927
		[((((Class412) class412).anInt4944 += 1336678779) * -1097736781
		  - 1)]
		= class451s.length;
	} else
	    ((Class412) class412).anIntArray4927
		[((((Class412) class412).anInt4944 += 1336678779) * -1097736781
		  - 1)]
		= 0;
    }
    
    static final void method301(Class412 class412, int i) {
	Class428.method5544((byte) 5);
    }
    
    static void method302(long l) {
	Class512.aCalendar6931.setTime(new Date(l));
    }
    
    public static final void method303(String string, int i) {
	if (null != string) {
	    String string_3_ = Class456.method5781(string, -110646199);
	    if (string_3_ != null) {
		for (int i_4_ = 0; i_4_ < -1735667973 * client.anInt8238;
		     i_4_++) {
		    Class10 class10 = client.aClass10Array8240[i_4_];
		    String string_5_ = class10.aString119;
		    String string_6_
			= Class456.method5781(string_5_, -894613506);
		    if (Class225.method2680(string, string_3_, string_5_,
					    string_6_, 16711935)) {
			client.anInt8238 -= 951454771;
			for (int i_7_ = i_4_;
			     i_7_ < -1735667973 * client.anInt8238; i_7_++)
			    client.aClass10Array8240[i_7_]
				= client.aClass10Array8240[1 + i_7_];
			client.anInt8176 = client.anInt8160 * 1042317209;
			Class33 class33 = Class460.method5838(2008515824);
			Class328_Sub24 class328_sub24
			    = Class379.method4707(OutgoingFrameMeta.aClass226_2852,
						  class33.aClass495_590,
						  2061629088);
			class328_sub24.aClass328_Sub31_Sub2_7471.writeByte
			    (Class328_Sub2.method6742(string, -993133920),
			     -1323622611);
			class328_sub24.aClass328_Sub31_Sub2_7471
			    .writeCString(string, -2146585035);
			class33.method652(class328_sub24, -1828999000);
			break;
		    }
		}
	    }
	}
    }
    
    static final void method304(int i, int i_8_, int i_9_, int i_10_,
				int i_11_, int i_12_, int i_13_, byte i_14_) {
	if (426181619 * client.anInt8185 == 1) {
	    int i_15_ = Class41.anInt713 * -300683199;
	    int[] is = Class41.anIntArray720;
	    for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
		Player class405_sub1_sub4_sub3_sub2
		    = client.players[is[i_16_]];
		if (class405_sub1_sub4_sub3_sub2 != null)
		    class405_sub1_sub4_sub3_sub2.method9416(i, i_8_, i_9_,
							    i_10_, i_11_,
							    i_12_, i_13_,
							    -2043748159);
	    }
	    for (int i_17_ = 0; i_17_ < -1948866823 * client.anInt8236;
		 i_17_++) {
		int i_18_ = client.anIntArray7996[i_17_];
		Class328_Sub38 class328_sub38
		    = ((Class328_Sub38)
		       client.aClass493_7976.method6198((long) i_18_));
		if (null != class328_sub38)
		    ((Class405_Sub1_Sub4_Sub3) class328_sub38.anObject7600)
			.method9416
			(i, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_,
			 -1972265062);
	    }
	}
    }
}
