.data
	A:	.word	0x12345678
.text
_start
	addi	$11,	$0,	0x3579
	la	$10,	A
	sw	$11,	0($10)
	addi	$2,	$0,	10
	syscall
