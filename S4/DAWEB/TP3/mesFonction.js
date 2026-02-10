function inverse() {
    const input = document.getElementById('chaine').value;
    const output = input.split('').reverse().join('');
    document.querySelector('.MyDiv').textContent = output;
}

function trouver() {
    const input = document.getElementById('chaine');
    const value = input.value;
    if (value.includes('@')) {
        input.classList.remove('contenuErrone');
        input.classList.add('contenuCorrect');
    } else {
        input.classList.remove('contenuCorrect');
        input.classList.add('contenuErrone');
    }
}

function checkPasswords() {
    const pwd1 = document.getElementById('pwd1');
    const pwd2 = document.getElementById('pwd2');

    if (pwd1.value === pwd2.value && pwd1.value !== '') {
        pwd1.classList.remove('contenuErrone');
        pwd1.classList.add('contenuCorrect');
        pwd2.classList.remove('contenuErrone');
        pwd2.classList.add('contenuCorrect');
    } else {
        pwd1.classList.remove('contenuCorrect');
        pwd1.classList.add('contenuErrone');
        pwd2.classList.remove('contenuCorrect');
        pwd2.classList.add('contenuErrone');
    }
}
