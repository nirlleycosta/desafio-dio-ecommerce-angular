package com.theshop.ecommerce.service;

import com.theshop.ecommerce.exception.ResourceNotFoundException;
import com.theshop.ecommerce.model.Product;
import com.theshop.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product.ts not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}