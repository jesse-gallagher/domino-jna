package com.mindoo.domino.jna.internal.structs.viewformat;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;

import com.mindoo.domino.jna.internal.structs.BaseStructure;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotesViewTableFormat2Struct extends BaseStructure {
	/** Length of this structure */
	public short Length;
	/** Color of view's background */
	public short BackgroundColor;
	/** Color of view's border lines */
	public short V2BorderColor;
	/** Title and borders */
	public int TitleFont;
	/** Unread lines */
	public int UnreadFont;
	/** Totals/Statistics */
	public int TotalsFont;
	/**
	 * Interval b/w auto updates <br>
	 * (zero for no autoupdate)
	 */
	public short AutoUpdateSeconds;
	/**
	 * Color of view's background for<br>
	 * alternate rows.
	 */
	public short AlternateBackgroundColor;
	/** see VALID_VIEW_FORMAT_SIG */
	public short wSig;
	/**
	 * Number of lines per row.  1, 2, etc.<br>
	 * see VIEW_TABLE_MAX_LINE_COUNT
	 */
	public byte LineCount;
	/** Spacing. see VIEW_TABLE_xxx_SPACE */
	public byte Spacing;
	/** Palette Color of view's background. */
	public short BackgroundColorExt;
	/** Lines per header. */
	public byte HeaderLineCount;
	/** see VIEW_TABLE_xxx */
	public byte Flags1;
	/**
	 * Spares.  Will be zero when<br>
	 * wSig == VALID_VIEW_FORMAT_SIG.<br>
	 * C type : WORD[4]
	 */
	public short[] Spare = new short[4];
	public NotesViewTableFormat2Struct() {
		super();
		setAlignType(Structure.ALIGN_NONE);
	}
	
	public static NotesViewTableFormat2Struct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesViewTableFormat2Struct>() {

			@Override
			public NotesViewTableFormat2Struct run() {
				return new NotesViewTableFormat2Struct();
			}
		});
	}

	protected List<String> getFieldOrder() {
		return Arrays.asList("Length", "BackgroundColor", "V2BorderColor", "TitleFont", "UnreadFont", "TotalsFont", "AutoUpdateSeconds", "AlternateBackgroundColor", "wSig", "LineCount", "Spacing", "BackgroundColorExt", "HeaderLineCount", "Flags1", "Spare");
	}
	public NotesViewTableFormat2Struct(Pointer peer) {
		super(peer);
		setAlignType(Structure.ALIGN_NONE);
	}
	
	public static NotesViewTableFormat2Struct newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesViewTableFormat2Struct>() {

			@Override
			public NotesViewTableFormat2Struct run() {
				return new NotesViewTableFormat2Struct(peer);
			}
		});
	}

	public static class ByReference extends NotesViewTableFormat2Struct implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesViewTableFormat2Struct implements Structure.ByValue {
		
	};
}
