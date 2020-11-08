package com.blues.lin.mpauto.api;

import com.blues.lin.mpauto.core.constants.Constants;
import com.blues.lin.mpauto.core.model.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Controller 基类
 * @author linzg
 * @date 2020/03/02 15:25
 */
public class BaseController {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * The Global exception handler
     * @param e
     * @return
     * @author linzg
     * @date 2020/03/02 15:25
     */
    @ExceptionHandler(Exception.class)
    public R exceptionHandler(Exception e) {
        log.error(e.getMessage(), e);
        R response = R.failure(Constants.Response.FAILURE);
        return response;
    }

}