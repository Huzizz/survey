package survey;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zh.survey.ApplicationSurvey;
import com.zh.survey.entity.User;
import com.zh.survey.mapper.UserMapper;
import com.zh.survey.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationSurvey.class)
public class UserServiceTest {

	@Autowired
    private UserMapper userMapper;
	
    @Autowired
    private UserService userService;
    
    @Test
    public void mapperInsertTest() {
    	User user = new User();//ObjectId("5d47e43475d210b038a6c12e")
    	user.setNickName("zhonghuai");
    	user.setPhone(13410542543l);
    	user.setStatus(1);
    	user.setCreateTime(new Date());
    	userService.insert(user);
    }
    
    //@Test
    public void mapperUpdateTest() {
    	User user = new User();//ObjectId("5d47e43475d210b038a6c12e")
    	user.setUserId("5d47e43475d210b038a6c12e");
    	user.setPhone(13410542543l);
    	user.setStatus(0);
    	user.setCreateTime(new Date());
    	userService.update(user);
    }
    
    //@Test
    public void mapperFindTest() {
    	User user = userService.findByUserId("5d47e43475d210b038a6c12e");
    	System.out.println(user);
    }
}
