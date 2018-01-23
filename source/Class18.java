

public class Class18
{
    public String aString195;
    public String aString196;
    public int anInt197;
    public String aString198;
    public int anInt199;
    public int anInt200;
    public boolean aBool201;
    public int anInt202;
    public static Class357 aClass357_203;
    
    Class18() {
	/* empty */
    }
    
    public static byte[] method508(String string, byte i) {
	int i_0_ = string.length();
	if (0 == i_0_)
	    return new byte[0];
	int i_1_ = i_0_ + 3 & ~0x3;
	int i_2_ = i_1_ / 4 * 3;
	if (i_1_ - 2 >= i_0_
	    || Class103.method1429(string.charAt(i_1_ - 2), 1506749385) == -1)
	    i_2_ -= 2;
	else if (i_1_ - 1 >= i_0_
		 || (Class103.method1429(string.charAt(i_1_ - 1), 424630647)
		     == -1))
	    i_2_--;
	byte[] is = new byte[i_2_];
	Class344.method4211(string, is, 0, 519827694);
	return is;
    }
    
    static final void method509(Class412 class412, int i) {
	((Class412) class412).anInt4938 -= 483010462;
	((Class412) class412).anInt4944 -= -1621609738;
	Class100.method1409
	    ((String) (((Class412) class412).anObjectArray4933
		       [((Class412) class412).anInt4938 * 783749935]),
	     (String) (((Class412) class412).anObjectArray4933
		       [1 + 783749935 * ((Class412) class412).anInt4938]),
	     (((Class412) class412).anIntArray4927
	      [-1097736781 * ((Class412) class412).anInt4944]),
	     1 == (((Class412) class412).anIntArray4927
		   [1 + -1097736781 * ((Class412) class412).anInt4944]),
	     1996163401);
    }
}
