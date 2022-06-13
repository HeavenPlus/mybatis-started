import com.heaven.dao.mapper.IOrderDao;
import com.heaven.dao.mapper.IUserDao;
import com.heaven.dao.mapper.IUserRoleDao;
import com.heaven.dao.pojo.User;
import com.heaven.dao.vo.OrderVO;
import com.heaven.dao.vo.UserRoleVO;
import com.heaven.dao.vo.UserVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description 测试类
 * @Author Heaven
 * @Date 2022/6/11 下午10:18
 */
public class Test {

    @org.junit.Test
    public void test1() throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("user.findAll");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void test2() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private IOrderDao orderDao;
    private IUserDao userDao;
    private IUserRoleDao userRoleDao;

    @Before
    public void before() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        orderDao = sqlSession.getMapper(IOrderDao.class);
        userDao = sqlSession.getMapper(IUserDao.class);
        userRoleDao = sqlSession.getMapper(IUserRoleDao.class);
    }

    @org.junit.Test
    public void oneToOne(){
        List<OrderVO> orderAndUser = orderDao.findOrderAndUser();
        for (OrderVO orderVO : orderAndUser) {
            System.out.println(orderVO);
        }
    }

    @org.junit.Test
    public void oneToMany(){
        List<UserVO> userAndOrder = userDao.findUserAndOrder();
        for (UserVO userVO : userAndOrder) {
            System.out.println(userVO);
        }
    }

    @org.junit.Test
    public void manyToMany(){
        List<UserRoleVO> allUserRole = userRoleDao.findAllUserRole();
        for (UserRoleVO userRoleVO : allUserRole) {
            System.out.println(userRoleVO);
        }
    }
}
