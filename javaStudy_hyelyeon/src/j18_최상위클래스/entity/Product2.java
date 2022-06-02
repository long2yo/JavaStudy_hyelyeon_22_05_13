package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Product2 {
	@NonNull
	private final int productCode;//final을 붙이면 생성시에 무조건 값이 초기화되어야 한다.
	@NonNull
	private String productName;
	private int category;
	private LocalDate productionDate;
	
	

	

	
	
	
	
	

}
