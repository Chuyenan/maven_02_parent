package com.itzcy.controller;

import com.itzcy.domain.Item;
import com.itzcy.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    private IItemService itemService;

    @RequestMapping("findById")
    public String findById(Model model){
        Item item = itemService.findById(1);
        model.addAttribute("item", item);
        return "itemDetail";
    }
}
