配置属性加解密之非对称加密

$ keytool -genkeypair -alias mytestkey -keyalg RSA -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" -keypass changeme -keystore server.jks -storepass letmein

application.yml配置：

    encrypt:
      keyStore:
        location: classpath:/server.jks
        password: letmein
        alias: mytestkey
        secret: changeme

$ curl -X POST http://localhost:8079/encrypt -d abc
--> AQBQntpcdp+gbp2nYSScBfQwyijtUBp/sAKz4RwocMNpUeZ1ZOv40dGI3jaPbkXi++5jfh27TrVVN3dUcUkeyi1Hg9YB+XGDdkJL3qsQPIfPFNgyCsrrKeX2kinlr17+6Wh0cf7kCyk/nu5lkyFOYE7X38mTcf3b3iuRbuy1Nwx7cVS6kq4qjV+kpxzCveUUoR1tMqILfnnc37qp3CRz6x2Jk/oTEgIR3382RZkel+uGfgeAe6EWBiw1K42t9gOSPP508VqHKYLmuh3gDTLeeNI5dr1OIUriNNYVDZH1oCJTl9mE6zbmSsWwoAXWA/wwGkiPg6kylr8W3nAvLpZ/4hVXn0ADfwyifXdQRLyufdZ/jLiGlFr+A+gi5fVs6nodDjU=

$ curl -X POST http://localhost:8079/dncrypt -d AQBQntpcdp+gbp2nYSScBfQwyijtUBp/sAKz4RwocMNpUeZ1ZOv40dGI3jaPbkXi++5jfh27TrVVN3dUcUkeyi1Hg9YB+XGDdkJL3qsQPIfPFNgyCsrrKeX2kinlr17+6Wh0cf7kCyk/nu5lkyFOYE7X38mTcf3b3iuRbuy1Nwx7cVS6kq4qjV+kpxzCveUUoR1tMqILfnnc37qp3CRz6x2Jk/oTEgIR3382RZkel+uGfgeAe6EWBiw1K42t9gOSPP508VqHKYLmuh3gDTLeeNI5dr1OIUriNNYVDZH1oCJTl9mE6zbmSsWwoAXWA/wwGkiPg6kylr8W3nAvLpZ/4hVXn0ADfwyifXdQRLyufdZ/jLiGlFr+A+gi5fVs6nodDjU=
--> abc