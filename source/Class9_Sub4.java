
public class Class9_Sub4 extends Font
{
    int[] anIntArray8845;
    byte[][] aByteArrayArray8846;
    int[] anIntArray8847;
    Class425_Sub2 aClass425_Sub2_8848;
    int[] anIntArray8849;
    int[] anIntArray8850;
    
    void UA(char c, int i, int i_0_, int i_1_, boolean bool) {
	if (null != (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anIntArray8887)) {
	    i += ((Class9_Sub4) this).anIntArray8847[c];
	    i_0_ += ((Class9_Sub4) this).anIntArray8850[c];
	    int i_2_ = ((Class9_Sub4) this).anIntArray8845[c];
	    int i_3_ = ((Class9_Sub4) this).anIntArray8849[c];
	    int i_4_
		= ((((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		    .anInt8890)
		   * -728919167);
	    int i_5_ = i_0_ * i_4_ + i;
	    int i_6_ = i_4_ - i_2_;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    if (i_0_
		< (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		   .anInt8877) * 547939757) {
		int i_9_ = ((((Class425_Sub2) (((Class9_Sub4) this)
					       .aClass425_Sub2_8848)).anInt8877
			     * 547939757)
			    - i_0_);
		i_3_ -= i_9_;
		i_0_ = 547939757 * (((Class425_Sub2)
				     ((Class9_Sub4) this).aClass425_Sub2_8848)
				    .anInt8877);
		i_8_ += i_2_ * i_9_;
		i_5_ += i_4_ * i_9_;
	    }
	    if (i_3_ + i_0_
		> -926266187 * (((Class425_Sub2)
				 ((Class9_Sub4) this).aClass425_Sub2_8848)
				.anInt8878))
		i_3_ -= i_0_ + i_3_ - (((Class425_Sub2) (((Class9_Sub4) this)
							 .aClass425_Sub2_8848))
				       .anInt8878) * -926266187;
	    if (i < (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anInt8875) * -124745859) {
		int i_10_
		    = (-124745859 * (((Class425_Sub2)
				      ((Class9_Sub4) this).aClass425_Sub2_8848)
				     .anInt8875)
		       - i);
		i_2_ -= i_10_;
		i = (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anInt8875) * -124745859;
		i_8_ += i_10_;
		i_5_ += i_10_;
		i_7_ += i_10_;
		i_6_ += i_10_;
	    }
	    if (i_2_ + i
		> (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		   .anInt8876) * -2088037891) {
		int i_11_
		    = i + i_2_ - (((Class425_Sub2)
				   ((Class9_Sub4) this).aClass425_Sub2_8848)
				  .anInt8876) * -2088037891;
		i_2_ -= i_11_;
		i_7_ += i_11_;
		i_6_ += i_11_;
	    }
	    if (i_2_ > 0 && i_3_ > 0)
		method8130(((Class9_Sub4) this).aByteArrayArray8846[c],
			   (((Class425_Sub2)
			     ((Class9_Sub4) this).aClass425_Sub2_8848)
			    .anIntArray8887),
			   i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
	}
    }
    
    Class9_Sub4(Class425_Sub2 class425_sub2, FontSpecification class508,
		IndexedImage[] class99_sub2s, int[] is, int[] is_12_) {
	super(class425_sub2, class508);
	((Class9_Sub4) this).aClass425_Sub2_8848 = class425_sub2;
	((Class9_Sub4) this).aClass425_Sub2_8848 = class425_sub2;
	((Class9_Sub4) this).anIntArray8845 = is;
	((Class9_Sub4) this).anIntArray8849 = is_12_;
	((Class9_Sub4) this).aByteArrayArray8846
	    = new byte[class99_sub2s.length][];
	((Class9_Sub4) this).anIntArray8850 = new int[class99_sub2s.length];
	((Class9_Sub4) this).anIntArray8847 = new int[class99_sub2s.length];
	for (int i = 0; i < class99_sub2s.length; i++) {
	    IndexedImage class99_sub2 = class99_sub2s[i];
	    if (null != class99_sub2.alpha)
		((Class9_Sub4) this).aByteArrayArray8846[i]
		    = class99_sub2.alpha;
	    else {
		byte[] is_13_ = class99_sub2.raster;
		byte[] is_14_ = (((Class9_Sub4) this).aByteArrayArray8846[i]
				 = new byte[is_13_.length]);
		for (int i_15_ = 0; i_15_ < is_13_.length; i_15_++)
		    is_14_[i_15_] = (byte) (is_13_[i_15_] == 0 ? 0 : -1);
	    }
	    ((Class9_Sub4) this).anIntArray8850[i] = class99_sub2.offsetY;
	    ((Class9_Sub4) this).anIntArray8847[i] = class99_sub2.offsetX;
	}
    }
    
    void method406(char c, int i, int i_16_, int i_17_, boolean bool,
		   Class475 class475, int i_18_, int i_19_) {
	if (null != (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anIntArray8887)) {
	    if (class475 == null)
		UA(c, i, i_16_, i_17_, bool);
	    else {
		i += ((Class9_Sub4) this).anIntArray8847[c];
		i_16_ += ((Class9_Sub4) this).anIntArray8850[c];
		int i_20_ = ((Class9_Sub4) this).anIntArray8845[c];
		int i_21_ = ((Class9_Sub4) this).anIntArray8849[c];
		int i_22_ = (((Class425_Sub2) (((Class9_Sub4) this)
					       .aClass425_Sub2_8848)).anInt8890
			     * -728919167);
		int i_23_ = i + i_22_ * i_16_;
		int i_24_ = i_22_ - i_20_;
		int i_25_ = 0;
		int i_26_ = 0;
		if (i_16_ < (((Class425_Sub2) (((Class9_Sub4) this)
					       .aClass425_Sub2_8848)).anInt8877
			     * 547939757)) {
		    int i_27_
			= 547939757 * (((Class425_Sub2) (((Class9_Sub4) this)
							 .aClass425_Sub2_8848))
				       .anInt8877) - i_16_;
		    i_21_ -= i_27_;
		    i_16_
			= 547939757 * (((Class425_Sub2) (((Class9_Sub4) this)
							 .aClass425_Sub2_8848))
				       .anInt8877);
		    i_26_ += i_20_ * i_27_;
		    i_23_ += i_22_ * i_27_;
		}
		if (i_21_ + i_16_
		    > -926266187 * (((Class425_Sub2)
				     ((Class9_Sub4) this).aClass425_Sub2_8848)
				    .anInt8878))
		    i_21_ -= (i_21_ + i_16_
			      - (((Class425_Sub2)
				  ((Class9_Sub4) this).aClass425_Sub2_8848)
				 .anInt8878) * -926266187);
		if (i < -124745859 * (((Class425_Sub2) (((Class9_Sub4) this)
							.aClass425_Sub2_8848))
				      .anInt8875)) {
		    int i_28_
			= (-124745859 * ((Class425_Sub2)
					 (((Class9_Sub4) this)
					  .aClass425_Sub2_8848)).anInt8875
			   - i);
		    i_20_ -= i_28_;
		    i = (((Class425_Sub2)
			  ((Class9_Sub4) this).aClass425_Sub2_8848).anInt8875
			 * -124745859);
		    i_26_ += i_28_;
		    i_23_ += i_28_;
		    i_25_ += i_28_;
		    i_24_ += i_28_;
		}
		if (i + i_20_ > (((Class425_Sub2)
				  ((Class9_Sub4) this).aClass425_Sub2_8848)
				 .anInt8876) * -2088037891) {
		    int i_29_
			= i_20_ + i - (((Class425_Sub2) (((Class9_Sub4) this)
							 .aClass425_Sub2_8848))
				       .anInt8876) * -2088037891;
		    i_20_ -= i_29_;
		    i_25_ += i_29_;
		    i_24_ += i_29_;
		}
		if (i_20_ > 0 && i_21_ > 0)
		    method8129(((Class9_Sub4) this).aByteArrayArray8846[c],
			       (((Class425_Sub2)
				 ((Class9_Sub4) this).aClass425_Sub2_8848)
				.anIntArray8887),
			       i_17_, i_26_, i_23_, i_20_, i_21_, i_24_, i_25_,
			       i, i_16_,
			       ((Class9_Sub4) this).anIntArray8845[c],
			       class475, i_18_, i_19_);
	    }
	}
    }
    
    void method8129(byte[] is, int[] is_30_, int i, int i_31_, int i_32_,
		    int i_33_, int i_34_, int i_35_, int i_36_, int i_37_,
		    int i_38_, int i_39_, Class475 class475, int i_40_,
		    int i_41_) {
	Class475_Sub1 class475_sub1 = (Class475_Sub1) class475;
	int[] is_42_ = ((Class475_Sub1) class475_sub1).anIntArray8836;
	int[] is_43_ = ((Class475_Sub1) class475_sub1).anIntArray8837;
	int i_44_
	    = (i_37_
	       - (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		  .anInt8875) * -124745859);
	int i_45_ = i_38_;
	if (i_41_ > i_45_) {
	    i_45_ = i_41_;
	    i_32_ += -728919167 * (((Class425_Sub2)
				    ((Class9_Sub4) this).aClass425_Sub2_8848)
				   .anInt8890) * (i_41_ - i_38_);
	    i_31_ += i_39_ * (i_41_ - i_38_);
	}
	int i_46_ = (i_41_ + is_42_.length < i_38_ + i_34_
		     ? is_42_.length + i_41_ : i_38_ + i_34_);
	for (int i_47_ = i_45_; i_47_ < i_46_; i_47_++) {
	    int i_48_ = i_40_ + is_42_[i_47_ - i_41_];
	    int i_49_ = is_43_[i_47_ - i_41_];
	    int i_50_ = i_33_;
	    if (i_44_ > i_48_) {
		int i_51_ = i_44_ - i_48_;
		if (i_51_ >= i_49_) {
		    i_31_ += i_36_ + i_33_;
		    i_32_ += i_35_ + i_33_;
		    continue;
		}
		i_49_ -= i_51_;
	    } else {
		int i_52_ = i_48_ - i_44_;
		if (i_52_ >= i_33_) {
		    i_31_ += i_33_ + i_36_;
		    i_32_ += i_35_ + i_33_;
		    continue;
		}
		i_31_ += i_52_;
		i_50_ -= i_52_;
		i_32_ += i_52_;
	    }
	    int i_53_ = 0;
	    if (i_50_ < i_49_)
		i_49_ = i_50_;
	    else
		i_53_ = i_50_ - i_49_;
	    for (int i_54_ = -i_49_; i_54_ < 0; i_54_++) {
		int i_55_ = is[i_31_++] & 0xff;
		if (0 != i_55_) {
		    int i_56_ = (((i_55_ * (i & 0xff00ff) & ~0xff00ff)
				  + (i_55_ * (i & 0xff00) & 0xff0000))
				 >> 8);
		    i_55_ = 256 - i_55_;
		    int i_57_ = is_30_[i_32_];
		    is_30_[i_32_++]
			= i_56_ + ((((i_57_ & 0xff00ff) * i_55_ & ~0xff00ff)
				    + (i_55_ * (i_57_ & 0xff00) & 0xff0000))
				   >> 8);
		} else
		    i_32_++;
	    }
	    i_31_ += i_36_ + i_53_;
	    i_32_ += i_53_ + i_35_;
	}
    }
    
    void c(char c, int i, int i_58_, int i_59_, boolean bool) {
	if (null != (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anIntArray8887)) {
	    i += ((Class9_Sub4) this).anIntArray8847[c];
	    i_58_ += ((Class9_Sub4) this).anIntArray8850[c];
	    int i_60_ = ((Class9_Sub4) this).anIntArray8845[c];
	    int i_61_ = ((Class9_Sub4) this).anIntArray8849[c];
	    int i_62_
		= ((((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		    .anInt8890)
		   * -728919167);
	    int i_63_ = i_58_ * i_62_ + i;
	    int i_64_ = i_62_ - i_60_;
	    int i_65_ = 0;
	    int i_66_ = 0;
	    if (i_58_
		< (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		   .anInt8877) * 547939757) {
		int i_67_ = ((((Class425_Sub2)
			       ((Class9_Sub4) this).aClass425_Sub2_8848)
			      .anInt8877) * 547939757
			     - i_58_);
		i_61_ -= i_67_;
		i_58_ = 547939757 * (((Class425_Sub2)
				      ((Class9_Sub4) this).aClass425_Sub2_8848)
				     .anInt8877);
		i_66_ += i_60_ * i_67_;
		i_63_ += i_62_ * i_67_;
	    }
	    if (i_61_ + i_58_
		> -926266187 * (((Class425_Sub2)
				 ((Class9_Sub4) this).aClass425_Sub2_8848)
				.anInt8878))
		i_61_ -= (i_58_ + i_61_
			  - (((Class425_Sub2) (((Class9_Sub4) this)
					       .aClass425_Sub2_8848)).anInt8878
			     * -926266187));
	    if (i < (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anInt8875) * -124745859) {
		int i_68_
		    = (-124745859 * (((Class425_Sub2)
				      ((Class9_Sub4) this).aClass425_Sub2_8848)
				     .anInt8875)
		       - i);
		i_60_ -= i_68_;
		i = (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anInt8875) * -124745859;
		i_66_ += i_68_;
		i_63_ += i_68_;
		i_65_ += i_68_;
		i_64_ += i_68_;
	    }
	    if (i_60_ + i
		> (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		   .anInt8876) * -2088037891) {
		int i_69_
		    = i + i_60_ - (((Class425_Sub2)
				    ((Class9_Sub4) this).aClass425_Sub2_8848)
				   .anInt8876) * -2088037891;
		i_60_ -= i_69_;
		i_65_ += i_69_;
		i_64_ += i_69_;
	    }
	    if (i_60_ > 0 && i_61_ > 0)
		method8130(((Class9_Sub4) this).aByteArrayArray8846[c],
			   (((Class425_Sub2)
			     ((Class9_Sub4) this).aClass425_Sub2_8848)
			    .anIntArray8887),
			   i_59_, i_66_, i_63_, i_60_, i_61_, i_64_, i_65_);
	}
    }
    
    void method8130(byte[] is, int[] is_70_, int i, int i_71_, int i_72_,
		    int i_73_, int i_74_, int i_75_, int i_76_) {
	for (int i_77_ = -i_74_; i_77_ < 0; i_77_++) {
	    for (int i_78_ = -i_73_; i_78_ < 0; i_78_++) {
		int i_79_ = is[i_71_++] & 0xff;
		if (i_79_ != 0) {
		    int i_80_ = ((((i & 0xff00ff) * i_79_ & ~0xff00ff)
				  + ((i & 0xff00) * i_79_ & 0xff0000))
				 >> 8);
		    i_79_ = 256 - i_79_;
		    int i_81_ = is_70_[i_72_];
		    is_70_[i_72_++]
			= i_80_ + (((i_79_ * (i_81_ & 0xff00) & 0xff0000)
				    + (i_79_ * (i_81_ & 0xff00ff) & ~0xff00ff))
				   >> 8);
		} else
		    i_72_++;
	    }
	    i_72_ += i_75_;
	    i_71_ += i_76_;
	}
    }
    
    void v(char c, int i, int i_82_, int i_83_, boolean bool) {
	if (null != (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anIntArray8887)) {
	    i += ((Class9_Sub4) this).anIntArray8847[c];
	    i_82_ += ((Class9_Sub4) this).anIntArray8850[c];
	    int i_84_ = ((Class9_Sub4) this).anIntArray8845[c];
	    int i_85_ = ((Class9_Sub4) this).anIntArray8849[c];
	    int i_86_
		= ((((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		    .anInt8890)
		   * -728919167);
	    int i_87_ = i_82_ * i_86_ + i;
	    int i_88_ = i_86_ - i_84_;
	    int i_89_ = 0;
	    int i_90_ = 0;
	    if (i_82_
		< (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		   .anInt8877) * 547939757) {
		int i_91_ = ((((Class425_Sub2)
			       ((Class9_Sub4) this).aClass425_Sub2_8848)
			      .anInt8877) * 547939757
			     - i_82_);
		i_85_ -= i_91_;
		i_82_ = 547939757 * (((Class425_Sub2)
				      ((Class9_Sub4) this).aClass425_Sub2_8848)
				     .anInt8877);
		i_90_ += i_84_ * i_91_;
		i_87_ += i_86_ * i_91_;
	    }
	    if (i_85_ + i_82_
		> -926266187 * (((Class425_Sub2)
				 ((Class9_Sub4) this).aClass425_Sub2_8848)
				.anInt8878))
		i_85_ -= (i_82_ + i_85_
			  - (((Class425_Sub2) (((Class9_Sub4) this)
					       .aClass425_Sub2_8848)).anInt8878
			     * -926266187));
	    if (i < (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anInt8875) * -124745859) {
		int i_92_
		    = (-124745859 * (((Class425_Sub2)
				      ((Class9_Sub4) this).aClass425_Sub2_8848)
				     .anInt8875)
		       - i);
		i_84_ -= i_92_;
		i = (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anInt8875) * -124745859;
		i_90_ += i_92_;
		i_87_ += i_92_;
		i_89_ += i_92_;
		i_88_ += i_92_;
	    }
	    if (i_84_ + i
		> (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		   .anInt8876) * -2088037891) {
		int i_93_
		    = i + i_84_ - (((Class425_Sub2)
				    ((Class9_Sub4) this).aClass425_Sub2_8848)
				   .anInt8876) * -2088037891;
		i_84_ -= i_93_;
		i_89_ += i_93_;
		i_88_ += i_93_;
	    }
	    if (i_84_ > 0 && i_85_ > 0)
		method8130(((Class9_Sub4) this).aByteArrayArray8846[c],
			   (((Class425_Sub2)
			     ((Class9_Sub4) this).aClass425_Sub2_8848)
			    .anIntArray8887),
			   i_83_, i_90_, i_87_, i_84_, i_85_, i_88_, i_89_);
	}
    }
    
    void method412(char c, int i, int i_94_, int i_95_, boolean bool,
		   Class475 class475, int i_96_, int i_97_) {
	if (null != (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anIntArray8887)) {
	    if (class475 == null)
		UA(c, i, i_94_, i_95_, bool);
	    else {
		i += ((Class9_Sub4) this).anIntArray8847[c];
		i_94_ += ((Class9_Sub4) this).anIntArray8850[c];
		int i_98_ = ((Class9_Sub4) this).anIntArray8845[c];
		int i_99_ = ((Class9_Sub4) this).anIntArray8849[c];
		int i_100_
		    = (((Class425_Sub2)
			((Class9_Sub4) this).aClass425_Sub2_8848).anInt8890
		       * -728919167);
		int i_101_ = i + i_100_ * i_94_;
		int i_102_ = i_100_ - i_98_;
		int i_103_ = 0;
		int i_104_ = 0;
		if (i_94_ < (((Class425_Sub2) (((Class9_Sub4) this)
					       .aClass425_Sub2_8848)).anInt8877
			     * 547939757)) {
		    int i_105_
			= 547939757 * (((Class425_Sub2) (((Class9_Sub4) this)
							 .aClass425_Sub2_8848))
				       .anInt8877) - i_94_;
		    i_99_ -= i_105_;
		    i_94_
			= 547939757 * (((Class425_Sub2) (((Class9_Sub4) this)
							 .aClass425_Sub2_8848))
				       .anInt8877);
		    i_104_ += i_98_ * i_105_;
		    i_101_ += i_100_ * i_105_;
		}
		if (i_99_ + i_94_
		    > -926266187 * (((Class425_Sub2)
				     ((Class9_Sub4) this).aClass425_Sub2_8848)
				    .anInt8878))
		    i_99_ -= (i_99_ + i_94_
			      - (((Class425_Sub2)
				  ((Class9_Sub4) this).aClass425_Sub2_8848)
				 .anInt8878) * -926266187);
		if (i < -124745859 * (((Class425_Sub2) (((Class9_Sub4) this)
							.aClass425_Sub2_8848))
				      .anInt8875)) {
		    int i_106_
			= (-124745859 * ((Class425_Sub2)
					 (((Class9_Sub4) this)
					  .aClass425_Sub2_8848)).anInt8875
			   - i);
		    i_98_ -= i_106_;
		    i = (((Class425_Sub2)
			  ((Class9_Sub4) this).aClass425_Sub2_8848).anInt8875
			 * -124745859);
		    i_104_ += i_106_;
		    i_101_ += i_106_;
		    i_103_ += i_106_;
		    i_102_ += i_106_;
		}
		if (i + i_98_ > (((Class425_Sub2)
				  ((Class9_Sub4) this).aClass425_Sub2_8848)
				 .anInt8876) * -2088037891) {
		    int i_107_
			= i_98_ + i - (((Class425_Sub2) (((Class9_Sub4) this)
							 .aClass425_Sub2_8848))
				       .anInt8876) * -2088037891;
		    i_98_ -= i_107_;
		    i_103_ += i_107_;
		    i_102_ += i_107_;
		}
		if (i_98_ > 0 && i_99_ > 0)
		    method8129(((Class9_Sub4) this).aByteArrayArray8846[c],
			       (((Class425_Sub2)
				 ((Class9_Sub4) this).aClass425_Sub2_8848)
				.anIntArray8887),
			       i_95_, i_104_, i_101_, i_98_, i_99_, i_102_,
			       i_103_, i, i_94_,
			       ((Class9_Sub4) this).anIntArray8845[c],
			       class475, i_96_, i_97_);
	    }
	}
    }
    
    void method409(char c, int i, int i_108_, int i_109_, boolean bool,
		   Class475 class475, int i_110_, int i_111_) {
	if (null != (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anIntArray8887)) {
	    if (class475 == null)
		UA(c, i, i_108_, i_109_, bool);
	    else {
		i += ((Class9_Sub4) this).anIntArray8847[c];
		i_108_ += ((Class9_Sub4) this).anIntArray8850[c];
		int i_112_ = ((Class9_Sub4) this).anIntArray8845[c];
		int i_113_ = ((Class9_Sub4) this).anIntArray8849[c];
		int i_114_
		    = (((Class425_Sub2)
			((Class9_Sub4) this).aClass425_Sub2_8848).anInt8890
		       * -728919167);
		int i_115_ = i + i_114_ * i_108_;
		int i_116_ = i_114_ - i_112_;
		int i_117_ = 0;
		int i_118_ = 0;
		if (i_108_ < (((Class425_Sub2)
			       ((Class9_Sub4) this).aClass425_Sub2_8848)
			      .anInt8877) * 547939757) {
		    int i_119_
			= 547939757 * (((Class425_Sub2) (((Class9_Sub4) this)
							 .aClass425_Sub2_8848))
				       .anInt8877) - i_108_;
		    i_113_ -= i_119_;
		    i_108_
			= 547939757 * (((Class425_Sub2) (((Class9_Sub4) this)
							 .aClass425_Sub2_8848))
				       .anInt8877);
		    i_118_ += i_112_ * i_119_;
		    i_115_ += i_114_ * i_119_;
		}
		if (i_113_ + i_108_
		    > -926266187 * (((Class425_Sub2)
				     ((Class9_Sub4) this).aClass425_Sub2_8848)
				    .anInt8878))
		    i_113_ -= (i_113_ + i_108_
			       - (((Class425_Sub2)
				   ((Class9_Sub4) this).aClass425_Sub2_8848)
				  .anInt8878) * -926266187);
		if (i < -124745859 * (((Class425_Sub2) (((Class9_Sub4) this)
							.aClass425_Sub2_8848))
				      .anInt8875)) {
		    int i_120_
			= (-124745859 * ((Class425_Sub2)
					 (((Class9_Sub4) this)
					  .aClass425_Sub2_8848)).anInt8875
			   - i);
		    i_112_ -= i_120_;
		    i = (((Class425_Sub2)
			  ((Class9_Sub4) this).aClass425_Sub2_8848).anInt8875
			 * -124745859);
		    i_118_ += i_120_;
		    i_115_ += i_120_;
		    i_117_ += i_120_;
		    i_116_ += i_120_;
		}
		if (i + i_112_ > (((Class425_Sub2)
				   ((Class9_Sub4) this).aClass425_Sub2_8848)
				  .anInt8876) * -2088037891) {
		    int i_121_ = (i_112_ + i
				  - (((Class425_Sub2)
				      ((Class9_Sub4) this).aClass425_Sub2_8848)
				     .anInt8876) * -2088037891);
		    i_112_ -= i_121_;
		    i_117_ += i_121_;
		    i_116_ += i_121_;
		}
		if (i_112_ > 0 && i_113_ > 0)
		    method8129(((Class9_Sub4) this).aByteArrayArray8846[c],
			       (((Class425_Sub2)
				 ((Class9_Sub4) this).aClass425_Sub2_8848)
				.anIntArray8887),
			       i_109_, i_118_, i_115_, i_112_, i_113_, i_116_,
			       i_117_, i, i_108_,
			       ((Class9_Sub4) this).anIntArray8845[c],
			       class475, i_110_, i_111_);
	    }
	}
    }
    
    void s(char c, int i, int i_122_, int i_123_, boolean bool) {
	if (null != (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anIntArray8887)) {
	    i += ((Class9_Sub4) this).anIntArray8847[c];
	    i_122_ += ((Class9_Sub4) this).anIntArray8850[c];
	    int i_124_ = ((Class9_Sub4) this).anIntArray8845[c];
	    int i_125_ = ((Class9_Sub4) this).anIntArray8849[c];
	    int i_126_
		= ((((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		    .anInt8890)
		   * -728919167);
	    int i_127_ = i_122_ * i_126_ + i;
	    int i_128_ = i_126_ - i_124_;
	    int i_129_ = 0;
	    int i_130_ = 0;
	    if (i_122_
		< (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		   .anInt8877) * 547939757) {
		int i_131_ = ((((Class425_Sub2)
				((Class9_Sub4) this).aClass425_Sub2_8848)
			       .anInt8877) * 547939757
			      - i_122_);
		i_125_ -= i_131_;
		i_122_ = 547939757 * (((Class425_Sub2) (((Class9_Sub4) this)
							.aClass425_Sub2_8848))
				      .anInt8877);
		i_130_ += i_124_ * i_131_;
		i_127_ += i_126_ * i_131_;
	    }
	    if (i_125_ + i_122_
		> -926266187 * (((Class425_Sub2)
				 ((Class9_Sub4) this).aClass425_Sub2_8848)
				.anInt8878))
		i_125_ -= (i_122_ + i_125_
			   - (((Class425_Sub2)
			       ((Class9_Sub4) this).aClass425_Sub2_8848)
			      .anInt8878) * -926266187);
	    if (i < (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anInt8875) * -124745859) {
		int i_132_
		    = (-124745859 * (((Class425_Sub2)
				      ((Class9_Sub4) this).aClass425_Sub2_8848)
				     .anInt8875)
		       - i);
		i_124_ -= i_132_;
		i = (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		     .anInt8875) * -124745859;
		i_130_ += i_132_;
		i_127_ += i_132_;
		i_129_ += i_132_;
		i_128_ += i_132_;
	    }
	    if (i_124_ + i
		> (((Class425_Sub2) ((Class9_Sub4) this).aClass425_Sub2_8848)
		   .anInt8876) * -2088037891) {
		int i_133_
		    = i + i_124_ - (((Class425_Sub2)
				     ((Class9_Sub4) this).aClass425_Sub2_8848)
				    .anInt8876) * -2088037891;
		i_124_ -= i_133_;
		i_129_ += i_133_;
		i_128_ += i_133_;
	    }
	    if (i_124_ > 0 && i_125_ > 0)
		method8130(((Class9_Sub4) this).aByteArrayArray8846[c],
			   (((Class425_Sub2)
			     ((Class9_Sub4) this).aClass425_Sub2_8848)
			    .anIntArray8887),
			   i_123_, i_130_, i_127_, i_124_, i_125_, i_128_,
			   i_129_);
	}
    }
    
    public static Class451[] method8131(Class453 class453, byte i) {
	int[] is = class453.method5707(-2041810056);
	Class451[] class451s = new Class451[is.length >> 2];
	for (int i_134_ = 0; i_134_ < class451s.length; i_134_++) {
	    Class451 class451 = new Class451();
	    class451s[i_134_] = class451;
	    class451.anInt6192 = is[i_134_ << 2] * 172938699;
	    class451.anInt6193 = is[(i_134_ << 2) + 1] * -584650169;
	    class451.anInt6194 = is[2 + (i_134_ << 2)] * -1490383283;
	    ((Class451) class451).anInt6195
		= is[3 + (i_134_ << 2)] * -687446995;
	}
	return class451s;
    }
    
    public static void method8132(String string, byte i) {
	if (client.aBool8128 && (436529679 * Class315.anInt3899 & 0x18) != 0) {
	    boolean bool = false;
	    int i_135_ = Class41.anInt713 * -300683199;
	    int[] is = Class41.anIntArray720;
	    for (int i_136_ = 0; i_136_ < i_135_; i_136_++) {
		Player class405_sub1_sub4_sub3_sub2
		    = (client.players
		       [is[i_136_]]);
		if (null != class405_sub1_sub4_sub3_sub2.aString10601
		    && class405_sub1_sub4_sub3_sub2.aString10601
			   .equalsIgnoreCase(string)
		    && (((Class399.localPlayer
			  == class405_sub1_sub4_sub3_sub2)
			 && 0 != (Class315.anInt3899 * 436529679 & 0x10))
			|| 0 != (436529679 * Class315.anInt3899 & 0x8))) {
		    Class328_Sub24 class328_sub24
			= Class379.method4707(OutgoingFrameMeta.aClass226_2861,
					      (client.aClass33_8003
					       .aClass495_590),
					      1869021801);
		    class328_sub24.aClass328_Sub31_Sub2_7471.writeShort
			(client.anInt8130 * -603027315, -1146234064);
		    class328_sub24.aClass328_Sub31_Sub2_7471.writeInt
			(Class110_Sub18.anInt9297 * -1336955721, 649329495);
		    class328_sub24.aClass328_Sub31_Sub2_7471
			.method7064(0, 462499147);
		    class328_sub24.aClass328_Sub31_Sub2_7471
			.method7069(is[i_136_], 175783498);
		    class328_sub24.aClass328_Sub31_Sub2_7471
			.method7069(client.anInt8129 * 1813230387, 507331961);
		    client.aClass33_8003.method652(class328_sub24,
						   -1828999000);
		    int i_137_
			= class405_sub1_sub4_sub3_sub2.method9405(1984326800);
		    Class537.method6622
			(class405_sub1_sub4_sub3_sub2.anIntArray10512[0],
			 class405_sub1_sub4_sub3_sub2.anIntArray10500[0], true,
			 Class8.method392((class405_sub1_sub4_sub3_sub2
					   .anIntArray10512[0]),
					  (class405_sub1_sub4_sub3_sub2
					   .anIntArray10500[0]),
					  i_137_, i_137_, 0, (byte) 58),
			 235347170);
		    bool = true;
		    break;
		}
	    }
	    if (!bool)
		Class192.method2471(4, new StringBuilder().append
					   (Class502.aClass502_6642.method6311
					    (Class317_Sub3.aClass426_7220,
					     2108575611))
					   .append
					   (string).toString(), -2037628288);
	    if (client.aBool8128)
		Class303.method3682((byte) -27);
	}
    }
    
    public static void method8133(int i, int i_138_) {
	Class328_Sub45_Sub4 class328_sub45_sub4
	    = Class151.method2081(11, (long) i);
	class328_sub45_sub4.method8890((byte) 33);
    }
}
