package week12;

public class BusinessException extends Exception {
    private Severity severity;

  public BusinessException(String message, Severity severity) {
    super(message);
    this.severity = severity;
  }

  public BusinessException(String message) {
    super(message);
    this.severity = Severity.LOW;
  }

  public Severity getCode() {
    return this.severity;
  }
}