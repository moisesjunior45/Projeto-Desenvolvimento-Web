function enviarClientes() {
    const formulario = document.getElementById('formularioCliente');

    formulario.addEventListener('submit', evento => {
        evento.preventDefault();

        const formData = new FormData(formulario);
        const data = Object.fromEntries(formData);

        fetch('http://localhost:8080/clientes', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        }).then(response => {
            if (response.ok) {
                return response.json(); // ou response.text() se a resposta não for JSON
            }
            throw new Error('A solicitação falhou!');
        })
        .then(data => {
            console.log(data); // Trata a resposta do servidor
            alert('Cliente cadastrado com sucesso!');
        })
        .catch(error => {
            console.error('Houve um problema com a operação fetch: ', error);
        });
    })
}