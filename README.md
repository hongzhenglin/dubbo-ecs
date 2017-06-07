# 对dubbo进行了一些简单的扩展和修改
## 扩展如下：
### 1.dubbo服务的熔断机制 
    添加熔断器
#### 使用方式如下：
     添加熔断器配置：
     <bean id="demoService" class="com.alibaba.dubbo.demo.provider.DemoServiceImpl" />
	
	<dubbo:service interface="com.alibaba.dubbo.demo.DemoService" ref="demoService"  circuitName="redis" >
	
	</dubbo:service>
    参数 circuitName :熔断器名称
    目前实现了两个熔断器：hystrix 和redis熔断机制两种，默认是hystrix熔断器
     
### 2.dubbo服务的编排
      待补充
    
### 3.新增一些filter
      待补充
 
