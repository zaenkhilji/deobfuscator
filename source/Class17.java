

public class Class17 {
	boolean aBool188;
	int anInt189;
	int anInt190;
	int anInt191;
	boolean aBool192;
	static Class72[] aClass72Array193;
	public static Class259 aClass259_194;

	Class17() {
		/* empty */
	}

	static void method498(Class425 class425, Class121 class121, int i) {
		boolean bool = ((Class130.aClass501_1652.method6282(class425, class121.anInt1525 * -1005290485,
				418924261 * class121.anInt1526, -714539681 * class121.anInt1422,
				~0xffffff | class121.anInt1423 * -1517586161, class121.anInt1445 * -323302977,
				(class121.aBool1430 ? Class399.localPlayer.aClass385_10607 : null),
				-1708413)) == null);
		if (bool) {
			Class37.aClass472_640
					.method5984(new Class328_Sub11(class121.anInt1525 * -1005290485, 418924261 * class121.anInt1526,
							class121.anInt1422 * -714539681, (~0xffffff | class121.anInt1423 * -1517586161),
							class121.anInt1445 * -323302977, class121.aBool1430), -158712470);
			Class380_Sub2.method7335(class121, -1262004354);
		}
	}

	static final void method499(Class412 class412, int i) {
		Class403 class403 = (((Class412) class412).aBool4954 ? ((Class412) class412).aClass403_4936
				: ((Class412) class412).aClass403_4934);
		Class121 class121 = ((Class403) class403).aClass121_4887;
		Class122 class122 = ((Class403) class403).aClass122_4888;
		Class199.method2484(class121, class122, true, 1, class412, (byte) -115);
	}

	static final void method500(Class412 class412, byte i) {
		int i_0_ = (((Class412) class412).anIntArray4927[((((Class412) class412).anInt4944 -= 1336678779)
				* -1097736781)]);
		Class121 class121 = Class466.method5942(i_0_, (byte) 68);
		Class122 class122 = Class96.aClass122Array1098[i_0_ >> 16];
		Class143.method1995(class121, class122, class412, 2129599050);
	}

	static final void method501(Class412 class412, int i) {
		int i_1_ = (((Class412) class412).anIntArray4927[((((Class412) class412).anInt4944 -= 1336678779)
				* -1097736781)]);
		Class121 class121 = Class466.method5942(i_1_, (byte) 81);
		((Class412) class412).anIntArray4927[(((Class412) class412).anInt4944 += 1336678779) * -1097736781
				- 1] = class121.anInt1436 * 1708895883;
	}

	static final void method502(Class412 class412, int i) {
		((Class412) class412).anIntArray4927[(((Class412) class412).anInt4944 += 1336678779) * -1097736781
				- 1] = client.aBool7931 ? 1 : 0;
	}

	static final void method503(Class412 class412, int i) {
		((Class412) class412).anIntArray4927[(((Class412) class412).anInt4944 += 1336678779) * -1097736781
				- 1] = Class2.aBool30 ? 1 : 0;
	}

	static final void method504(Class412 class412, byte i) {
		Class110.method1506((byte) 103);
	}

	static final void method505(int i) {
		Class8.aLong92 = 3156757192804902195L;
		Class8.aLong100 = 0L;
		Class8.anInt85 = -2127046293;
	}

	static final void method506(Class412 class412, byte i) {
		int i_2_ = (((Class412) class412).anIntArray4950[((Class412) class412).anInt4952 * 417925363]);
		((Class412) class412).anIntArray4927[(((Class412) class412).anInt4944 += 1336678779) * -1097736781
				- 1] = ((Class405_Sub1_Sub4_Sub3_Sub1) ((Class412) class412).aClass405_Sub1_Sub4_Sub3_4949).aClass82_10593
						.method1187(i_2_, (byte) -95);
	}

	static final void decodePlayerMask(FrameBuffer buffer, int i) {
		for (int i_3_ = 0; i_3_ < Class41.anInt719 * -475329333; i_3_++) {
			int index = Class41.maskUpdateIndices[i_3_];
			Player player = client.players[index];
			int mask = buffer.readUByte(-1409451931);
			if (0 != (mask & 0x2))
				mask += buffer.readUByte(-1243881394) << 8;
			if ((mask & 0x2000) != 0)
				mask += buffer.readUByte(1230181778) << 16;
			Class525.decodePlayerMask(buffer, index, player, mask, 809840820);
		}
	}
}
