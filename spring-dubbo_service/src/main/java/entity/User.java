package entity;

import lombok.Data;

/**
 * @Author Aran
 * @Date 2020/10/6 下午9:56
 */
@Data
public class User {
    private int user_id;
    private String username;
    private String realname;
    private int age;
    private String addr;

}
