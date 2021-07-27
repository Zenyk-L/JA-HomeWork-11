package ua.lviv.lgs.service;

import ua.lviv.lgs.domain.Product;
import ua.lviv.lgs.shared.AbstructCRUD;

import java.util.Map;

public interface ProductService extends AbstructCRUD<Product>  {
    public Map<Integer, Product> readAllMap();
}
