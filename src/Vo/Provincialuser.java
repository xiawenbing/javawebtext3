package Vo;

public class Provincialuser {
    private  static  int pid;//编号
    private  static String provincial;//省份名

    public Provincialuser(int pid,String provincial) {
        super();
        this.pid=pid;
        this.provincial=provincial;
    }

    public Provincialuser() {
     super();
    }

    public static int getPid() {
        return pid;
    }

    public static void setPid(int pid) {
        Provincialuser.pid = pid;
    }

    public static String getProvincial() {
        return provincial;
    }

    public static void setProvincial(String provincial) {
        Provincialuser.provincial = provincial;
    }
}
