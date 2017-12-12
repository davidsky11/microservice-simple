package com.kvlt.cloud;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * PreZuulFilter
 *
 * @author KVLT
 * @date 2017-12-12.
 */
public class PreZuulFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(PreZuulFilter.class);

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String host = request.getRemoteHost();
        PreZuulFilter.logger.info("请求的host:{}", host);
        return null;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

}
