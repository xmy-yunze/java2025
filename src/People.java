public class People {
    /**
     * 记录出生年
     */
    private int year = 0;
    /**
     * 姓名
     */
    private String name = null;

    /**
     * 身份证号码
     */
    private String id;


    public People() {

    }

    public People(int year, String name) {
        this.year = year;
        this.name = name;
    }

    /**
     * 计算年龄
     *
     * @param now 现在年份
     * @return 年龄
     */
    public int age(int now) {
        return now - year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
