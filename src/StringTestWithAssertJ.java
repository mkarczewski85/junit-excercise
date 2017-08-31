import org.junit.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StringTest {

    @Test
    public void test(){
        String napis = "ala";
        //JUnit
        assertEquals("ala", napis);
        //AssertJ
        assertThat(napis).contains("a");
    }

    @Test
    public void dateTest(){
        Date date = new Date();

        date.getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 10, 9);
        Date result = calendar.getTime();

        Calendar instance = Calendar.getInstance();
        instance.set(1980, 10, 9);
        Date birthday = instance.getTime();
        assertThat(birthday).isBefore(result);
    }

    @Test
    public void listTest(){
        List<Object> objects = new ArrayList<>();

        objects.add(new String("Napis"));
        objects.add(new String("Napis"));
        objects.add(new String("Napis"));

        //JUnit
        assertNotNull(objects.isEmpty());

        //AssertJ
        assertThat(objects).isNotNull();
    }


    @Test
    public void mapTest(){
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("666", "Napis");
        assertThat(stringMap).containsKeys("666").containsValues("Napis");
        assertThat(stringMap).doesNotContainValue("Napis2");
        assertThat(stringMap).isNotNull();

    }

}
