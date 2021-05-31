# City API

O Projeto consiste em uma API REST com Spring Boot feito para o bootcamp everis Quality Assurance Beginner da Digital Innovation One.
Para o desenvolvimento da API foi foi utilizado o [Spring initializr](https://start.spring.io/) para criar o projeto com 
suas dependências, a versão 11 do Java, o banco de dados PostgreSQL, Gradle e a IDE Intellj IDEA Community Edition.
[Link do projeto no heroku.](https://cities-api-live-dio.herokuapp.com/)

## API Endpoints
### GET
* /cities - Recupera todas as cidades cadastradas.
* /states - Recupera todos os estados cadastradas.
* /countries - Recupera todos os países cadastradas.
* /countries/id - Recupera um país pelo o seu id.
* /distances/by-points?from=id1&to=id2 - Retorna a distância, em milhas, entre duas cidades pelo seus ids.
