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

//@NoArgsConstructor
//arg는 매개변수를 의미 noArg는 매개변수가 없다는 의미이며 기본생성자를 의미함. Nonnull을 사용할시 변수를 final로 선언해야하고 무조건 초기화를 해야하기때문에 @NoArgsConstructor을 사용 할 수 없다. 
@RequiredArgsConstructor
@AllArgsConstructor
//전체 생성자를 의미
@Getter
@Setter
@EqualsAndHashCode
@ToString

/*
 * 	변수나 자료형을 변경했을때 직접 수정 할 필요없이 자동으로 바꿔줌(매우편리)
 */

public class Product02 {
	
	@NonNull	//null일 수 없다.
	private final int productCode;
	private String productName;
	private int category;
	private LocalDate productionDate;
	
}
