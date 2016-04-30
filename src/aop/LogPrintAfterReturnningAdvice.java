package aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by dw on 2016. 4. 30..
 */
public class LogPrintAfterReturnningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        Log log = LogFactory.getLog(this.getClass());

        log.info("[After]:Method: " + method.getName() + ", returnValue : " + returnValue + ", args : "
        + Arrays.toString(args));
    }
}
