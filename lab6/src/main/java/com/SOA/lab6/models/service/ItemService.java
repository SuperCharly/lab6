package com.SOA.lab6.models.service;

import java.util.List;
import com.SOA.lab6.models.Item;

public interface ItemService {
    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}
