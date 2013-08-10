package org.zdqk.framework.core.base.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

/**
 * base dao
 * 
 * 
 */
public class BaseDAO<T, ID extends Serializable> extends GenericDAOImpl<T, ID> {

    @Autowired
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
