
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class19 implements Runnable
{
    InetAddress anInetAddress204;
    volatile String aString205;
    static FileOutputStream aFileOutputStream206;
    
    Class19(int i) throws UnknownHostException {
	((Class19) this).anInetAddress204
	    = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff),
						    (byte) (i >> 16 & 0xff),
						    (byte) (i >> 8 & 0xff),
						    (byte) (i & 0xff) });
    }
    
    public String method510(int i) {
	return ((Class19) this).aString205;
    }
    
    public void run() {
	((Class19) this).aString205
	    = ((Class19) this).anInetAddress204.getHostName();
    }
    
    public void method511() {
	((Class19) this).aString205
	    = ((Class19) this).anInetAddress204.getHostName();
    }
    
    public void method512() {
	((Class19) this).aString205
	    = ((Class19) this).anInetAddress204.getHostName();
    }
    
    public void method513() {
	((Class19) this).aString205
	    = ((Class19) this).anInetAddress204.getHostName();
    }
    
    public void method514() {
	((Class19) this).aString205
	    = ((Class19) this).anInetAddress204.getHostName();
    }
    
    public String method515() {
	return ((Class19) this).aString205;
    }
    
    public String method516() {
	return ((Class19) this).aString205;
    }
    
    static final int method517(int i, int i_0_, byte i_1_) {
	int i_2_ = (Class311.method3760(i - 1, i_0_ - 1, 65280)
		    + Class311.method3760(1 + i, i_0_ - 1, 65280)
		    + Class311.method3760(i - 1, 1 + i_0_, 65280)
		    + Class311.method3760(1 + i, 1 + i_0_, 65280));
	int i_3_ = (Class311.method3760(i - 1, i_0_, 65280)
		    + Class311.method3760(1 + i, i_0_, 65280)
		    + Class311.method3760(i, i_0_ - 1, 65280)
		    + Class311.method3760(i, i_0_ + 1, 65280));
	int i_4_ = Class311.method3760(i, i_0_, 65280);
	return i_4_ / 4 + (i_2_ / 16 + i_3_ / 8);
    }
}
