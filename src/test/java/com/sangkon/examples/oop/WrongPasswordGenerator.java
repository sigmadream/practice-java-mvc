package com.sangkon.examples.oop;

import com.sangkon.examples.oop.PasswordGeneratePolicy;

public class WrongPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "bb";
    }
}