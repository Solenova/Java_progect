package Exception0512.home_work_exception0512_3result;

import Exception0512.home_work_exception0512_3result.wrong_melons_exception.WrongLoginException;
import Exception0512.home_work_exception0512_3result.wrong_melons_exception.WrongPaasswordException;

// V 1.Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
// V 2. Login должен содержать только латинские буквы, цифры и знак подчеркивания.
// V 3. Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, 
// необходимо выбросить WrongLoginException.
// V 4. Password должен содержать только латинские буквы, цифры и знак подчеркивания. 
// Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
// V 5. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
// v 6. WrongPasswordException и WrongLoginException - пользовательские классы исключения 
//с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
// V 7. Обработка исключений проводится внутри метода.
// 8. Метод возвращает true, если значения верны или false в другом случае.
public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPaasswordException {

        String login = "are76_7665";
        String password = "sword565%;№№555_jhhh";
        String confirmPassword = "sword56555_jhhh";
        System.out.println(checkId(login, password, confirmPassword));
    }

    public static boolean checkId(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPaasswordException {
        String pattern = "\\w+";

        if (login.length() > 20) {
            throw new WrongLoginException("Размер логина превышает допустимый");
        }
        if (!login.matches(pattern)) {
            throw new WrongLoginException("Некорректный логин");
        }

        if (password.length() > 20) {
            throw new WrongPaasswordException("Размер пароля превышает допустимый");
        }
        if (!password.matches(pattern)) {
            throw new WrongPaasswordException("Некорректный пароль");
        }
        if (password != confirmPassword) {
            throw new WrongPaasswordException("Пароли не совпадают");
        }
        return true;

    }
}
