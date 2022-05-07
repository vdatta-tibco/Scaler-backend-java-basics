package com.scaler;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)

public class Person {

    private String Name;
    private int age;
}
