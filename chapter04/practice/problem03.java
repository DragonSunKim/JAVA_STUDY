// Coding By 김용선.

class Member {
    private String name;
    private String id;
    private String pw;
    private int age;

    // 설정자 생성
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 접근자 생성
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public int getAge() {
        return age;
    }

    Member(String name, String id, String pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }
}

public class problem03 {
    public static void main(String[] args) {
        Member user = new Member("김용선", "KYS", "1234", 28);
        System.out.println("이름 : " + user.getName());
        System.out.println("아이디 : " + user.getId());
        System.out.println("암호 : " + user.getPw());
        System.out.println("나이 : " + user.getAge());
    }
}
