import java.util.ArrayList;
import java.util.List;

public class Greeting {

    public String greet(String... names) {

        if (names == null){
            return "Hello, my friend";
        }

        if (names.length == 1) {
            String name = names[0];
            if (name.toUpperCase().equals(name)) {
                return "HELLO " + name;
            } else {
                return "Hello, " + name;
            }
        } else {
            StringBuilder message = new StringBuilder();
            if (!hasUppercase(names)){
                for (int i = 0; i < names.length; i++) {
                    if (i == names.length - 1) {
                        message.append(" and " + names[i] + "!");
                    } else {
                        message.append(names[i]);
                    }
                }
                return "Hello, " + message.toString();
            } else {
                List<String> namesWithUppercase = new ArrayList<>();
                List<String> namesWithLowercase = new ArrayList<>();

                for (String name : names){
                    if (name.toUpperCase().equals(name)) {
                        namesWithUppercase.add(name);
                    } else {
                        namesWithLowercase.add(name);
                    }
                }

                for (int i = 0; i < namesWithLowercase.size(); i++){
                    if (i == namesWithLowercase.size() - 1) {
                        message.append(" and " + namesWithLowercase.get(i) + "!");
                    } else {
                        message.append(namesWithLowercase.get(i));
                    }
                }

                for (int i = 0; i < namesWithUppercase.size(); i++){

                }
            }

        }
    }

    public boolean hasUppercase(String[] a){
        boolean result = false;
        for (String s : a){
            if (s.toUpperCase().equals(s)) {
                result = true;
            }
        }
        return result;
    }


}