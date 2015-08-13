import com.sshe.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenxyz on 2014/4/26.
 */
public class SpringTest {

	@Test
	public void test() {
//		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
//		UserService userService = (UserService)ac.getBean("userService");
//		userService.test();
	}

//	public static void main(String args[]) {
//		System.out.println("start");
//		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
//		UserService userService = (UserService)ac.getBean("userService");
//		userService.test();
//	}

	public static void main(String[] args) {
		System.out.println("我的测试");
	}
}
