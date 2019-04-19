package com.neal.divinspringboot.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {

        AsyncContext asyncContext = req.startAsync();
            asyncContext.start(() -> {
                try {
                    resp.getWriter().println("Hello World");
                    //显示的触发完成
                    asyncContext.complete();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

    }


