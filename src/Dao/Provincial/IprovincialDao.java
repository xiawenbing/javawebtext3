package Dao.Provincial;

import Vo.city;


import java.sql.SQLException;

public interface IprovincialDao extends provincialDao {
    city findsth(String provincialCode) throws SQLException;//查找
}
