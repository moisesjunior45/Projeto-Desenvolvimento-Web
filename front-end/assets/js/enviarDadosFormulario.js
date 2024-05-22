function enviarCliente() {

    const formulario = document.getElementById("formularioCliente");

    formulario.addEventListener("submit", evento => {
        evento.preventDefault();

        const clienteData = {
            nome: document.getElementById('nome').value,
            cpf: document.getElementById('cpf').value,
            email: document.getElementById('email').value,
            endereco: document.getElementById('endereco').value,
            telefone: document.getElementById('telefone').value,
            senha: document.getElementById('senha').value,
            confirmarSenha: document.getElementById('confirmar_senha').value
        };

        fetch('http://localhost:8080/clientes', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(clienteData)
        })
            .then(response => {
                console.log(response);
                if (response.ok) {
                    return response.json();
                }
                throw new Error('A solicitação falhou!');
            })
            .then(data => {
                console.log(data);
                alert('Cliente cadastrado com sucesso!');
            })
            .catch(error => {
                console.error('Houve um problema com a operação fetch: ', error);
            });
    })
}

function validarCadastro() {
    let nome = document.getElementById("nome").value;
    let cpf = document.getElementById("cpf").value;
    let email = document.getElementById("email").value;
    let endereco = document.getElementById("endereco").value;
    let telefone = document.getElementById("telefone").value;
    let senha = document.getElementById("senha").value;
    let confirmarSenha = document.getElementById("confirmar_senha").value;

    if (nome == "") {
        alert("Nome não informado");
        nome.focus();
        return;
    } if (cpf == "") {
        alert("CPF não informado");
        cpf.focus();
        return;

    }
    if (email == "") {
        alert("E-mail não informado");
        email.focus();
        return;

    } if (endereco == "") {
        alert("Endereço não informado");
        endereco.focus();
        return;
    } if (telefone == "") {
        alert("Telefone não informado");
        telefone.focus();
        return;
    }
    if (senha == "") {
        alert("Senha não informada");
        senha.focus();
        return;
    } if (confirmarSenha == "") {
        alert("Confirmar senha não informado");
        confirmarSenha.focus();
        return;
    } if (senha != confirmarSenha) {
        alert("As senhas não correspondem. Por favor, tente novamente.");
        return;
    }
}


