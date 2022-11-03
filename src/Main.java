public class Main {
    public static void main(String args[]) {
    Person firstPerson = new Person();
    firstPerson.setNameOfPerson("Aiperi");
    firstPerson.setAgeOfPerson((byte) 20);
    firstPerson.setHobbyOfPerson("readind");
    Person secondPerson = new Person();
    secondPerson.setNameOfPerson("Adilet");
    secondPerson.setAgeOfPerson((byte)18);
    secondPerson.setHobbyOfPerson("dancing");
    Person thirdperson = new Person();
    thirdperson.setNameOfPerson("Janysh");
    thirdperson.setAgeOfPerson((byte)19);
    thirdperson.setHobbyOfPerson("singing");
    Person [] persons = {firstPerson,secondPerson,thirdperson};
        System.out.println("Persons[]...");
        for (Person personen:persons) {
            System.out.println("Name: "+personen.getNameOfPerson() + " Age: " + personen.getAgeOfPerson() + "  Hobby:" + personen.getHobbyOfPerson());
        }

      University firstUniversity = new University();
      firstUniversity.setNameOfUniversity("KNU");
      firstUniversity.setAdressOfUniversity("Chui street");
      firstUniversity.setRectorOfUniversity("Abdiev");
      University secondUniversity = new University();
      secondUniversity.setNameOfUniversity("AUSA");
      secondUniversity.setAdressOfUniversity("Bokonbaev street");
      secondUniversity.setRectorOfUniversity("Adiletov");
      University thirdUniversity = new University();
      thirdUniversity.setNameOfUniversity("USTA");
      thirdUniversity.setAdressOfUniversity("Ahunbaev street");
      thirdUniversity.setRectorOfUniversity("Ibraimova");
      University [] universities = {firstUniversity,secondUniversity,thirdUniversity};
        System.out.println("Universities []...");
            for (University unis:universities) {
                System.out.println("Name of University: "+ unis.getNameOfUniversity()+"  Adress: "+ unis.getAdressOfUniversity()+"  Rector of University: "+unis.getRectorOfUniversity());
            }
     School firstschool = new School();
     firstschool.setNameOfSchool("Alykulov");
     firstschool.setNumberOfSchool(12);
     firstschool.setDirektorOfSchool("Baktybekov");
     School secondschool = new School();
     secondschool.setNameOfSchool("Bokonbaev");
     secondschool.setNumberOfSchool(5);
     secondschool.setDirektorOfSchool("Isaev");
     School thirdschool = new School();
     thirdschool.setNameOfSchool("Ismail Uulu Matish ");
     thirdschool.setNumberOfSchool(17);
     thirdschool.setDirektorOfSchool("Bagysheva");
     School [] schools = {firstschool,secondschool,thirdschool};
        System.out.println("Schools[]...");
        for (School schoolses : schools) {
            System.out.println("Name of School: "+ schoolses.getNameOfSchool()+" Number of School: "+schoolses.getNumberOfSchool()+" Direktor of School: "+schoolses.getDirektorOfSchool());
        }
     Car firstcar = new Car();
     firstcar.setModelOfCar("BMW");
     firstcar.setColorOfCar("pink");
     firstcar.setSpeedOfCar(800);
     Car secondcar = new Car();
     secondcar.setModelOfCar("Mersedes Mers");
     secondcar.setColorOfCar("violet");
     secondcar.setSpeedOfCar(500);
     Car thirdcar = new Car();
     thirdcar.setModelOfCar("VW");
     thirdcar.setColorOfCar("white");
     thirdcar.setSpeedOfCar(250);
     Car [] cars = {firstcar,secondcar,thirdcar};
        System.out.println("Cars[]...");
        for (Car CAR:cars) {
            System.out.println("Model of Car: "+CAR.getModelOfCar()+" Color of Car: "+ CAR.getColorOfCar()+ " Speed of Car: "+ CAR.getSpeedOfCar());

        }


    }
}


