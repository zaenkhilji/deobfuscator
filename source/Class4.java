import jaclib.ping.Ping;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class4 implements Runnable {

   volatile long aLong32 = -297816521915811371L;
   InetAddress anInetAddress33;
   volatile boolean aBool34 = true;
   String aString35;
   public static int anInt36;
   static int anInt37;


   void method305() {
      this.aBool34 = false;
   }

   void method306(String var1, byte var2) {
      this.aString35 = var1;
      this.anInetAddress33 = null;
      this.aLong32 = -297816521915811371L;
      if(this.aString35 != null) {
         try {
            this.anInetAddress33 = InetAddress.getByName(this.aString35);
         } catch (UnknownHostException var4) {
            ;
         }
      }

   }

   public void method307() {
      while(this.aBool34) {
         this.method309(-614059354);
      }

   }

   long method308(byte var1) {
      return -8377994853995001725L * this.aLong32;
   }

   void method309(int var1) {
      if(null != this.anInetAddress33) {
         try {
            byte[] var2 = this.anInetAddress33.getAddress();
            this.aLong32 = (long)Ping.method241(var2[0], var2[1], var2[2], var2[3], 10000L) * 297816521915811371L;
         } catch (Throwable var3) {
            ;
         }
      }

      Class376.method4681(1000L);
   }

   public void run() {
      while(this.aBool34) {
         this.method309(-614059354);
      }

   }

   long method310() {
      return -8377994853995001725L * this.aLong32;
   }

   public void method311() {
      while(this.aBool34) {
         this.method309(-614059354);
      }

   }

   void method312() {
      this.aBool34 = false;
   }

   void method313(int var1) {
      this.aBool34 = false;
   }

   void method314() {
      this.aBool34 = false;
   }

   public void method315() {
      while(this.aBool34) {
         this.method309(-614059354);
      }

   }

   void method316() {
      this.aBool34 = false;
   }

   public void method317() {
      while(this.aBool34) {
         this.method309(-614059354);
      }

   }

   void method318() {
      if(null != this.anInetAddress33) {
         try {
            byte[] var1 = this.anInetAddress33.getAddress();
            this.aLong32 = (long)Ping.method241(var1[0], var1[1], var1[2], var1[3], 10000L) * 297816521915811371L;
         } catch (Throwable var2) {
            ;
         }
      }

      Class376.method4681(1000L);
   }

   void method319() {
      if(null != this.anInetAddress33) {
         try {
            byte[] var1 = this.anInetAddress33.getAddress();
            this.aLong32 = (long)Ping.method241(var1[0], var1[1], var1[2], var1[3], 10000L) * 297816521915811371L;
         } catch (Throwable var2) {
            ;
         }
      }

      Class376.method4681(1000L);
   }

   public static void method320(Class425 var0, Archive var1, byte var2) {
      Image[] var3 = ImageUtils.load(var1, Class6.anInt50 * -208604209, 0);
      Class188.aClass72Array2285 = new Class72[var3.length];

      int var4;
      for(var4 = 0; var4 < var3.length; ++var4) {
         Class188.aClass72Array2285[var4] = var0.method5322(var3[var4], true);
      }

      var3 = ImageUtils.load(var1, Class475_Sub1.anInt8838 * -1759977933, 0);
      Class535.aClass72Array7094 = new Class72[var3.length];

      for(var4 = 0; var4 < var3.length; ++var4) {
         Class535.aClass72Array7094[var4] = var0.method5322(var3[var4], true);
      }

      var3 = ImageUtils.load(var1, Class442.anInt6160 * -751020661, 0);
      Class42.aClass72Array724 = new Class72[var3.length];

      for(var4 = 0; var4 < var3.length; ++var4) {
         Class42.aClass72Array724[var4] = var0.method5322(var3[var4], true);
      }

      var3 = ImageUtils.load(var1, Class6.anInt55 * 1086335823, 0);
      Class292.aClass72Array3665 = new Class72[var3.length];

      for(var4 = 0; var4 < var3.length; ++var4) {
         Class292.aClass72Array3665[var4] = var0.method5322(var3[var4], true);
      }

      var3 = ImageUtils.load(var1, Class163.anInt2054 * -784960599, 0);
      Class160.aClass72Array2047 = new Class72[var3.length];
      byte var6 = 25;

      int var5;
      for(var5 = 0; var5 < var3.length; ++var5) {
         var3[var5].method1353(-var6 + (int)(Math.random() * (double)var6 * 2.0D), -var6 + (int)(Math.random() * (double)var6 * 2.0D), -var6 + (int)(Math.random() * (double)var6 * 2.0D));
         Class160.aClass72Array2047[var5] = var0.method5322(var3[var5], true);
      }

      var3 = ImageUtils.load(var1, 1348505909 * Class6.anInt51, 0);
      Class17.aClass72Array193 = new Class72[var3.length];

      for(var5 = 0; var5 < var3.length; ++var5) {
         Class17.aClass72Array193[var5] = var0.method5322(var3[var5], true);
      }

      var3 = ImageUtils.load(var1, Class6.anInt53 * 2014555053, 0);
      Class163.aClass72Array2059 = new Class72[var3.length];
      var6 = 12;

      for(var5 = 0; var5 < var3.length; ++var5) {
         var3[var5].method1353(-var6 + (int)(Math.random() * (double)var6 * 2.0D), -var6 + (int)(Math.random() * (double)var6 * 2.0D), -var6 + (int)(Math.random() * (double)var6 * 2.0D));
         Class163.aClass72Array2059[var5] = var0.method5322(var3[var5], true);
      }

      var3 = ImageUtils.load(var1, 1983813999 * Class6.anInt47, 0);
      Class187.aClass72Array2273 = new Class72[var3.length];
      var6 = 12;

      for(var5 = 0; var5 < var3.length; ++var5) {
         var3[var5].method1353(-var6 + (int)(Math.random() * (double)var6 * 2.0D), -var6 + (int)(Math.random() * (double)var6 * 2.0D), -var6 + (int)(Math.random() * (double)var6 * 2.0D));
         Class187.aClass72Array2273[var5] = var0.method5322(var3[var5], true);
      }

      Class401.aClass72_4875 = var0.method5322(ImageUtils.loadFirst(var1, -1629538563 * Class134.anInt1725, 0), true);
      Class456_Sub1.aClass72_7876 = var0.method5322(ImageUtils.loadFirst(var1, -990432143 * Class292.anInt3667, 0), true);
      var3 = ImageUtils.load(var1, -1983116121 * Class110_Sub12.anInt9259, 0);
      Class216.aClass72Array2479 = new Class72[var3.length];

      for(var5 = 0; var5 < var3.length; ++var5) {
         Class216.aClass72Array2479[var5] = var0.method5322(var3[var5], true);
      }

   }

   public static void method321(String var0, byte var1) {
      if(12 == 379716649 * client.anInt7951) {
         Class328_Sub24 var2 = Class379.method4707(OutgoingFrameMeta.aClass226_2912, client.aClass33_8109.aClass495_590, 2140842413);
         var2.aClass328_Sub31_Sub2_7471.writeShort(0, -1412082001);
         int var3 = -1977639283 * var2.aClass328_Sub31_Sub2_7471.offset;
         var2.aClass328_Sub31_Sub2_7471.writeCString(var0, -2147218341);
         var2.aClass328_Sub31_Sub2_7471.offset += -639742493;
         var2.aClass328_Sub31_Sub2_7471.method7058(Class1.anIntArray21, var3, var2.aClass328_Sub31_Sub2_7471.offset * -1977639283, 1286772785);
         var2.aClass328_Sub31_Sub2_7471.method7055(var2.aClass328_Sub31_Sub2_7471.offset * -1977639283 - var3, -359687427);
         client.aClass33_8109.method652(var2, -1828999000);
         Class1.aClass449_15 = Class449.aClass449_6183;
      }
   }
}
