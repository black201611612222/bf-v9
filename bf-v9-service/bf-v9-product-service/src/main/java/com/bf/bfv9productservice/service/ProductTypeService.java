package com.bf.bfv9productservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bf.api.product.IProductTypeService;
import com.bf.v9.comon.base.BaseServiceImpl;
import com.bf.v9.comon.base.IBaseDao;
import com.bf.v9.entity.TProductType;
import com.bf.v9.mapper.TProductTypeMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Service
@Component
public class ProductTypeService extends BaseServiceImpl<TProductType> implements IProductTypeService {

    @Resource
    private TProductTypeMapper productTypeMapper;

    @Override
    public IBaseDao<TProductType> getBaseDao() {
        return productTypeMapper;
    }
}
