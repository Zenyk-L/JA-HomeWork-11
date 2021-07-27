package ua.lviv.lgs.servlet;

import ua.lviv.lgs.domain.Bucket;
import ua.lviv.lgs.service.BucketService;
import ua.lviv.lgs.service.impl.BucketServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet("/bucket")
public class BucketController extends HttpServlet {

    BucketService bucketService = BucketServiceImpl.getBucketService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String productId = request.getParameter("productId");

        HttpSession session = request.getSession();
        Integer userId = (Integer) session.getAttribute("userId");

        Bucket bucket = new Bucket(userId, Integer.parseInt(productId), new Date());
        bucketService.create(bucket);

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("Success");
    }
}
