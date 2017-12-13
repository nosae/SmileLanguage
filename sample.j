.class public sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; i,j,k:)integer

.field private static i I
.field private static j I
.field private static k I

; x,y,z:)real

.field private static x F
.field private static y F
.field private static z F

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        sample/_standardIn LPascalTextIn;

; i=)25

	ldc	25
	putstatic	sample/i I

; j=)30

	ldc	30
	putstatic	sample/j I

; k=)i+17

	getstatic	sample/i I
	ldc	17
	iadd
	putstatic	sample/k I

; x=)23.5

	ldc	23.5
	putstatic	sample/x F

; IFi==26THENprint("YESSSS")ELSEprint("NOOOOO")

	getstatic	sample/i I
	ldc	26
	if_icmpeq	L001
	iconst_0
	goto	L002
L001:
	iconst_1
L002:
ifeq	L2

; print("YESSSS")

	getstatic     java/lang/System/out Ljava/io/PrintStream;
	ldc           "YESSSS"
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
	getstatic     java/lang/System/out Ljava/io/PrintStream;
	ldc           ""
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L1
L2:

; print("NOOOOO")

	getstatic     java/lang/System/out Ljava/io/PrintStream;
	ldc           "NOOOOO"
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
	getstatic     java/lang/System/out Ljava/io/PrintStream;
	ldc           ""
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L1:

	getstatic     sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
