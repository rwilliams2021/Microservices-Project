package com.microservices.product_service.mapper;

import com.microservices.product_service.dto.ProductResponse;
import com.microservices.product_service.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    
    ProductResponse productToProductResponse(Product product);

}