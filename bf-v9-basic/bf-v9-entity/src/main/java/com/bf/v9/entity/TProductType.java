package com.bf.v9.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TProductType {
    private Long id;

    private Long pid;

    private String name;
}