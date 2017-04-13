package com.mentha.exception;


public class PortsNotFoundException extends RuntimeException {

    public PortsNotFoundException(String message) {
        super(message);
    }
}
