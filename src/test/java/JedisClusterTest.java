import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import redis.clients.jedis.JedisCluster;
import xingoo.Application;

/**
 * Created by xinghailong on 2017/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
@ImportResource(locations={"classpath:application-context.xml"})
public class JedisClusterTest {

    @Autowired
    JedisCluster jedisCluster;

    @Test
    public void test(){
//        jedisCluster.set("aaa", "aaaaaa_value");
//        jedisCluster.expire("aaa", 100);
        System.out.println("hello");
        System.out.println(jedisCluster.get("foo"));
    }
}
