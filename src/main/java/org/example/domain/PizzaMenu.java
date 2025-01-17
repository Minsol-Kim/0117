package org.example.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
//피자 크기 -> 정해짐,enum 사용
public class PizzaMenu extends Menu {
    private PizzaSize size;

    //생성자
    public PizzaMenu(int mno, String name, int price, PizzaSize size) {
        super(mno, name, price);
        this.size=size;

    }
}
