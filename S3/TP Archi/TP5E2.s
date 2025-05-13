.text
_start:
	addi $2, $0, 5
	syscall
	add $9, $0, $2

	addi $2, $0, 5
	syscall
	add $10, $0, $2

	addi $4, $0, 1
	addi $11, $0, 0
	addi $12, $0, 0
test:
	sw $4, $12($13)
	addi $12, $12, 4
	beq $10, $11, affichage
	mult $4, $9
	mflo $4
	addi $11, $11, 1
	j test
affichage:
	addi $2, $0, 1
	syscall
	addi $2, $0, 10
	syscall
; ----------------------
    .END;  Merci
; ----------------------
