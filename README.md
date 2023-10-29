# ifsp-tpe-project
Project for TPE subject demonstration.

## Run Project
* terminal: `docker-compose up -d`
* com o docker rodando, no browser `localhost:8888` acesse a página do pgadmin;
* ao tentar inicializar um server, se tiver algum problema com a configuração, pode tentar:
    * `docker-compose ps` para ver os conteiners ativos;
    * `docker inspect` no contêiner do postgres
    * verificar o IPAddress e usar este IP como Host name/address no Register-Server