package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data 						//getter/setter/Equals()/hashcode()/toString()

public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data;

}
