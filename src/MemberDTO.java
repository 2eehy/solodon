public class MemberDTO {
    private String name;
    private String phone;


    public MemberDTO() {}


    public MemberDTO (String name, String phone) {
        this.name = name;
        this.phone = phone;

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }




    @Override
    public String toString() {
        return "가입회원{" +
                "이름='" + name + '\'' +
                ", 전화번호='" + phone + '\'' +
                " }" ;

    }
}