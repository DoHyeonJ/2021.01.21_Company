package main.company.image;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter @Setter
@EqualsAndHashCode(of = "id") @Builder
@AllArgsConstructor @NoArgsConstructor
public class image {

    @Id @GeneratedValue
    private Long idx; // 고유번호

    @Column
    private String images; // 이미지

    @Column
    private String description; // 이미지 설명

    @Column(unique = true)
    private int position; // 이미지 위치

}
