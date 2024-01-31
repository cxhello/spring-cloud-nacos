package top.cxhello.test.demos.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cxhello
 * @date 2024/1/31
 */
@RefreshScope
@RestController
public class TestController {


    @Value("${test.value}")
    private String value;

    @RequestMapping("/test")
    public String hello() {
        return value;
    }


}
