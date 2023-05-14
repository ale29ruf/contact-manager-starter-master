import com.programming.techie.ContactManager;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class ContactTest {

    private ContactManager contactManager;


    @BeforeAll
    public void iniz(){
        contactManager=new ContactManager();
    }

    @Test
    @DisplayName(value = "test1 eseguito")
    public void test1(){
         contactManager.addContact("123","123","0123123123");
    }
}
