package demo;

import Dao.Provincial.IprovincialDao;
import Dao.Provincial.IprovincialDaofinsh;
import Vo.Provincialuser;
import Vo.city;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("utf-8");
        String provinceCode = request.getParameter("provinceCode");
        String jsonStr="";
        IprovincialDaofinsh dao=new IprovincialDaofinsh();
        if (provinceCode==null)
        {
            ArrayList<Provincialuser> list= (ArrayList<Provincialuser>) dao.findallprovincial();
            jsonStr=new Gson().toJson(list);
        }else {
            try {
                city c=new city();
                c=dao.findsth(provinceCode);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            jsonStr=new Gson().toJson(city.getCitys());
        }
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        System.out.println(jsonStr);
        out.print(jsonStr);
        out.close();
        out.flush();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
