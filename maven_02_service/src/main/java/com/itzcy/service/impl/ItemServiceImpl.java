package com.itzcy.service.impl;

import com.itzcy.dao.IItemDao;
import com.itzcy.domain.Item;
import com.itzcy.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemServiceImpl implements IItemService {

    @Autowired
    private IItemDao itemDao;

    @Override
    public Item findById(Integer id) {
        return itemDao.findById(id);
    }
}
