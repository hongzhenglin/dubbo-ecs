# 对dubbo进行了一些简单的扩展和修改
## 扩展如下：
### 1.dubbo服务的熔断机制 
    添加熔断器
#### 使用方式如下：
     添加熔断器配置：
     <bean id="demoService" class="com.alibaba.dubbo.demo.provider.DemoServiceImpl" />
	
	<dubbo:service interface="com.alibaba.dubbo.demo.DemoService" ref="demoService" >
	<!-- 添加 熔断器 -->
	
	  <dubbo:parameter key="circuit" value="hystrix" />
	</dubbo:service>
参数 circuit:表示添加熔断器 value：为熔断器名称，此配置为扩展配置，
    目前实现了两个熔断器：hystrix 和redis熔断机制两种，默认是hystrix熔断器
     
### 2.dubbo服务的编排
    
### 3.新增一些filter
 
