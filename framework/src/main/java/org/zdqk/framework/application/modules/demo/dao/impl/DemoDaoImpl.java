package org.zdqk.framework.application.modules.demo.dao.impl;

import org.springframework.stereotype.Repository;
import org.zdqk.framework.application.modules.demo.dao.DemoDao;
import org.zdqk.framework.application.modules.demo.model.Demo;
import org.zdqk.framework.core.base.dao.BaseDAO;


@Repository
public class DemoDaoImpl extends BaseDAO<Demo, Integer> implements DemoDao {
    
}
