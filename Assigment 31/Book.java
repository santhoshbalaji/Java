import java.util.HashSet;
class Book{
    private int id;
    private String title;
    public Book(int id , String title){
        this.id = id;
        this.title = title;
    }
    public String toString(){
        StringBuffer n = new StringBuffer();
        n.append(id+"\t");
        n.append(title);
        return new String(n);
    }
    public boolean equals(Object o){
        Book q = new Book(this.id,this.title);
        System.out.println(q);
        System.out.println(o);
        return q == o;
    }
    public int hashCode(){
        // System.out.println("hi");
        // System.out.println(Integer.valueOf(title.charAt(0)));
        // return Integer.valueOf(title.charAt(0));
        return 0;
    }
    public static void main(String args[]){
        Book one = new Book(1,"Harry Potter Part-1");
        Book two = new Book(2,"Harry Potter Part-2");
        // boolean boo = one.equals(two);
        // System.out.println(boo);
        HashSet hashset = new HashSet<Book>();
        hashset.add(one);
        hashset.add(one);
        hashset.add(two);
        System.out.println(one);
    }
}
