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

; i=)24

	ldc	24
	putstatic	sample/i I

; j=)0

	ldc	0
	putstatic	sample/j I

; k=)i+17

	getstatic	sample/i I
	ldc	17
	iadd
	putstatic	sample/k I

; x=)23.5

	ldc	23.5
	putstatic	sample/x F

; WHILE(i<25)DOprint("COOL")

L1:
	getstatic	sample/i I
	ldc	25
	if_icmplt	L001
	iconst_0
	goto	L002
L001:
	iconst_1
L002:
ifeq	L2

; print("COOL")

	getstatic     java/lang/System/out Ljava/io/PrintStream;
	ldc           "COOL"
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
	getstatic     java/lang/System/out Ljava/io/PrintStream;
	ldc           ""
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L1
L2:

; i=)i-1

	getstatic	sample/i I
	ldc	1
	isub
	putstatic	sample/i I

	getstatic     sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
