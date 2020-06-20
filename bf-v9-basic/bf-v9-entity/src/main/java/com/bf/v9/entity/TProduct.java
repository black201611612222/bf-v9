package com.bf.v9.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TProduct {
    private Long id;

    private String name;

    private Long price;

    private Long salePrice;

    private String salePoint;

    private String image;

    private Long stock;

    private Boolean flag;

    private Date createTime;

    private Date updateTime;

    private Long createUser;

    private Long updateUser;
}