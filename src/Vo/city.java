package Vo;

public class city {
    private static String provincialCode;
    private static String citys;

    public city() {
        super();
        this.provincialCode=provincialCode;
        this.citys=citys;

    }

    public static String getProvincialCode() {
    return provincialCode;
}

    public static void setProvincialCode(String provincialCode) {
        city.provincialCode = provincialCode;
    }

    public static String getCitys() {
        return citys;
    }

    public static void setCitys(String citys) {
        city.citys = citys;
    }
}
