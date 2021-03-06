package com.mindoo.domino.jna.internal;

import com.sun.jna.win32.StdCallLibrary.StdCallCallback;

/**
 * Callback interface used on Win32 platforms. Implements 
 * {@link StdCallCallback} so that the right method calling conventions are used.
 * 
 * @author Karsten Lehmann
 */
public interface Win32NotesCallbacks {

	interface NoteExtractCallbackWin32 extends NotesCallbacks.NoteExtractCallback, StdCallCallback {}

	interface IdEnumerateProcWin32 extends NotesCallbacks.IdEnumerateProc, StdCallCallback {}

	interface MQScanCallbackWin32 extends NotesCallbacks.MQScanCallback, StdCallCallback {}

	interface NSFGetNotesCallbackWin32 extends NotesCallbacks.NSFGetNotesCallback, StdCallCallback {}

	interface NSFFolderAddCallbackWin32 extends NotesCallbacks.NSFFolderAddCallback, StdCallCallback {}

	interface LogRestoreCallbackFunctionWin32 extends NotesCallbacks.LogRestoreCallbackFunction, StdCallCallback {}

	interface NIFFindByKeyProcWin32 extends NotesCallbacks.NIFFindByKeyProc, StdCallCallback {}

	interface OSSIGPROCWin32 extends NotesCallbacks.OSSIGPROC, StdCallCallback {}

	interface OSSIGMSGPROCWin32 extends NotesCallbacks.OSSIGMSGPROC, StdCallCallback {}

	interface OSSIGBUSYPROCWin32 extends NotesCallbacks.OSSIGBUSYPROC, StdCallCallback {}

	interface OSSIGBREAKPROCWin32 extends NotesCallbacks.OSSIGBREAKPROC, StdCallCallback {}

	interface ABORTCHECKPROCWin32 extends NotesCallbacks.ABORTCHECKPROC, StdCallCallback {}
	
	interface OSSIGPROGRESSPROCWin32 extends NotesCallbacks.OSSIGPROGRESSPROC, StdCallCallback {}

	interface OSSIGREPLPROCWin32 extends NotesCallbacks.OSSIGREPLPROC, StdCallCallback {}

	interface ActionRoutinePtrWin32 extends NotesCallbacks.ActionRoutinePtr, StdCallCallback {}

	interface NsfSearchProcWin32 extends NotesCallbacks.NsfSearchProc, StdCallCallback {}

	interface CWFErrorProcWin32 extends NotesCallbacks.b32_CWFErrorProc, StdCallCallback {}

	interface NSFNoteOpenCallbackWin32 extends NotesCallbacks.b32_NSFNoteOpenCallback, StdCallCallback {}

	interface NSFObjectAllocCallbackWin32 extends NotesCallbacks.b32_NSFObjectAllocCallback, StdCallCallback {}

	interface NSFObjectWriteCallbackWin32 extends NotesCallbacks.b32_NSFObjectWriteCallback, StdCallCallback {}

	interface LSCompilerErrorProcWin32 extends NotesCallbacks.LSCompilerErrorProc, StdCallCallback {}
}
