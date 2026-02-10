.text 
_start:
ori	$8,	$0,	9
ori	$9,	$0,	0x1569	//transforme en binaire et fais une comp OU logique bit a bit
ori	$10,	$0,	-6		
ori	$11,	$0,	0xF045
or	$9,	$8,	$10 
orii	$2,	$0,	10
syscall
; ----------------------
    .END;  Merci
; ----------------------

