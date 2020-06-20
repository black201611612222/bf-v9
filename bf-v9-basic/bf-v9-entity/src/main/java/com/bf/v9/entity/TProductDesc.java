package com.bf.v9.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TProductDesc {
    private Long id;

    private String pDesc;

    private Long productId;
}