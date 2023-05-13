package com.quangpn.product.service;

import com.quangpn.product.dto.ProductRequest;
import com.quangpn.product.dto.ProductResponse;

import java.util.List;

public interface IProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProduct();
}
