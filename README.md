Coloque o programa para rodar e abre o postman, teste os endpoints CRUD, começando por criar uma nova tarefa (post na) url: 'http://localhost:8080/tasks, métodos post, no body, selecione raw e JSON, escreva o que deseja colocar: { "descricao":,"dataLimite":, "finalizada":,
para enviar a requisição clique emsend
Para obter todas as tarefas utilize o get, na url: 'http://localhost:8080/tasks, enviar requisição cliqeu em send, isso fará com que todas as tarefas que estão presentes sejam exibidas, 
Para obter uma tarefa pelo id dela utilize o get, na url: 'http://localhost:8080/tasks/{id}, subtitua o id pelo id da tarefa que você deseja encontrar, clique em send para enviar a requisição.
Para atualizar uma tarefa utilize o put, na url: 'http://localhost:8080/tasks/{id}, subtitua o id pelo id da tarefa que você deseja atualizar, no body selecione raw e json, e atualize as informações do body da maneira que desejar, para enviar a requisição clique em send.
Para deletar uma tarefa utilize o delete, na url: 'http://localhost:8080/tasks/{id}, subtitua o id pelo id da tarefa que você deseja deletar, clique em send para enviar a requisição.
Essas são as opções disponiveis para utilizar no postman. Para as considerações finais, verifique a porta, tenha certeza que o aplicativo Spring Boot está rodando na porta correta, com a 8080 sendo a padrão, verifique o formato do JSON, 
certifique-se de que o JSON no corpo das requisições esteja bem formatado, e por ultimo certifique-se de utilizar um ID existente no banco de dados.
