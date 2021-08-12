
import com.ch.dao.StudentDao;
import com.ch.dao.imp.StudentDaoImp;
import com.ch.domain.Student;
import com.ch.service.StudentService;
import com.ch.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Mytest {


    @Test
    public void Mytest01(){
        StudentDao dao=new StudentDaoImp();
        List<Student> studentList=dao.selectStudents();
        for (Student stu:studentList){
            System.out.println(stu);
        }
    }
    @Test
    public void Mytest02(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList=dao.selectStudents();
        for (Student stu:studentList){
            System.out.println(stu);
        }
    }

    @Test
    public void Mytest03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        StudentService service = (StudentService) applicationContext.getBean("myservice");
        List<Student> studentList = service.findStudent();
        for (Student stu:studentList){
            System.out.println(stu);
        }
    }
}
