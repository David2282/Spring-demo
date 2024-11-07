package my.resume.Spring.exception;

public class NullPointerException {
  public static void nullCheck(Object object, String message){
    if (object == null){
        throw new ValidationException(message);
    }
  }
}
