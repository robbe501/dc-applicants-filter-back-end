package com.enums;

public enum Posizione {
	JAVA_PROGRAMMER("Java Programmer"), MICROSOFT_PROGRAMMER("Microsoft Programmer"), ALTRO("Altro");

	private final String value;

	Posizione(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static Posizione fromString(String value) {
		for (Posizione b : Posizione.values()) {
			if (b.value.contains(value)) {
				return b;
			}
		}
		return null;
	}
}
