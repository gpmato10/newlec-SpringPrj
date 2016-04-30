package aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dw on 2016. 4. 30..
 */
public class LogPrintHanlder implements InvocationHandler {

    private Object target;

    public LogPrintHanlder(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Log log = LogFactory.getLog(this.getClass());

        StopWatch sw = new StopWatch();
        sw.start();
        log.info("타이머 시작");

        int result = (int) method.invoke(target, args);

        sw.stop();
        log.info("타이머 정지");
        log.info("[TIMERLOG]METHOD : add");
        log.info("[TIMERLOG]Process Time: " + sw.getTotalTimeMillis());
        return result;
    }
}