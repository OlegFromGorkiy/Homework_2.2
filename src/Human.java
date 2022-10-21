
public class Human {

    private int yearOfBirth;
    String name;
    private String town;
    String job;

    public Human() {
        yearOfBirth = 0;
        name = "Информация не указана";
        town = "Информация не указана";
        job = "Информация не указана";
    }

    public Human(int yearOfBirth, String name, String town, String job) {
        setYearOfBirth(yearOfBirth);
        setName(name);
        setTown(town);
        setJob(job);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    public void setName(String name) {
        if (name == null) name = "";
        if (!name.equals("")) this.name = name;
        else this.name = "Информация не указана";

    }

    public void setTown(String town) {
        if (town == null) town = "";
        if (!town.equals("")) this.name = name;
        else this.town = "Информация не указана";
    }

    public void setJob(String job) {
        if (job == null) job = "";
        if (!job.equals("")) this.job = job;
        else this.job = "Информация не указана";
    }

    @Override
    public String toString() {
        check();
        if (job.equals("Информация не указана") || job.equalsIgnoreCase("безработный")) {
            return smallGreeting();
        } else
            return String.format("Привет! Меня зовут %s. Я из города %s. Я родился в %d году.Я работаю на должности %s. Будем знакомы!",
                    name, town, yearOfBirth, job);
    }

    public String smallGreeting() {
        check();
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Будем знакомы!",
                name, town, yearOfBirth);
    }

    private void check() {
        //как сделать проверки на основе регулярных выражений? Пример бы глянуть.
        if (name != null) {
            if (name.equals("") || name.equals(" ")) name = "Информация не указана";
        } else name = "Информация не указана";
        if (town != null) {
            if (town.equals("") || town.equals(" ")) town = "Информация не указана";
        } else town = "Информация не указана";
        if (job != null) {
            if (job.equals("") || job.equals(" ")) job = "Информация не указана";
        } else job = "Информация не указана";
    }
}