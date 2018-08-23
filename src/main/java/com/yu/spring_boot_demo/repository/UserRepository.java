package com.yu.spring_boot_demo.repository;

import com.yu.spring_boot_demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserRepository {

    /**
     * 定义内存存储
     */
    private final ConcurrentHashMap<Integer, User>  repositoryMap = new ConcurrentHashMap<>();

    /**
     * id自增长
     */
    private final static AtomicInteger idGenerator = new AtomicInteger();

    /**
     *
     * @param user
     * @return  如果保存成功，返回<code>true</code>
     *              否则返回<code>false</code>
     */
    public boolean save(User user){
        //id从1开始
        Integer id = idGenerator.incrementAndGet();
        user.setId(id);
        return repositoryMap.put(id,user) == null;
    }
}
