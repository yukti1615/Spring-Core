package com.genx.springcore.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private List<Integer> marks;
	private Set<Integer> marksSet;
	private Map<Integer, Integer> marksMap;
	private Properties marksProp;
	
	public void setMarksProp(Properties marksProp) {
		this.marksProp = marksProp;
	}

	public void setMarksSet(Set<Integer> marksSet) {
		this.marksSet = marksSet;
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", marksSet=" + marksSet + ", marksMap=" + marksMap + ", marksProp="
				+ marksProp + "]";
	}

	public void setMarksMap(Map<Integer, Integer> marksMap) {
		this.marksMap = marksMap;
	}


	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	
	

}
