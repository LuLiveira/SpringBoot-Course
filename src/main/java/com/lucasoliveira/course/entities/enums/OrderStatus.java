package com.lucasoliveira.course.entities.enums;

import com.lucasoliveira.course.entities.Order;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    //static para poder acessar o método sem precisar instanciar uma OrderStatus
    public static OrderStatus valueOf(int code){
        //Percorrendo todos os valores de OrderStatus
        for (OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Inválid OrderStatus code");
    }
}
