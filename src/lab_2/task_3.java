package lab_2;

import java.util.Scanner;

public class task_3 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();

        String cryptoText = Crypto(0, text, key);
        System.out.println("Текст после преобразования: " + cryptoText);

        scanner.nextLine();

        while(true){
            System.out.print("Выполнить обратное преобразование? (y/n): ");
            String action = scanner.nextLine().trim().toLowerCase();;

            if(action.equals("y")){
                String deCryptoText = Crypto(1, cryptoText, key);
                System.out.println("Текст после обратного преобразования: " + deCryptoText);
                break;
            } else if (action.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ.");
            }
        }
    }

    static String Crypto(int type, String text, int key) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char shifted;
                char firstLetter = 'a';
                int letterCount = 26;
                if (type == 0){
                    shifted = (char) (((ch - firstLetter + key) % letterCount) + firstLetter);
                } else {
                    shifted = (char) (((ch - firstLetter - key + letterCount) % letterCount) + firstLetter);
                }
                res.append(shifted);
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}
