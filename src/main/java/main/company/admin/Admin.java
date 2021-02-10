package main.company.admin;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Builder @AllArgsConstructor @NoArgsConstructor
public class Admin {

    @Id @GeneratedValue
    private Long idx; //고유 id

    @Column(unique = true)
    private String id; // 관리자 id

    @Column
    private String pw; // 관리자 pw

    @Column
    private LocalDateTime joinAt; // 가입일

    @Column
    private String CompanyName; // 회사명

}
