package Exception0512.home_work_exception0512_3result.wrong_melons_exception;

public class WrongLoginException extends Exception{     
    public WrongLoginException(String msg){               
        super(msg);
    }
    
    public WrongLoginException(String message, Throwable cause){  // Throwableперехватили сообщение  делегировали родителю
        super(message, cause);                                          //super это вызов конструктора родителя (в нашем случае Exception)     
    }
}
