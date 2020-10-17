package Dao.Provincial;

import Tools.Connectiontool;
import Vo.Provincialuser;
import Vo.city;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IprovincialDaofinsh implements IprovincialDao {
    Connectiontool tool;

    {
        try {
            tool = new Connectiontool();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    Connection con= tool.getConnection();
    PreparedStatement pst;
    @Override
    public List<Provincialuser> findallprovincial() {
        Provincialuser p=new Provincialuser();
        List<Provincialuser> list=new ArrayList<Provincialuser>();
        String sql="select * from provincial ";
        try {
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                p.setPid(rs.getInt(1));
                p.setProvincial(rs.getString(2));

                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(list.toString());
        return list;
    }

    @Override
    public city findsth(String provincialCode) throws SQLException {
        city dao1=new city() ;
        String sql = "select * from city where provincialCode=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, provincialCode);
            ResultSet rs = pst.executeQuery();
            if (rs.next()){
                dao1.setProvincialCode(rs.getString(1));
                dao1.setCitys(rs.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao1;

    }
}
