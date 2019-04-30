package norton.com.daoProject;

import java.util.Optional;

import norton.com.daoProject.memory.daos.Dao;
import norton.com.daoProject.memory.daos.UserDao;
import norton.com.daoProject.memory.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Dao userDao;
    
	public static void main( String[] args )
    {
        userDao = new UserDao();
        
        User user1 = getUser(0);
        System.out.println(user1);
        userDao.update(user1, new String[]{"Jake", "jake@domain.com"});
         
        User user2 = getUser(1);
        userDao.delete(user2);
        userDao.save(new User("Julie", "julie@domain.com"));
         
        userDao.getAll().forEach(user -> System.out.println(((User) user).getName()));
    }
 
    private static User getUser(long id) {
        Optional<User> user = userDao.get(id);
         
        return user.orElseGet(
          () -> new User("non-existing user", "no-email"));
    }
}
