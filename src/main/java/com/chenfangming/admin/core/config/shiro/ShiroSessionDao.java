package com.chenfangming.admin.core.config.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author fangming.chen
 * @since 2018-07-01 17：56
 * Email cfmmail@sina.com
 * Description shiro session共享
 */
@Component("shiroSessionDao")
public class ShiroSessionDao extends CachingSessionDAO {

    @Override
    protected void doUpdate(Session session) {
    }

    @Override
    protected void doDelete(Session session) {

    }

    @Override
    protected Serializable doCreate(Session session) {

        return session.getId();
    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        return null;
    }


}
