

public class Class5
{
    static String aString38;
    static String aString39;
    static String aString40;
    static String aString41 = "true";
    static String aString42;
    static String aString43;
    static String aString44;
    public static String aString45;
    public static Class516 aClass516_46;
    
    Class5() throws Throwable {
	throw new Error();
    }
    
    static {
	aString39 = ",";
	aString43 = " (";
	aString44 = ")";
	aString42 = "->";
	aString38 = "127.0.0.1";
	aString45 = "<br>";
	aString40 = "</col>";
    }
    
    public static String method322(int i) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
    
    public static boolean method323(int i, int[] is, int i_0_) {
	if (Class317_Sub2.aBoolArray7193[i])
	    return true;
	Class96.aClass122Array1098[i]
	    = Class394.method4945(i, is, Class96.aClass122Array1098[i], false,
				  -1428410954);
	if (Class96.aClass122Array1098[i] == null)
	    return false;
	Class317_Sub2.aBoolArray7193[i] = true;
	return true;
    }
    
    public static void method324
	(Player class405_sub1_sub4_sub3_sub2, int i) {
	Class328_Sub46 class328_sub46
	    = ((Class328_Sub46)
	       (Class328_Sub46.aClass493_7674.method6198
		((long) (812393755
			 * class405_sub1_sub4_sub3_sub2.anInt10451))));
	if (null == class328_sub46)
	    Class116.method1561(class405_sub1_sub4_sub3_sub2.aByte7857,
				(class405_sub1_sub4_sub3_sub2.anIntArray10512
				 [0]),
				(class405_sub1_sub4_sub3_sub2.anIntArray10500
				 [0]),
				0, null, null, class405_sub1_sub4_sub3_sub2,
				(byte) 1);
	else
	    class328_sub46.method7259(-822972411);
    }
    
    static Class370 method325(Buffer class328_sub31, int i) {
	int i_1_ = class328_sub31.readUByte(-296818339);
	int i_2_ = class328_sub31.readUByte(-1402763991);
	return new Class370(i_1_, i_2_);
    }
}
