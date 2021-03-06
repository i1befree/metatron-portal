package app.metatron.portal.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * API 로직 처리중 예상하지 못한 오류 발생시 활용
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Unknown server error")
public class UnknownServerException extends BaseException {

  public UnknownServerException(String message) {
    super(GlobalErrorCodes.UNKNOWN_SERVER_ERROR_CODE, message);
  }

  public UnknownServerException(Throwable cause) {
    super(GlobalErrorCodes.UNKNOWN_SERVER_ERROR_CODE, cause);
  }

  public UnknownServerException(String message, Throwable cause) {
    super(GlobalErrorCodes.UNKNOWN_SERVER_ERROR_CODE, message, cause);
  }
}
