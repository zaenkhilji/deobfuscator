
import java.math.BigInteger;

public class Buffer extends Class328 {
	public static long[] aLongArray7519;
	public int offset;
	public byte[] payload;
	static final int anInt7522 = -306674912;
	static int[] anIntArray7523 = new int[256];
	public static final int anInt7524 = 5000;
	public static final int anInt7525 = 100;
	static final long aLong7526 = -3932672073523589310L;
	static int anInt7527;

	public void writeBytes(byte[] is, int i, int i_0_, int i_1_) {
		for (int i_2_ = i; i_2_ < i + i_0_; i_2_++)
			payload[(offset += 1749308485) * -1977639283 - 1] = is[i_2_];
	}

	public Buffer(byte[] is) {
		payload = is;
		offset = 0;
	}

	public String method7023(int i) {
		byte i_3_ = payload[(offset += 1749308485) * -1977639283 - 1];
		if (i_3_ != 0)
			throw new IllegalStateException("");
		int i_4_ = method7056(1234877631);
		if (offset * -1977639283 + i_4_ > payload.length)
			throw new IllegalStateException("");
		String string = Class36.method695(payload, offset * -1977639283, i_4_, -2033097151);
		offset += 1749308485 * i_4_;
		return string;
	}

	public void writeByte(int i, int i_5_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public void method7025(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 16);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public void method7026(int i, int i_6_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
	}

	public void method7027(int[] is, int i) {
		int i_7_ = offset * -1977639283 / 8;
		offset = 0;
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			int i_9_ = readInt(528576950);
			int i_10_ = readInt(1681532086);
			int i_11_ = -957401312;
			int i_12_ = -1640531527;
			int i_13_ = 32;
			while (i_13_-- > 0) {
				i_10_ -= (i_9_ + (i_9_ << 4 ^ i_9_ >>> 5) ^ i_11_ + is[i_11_ >>> 11 & 0x3]);
				i_11_ -= i_12_;
				i_9_ -= (i_10_ + (i_10_ << 4 ^ i_10_ >>> 5) ^ i_11_ + is[i_11_ & 0x3]);
			}
			offset -= 1109565992;
			writeInt(i_9_, -583593801);
			writeInt(i_10_, -142115066);
		}
	}

	public byte readByteS(int i) {
		return (byte) (128 - (payload[(offset += 1749308485) * -1977639283 - 1]));
	}

