// Importando o modal
let modalCadastro = document.getElementById("modal-cadastro");
let modalLogin = document.getElementById("modal-login");


// Chamando botão que abre o modal
let btnCadastro = document.getElementById("myBtn-cadastro");
let btnLogin = document.getElementById("myBtn-login");


// Obtenha o elemento <span> que fecha o modal
let spanCadastro = document.getElementsByClassName("close-cadastro")[0];
let spanLogin = document.getElementsByClassName("close-login")[0];


// Quando o usuário clicar no botão, abra o modal
btnCadastro.onclick = function () {
    modalCadastro.style.display = "block";
}

btnLogin.onclick = function () {
    modalLogin.style.display = "block";
}


// Quando o usuário clicar em <span> (x), feche o modal
spanCadastro.onclick = function () {
    modalCadastro.style.display = "none";
}

spanLogin.onclick = function () {
    modalLogin.style.display = "none";
}


// Quando o usuário clicar em qualquer lugar fora do modal, feche-o
window.onclick = function (event) {
    if (event.target == modalCadastro) {
        modalCadastro.style.display = "none";
    }
    if (event.target == modalLogin) {
        modalLogin.style.display = "none";
    }
}


// Abrir e fechar modal de pagamentos
function openPayment() {
    const payment = document.querySelector(".payment");
    payment.style.display = "flex";
}

function closePayment() {
    const payment = document.querySelector(".payment");
    payment.style.display = "none";
}