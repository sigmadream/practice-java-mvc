package com.sangkon.examples.oop;

import com.sangkon.examples.oop.PasswordGeneratePolicy;

public class CorrectPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "aaaabbbbcc";
    }
}
