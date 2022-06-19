package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // jpa 엔티티 매핑
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // pk를 DB가 알아서 생성해주는 전략
    private Long id; // 시스템이 저장하는 아이디

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
