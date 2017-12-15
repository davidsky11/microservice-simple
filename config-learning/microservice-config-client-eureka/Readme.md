Git repo: https://github.com/davidsky11/config-server-repo


http://localhost:8080/abc/default/master
http://localhost:8080/foobar/dev/master

http://localhost:8080/master/abc-default.yml
http://localhost:8080/master/abc-default.properties

http://localhost:8080/master/foobar-dev.yml
http://localhost:8080/master/foobar-dev.properties


映射规则：

/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties