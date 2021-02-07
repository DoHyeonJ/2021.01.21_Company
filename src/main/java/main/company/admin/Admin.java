package main.company.admin;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Admin {

    @Id
    public Long idx; //고유 id

    @Column(unique = true)
    private String id; // 관리자 id

    @Column
    private String pw; // 관리자 pw

    @Column
    private LocalDateTime joinAt; //가입일

}
