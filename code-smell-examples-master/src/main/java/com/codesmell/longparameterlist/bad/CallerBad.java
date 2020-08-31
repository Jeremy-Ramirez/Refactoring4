package com.codesmell.longparameterlist.bad;

public class CallerBad {

	private static void printPersonDetails(FullName fullName, Address address) {
        System.out.format("Person named %s %s %s %s lives at %s %s %s %s.",
                fullName.getSalutation(), fullName.getFirstName(),
                fullName.getMiddleName(), fullName.getLastName(),
                address.getZipCode(), address.getStreetAddress(),
                address.getCity(), address.getCountry());
    }

    public static void main(String[] args) {
        printPersonDetails(
                new FullName("Doe", "Jane", "Mary", "Mrs."),
                new Address("1234567", "str. Unirii", "Bucuresti", "Romania"));
    }
}
