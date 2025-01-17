package org.example.ui;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;
@RequiredArgsConstructor
public abstract class BasicUI {

    private final Scanner scanner;
//하위에 물려주고 싶은 기능 -> 키보드에서 입력받는것
public String input(String msg){
    System.out.println(msg);
    return scanner.nextLine();
    }
    //숫자 입력
    public int inputInt(String msg){
        return Integer.parseInt(input(msg));
        }
        //실제 실행하는 부분, 추상클래스
    public abstract void execute();

}
