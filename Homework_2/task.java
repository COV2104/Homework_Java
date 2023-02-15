
/**
 * Написать метод который приводит сторку к нормальному виду строка на вход
 * Добрый день Как дела Все хорошо
 * выход
 * Добрый день. Как дела. Все хорошо.
 */

public class task {
    public static void main(String[] args) {
        String text = "    Доброе утро     Как дела        Хорошего дня";
        System.out.println(text);
        System.out.println(bringingItBackToNormal(text));
    }

    public static String bringingItBackToNormal(String text) {
        if (text.isEmpty()) {
            return "Пустая строка";
        } else {
            String textReplace = text.replaceAll(" +", " ");
            StringBuilder stringBuilder = new StringBuilder(textReplace);

            for (int index = textReplace.length() - 1; index >= 0; index--) {
                if (textReplace.charAt(index) >= 'А' && textReplace.charAt(index) <= 'Я') {
                    stringBuilder.setCharAt(index - 1, '.');
                    stringBuilder.insert(index, ' ');
                }
            }

            stringBuilder.delete(0, 2);
            stringBuilder.append('.');
            return stringBuilder.toString();
        }
    }
}
