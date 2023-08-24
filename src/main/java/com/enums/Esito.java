package com.enums;

public enum Esito {
	IDONEO("Idoneo"), NON_IDONEO("Non Idoneo"), AMMESSO("Ammesso"), NON_AMMESSO("Non Ammesso");

	private final String value;

	Esito(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static Esito fromString(String value) {
		for (Esito b : Esito.values()) {
			if (b.value.contains(value)) {
				return b;
			}
		}
		return null;
	}

}
