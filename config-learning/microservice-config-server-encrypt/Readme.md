配置属性加解密之对称加密

$ curl.exe -X POST http://localhost:8080/encrypt -d foobar
--> 1a53c2460b5b912186598086dc034e0ee889c90b5fc558e46ab1c1c365093edc

$ curl.exe -X POST http://localhost:8080/decrypt -d 1a53c2460b5b912186598086dc034e0ee889c90b5fc558e46ab1c1c365093edc
--> foobar


Git仓库： https://github.com/davidsky11/config-server-repo

foobar-production.yml：
    profile: '{cipher}1a53c2460b5b912186598086dc034e0ee889c90b5fc558e46ab1c1c365093edc'

foobar-test.properties：
    profile={cipher}1a53c2460b5b912186598086dc034e0ee889c90b5fc558e46ab1c1c365093edc
   
注： 
1、密码前需要加 {cipher}
2、yml加 ‘’， properties不加‘’
3、Config Client 不需要特殊配置 