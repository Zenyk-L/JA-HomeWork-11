package ua.lviv.lgs;

import ua.lviv.lgs.domain.Bucket;
import ua.lviv.lgs.domain.Product;
import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.service.BucketService;
import ua.lviv.lgs.service.ProductService;
import ua.lviv.lgs.service.UserService;
import ua.lviv.lgs.service.impl.BucketServiceImpl;
import ua.lviv.lgs.service.impl.ProductServiceImpl;
import ua.lviv.lgs.service.impl.UserServiceImpl;

import java.util.Date;

public class MainTest {
    public static void main(String[] args) {


        UserService userService = new UserServiceImpl();
        BucketService bucketService = new BucketServiceImpl();
        ProductService productService = new ProductServiceImpl();


//        userService.create(new User("test3", "test3", "test3", "test"));
//        userService.update(new User(2,"test2", "test2", "test2", "test"));
//        userService.delete(2);
//        System.out.println(userService.readAll());

//        productService.create(new Product("leter","leter",99.99));
//        productService.update(new Product(3,"leter3","leter3",3.99));
//        productService.delete(2);
//        System.out.println(productService.readAll());
//        System.out.println();
//        System.out.println(productService.read(2));

//        bucketService.create(new Bucket(1,1, new Date()));
        bucketService.create(new Bucket(3,3, new Date()));
        bucketService.create(new Bucket(1,3, new Date()));
//        System.out.println(bucketService.read(1));
//        bucketService.delete(2);
        System.out.println(bucketService.readAll());

    }
}
