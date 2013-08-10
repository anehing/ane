/**
 * 
 */
package org.zdqk.framework.core.base.service;

import java.io.Serializable;
import java.util.List;


import com.googlecode.genericdao.search.ISearch;
import com.googlecode.genericdao.search.SearchResult;

/**
 * @author Administrator
 * @param <T>
 *
 */
public interface BaseService<T extends Serializable > {

	/**
	 * 增加或更新T
	 * @param <T>
	 * @param T
	 * @return
	 */
	public  boolean save( T t);

	/**
	 * 批量增加或更新T
	 * @param T
	 * @return
	 */
	public boolean[] save(T[] t);

	/**
	 * 删除T
	 * @param T
	 * @return
	 */
	public boolean remove(T t);

	/**
	 * 批量删除T
	 * @param T
	 */
	public void remove(T[] demos);

	/**
	 * 根据主键删除T
	 * @param id
	 * @return
	 */
	public boolean removeById(Integer id);

	/**
	 * 批量根据主键删除T
	 * @param ids
	 */
	public void removeByIds(String[] ids);

	/**
	 * 查询T数据记录集
	 * @return
	 */
	public List<T> findAll();

	/**
	 * 根据主键查询T
	 * @param id
	 * @return
	 */
	public T findById(Integer id);

	/**
	 * 批量根据主键查询T记录集
	 * @param ids
	 * @return
	 */
	public T[] findByIds(Integer[] ids);
	
	/**
	 * 根据条件查询T记录集
	 * @param search
	 * @return
	 */
	public List<T> search(ISearch search);
	
	/**
	 * 根据条件查询T记录集总数
	 * @param search
	 * @return
	 */
    public int count(ISearch search);
    
    /**
     * 根据条件查询T集合与总数
     * @param search
     * @return
     */
    public SearchResult<T> searchAndCount(ISearch search);
    
	/**
	 * 根据条件查询T主键ID
	 * @param search
	 * @return
	 */
	public Integer searchUnique(ISearch search);
    
	/**
	 * 持久化session数据到数据库
	 */
	public void flush();
}
