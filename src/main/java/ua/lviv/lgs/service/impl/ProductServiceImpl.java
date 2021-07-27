package ua.lviv.lgs.service.impl;

import org.apache.log4j.Logger;
import ua.lviv.lgs.dao.ProductDao;
import ua.lviv.lgs.dao.impl.ProductDaoImpl;
import ua.lviv.lgs.domain.Product;
import ua.lviv.lgs.service.ProductService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {

    private static Logger LOGGER = Logger.getLogger(ProductServiceImpl.class);
    public  static ProductService productServiceImpl;

    private ProductDao productDao;

    public ProductServiceImpl() {
        try {
            productDao = new ProductDaoImpl();
        } catch (InstantiationException e) {
            LOGGER.error(e);
        } catch (IllegalAccessException e) {
            LOGGER.error(e);
        } catch (ClassNotFoundException e) {
            LOGGER.error(e);
        } catch (SQLException e) {
            LOGGER.error(e);
        }
    }

    public static ProductService getProductService(){
        if (productServiceImpl == null )
            productServiceImpl = new ProductServiceImpl();
        return productServiceImpl;
    }

    @Override
    public Product create(Product product) {
        return productDao.create(product);
    }

    @Override
    public Product read(Integer id) {
        return productDao.read(id);
    }

    @Override
    public Product update(Product product) {
        return productDao.update(product);
    }

    @Override
    public void delete(Integer id) {
        productDao.delete(id);
    }

    @Override
    public List<Product> readAll() {
        return productDao.readAll();
    }

    @Override
    public Map<Integer, Product> readAllMap() {
        return readAll().stream().collect(Collectors.toMap(Product::getId, Function.identity()));
    }
}
