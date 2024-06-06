package lab_8.Example_2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
public class Task_JSONCustomParser {
    public static void main(String[] args) throws IOException, ParseException {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lab_8/employees.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("employees");
            for (Object o : jsonArray) {
                JSONObject item = (JSONObject) o;
                System.out.println("\nТекущий элемент: employee");
                System.out.println("Имя: " + item.get("name"));
                System.out.println("Должность: " + item.get("position"));
            }


            Scanner in = new Scanner(System.in);

            String name, position;

            System.out.print("(Добавить) Введетие имя: ");
            name = in.nextLine();
            System.out.print("(Добавить) Введетие должность: ");
            position = in.nextLine();

            JSONObject newItem = new JSONObject();
            newItem.put("name", name);
            newItem.put("position", position);
            jsonArray.add(newItem);
            jsonObject.put("employees", jsonArray);


            int j = 0;
            String fname, fposition;
            System.out.print("(Найти и удалить) Введите имя: ");
            fname = in.nextLine();
            System.out.print("(Найти и удалить) Введите должность: ");
            fposition = in.nextLine();
            for (Object o : jsonArray) {
                JSONObject item = (JSONObject) o;
                if (item.get("name").equals(fname) || item.get("position").equals(fposition)) {
                    System.out.println("найден: " + item.toJSONString());
                    j++;
                }
            }
            if (j == 0) {
                System.out.println("нет элемента");
            }

            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject item = (JSONObject) iterator.next();
                if (item.get("name").equals(fname) || item.get("position").equals(fposition)) {
                    iterator.remove();
                    System.out.println("Элемент удален!");
                }
            }

            jsonObject.put("employees", jsonArray);
            try (FileWriter file = new FileWriter("src/lab_8/employees_upd.json")) {
                file.write(jsonObject.toJSONString());
                System.out.println("JSON-файл успешно дополнен!");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

