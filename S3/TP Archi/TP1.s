.text 
_start:
addi	$17,	$0,	5	# additionner 5 avec 0 ($0) et stocker dans $17
addi	$18,	$0,	10	# additionner 10 avec 0 ($0) et stocker dans $18
add	$18,	$18,	$17	# additionner valeur stocker dans $17 avec celle de $18 
					# et restocker dans $18
addi	$2,	$0,	10
syscall
; ----------------------
    .END;  Merci
; ----------------------

