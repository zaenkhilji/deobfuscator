
public class Class29
{
    byte aByte536;
    boolean aBool537;
    int anInt538;
    short aShort539;
    byte aByte540;
    short aShort541;
    short aShort542;
    int anInt543;
    
    Class29(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
	    int i_6_, int i_7_, boolean bool, int i_8_) {
	((Class29) this).anInt538 = 1791994233 * i;
	((Class29) this).aShort542 = (short) i_3_;
	((Class29) this).aShort541 = (short) i_4_;
	((Class29) this).aShort539 = (short) i_5_;
	((Class29) this).aByte536 = (byte) i_6_;
	((Class29) this).aByte540 = (byte) i_7_;
	((Class29) this).aBool537 = bool;
	((Class29) this).anInt543 = i_8_ * 363892367;
    }
    
    static final int method596(int i, int i_9_, int i_10_) {
	int i_11_
	    = (Class434.method5581(i + 45365, i_9_ + 91923, 4, 151455623) - 128
	       + ((Class434.method5581(10294 + i, i_9_ + 37821, 2, -574461257)
		   - 128)
		  >> 1)
	       + (Class434.method5581(i, i_9_, 1, 487355826) - 128 >> 2));
	i_11_ = 35 + (int) ((double) i_11_ * 0.3);
	if (i_11_ < 10)
	    i_11_ = 10;
	else if (i_11_ > 60)
	    i_11_ = 60;
	return i_11_;
    }
    
    static void method597(Class412 class412, int i) {
	((Class412) class412).anIntArray4927
	    [((Class412) class412).anInt4944 * -1097736781 - 2]
	    = (Class157.aClass392_2035.method4893
		   ((((Class412) class412).anIntArray4927
		     [((Class412) class412).anInt4944 * -1097736781 - 2]),
		    (byte) -57)
		   .method4952
	       (client.anIntArray8034,
		(((Class412) class412).anIntArray4927
		 [-1097736781 * ((Class412) class412).anInt4944 - 1]),
		-1650966729)) ? 1 : 0;
	((Class412) class412).anInt4944 -= 1336678779;
    }
    
    static final void method598(Class412 class412, byte i) {
	int i_12_ = (((Class412) class412).anIntArray4950
		     [((Class412) class412).anInt4952 * 417925363]);
	((Class412) class412).anIntArray4927
	    [(((Class412) class412).anInt4944 += 1336678779) * -1097736781 - 1]
	    = ((Player)
	       ((Class412) class412).aClass405_Sub1_Sub4_Sub3_4949)
		  .aClass78_10614.method1146(i_12_, -1318745864);
    }
    
    static final void method599(Class412 class412, byte i) {
	int i_13_ = (((Class412) class412).anIntArray4927
		     [((((Class412) class412).anInt4944 -= 1336678779)
		       * -1097736781)]);
	((Class412) class412).anIntArray4927
	    [(((Class412) class412).anInt4944 += 1336678779) * -1097736781 - 1]
	    = i_13_ & 0x3fff;
    }
    
    static final void method600(Class412 class412, int i) {
	if (Class455.aBool6210 && Class260.aFrame3205 != null)
	    Class227.method2687(Class196.preferences
				    .aClass464_Sub16_7616
				    .method7569(-762948788),
				-1, -1, false, (short) -13998);
	if (Class367.method4591((byte) -4) == Class312.aClass312_3873) {
	    Class319_Sub2.method6702(-832241152);
	    System.exit(0);
	} else
	    Class257.method3077(-1151871645);
    }
}
