package main.company.board;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Board {

    @Id @GeneratedValue
    private Long idx; // 고유값

    @Column
    private String subject; // 제목

    @Column
    private String content; // 내용

    @Column
    private String name; // 작성자

    @Column
    private String comment; // 댓글

    @Column
    private LocalDateTime register; // 작성일

}
