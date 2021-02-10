package main.company.contents;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@Builder @AllArgsConstructor @NoArgsConstructor
public class Contents {

    @Id @GeneratedValue
    private Long idx;

    @Column
    private String comment; // 본문

    @Column
    private String images; // 이미지

    @Column
    private String description; // 이미지 설명

}
