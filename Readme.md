## springcloud-jpa-lcn
    spring cloud 分布式事物的使用demo
    
## How to run
    1.启动eureka-server
    2.启动tx-manage
    3.启动server1
    4.启动server2
    
    
    请求  http://localhost:8888/save 的使用 server1的时候在service层的save方法调用了server2的save方法
    调用链：server1-->server2
    形成了一个应用层相互调用的场景： 两个业务都有保存的方法， 如果在server1的保存失败
    即：int v=100/0; 执行了改代码会整个事物的回滚 （server1,  server2） 的save
    
    
## tx-manager 模块
    访问其首页： http://localhost:8899/index.html 
    
    
    
       
    
    
    