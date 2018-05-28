package com.axity.operations;

import org.apache.log4j.Logger;

public class Principal {

    final static Logger LOG = Logger.getLogger(Principal.class);

    public int getSuma(int num1, int num2){
        LOG.info("Suma: " + num1 + " + " + num2);
        return num1 + num2;
    }

}
