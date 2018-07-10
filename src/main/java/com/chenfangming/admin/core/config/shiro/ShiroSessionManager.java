package com.chenfangming.admin.core.config.shiro;

import com.chenfangming.admin.core.constant.HeaderConstantEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.Serializable;

/**
 * @author fangming.chen
 * @since 2018-07-08 15：33
 * Email cfmmail@sina.com
 * Description 自定义sessionId获取
 */
public class ShiroSessionManager extends DefaultWebSessionManager {

    /**
     * 无参构造
     */
    public ShiroSessionManager() {
        super();
    }

    @Override
    protected Serializable getSessionId(ServletRequest request, ServletResponse response) {
        String id = WebUtils.toHttp(request).getHeader(HeaderConstantEnum.AUTHORIZATION.getHeader());
        // 如果请求头中有 Authorization 则其值为sessionId
        if (!StringUtils.isEmpty(id)) {
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE, HeaderConstantEnum.REFERENCED_SESSION_ID_SOURCE.getHeader());
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID, id);
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_IS_VALID, Boolean.TRUE);
            return id;
        } else {
            // 否则按默认规则从cookie取sessionId
            return super.getSessionId(request, response);
        }
    }

}
