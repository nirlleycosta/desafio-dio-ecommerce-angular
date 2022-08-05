package com.theshop.ecommerce.repository;

import com.theshop.ecommerce.model.OrderProduct;
import com.theshop.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
