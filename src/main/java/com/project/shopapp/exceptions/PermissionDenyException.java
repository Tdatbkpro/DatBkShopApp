package com.project.shopapp.exceptions;

import org.springframework.security.core.parameters.P;

public class PermissionDenyException extends Exception{
    public PermissionDenyException(String e) {
        super(e);
    }
}
