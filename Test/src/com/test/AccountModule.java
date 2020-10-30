package com.test;

/**
 * 
 */

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * Enumeration for various modules of accounts like Conventional, Islamic.
 * 
 * <table>
 * <tr>
 * <th>Enumeration Name</th>
 * <th>Enumeration Value</th>
 * </tr>
 * <tr>
 * <td>CONVENTIONAL</td>
 * <td>"CON"</td>
 * </tr>
 * <tr>
 * <td>ISLAMIC</td>
 * <td>"ISL"</td>
 * </tr>
 * <tr>
 * <td>RECURRING_DEPOSIT</td>
 * <td>"RD"</td>
 * </tr>
 * </table>
 */
@XmlEnum
public enum AccountModule {
	/**
	 * CON refers Conventional accounts
	 */
	@XmlEnumValue(value = "CON")
	CONVENTIONAL("CON"),
	/**
	 * ISL refers Islamic
	 */
	@XmlEnumValue(value = "ISL")
	ISLAMIC("ISL"),

	/**
	 * RD refers recurring deposit.
	 */
	@XmlEnumValue(value = "RD")
	RECURRING_DEPOSIT("RD");

	/**
	 * Value of enum to be persisted to data store.
	 */
	private String value = null;

	/**
	 * private overloaded constructor to receive a value as argument.
	 * 
	 * @param value
	 *            Value of enum to be persisted to data store
	 */
	private AccountModule(String value) {
		this.value = value;
	}

	/**
	 * Returns value of the Enum type.
	 * 
	 * 
	 */
	public String toString() {
		return this.value;
	}

	/**
	 * Returns the Enum Type from value.
	 * 
	 * @param value
	 *            of Enum
	 * @return {@link AccountModule}
	 */
	public static AccountModule fromValue(String value) {
		for (AccountModule element : AccountModule.values()) {
			if (element.toString().equals(value)) {
				return element;
			}
		}

		return null;
	}
}
