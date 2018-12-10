### Dubbo的测试样例



#### dubbo-api

1. 提供了rpc所引用的接口以及数据bean

#### dubbo-provider

1. 方法提供者,实现dubbo-api中,提供接口实现类,


#### dubbo-consumer

1. 方法消费者,通过使用dubbo-api定义的接口,过得数据


#### 注意点
在启动项目前,需要先自行启动zookeeper服务