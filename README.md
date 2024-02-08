
# Certificação de Alunos

O projeto consiste em um sistema de cadastro de alunos que permite aos usuários se registrarem utilizando seus endereços de e-mail. Após o registro, os alunos têm a opção de participar de uma prova para obter um certificado. O sistema assegura que cada aluno só possa realizar a prova uma vez, impedindo que a faça novamente caso já tenha concluído anteriormente. O projeto é desenvolvido em Java, utilizando o Spring Framework, aproveitando seus recursos para o desenvolvimento eficiente e escalável de aplicações web. 

É relevante mencionar que o projeto foi concebido e desenvolvido durante a décima quarta edição da Next Level Week (NLW) da Rocketsea, destacando a sinergia entre o aprendizado intensivo proporcionado pelo evento e a implementação prática de um sistema funcional e robusto. A abordagem cuidadosa na validação de acesso ao questionário complementa a integridade do banco de dados, reforçando a eficácia do processo de avaliação.

## Documentação da API

### Verifica se o usuário já realizou a prova

```http
  POST /students/verify
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `email` | `String` | O email do usuário a ser consultado |
| `technology` | `String` | A tecnologia do questionário
 a ser consultada |

#### Exemplo de Requisição
```json
POST /students/verify

{
  "email": "exemplo@email.com",
  "technology": "JAVA"
}
```

### Vizualizar as questões do questionário

```http
  GET /questions/technology/JAVA
```

### Realizar as questões

```http
  POST /students/certification/answer
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `email` | `String` | O email do usuário |
| `technology` | `String` | A tecnologia da prova |
| `questionsAnswers` | `Object` | A lista com os IDs das perguntas e respostas |

#### Exemplo de Requisição
```json
POST /students/certification/answer
Content-Type: application/json

{
	"email": "exemplo@email.com",
	"tech": "JAVA",
	"questionsAnswers": [
		{
			"questionID": "c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66",
			"alternativeID": "993a7d37-62a0-4040-810d-d667e3f7a891"
		},
		{
			"questionID": "b0ec9e6b-721c-43c7-9432-4d0b6eb15b01",
			"alternativeID": "f8e6e9b3-199b-4f0d-97ce-7e5bdc080da9"
		},
		{
			"questionID": "f85e9434-1711-4e02-9f9e-7831aa5c743a",
			"alternativeID": "d3e51a56-9b97-4bb8-9827-8bcf89f4b276"
		}
	]
}
```

### Retorna um ranking com as 10 melhores notas

```http
  GET /ranking/top-10
```



## Minhas Redes
Fique conectado para mais novidades e atualizações. Não hesite em entrar em contato!

Linkedin: linkedin.com/in/matheuspiress
e-mail: matheuspiressdev@gmail.com