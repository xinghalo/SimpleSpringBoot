import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.JedisCluster;

import java.util.Date;

import static redis.clients.util.Hashing.MD5;

/**
 * Created by xinghailong on 2017/8/9.
 */
public class test2 {
    public static void main(String[] args) throws Exception {
        System.out.println(new Date().getTime());
        System.out.println(MD5.hash("wb_001_dashang"+"1502271754320_0001"+"wb_001_dashang_0001"));
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
//        JedisCluster cluster = (JedisCluster)ctx.getBean("jedisCluster");
//        String foo = cluster.get("foo");
//        System.out.println(foo);
    }
}
