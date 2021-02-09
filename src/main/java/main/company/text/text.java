package main.company.text;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter @Setter
@EqualsAndHashCode(of = "id") @Builder
@AllArgsConstructor @NoArgsConstructor
public class text {

    @Id @GeneratedValue
    private Long idx; // 고유번호

    @Column
    private String comment; // 본문

}
