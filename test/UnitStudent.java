import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by eddy on 11/29/16.
 */
public class UnitStudent {

    private Student studentA;
    private Person person;
    private Person personB;
    private Student studentB;

    @Before
    public void before() {
        studentA = new Student(1);
        studentB = new Student(2);
        person = new Student(1);

        personB = new Person(1);
    }

    @Test
    public void testStudentsAreNotEqual() {
        this.setup();
        Assert.assertFalse(studentA.equals(studentB));
    }

    @Test
    public void testPersonAndStudentAAreNotEqualDueNotSameClass() {
        this.setup();
        Assert.assertFalse(studentA.equals(person));
    }

    @Test
    public void testPersonAndStudentAEqualDueSameClass() {
        this.setup();
        ((Student)person).setClassNumber(1);
        Assert.assertTrue(studentA.equals(person));
    }

    @Test
    public void testPersonAndStudentReferencePersonEqual() {
        this.setup();
        Assert.assertTrue(personB.equals(studentA));
    }

    @Test
    public void testPersonAndStudentReferencePersonAreNotEqualOnReverseComparationDueNotSameReference() {
        this.setup();
        Assert.assertFalse(studentA.equals(personB));
    }

    @Ignore
    private void setup(){

        studentA.setClassNumber(1);
        studentB.setClassNumber(1);

        studentA.setAge(12);
        studentB.setAge(12);

        studentA.setName("Ivan");
        studentB.setName("Ferran");

        studentA.setSurname("Castello");
        studentB.setSurname("Castello");

        person.setAge(12);
        person.setName("Ivan");
        person.setSurname("Castello");

        personB.setAge(12);
        personB.setName("Ivan");
        personB.setSurname("Castello");
    }


}
