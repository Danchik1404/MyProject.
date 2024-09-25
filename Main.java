import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        List<String> questions = new ArrayList<>();
        questions.add("Что такое ООП?");
        questions.add("Что такое наследование?");
        questions.add("Что такое инкапсуляция?");
        questions.add("Что такое полиморфизм?");
        questions.add("Что такое конструктор в Java?");
        questions.add("Что такое объекты?");
        questions.add("Что такое классы?");
        questions.add("Какие два класса не наследуются от Object?");
        questions.add("Что такое Local Variable?");
        questions.add("Что такое Instance Variable?");
        questions.add("Что такое модификаторы доступа?");
        questions.add("Что такое переопределение (overriding) методов?");

        int randomIndex = rnd.nextInt(questions.size());
        System.out.println(questions.get(randomIndex));
    }
}
