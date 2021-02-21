package main.company.information;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.swing.plaf.SpinnerUI;

@Entity
@Getter @Setter
@Builder @AllArgsConstructor @NoArgsConstructor
public class information {

    @Id @GeneratedValue
    public Long idx; // 고유값 ( 1개의 idx 사용 예정 )

    @Column
    public String name; // 회사명
    
    @Column 
    public String number; // 회사 대표번호
    
    @Column 
    public String email; // 회사 대표메일
    
    @Column 
    public String license; // 사업자 등록번호
    
}
