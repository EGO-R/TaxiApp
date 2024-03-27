package org.mirea.entitiy;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
public class CarEntity {
    private String number;
    private String mark;
    private String model;
}
