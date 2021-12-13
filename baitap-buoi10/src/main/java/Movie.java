public class Movie {
    private String id;
    private String name;
    private String Category;
    private String director;
    private int longTime;
    private int year;
    private int view;

    public Movie() {
    }

    public Movie(String id, String name, String category, String director, int longTime, int year, int view) {
        this.id = id;
        this.name = name;
        Category = category;
        this.director = director;
        this.longTime = longTime;
        this.year = year;
        this.view = view;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLongTime() {
        return longTime;
    }

    public void setLongTime(int longTime) {
        this.longTime = longTime;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Category='" + Category + '\'' +
                ", director='" + director + '\'' +
                ", longTime=" + longTime +
                ", year=" + year +
                ", view=" + view +
                '}';
    }
}
