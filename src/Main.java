void main() {
    Path path = Paths.get("simple.txt");
    String str = "DDLWA: __@#1";
    try{
        Files.write(path, str.getBytes(),
                StandardOpenOption.CREATE);
        System.out.println("file create");
    }catch (IOException e){
        System.out.println("error ");
    }
}