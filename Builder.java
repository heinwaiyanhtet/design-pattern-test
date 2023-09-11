public class Builder{

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private String address;

    private Builder(AnotherClass anotherClass)
    {
        this.firstName = anotherClass.firstName;
        this.lastName = anotherClass.lastName;
        this.age = anotherClass.age;
        this.email = anotherClass.email;
        this.phone = anotherClass.phone;
        this.address = anotherClass.address;
    }

    @Override
    public String toString(){
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public static class AnotherClass
    {
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String phone;
        private String address;

        public AnotherClass(String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public AnotherClass age(int age)
        {
            this.age = age;
            return this;
        }


        public AnotherClass email(String email)
        {
            this.email = email;
            return this;
        }

        public AnotherClass phone(String phone)
        {
            this.phone = phone;
            return this;
        }


        public AnotherClass address(String phone) {
            this.address = address;
            return this;
        }

        public Builder build() {
            return new Builder(this);
        }
        
    }

    public static void main(String[] args){
        Builder builder = new AnotherClass("John", "Doe")
        .age(30)
        .email("john.doe@example.com")
        .phone("+1234567890")
        .address("john@example.com")
        .build();
        System.out.println(builder);
    }

}



