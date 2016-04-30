package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

/**
 * Created by dw on 2016. 4. 30..
 */
public class LogPrintAroundAdvice implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Log log = LogFactory.getLog(this.getClass());

        StopWatch sw = new StopWatch();
        sw.start();
        log.info("타이머 시작");

        Object result = methodInvocation.proceed();

        sw.stop();
        log.info("타이머 정지");
        log.info("[TIMERLOG]METHOD : add");
        log.info("[TIMERLOG]Process Time: " + sw.getTotalTimeMillis());

        return result;
    }
}
