.data 
	tab: .space 40
	slt: .asciiz"Entrer les 10 valeur de tab\n"
.text
	la $4, slt
	ori $2, $0, 4
	syscall

	addi $8, $0, 10
	addi $9, $0, 1
	la $11, tab
	
	;beq $8, $9, fin
	;addi $2, $0, 5
	;syscall
	;addi 
	
	
; ----------------------
    .END;  Merci
; ----------------------
