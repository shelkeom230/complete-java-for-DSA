package collectionFramework;

import java.util.Objects;

public class student implements Comparable<student> {

	String name;
	int rollNo;
	
	public student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	
	@Override
	public String toString() {
		return "student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return Objects.equals(name, other.name) && rollNo == other.rollNo;
	}

	public static void main(String[] args) {
		
	}

	@Override
	public int compareTo(student that) {
		// TODO Auto-generated method stub
		return this.rollNo-that.rollNo;
	}
}
