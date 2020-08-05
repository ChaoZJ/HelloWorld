package com.example.demo;

import lombok.Getter;
import lombok.ToString;

/**
 * @author john
 */
@ToString
public enum Code {
    SUCCESS(200, "成功");

    @Getter
    private long codeNumber;
    @Getter
    private String name;
    Code(long codeNumber, String name) {
        this.codeNumber = codeNumber;
        this.name = name;
    }
}
