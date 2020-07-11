package ssmBook.pojo;

/**
 * 管理员实体类
 * @GimmciK 2020.7.8
 */
public class admin {

    private Integer adminid;
    private String adminName;
    private String passWord;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
