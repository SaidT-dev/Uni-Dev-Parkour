.text 
_start:
addi	$8,	$0,	9
addi	$9,	$0,	0x1569	#addition avec valeur hex 0x1569 = 5481
addi	$10,	$0,	-6		#addition dún nombre signer
					#convertir en binnaire sur 32bit apres en ca2 apres en hex
addi	$11,	$0,	0xF045
add	$9,	$8,	$10 
addi	$2,	$0,	10
syscall

