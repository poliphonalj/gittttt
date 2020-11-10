package org.progmatic;

public class Person {


        private String firstName;
        private String lastName;
        private String companyName;
        private String address;
        private String city;
        private String county;
        private String state;
        private int zip;
        private String phone1;
        private String phone2;
        private String email;
        private String web;


        public Person(String firstName, String lastName, String city, String email) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.city = city;
                this.email = email;
        }


        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getCompanyName() {
                return companyName;
        }

        public void setCompanyName(String companyName) {
                this.companyName = companyName;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public String getCounty() {
                return county;
        }

        public void setCounty(String county) {
                this.county = county;
        }

        public String getState() {
                return state;
        }

        public void setState(String state) {
                this.state = state;
        }

        public int getZip() {
                return zip;
        }

        public void setZip(int zip) {
                this.zip = zip;
        }

        public String getPhone1() {
                return phone1;
        }

        public void setPhone1(String phone1) {
                this.phone1 = phone1;
        }

        public String getPhone2() {
                return phone2;
        }

        public void setPhone2(String phone2) {
                this.phone2 = phone2;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getWeb() {
                return web;
        }

        public void setWeb(String web) {
                this.web = web;
        }

        @Override
        public String toString() {
                return "Person{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", city='" + city + '\'' +
                        ", email='" + email + '\'' +
                        '}';
        }
}
