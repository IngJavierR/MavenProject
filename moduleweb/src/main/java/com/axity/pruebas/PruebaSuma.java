package com.axity.pruebas;

import com.axity.operations.Principal;
import org.apache.log4j.Logger;

public class PruebaSuma {

    final static Logger LOG = Logger.getLogger(PruebaSuma.class);

    public static void main(String[] args) {
        LOG.info("Inicia Suma");
        Principal principal = new Principal();
        int result = principal.getSuma(1,2);
        System.out.println(result);
    }
}
