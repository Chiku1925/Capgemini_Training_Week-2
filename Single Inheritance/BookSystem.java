class BookSystem{
  static class Book{
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    void displayInfo(){
        System.out.println("Book Title : "+ title);
        System.out.println("Publication Year: "+ publicationYear);
    }


    }

    static class Author extends  Book{
        protected String name;
        protected String bio;

        public Author(String title, int publicationYear,String name,String bio){
            super(title, publicationYear);
            this.name=name;
            this.bio=bio;
        }
        @Override

        void displayInfo(){
            super.displayInfo();
            System.out.println("Name of the author: "+ name);
            System.out.println("Bio : "+bio);
        }

    }

    public static void main(String[] args) {
        Book b1=new Author("Fast",2018,"Ram","Peace");
        b1.displayInfo();
    }
}