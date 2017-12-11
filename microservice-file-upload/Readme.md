文件上传处理

    $ curl.exe -F "file=@licecap.exe" localhost:8025/upload
    
    $ curl.exe -F "file=@GifCam.exe" localhost:8760/microservice-file-upload/upload
    
    $ curl -v -H "Transfer-Encoding: chunked" \
        -F "file=@mylarge.iso" localhost:9999/zuul/simple/file
        
对于大文件，会出现异常。 

1、被DispatcherServlet拦截，可以通过“/zuul/*”来绕过。
    localhost:8760/microservice-file-upload/upload 
--> localhost:8760/zuul/microservice-file-upload/upload

2、上传超时
    提升超时时间。
    hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds: 60000
    ribbon:
      ConnectTimeout: 3000
      ReadTimeout: 60000