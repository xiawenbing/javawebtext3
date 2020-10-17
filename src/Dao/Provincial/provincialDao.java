package Dao.Provincial;

import Vo.Provincialuser;
import Vo.download;

import java.util.List;

public interface provincialDao <T,K> {
    List<Provincialuser> findallprovincial();
}
