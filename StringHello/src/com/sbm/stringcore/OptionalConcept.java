package com.sbm.stringcore;

import java.util.Optional;

public class OptionalConcept {
	public static void main(String[] args) {
		int n1 = 2554;
		Optional<Integer> optional = Optional.ofNullable(n1);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
	}
}
