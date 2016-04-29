package aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

/**
 * Created by dw on 2016. 4. 30..
 */
public class NewlecCalculator implements Calculator {
    @Override
    public int add(int x, int y) {
        Log log = LogFactory.getLog(this.getClass());

        StopWatch sw = new StopWatch();
        sw.start();
        log.info("타이머 시작");
        int sum = x+y;

        sw.stop();
        log.info("타이머 정지");
        log.info("[TIMERLOG]METHOD : add");
        log.info("[TIMERLOG]Process Time: " + sw.getTotalTimeMillis());

        return sum;
    }

    @Override
    public int sub(int x, int y) {
        return x-y;
    }

    @Override
    public int multy(int x, int y) {
        return x * y;
    }

    @Override
    public int div(int x, int y) {
        return x / y;
    }
}
