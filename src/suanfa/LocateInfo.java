package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/2/1 10:37
 * @updateDate 2021/2/1 10:37
 **/
public class LocateInfo {
    private double longitude;
    /**
     * 维度
     */
    private double Latitude;
    /**
     * 是否在中国
     */
    private boolean isChina;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public boolean isChina() {
        return isChina;
    }

    public void setChina(boolean china) {
        isChina = china;
    }
}
