@Getter
@Builder
public class User2 {
 private String email;
 private String firstName;
 private String lastName;
 private List<Book> books;
 private Map<Long, Book> someMap;
}
