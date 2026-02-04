

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
    Path filePath2 = Paths.get("log.txt");
    String newEntry = "Новая запись в логе: " + java.time.LocalDateTime.now();

    try {
        Files.write(
                filePath2,
                List.of(newEntry),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    } catch (IOException e) {
        System.out.println("Ошибка при добавлении записи: " + e.getMessage());
    }
}