	public void writeLEInt(int i, int i_14_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 16);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 24);
	}

	public void write40(long l) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 32);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 24);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 16);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) l;
	}

	public int method7031(byte i) {
		offset += 952958159;
		return ((payload[-1977639283 * offset - 2] & 0xff) + (((payload[offset * -1977639283 - 1] & 0xff) << 8)
				+ ((payload[offset * -1977639283 - 3] & 0xff) << 16)));
	}

	public int method7032(int i) {
		if (payload[offset * -1977639283] < 0)
			return readInt(226820021) & 0x7fffffff;
		return readUShort((byte) -33);
	}

	public void method7033(CharSequence charsequence, int i) {
		int i_15_ = Class416.method5204(charsequence, (short) 11064);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) 0;
		method7037(i_15_, (byte) -125);
		offset += Class218.method2630(payload, -1977639283 * offset, charsequence, -1679589834) * 1749308485;
	}

	public void method7034(byte i) {
		if (null != payload)
			Class370.method4628(payload, (byte) 1);
		payload = null;
	}

	public void method7035(int i) {
		payload[offset * -1977639283 - i - 4] = (byte) (i >> 24);
		payload[-1977639283 * offset - i - 3] = (byte) (i >> 16);
		payload[offset * -1977639283 - i - 2] = (byte) (i >> 8);
		payload[offset * -1977639283 - i - 1] = (byte) i;
	}

	public int method7036(int i) {
		offset += -796350326;
		int i_16_ = ((payload[-1977639283 * offset - 1] - 128 & 0xff)
				+ ((payload[offset * -1977639283 - 2] & 0xff) << 8));
		if (i_16_ > 32767)
			i_16_ -= 65536;
		return i_16_;
	}

	public void method7037(int i, byte i_17_) {
		if ((i & ~0x7f) != 0) {
			if ((i & ~0x3fff) != 0) {
				if ((i & ~0x1fffff) != 0) {
					if (0 != (i & ~0xfffffff))
						writeByte(i >>> 28 | 0x80, -1323622611);
					writeByte(i >>> 21 | 0x80, -1323622611);
				}
				writeByte(i >>> 14 | 0x80, -1323622611);
			}
			writeByte(i >>> 7 | 0x80, -1323622611);
		}
		writeByte(i & 0x7f, -1323622611);
	}

	public byte readByte(byte i) {
		return payload[(offset += 1749308485) * -1977639283 - 1];
	}

	public int readSmart32(int i) {
		if (payload[-1977639283 * offset] < 0)
			return readInt(243805607) & 0x7fffffff;
		int i_18_ = readUShort((byte) -120);
		if (i_18_ == 32767)
			return -1;
		return i_18_;
	}

	public int readShort(int i) {
		offset += -796350326;
		int i_19_ = ((payload[offset * -1977639283 - 1] & 0xff) + ((payload[-1977639283 * offset - 2] & 0xff) << 8));
		if (i_19_ > 32767)
			i_19_ -= 65536;
		return i_19_;
	}

	public int readUTriByte(int i) {
		offset += 952958159;
		return ((payload[offset * -1977639283 - 1] & 0xff) + (((payload[-1977639283 * offset - 3] & 0xff) << 16)
				+ ((payload[offset * -1977639283 - 2] & 0xff) << 8)));
	}

	public int method7042(int i) {
		offset += 952958159;
		int i_20_ = (((payload[-1977639283 * offset - 3] & 0xff) << 16)
				+ ((payload[offset * -1977639283 - 2] & 0xff) << 8) + (payload[offset * -1977639283 - 1] & 0xff));
		if (i_20_ > 8388607)
			i_20_ -= 16777216;
		return i_20_;
	}

	public int method7043(int i) {
		offset += -796350326;
		int i_21_ = (((payload[offset * -1977639283 - 1] & 0xff) << 8) + (payload[-1977639283 * offset - 2] & 0xff));
		if (i_21_ > 32767)
			i_21_ -= 65536;
		return i_21_;
	}

	public int method7044(int i) {
		offset += -1592700652;
		return (((payload[-1977639283 * offset - 3] & 0xff) << 8)
				+ (((payload[offset * -1977639283 - 1] & 0xff) << 24)
						+ ((payload[offset * -1977639283 - 2] & 0xff) << 16))
				+ (payload[offset * -1977639283 - 4] & 0xff));
	}

	public long read40(byte i) {
		long l = (long) readUByte(1079712749) & 0xffffffffL;
		long l_22_ = (long) readInt(1450339898) & 0xffffffffL;
		return l_22_ + (l << 32);
	}

	public long readLong(int i) {
		long l = (long) readInt(320597610) & 0xffffffffL;
		long l_23_ = (long) readInt(556159925) & 0xffffffffL;
		return (l << 32) + l_23_;
	}

	public long method7047(byte i) {
		long l = (long) method7044(1930899850) & 0xffffffffL;
		long l_24_ = (long) method7044(1874818937) & 0xffffffffL;
		return l + (l_24_ << 32);
	}

	public long method7048(int i, int i_25_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		int i_26_ = i * 8;
		long l = 0L;
		for (/**/; i_26_ >= 0; i_26_ -= 8)
			l |= ((long) (payload[(offset += 1749308485) * -1977639283 - 1]) & 0xffL) << i_26_;
		return l;
	}

	public int method7049() {
		offset += 952958159;
		return ((payload[-1977639283 * offset - 2] & 0xff) + (((payload[offset * -1977639283 - 1] & 0xff) << 8)
				+ ((payload[offset * -1977639283 - 3] & 0xff) << 16)));
	}

	public String readPrefixedString(int i) {
		byte i_27_ = payload[(offset += 1749308485) * -1977639283 - 1];
		if (0 != i_27_)
			throw new IllegalStateException("");
		int i_28_ = offset * -1977639283;
		while (payload[(offset += 1749308485) * -1977639283 - 1] != 0) {
			/* empty */
		}
		int i_29_ = -1977639283 * offset - i_28_ - 1;
		if (i_29_ == 0)
			return "";
		return Class340.method4161(payload, i_28_, i_29_, 1421556986);
	}

	public void readReverseBytesA(byte[] is, int i, int i_30_, byte i_31_) {
		for (int i_32_ = i_30_ + i - 1; i_32_ >= i; i_32_--)
			is[i_32_] = (byte) ((payload[(offset += 1749308485) * -1977639283 - 1]) - 128);
	}

	public void readBytes(byte[] is, int i, int i_33_, int i_34_) {
		for (int i_35_ = i; i_35_ < i_33_ + i; i_35_++)
			is[i_35_] = payload[(offset += 1749308485) * -1977639283 - 1];
	}

	public void method7053(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
	}

	public int readSmart(int i) {
		int i_36_ = payload[-1977639283 * offset] & 0xff;
		if (i_36_ < 128)
			return readUByte(1926773188);
		return readUShort((byte) -91) - 32768;
	}

	public void method7055(int i, int i_37_) {
		payload[offset * -1977639283 - i - 2] = (byte) (i >> 8);
		payload[offset * -1977639283 - i - 1] = (byte) i;
	}

	public int method7056(int i) {
		int i_38_ = payload[(offset += 1749308485) * -1977639283 - 1];
		int i_39_ = 0;
		for (/**/; i_38_ < 0; i_38_ = payload[(offset += 1749308485) * -1977639283 - 1])
			i_39_ = (i_39_ | i_38_ & 0x7f) << 7;
		return i_39_ | i_38_;
	}

	public void writeInt(int i, int i_40_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 24);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 16);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public void method7058(int[] is, int i, int i_41_, int i_42_) {
		int i_43_ = -1977639283 * offset;
		offset = i * 1749308485;
		int i_44_ = (i_41_ - i) / 8;
		for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
			int i_46_ = readInt(2035166253);
			int i_47_ = readInt(1783337689);
			int i_48_ = 0;
			int i_49_ = -1640531527;
			int i_50_ = 32;
			while (i_50_-- > 0) {
				i_46_ += ((i_47_ << 4 ^ i_47_ >>> 5) + i_47_ ^ is[i_48_ & 0x3] + i_48_);
				i_48_ += i_49_;
				i_47_ += ((i_46_ << 4 ^ i_46_ >>> 5) + i_46_ ^ is[i_48_ >>> 11 & 0x3] + i_48_);
			}
			offset -= 1109565992;
			writeInt(i_46_, 1504946150);
			writeInt(i_47_, -744595210);
		}
		offset = i_43_ * 1749308485;
	}

	public void method7059(int[] is, int i, int i_51_, byte i_52_) {
		int i_53_ = offset * -1977639283;
		offset = i * 1749308485;
		int i_54_ = (i_51_ - i) / 8;
		for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
			int i_56_ = readInt(1743300872);
			int i_57_ = readInt(1154010331);
			int i_58_ = -957401312;
			int i_59_ = -1640531527;
			int i_60_ = 32;
			while (i_60_-- > 0) {
				i_57_ -= (i_56_ + (i_56_ << 4 ^ i_56_ >>> 5) ^ i_58_ + is[i_58_ >>> 11 & 0x3]);
				i_58_ -= i_59_;
				i_56_ -= (i_57_ + (i_57_ << 4 ^ i_57_ >>> 5) ^ is[i_58_ & 0x3] + i_58_);
			}
			offset -= 1109565992;
			writeInt(i_56_, -1513803977);
			writeInt(i_57_, 1807183957);
		}
		offset = 1749308485 * i_53_;
	}

	public void applyRSA(BigInteger biginteger, BigInteger biginteger_61_, int i) {
		int i_62_ = -1977639283 * offset;
		offset = 0;
		byte[] is = new byte[i_62_];
		readBytes(is, 0, i_62_, 125284972);
		BigInteger biginteger_63_ = new BigInteger(is);
		BigInteger biginteger_64_ = biginteger_63_.modPow(biginteger, biginteger_61_);
		byte[] is_65_ = biginteger_64_.toByteArray();
		offset = 0;
		writeShort(is_65_.length, -1243015710);
		writeBytes(is_65_, 0, is_65_.length, 1049955588);
	}

	public int method7061(int i, int i_66_) {
		int i_67_ = Class319.method3869(payload, i, -1977639283 * offset, (byte) 2);
		writeInt(i_67_, -83687023);
		return i_67_;
	}

	public void method7062(int i, short i_68_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 + i);
	}

	public void method7063(int i, int i_69_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (0 - i);
	}

	public void method7064(int i, int i_70_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 - i);
	}

	public int readUByteA(int i) {
		return ((payload[(offset += 1749308485) * -1977639283 - 1] - 128) & 0xff);
	}

	public int readUByteS(int i) {
		return ((128 - payload[(offset += 1749308485) * -1977639283 - 1]) & 0xff);
	}

	public byte readByteC(int i) {
		return (byte) (0 - (payload[(offset += 1749308485) * -1977639283 - 1]));
	}

	public void method7068(int i, byte i_71_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
	}

	public void method7069(int i, int i_72_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 + i);
	}

	public void method7070(int i, int i_73_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 + i);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
	}

	public int readLEUShort(byte i) {
		offset += -796350326;
		return ((payload[-1977639283 * offset - 2] & 0xff) + ((payload[offset * -1977639283 - 1] & 0xff) << 8));
	}

	public int readUShortA(int i) {
		offset += -796350326;
		return (((payload[-1977639283 * offset - 2] & 0xff) << 8) + (payload[-1977639283 * offset - 1] - 128 & 0xff));
	}

	public int readLEUShortA(int i) {
		offset += -796350326;
		return ((payload[offset * -1977639283 - 2] - 128 & 0xff) + ((payload[-1977639283 * offset - 1] & 0xff) << 8));
	}

	public int method4956(int i) {
		offset += -796350326;
		int i_74_ = (((payload[offset * -1977639283 - 1] & 0xff) << 8)
				+ (payload[-1977639283 * offset - 2] - 128 & 0xff));
		if (i_74_ > 32767)
			i_74_ -= 65536;
		return i_74_;
	}

	public void method7075(int i, int i_75_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 16);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 24);
	}

	public void method7076(int i, int i_76_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 24);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 16);
	}

	public void method7077(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public int readLEInt(int i) {
		offset += -1592700652;
		return ((payload[offset * -1977639283 - 4] & 0xff) + (((payload[offset * -1977639283 - 1] & 0xff) << 24)
				+ ((payload[-1977639283 * offset - 2] & 0xff) << 16)
				+ ((payload[offset * -1977639283 - 3] & 0xff) << 8)));
	}

	public void method7079(int i, int i_77_) {
		if (i >= 0 && i < 128)
			writeByte(i, -1323622611);
		else if (i >= 0 && i < 32768)
			writeShort(i + 32768, -1546994513);
		else
			throw new IllegalArgumentException();
	}

	public int readIntV2(int i) {
		offset += -1592700652;
		return (((payload[-1977639283 * offset - 1] & 0xff) << 8)
				+ (((payload[offset * -1977639283 - 3] & 0xff) << 24)
						+ ((payload[offset * -1977639283 - 4] & 0xff) << 16))
				+ (payload[-1977639283 * offset - 2] & 0xff));
	}

	public int method7081() {
		return (0 - payload[(offset += 1749308485) * -1977639283 - 1] & 0xff);
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_78_ = i;
			for (int i_79_ = 0; i_79_ < 8; i_79_++) {
				if ((i_78_ & 0x1) == 1)
					i_78_ = i_78_ >>> 1 ^ ~0x12477cdf;
				else
					i_78_ >>>= 1;
			}
			anIntArray7523[i] = i_78_;
		}
		aLongArray7519 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_80_ = 0; i_80_ < 8; i_80_++) {
				if (1L == (l & 0x1L))
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray7519[i] = l;
		}
	}

	public boolean method7082(int i) {
		offset -= -1592700652;
		int i_81_ = Class319.method3869(payload, 0, -1977639283 * offset, (byte) 2);
		int i_82_ = readInt(1289812847);
		if (i_81_ == i_82_)
			return true;
		return false;
	}

	public void method7083(String string, int i) {
		int i_83_ = string.indexOf('\0');
		if (i_83_ >= 0)
			throw new IllegalArgumentException("");
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) 0;
		offset += Class328_Sub37_Sub5.method9043(string, 0, string.length(), payload, -1977639283 * offset, (byte) 124)
				* 1749308485;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) 0;
	}

	public int method7084() {
		offset += -796350326;
		return ((payload[-1977639283 * offset - 2] & 0xff) + ((payload[offset * -1977639283 - 1] & 0xff) << 8));
	}

	public void method7085() {
		if (null != payload)
			Class370.method4628(payload, (byte) 1);
		payload = null;
	}

	public void method7086() {
		if (null != payload)
			Class370.method4628(payload, (byte) 1);
		payload = null;
	}

	public void method7087(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public void method7088(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public void method7089(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public int readIntV1(int i) {
		offset += -1592700652;
		return (((payload[offset * -1977639283 - 1] & 0xff) << 16) + ((payload[offset * -1977639283 - 2] & 0xff) << 24)
				+ ((payload[offset * -1977639283 - 4] & 0xff) << 8) + (payload[offset * -1977639283 - 3] & 0xff));
	}

	public void method7091(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
	}

	public void method7092(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
	}

	public void method7093(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
	}

	public void method7094(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 16);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public void method7095(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public void writeCString(String string, int i) {
		int i_84_ = string.indexOf('\0');
		if (i_84_ >= 0)
			throw new IllegalArgumentException("");
		offset += Class328_Sub37_Sub5.method9043(string, 0, string.length(), payload, offset * -1977639283, (byte) 66)
				* 1749308485;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) 0;
	}

	public void method7097(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 - i);
	}

	public void writeLong(long l) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 56);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 48);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 40);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 32);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 24);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 16);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) l;
	}

	public Buffer(int i) {
		payload = Class433.method5572(i, (byte) -66);
		offset = 0;
	}

	public void method7099(int i) {
		payload[offset * -1977639283 - i - 4] = (byte) (i >> 24);
		payload[-1977639283 * offset - i - 3] = (byte) (i >> 16);
		payload[offset * -1977639283 - i - 2] = (byte) (i >> 8);
		payload[offset * -1977639283 - i - 1] = (byte) i;
	}

	public void method7100(int i) {
		payload[offset * -1977639283 - i - 1] = (byte) i;
	}

	public String readString(byte i) {
		int i_85_ = offset * -1977639283;
		while (payload[(offset += 1749308485) * -1977639283 - 1] != 0) {
			if (i == -1)
				throw new IllegalStateException();
		}
		int i_86_ = offset * -1977639283 - i_85_ - 1;
		if (0 == i_86_) {
			if (i == -1) {
				/* empty */
			}
			return "";
		}
		return Class340.method4161(payload, i_85_, i_86_, 1257413948);
	}

	public void method7102(int i) {
		if ((i & ~0x7f) != 0) {
			if ((i & ~0x3fff) != 0) {
				if ((i & ~0x1fffff) != 0) {
					if (0 != (i & ~0xfffffff))
						writeByte(i >>> 28 | 0x80, -1323622611);
					writeByte(i >>> 21 | 0x80, -1323622611);
				}
				writeByte(i >>> 14 | 0x80, -1323622611);
			}
			writeByte(i >>> 7 | 0x80, -1323622611);
		}
		writeByte(i & 0x7f, -1323622611);
	}

	public byte readByteA(int i) {
		return (byte) ((payload[(offset += 1749308485) * -1977639283 - 1]) - 128);
	}

	public int method7104() {
		offset += -796350326;
		return (((payload[-1977639283 * offset - 2] & 0xff) << 8) + (payload[offset * -1977639283 - 1] & 0xff));
	}

	public int method7105() {
		offset += 952958159;
		int i = (((payload[-1977639283 * offset - 3] & 0xff) << 16) + ((payload[offset * -1977639283 - 2] & 0xff) << 8)
				+ (payload[offset * -1977639283 - 1] & 0xff));
		if (i > 8388607)
			i -= 16777216;
		return i;
	}

	public int method7106() {
		offset += -1592700652;
		return (((payload[-1977639283 * offset - 3] & 0xff) << 8)
				+ (((payload[offset * -1977639283 - 1] & 0xff) << 24)
						+ ((payload[offset * -1977639283 - 2] & 0xff) << 16))
				+ (payload[offset * -1977639283 - 4] & 0xff));
	}

	public int method7107() {
		offset += -1592700652;
		return (((payload[-1977639283 * offset - 3] & 0xff) << 8)
				+ (((payload[offset * -1977639283 - 1] & 0xff) << 24)
						+ ((payload[offset * -1977639283 - 2] & 0xff) << 16))
				+ (payload[offset * -1977639283 - 4] & 0xff));
	}

	public long method7108() {
		long l = (long) readUByte(-37096846) & 0xffffffffL;
		long l_87_ = (long) readInt(1831977121) & 0xffffffffL;
		return l_87_ + (l << 32);
	}

	public long method7109() {
		long l = (long) readUByte(433654742) & 0xffffffffL;
		long l_88_ = (long) readInt(1879520027) & 0xffffffffL;
		return l_88_ + (l << 32);
	}

	public void method7110(int i, int i_89_) {
		payload[offset * -1977639283 - i - 1] = (byte) i;
	}

	public String method7111(int i) {
		if (payload[-1977639283 * offset] == 0) {
			offset += 1749308485;
			return null;
		}
		return readString((byte) -79);
	}

	public int method7112() {
		offset += -796350326;
		int i = (((payload[offset * -1977639283 - 1] & 0xff) << 8) + (payload[-1977639283 * offset - 2] - 128 & 0xff));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public void method7113(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 16);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public int method7114() {
		offset += -1592700652;
		return (((payload[-1977639283 * offset - 3] & 0xff) << 8)
				+ (((payload[offset * -1977639283 - 1] & 0xff) << 24)
						+ ((payload[offset * -1977639283 - 2] & 0xff) << 16))
				+ (payload[offset * -1977639283 - 4] & 0xff));
	}

	public int method7115(int i) {
		int i_90_ = payload[-1977639283 * offset] & 0xff;
		if (i_90_ < 128)
			return readUByte(-81296390) - 64;
		return readUShort((byte) -127) - 49152;
	}

	public int method7116() {
		int i = payload[-1977639283 * offset] & 0xff;
		if (i < 128)
			return readUByte(230587441) - 64;
		return readUShort((byte) -60) - 49152;
	}

	public void method7117(int i, int i_91_) {
		payload[offset * -1977639283 - i - 4] = (byte) (i >> 24);
		payload[-1977639283 * offset - i - 3] = (byte) (i >> 16);
		payload[offset * -1977639283 - i - 2] = (byte) (i >> 8);
		payload[offset * -1977639283 - i - 1] = (byte) i;
	}

	public void method7118(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (0 - i);
	}

	public int method7119(int i) {
		int i_92_ = 0;
		int i_93_;
		for (i_93_ = readSmart(-1580046812); i_93_ == 32767; i_93_ = readSmart(-1580046812))
			i_92_ += 32767;
		i_92_ += i_93_;
		return i_92_;
	}

	public void method7120(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 + i);
	}

	public int readUByte(int i) {
		return (payload[(offset += 1749308485) * -1977639283 - 1] & 0xff);
	}

	public void method7122(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (0 - i);
	}

	public void writeShort(int i, int i_94_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public int readInt(int i) {
		offset += -1592700652;
		return (((payload[offset * -1977639283 - 2] & 0xff) << 8)
				+ (((payload[offset * -1977639283 - 3] & 0xff) << 16)
						+ ((payload[-1977639283 * offset - 4] & 0xff) << 24))
				+ (payload[offset * -1977639283 - 1] & 0xff));
	}

	public void method7125(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 - i);
	}

	public void method7126(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 + i);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
	}

	public int method7127() {
		return (0 - payload[(offset += 1749308485) * -1977639283 - 1] & 0xff);
	}

	public void method7128(long l, int i, int i_95_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		for (int i_96_ = i * 8; i_96_ >= 0; i_96_ -= 8)
			payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (int) (l >> i_96_);
	}

	public void method7129(int i) {
		if ((i & ~0x7f) != 0) {
			if ((i & ~0x3fff) != 0) {
				if ((i & ~0x1fffff) != 0) {
					if (0 != (i & ~0xfffffff))
						writeByte(i >>> 28 | 0x80, -1323622611);
					writeByte(i >>> 21 | 0x80, -1323622611);
				}
				writeByte(i >>> 14 | 0x80, -1323622611);
			}
			writeByte(i >>> 7 | 0x80, -1323622611);
		}
		writeByte(i & 0x7f, -1323622611);
	}

	public int readUByteC(byte i) {
		return (0 - payload[(offset += 1749308485) * -1977639283 - 1] & 0xff);
	}

	public void method7131(int i, int i_97_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 16);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 24);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
	}

	public void method7132(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 + i);
	}

	public void method7133(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 + i);
	}

	public void method7134(int i) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (128 + i);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
	}

	public int method7135() {
		return (0 - payload[(offset += 1749308485) * -1977639283 - 1] & 0xff);
	}

	public int method7136() {
		offset += -796350326;
		int i = (((payload[offset * -1977639283 - 1] & 0xff) << 8) + (payload[-1977639283 * offset - 2] - 128 & 0xff));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public int readUShort(byte i) {
		offset += -796350326;
		return (((payload[-1977639283 * offset - 2] & 0xff) << 8) + (payload[offset * -1977639283 - 1] & 0xff));
	}

	public int method7138() {
		offset += -796350326;
		return (((payload[-1977639283 * offset - 2] & 0xff) << 8) + (payload[offset * -1977639283 - 1] & 0xff));
	}

	public void method7139(int i, int i_98_) {
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 16);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) (i >> 8);
		payload[(offset += 1749308485) * -1977639283 - 1] = (byte) i;
	}

	public int method7140() {
		offset += -796350326;
		int i = (((payload[offset * -1977639283 - 1] & 0xff) << 8) + (payload[-1977639283 * offset - 2] - 128 & 0xff));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	static final void method7141(Class412 class412, int i) {
		((Class412) class412).anInt4938 -= -1422967955;
		Class312.method3762(
				(String) (((Class412) class412).anObjectArray4933[((Class412) class412).anInt4938 * 783749935]),
				(String) (((Class412) class412).anObjectArray4933[783749935 * ((Class412) class412).anInt4938 + 1]),
				(String) (((Class412) class412).anObjectArray4933[2 + ((Class412) class412).anInt4938 * 783749935]),
				((((Class412) class412).anIntArray4927[(((Class412) class412).anInt4944 -= 1336678779)
						* -1097736781]) == 1),
				true, (byte) 0);
	}
}
