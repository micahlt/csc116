public class Name {
    private String firstName, middleName, lastName;

    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }

    public String getFirst() {
        return firstName;
    }

    public String getMiddle() {
        return middleName;
    }

    public String getLast() {
        return lastName;
    }

    public String firstMiddleLast() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String lastFirstMiddle() {
        return lastName + ", " + firstName + " " + middleName;
    }

    public boolean equals(Name otherName) {
        return otherName.firstMiddleLast().toLowerCase().equals(firstMiddleLast().toLowerCase());
    }

    public String initials() {
        return ("" + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0)).toUpperCase();
    }

    public int length() {
        return (firstName + middleName + lastName).length();
    }
}
