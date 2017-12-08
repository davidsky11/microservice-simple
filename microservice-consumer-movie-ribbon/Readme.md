使用RestTemplate时，想要获取一个List，应该用数组，而不应该直接用List。

--> RestTemplate 的坑    restTemplate.getForObject 

java.lang.ClassCastException: java.util.LinkedHashMap cannot be cast to com.kvlt.cloud.entity.User

--> 方法1
    User[] users = this.restTemplate.getForObject("http://microservice-provider-user/list-all", User[].class);
    List<User> list = Arrays.asList(users);
    
--> 方法2
    ResponseEntity<List<User>> result = this.restTemplate.exchange("http://microservice-provider-user/list-all",
                    HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<List<User>>() {});
    List<User> list1 = result.getBody();