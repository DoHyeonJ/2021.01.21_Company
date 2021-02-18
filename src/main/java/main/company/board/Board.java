package main.company.board;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Board {

    @Id @GeneratedValue
    private Long idx;

    @Column
    private String subject;

    @Column
    private String content;

    @Column
    private String name;

    @Column
    private String comment;

    @Column
    private LocalDateTime register;

}
