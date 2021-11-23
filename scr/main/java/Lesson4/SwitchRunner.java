package Lesson4;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println(getSolutionSvetafore("желтый"));
        System.out.println(getSolutionSvetafore("красный"));
        System.out.println(getSolutionSvetafore("зеленый"));
        System.out.println(getSolutionSvetafore("з"));
    }

    public static String getSolutionSvetafore (String color) {
        String result;
        switch (color) {
            case "красный": {
                result = "Проход запрещен";
                break;
            }
            case "желтый" : {
                result = "Будь внимателен";
                break;
            }
            case  "зеленый" : {
                result = "Иди";
                break;
            }
            default: {
                result = "Ошибочка вышла";
                break;
            }
        }
        return result;
    }
}
