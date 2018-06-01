package com.example.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.springframework.cloud.netflix.zuul.util.RequestUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wangguo
 */
@Slf4j
public class TestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("44444444444444");

        RequestContext requestContent = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContent.getRequest();
        String token = httpServletRequest.getParameter("token");
        log.info(String.format("%s >>> %s", httpServletRequest.getMethod(), httpServletRequest.getRequestURL().toString()));
        if (!StringUtils.isEmpty(token)) {
            requestContent.setSendZuulResponse(false);
            requestContent.getResponse().setCharacterEncoding("utf-8");
            requestContent.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
            requestContent.getResponse().setContentType("text/html; charset=utf-8");
            requestContent.setResponseBody("用户未登录。。。");
        }
        return null;
    }
}
