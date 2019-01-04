package test1;

import java.math.BigDecimal;

public class User {
	public BigDecimal age;
	public BigDecimal getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name ;
	
	public User(BigDecimal age, String name) {
		this.age = age;
		this.name = name;
	};
}
