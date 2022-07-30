package org.example.web.controller;


import org.example.service.BusinessService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/ListALLBook")
public class ListALLBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用service层的方法，获取得到存放书籍的Map集合
        BusinessService businessService = new BusinessService();
        Map books = businessService.getAll();
        System.out.println(books.size());
        //存放在request域对象中，交给jsp页面显示
        request.setAttribute("books", books);

        //跳转到jsp页面中
        request.getRequestDispatcher("/WEB-INF/listBook.jsp").forward(request, response);
    }
}
