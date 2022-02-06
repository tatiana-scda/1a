# Gestão de Serviços de Logística

Trabalho de Conclusão de Curso

Pós-graduação em Arquitetura de Software Distribuído

Pontifíciia Universidade Catolica de Minas Gerais

## Base de Dados

Para rodar o sistema, é necessario instalar MYSQL.

```sudo apt install mysql-server```

Então, é possível conectar ao banco

```
sudo service mysql start;
sudo mysql -u root -p;
create database `gls`;
```

O sistema irá criar as tabelas e um dump automaticamente. Todas as tabelas já seráo populadas para ter resposta em todas chamadas.

## Chamada e Resposta

Aqui temos todos os endpoints disponiveis pela aplicação, como testá-los e o retorno esperado.

### Cadastro

Chamada

```
curl -X POST \
'http://127.0.0.1:8080/gsl-service/v1/user' \
-H 'Content-Type: application/json; charset=utf-8' \
-d '{
"name": "Ricardo Bom Destino",
"username": "ricardo",
"password": "ricardo"
}'
```

### Login

Chamada

```
curl -X GET \
'http://127.0.0.1:8080/gsl-service/v1/user' \
-H 'Content-Type: application/json; charset=utf-8' \
-d '{
"username": "user",
"password": "123"
}'
```

Resposta

true - login validado

false - informacao incorreta

### Rota

Chamada

```
  curl -X GET \
  'http://127.0.0.1:8080/gsl-service/v1/route/1' \
  -H 'Content-Type: application/json; charset=utf-8'
```

Resposta

``` 
{
    "routeId":1,
    "status":"IN_PROGRESS",
    "driver":"Pedro Martines",
    "currentLocation":"Rua Padre Anchieta 234 Barbacena",
    "origin":"Avenida Augusta 55 Sao Paulo",
    "destination":"Rua Sergipe 10 Belo Horizonte"
}
```

### Delivery

Chamada

```
'http://127.0.0.1:8080/gsl-service/v1/delivery/1' \
-H 'Content-Type: application/json; charset=utf-8'
```

Resposta

```
{
    "deliveryId":1,
    "status":"ON_ROUTE",
    "productDescription":"Livro Senhor dos Aneis - Edicao Colecionador"
} 
```# 1a
