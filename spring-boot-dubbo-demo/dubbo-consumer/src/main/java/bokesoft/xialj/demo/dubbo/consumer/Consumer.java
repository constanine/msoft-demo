package bokesoft.xialj.demo.dubbo.consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bokesoft.xialj.demo.dubbo.DubboHelloService;

public class Consumer {
    public static void main(String[] args) throws IOException {
    	//测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DubboHelloService helloService = context.getBean(DubboHelloService.class);
        System.out.println(helloService.getMemberInfo().toString());
    }
}