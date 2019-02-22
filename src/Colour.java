public enum Colour {
    WHITE("white"),
    BLACK("black"),
    RED("red");
    private String name;
    private Colour(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
