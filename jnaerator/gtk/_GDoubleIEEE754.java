package gtk;
import org.bridj.BridJ;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
/**
 * <i>native declaration : glib-2.0/glib/gtypes.h:415</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Union 
@Library("Gtk") 
public abstract class _GDoubleIEEE754 extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : gdouble (failed to convert type to Java (undefined type)) */
	/** C type : mpn_struct */
	@Field(1) 
	public gtk._GFloatIEEE754.mpn_struct mpn() {
		return this.io.getNativeObjectField(this, 1);
	}
	/** C type : mpn_struct */
	@Field(1) 
	public _GDoubleIEEE754 mpn(gtk._GFloatIEEE754.mpn_struct mpn) {
		this.io.setNativeObjectField(this, 1, mpn);
		return this;
	}
	/** <i>native declaration : glib-2.0/glib/gtypes.h:418</i> */
	public static abstract class mpn_struct extends StructObject {
		static {
			BridJ.register();
		}
		/** Conversion Error : guint (failed to convert type to Java (undefined type)) */
		/** Conversion Error : guint (failed to convert type to Java (undefined type)) */
		/** Conversion Error : guint (failed to convert type to Java (undefined type)) */
		/** Conversion Error : guint (failed to convert type to Java (undefined type)) */
	};
}