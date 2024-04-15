function enviarCliente() {

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
}