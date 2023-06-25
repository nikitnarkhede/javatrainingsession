package Assignment3;

import java.util.List;

class TempStudent {
    public String name;
    public int age;
    public Address address;
    public List<MobileNumber> mobileNumbers;
    public TempStudent(String name, int age, Address address, List<MobileNumber>
            mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }
}

