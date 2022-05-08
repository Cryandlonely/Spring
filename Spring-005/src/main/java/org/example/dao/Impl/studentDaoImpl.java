package org.example.dao.Impl;

import org.example.dao.studentDao;
import org.springframework.stereotype.Component;

@Component
public class studentDaoImpl implements studentDao {
    @Override
    public String getName(String name) {
        System.out.println("dao");
        return name;
    }
}
