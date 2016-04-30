package aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

/**
 * Created by dw on 2016. 4. 30..
 */
public class LogPrintBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        Log log = LogFactory.getLog(this.getClass());


        log.info("[Method Before]:보조업무 시작");
    }
}
