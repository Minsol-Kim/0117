package org.example.service;

import org.example.domain.DrinkMenu;
import org.example.domain.Menu;
import org.example.domain.PizzaMenu;
import org.example.domain.PizzaSize;

import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.menu;

public class MenuServiceImpl implements MenuService {
private List<Menu> menus;
    public MenuServiceImpl() {
        this.menus=menus;
    }


    @Override
    public List<Menu> getMenus() {
        return this.menus;
    }
}
