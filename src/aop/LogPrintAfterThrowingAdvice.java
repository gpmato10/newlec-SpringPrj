package aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

/**
 * Created by dw on 2016. 4. 30..
 */
public class LogPrintAfterThrowingAdvice implements ThrowsAdvice {

    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        Log log = LogFactory.getLog(this.getClass());

        log.info("[After Throwing]: 예외 발생");
    }
}
