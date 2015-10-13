package com.company;

public enum Currency {
        PENNY(1),
        NICKLE(5),
        DIME(10),
        QUARTER(25);


                private int value;


               private Currency(int value) {
               this.value = value;
            }


                public int getValue(){
                return this.value;
            }
    }
