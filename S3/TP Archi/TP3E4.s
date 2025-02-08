.data
	string:	.asciiz	"Hello Wolrd!\n"
.text
_start:
	la	$4,	string
	addi	$2,	$0,	4
	syscall	
	addi	$2,	$0,	10	#terminer le programme
	syscall	
; ----------------------
    .END;  Merci
; ----------------------

